import java.io.*;
import java.util.Scanner;

public class EventService {

    String eventFile = "events.txt";

    public void createEvent(Scanner sc) {
        System.out.print("Enter Event ID: ");
        String id = sc.nextLine();
        System.out.print("Enter Event Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Event Description: ");
        String desc = sc.nextLine();

        try {
            FileWriter fw = new FileWriter(eventFile, true);
            fw.write(id + "," + name + "," + desc + "\n");
            fw.close();
            System.out.println("Event created.");
        } catch (Exception e) {
            System.out.println("Error.");
        }
    }

    public void viewAllEvents() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(eventFile));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (Exception e) {
            System.out.println("No events found.");
        }
    }

    public void editEvent(Scanner sc) {
        System.out.print("Enter Event ID to edit: ");
        String id = sc.nextLine();

        try {
            BufferedReader br = new BufferedReader(new FileReader(eventFile));
            FileWriter fw = new FileWriter("temp.txt");

            String line;
            boolean found = false;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(id)) {
                    System.out.print("New Event Name: ");
                    String name = sc.nextLine();
                    System.out.print("New Description: ");
                    String desc = sc.nextLine();
                    fw.write(id + "," + name + "," + desc + "\n");
                    found = true;
                } else {
                    fw.write(line + "\n");
                }
            }

            br.close();
            fw.close();

            File oldFile = new File(eventFile);
            File newFile = new File("temp.txt");
            oldFile.delete();
            newFile.renameTo(oldFile);

            if (found) System.out.println("Event updated.");
            else System.out.println("Event ID not found.");

        } catch (Exception e) {
            System.out.println("Error.");
        }
    }

    public void deleteEvent(Scanner sc) {
        System.out.print("Enter Event ID to delete: ");
        String id = sc.nextLine();

        try {
            BufferedReader br = new BufferedReader(new FileReader(eventFile));
            FileWriter fw = new FileWriter("temp.txt");

            String line;
            boolean found = false;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (!data[0].equals(id)) {
                    fw.write(line + "\n");
                } else {
                    found = true;
                }
            }

            br.close();
            fw.close();

            File oldFile = new File(eventFile);
            File newFile = new File("temp.txt");
            oldFile.delete();
            newFile.renameTo(oldFile);

            if (found) System.out.println("Event deleted.");
            else System.out.println("Event ID not found.");

        } catch (Exception e) {
            System.out.println("Error.");
        }
    }
}
