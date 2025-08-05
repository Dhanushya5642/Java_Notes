import java.io.*;
import java.util.Scanner;

public class Register {

    String regFile = "registrations.txt";

    public void registerForEvent(Scanner sc, String empId) {
        System.out.print("Enter Event ID to register: ");
        String eventId = sc.nextLine();

        try {
            FileWriter fw = new FileWriter(regFile, true);
            fw.write(empId + "," + eventId + "\n");
            fw.close();
            System.out.println("Registered successfully!");
        } catch (IOException e) {
            System.out.println("Error writing to registration file.");
        }
    }

    public void editRegistration(Scanner sc, String empId) {
        try {
            File inputFile = new File(regFile);
            File tempFile = new File("temp.txt");

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            FileWriter writer = new FileWriter(tempFile);

            String currentLine;
            boolean found = false;

            while ((currentLine = reader.readLine()) != null) {
                String[] parts = currentLine.split(",");
                if (parts[0].equals(empId)) {
                    System.out.print("Enter new Event ID: ");
                    String newEventId = sc.nextLine();
                    writer.write(empId + "," + newEventId + "\n");
                    found = true;
                } else {
                    writer.write(currentLine + "\n");
                }
            }

            reader.close();
            writer.close();

            if (!found) {
                System.out.println("No registration found to edit.");
                tempFile.delete();
            } else {
                inputFile.delete();
                tempFile.renameTo(inputFile);
                System.out.println("Registration updated.");
            }

        } catch (IOException e) {
            System.out.println("Error updating registration.");
        }
    }
public void viewEmployeeRegistrations(String empId) {
    try (BufferedReader br = new BufferedReader(new FileReader("registrations.txt"))) {
        String line;
        boolean found = false;
        System.out.println("Your Registrations:");
        while ((line = br.readLine()) != null) {
            if (line.startsWith(empId + ",")) {
                System.out.println(line);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No registrations found for Employee ID: " + empId);
        }
    } catch (IOException e) {
        System.out.println("Error reading registrations file.");
    }
}

   public void viewAllRegistrations() {
    File file = new File("registrations.txt");

    System.out.println("\n--- Registered Employee IDs ---");

    try (BufferedReader br = new BufferedReader(new FileReader(file))) {
        String line;
        boolean found = false;

        while ((line = br.readLine()) != null) {
            String[] parts = line.split(",");
            if (parts.length >= 1 && !parts[0].isEmpty()) {
                System.out.println("Employee ID: " + parts[0]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No registrations found.");
        }

    } catch (IOException e) {
        System.out.println("Error reading registrations.");
    }
}

}
