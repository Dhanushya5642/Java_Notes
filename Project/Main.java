import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EventService eventService = new EventService();
        Register register = new Register();

        System.out.println("Event Management System!!");
        System.out.println("1. Manager");
        System.out.println("2. Employee");
        System.out.print("Choose your role (1 or 2): ");
        int role = getIntInput(sc);

        if (role == 1) {
            while (true) {
                System.out.println("\n Manager Menu ");
                System.out.println("1. Create Event");
                System.out.println("2. Edit Event");
                System.out.println("3. View All Events"); 
                System.out.println("4. Delete Event");  
                System.out.println("5. View All Registrations");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");
                int managerChoice = getIntInput(sc);

                switch (managerChoice) {
                    case 1:
                        eventService.createEvent(sc);
                        break;
                    case 2:
                        eventService.editEvent(sc);
                        break;
                    case 3:
                        eventService.viewAllEvents();
                        break;
                    case 4:
                        eventService.deleteEvent(sc);
                        break;
                    case 5:
                        register.viewAllRegistrations();
                        break;
                    case 6:
                        System.out.println("Exiting Manager Panel.");
                        return;
                    default:
                        System.out.println("Invalid option. Try again.");
                }
            }

        } else if (role == 2) {
            System.out.print("Enter your Employee ID: ");
            String empId = sc.nextLine();

            while (true) {
                System.out.println("\n--- Employee Menu ---");
                System.out.println("1. Register for Event");
                System.out.println("2. Edit Registration");
                System.out.println("3. View My Registrations");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                int empChoice = getIntInput(sc);

                switch (empChoice) {
                    case 1:
                        register.registerForEvent(sc, empId);
                        break;
                    case 2:
                        register.editRegistration(sc, empId);
                        break;
                    case 3:
                        register.viewEmployeeRegistrations(empId);
                        break;
                    case 4:
                        System.out.println("Exiting Employee Panel.");
                        return;
                    default:
                        System.out.println("Invalid option. Try again.");
                }
            }

        } else {
            System.out.println("Invalid role selected. Exiting.");
        }

        sc.close();
    }

    private static int getIntInput(Scanner sc) {
        int num = -1;
        while (true) {
            try {
                num = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.print("Please enter a valid number: ");
            }
        }
        return num;
    }
}
