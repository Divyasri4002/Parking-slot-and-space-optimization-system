import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ParkingLot lot = new ParkingLot(5);

        try {

            while (true) {

                System.out.println("\n--- PARKING SYSTEM ---");
                System.out.println("1. Park Standard Vehicle");
                System.out.println("2. Park EV Vehicle");
                System.out.println("3. Remove Vehicle");
                System.out.println("4. Display Slots");
                System.out.println("5. Exit");

                System.out.print("Enter choice: ");
                int choice = sc.nextInt();

                switch (choice) {

                    case 1:
                    case 2:

                        System.out.print("Vehicle Number: ");
                        String number = sc.next();

                        System.out.print("Parking Hours: ");
                        int hours = sc.nextInt();

                        if (hours <= 0) {
                            throw new IllegalArgumentException(
                                "Hours must be positive!"
                            );
                        }

                        Vehicle vehicle;

                        if (choice == 1) {
                            vehicle = new StandardVehicle(number, hours);
                        } else {
                            vehicle = new EVVehicle(number, hours);
                        }

                        lot.parkVehicle(vehicle);
                        break;

                    case 3:

                        System.out.print("Enter Vehicle Number: ");
                        String removeNumber = sc.next();

                        lot.removeVehicle(removeNumber);
                        break;

                    case 4:

                        lot.displaySlots();
                        break;

                    case 5:

                        System.out.println("Thank you!");
                        return;

                    default:
                        System.out.println("Invalid choice!");
                }
            }

        } catch (ParkingException |
                 IllegalArgumentException e) {

            System.out.println("Error: " + e.getMessage());

        } finally {
            sc.close();
        }
    }
}
