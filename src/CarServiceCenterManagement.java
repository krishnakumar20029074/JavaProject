import java.util.*;

public class CarServiceCenterManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ServiceCenter serviceCenter = new ServiceCenter();

        while (true) {
            System.out.println("\nCar Service Center Management");
            System.out.println("1. Add a Car");
            System.out.println("2. Remove a Car");
            System.out.println("3. List all Cars");
            System.out.println("4. Search Car by License Plate");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1 ->{
                    System.out.print("Enter license plate: ");
                    String licensePlate = scanner.nextLine();
                    System.out.print("Enter owner name: ");
                    String ownerName = scanner.nextLine();
                    System.out.print("Enter car model: ");
                    String carModel = scanner.nextLine();
                    System.out.print("Enter service type: ");
                    String serviceType = scanner.nextLine();

                    Car car = new Car(licensePlate, ownerName, carModel, serviceType);
                    serviceCenter.addCar(car);
                    break;
                }

                case 2 ->{
                    System.out.print("Enter license plate of car to remove: ");
                    String removeLicense = scanner.nextLine();
                    serviceCenter.removeCar(removeLicense);
                    break;
                }

                case 3 ->{
                    serviceCenter.listCars();
                    break;
                }

                case 4 ->{
                    System.out.print("Enter license plate to search: ");
                    String searchLicense = scanner.nextLine();
                    serviceCenter.searchCarByLicense(searchLicense);
                    break;
                }

                case 5 ->{
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    return;
                }

                default ->{
                    System.out.println("Invalid choice. Please try again.");
            }
            }
        }
    }
}

