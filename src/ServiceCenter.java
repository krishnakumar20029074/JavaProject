import java.util.*;

public class ServiceCenter {
     List<Car> cars;

    public ServiceCenter() {
        cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
        System.out.println("Car added successfully: " + car);
    }

    public void removeCar(String licensePlate) {
        cars.removeIf(car -> car.getLicensePlate().equals(licensePlate));
        System.out.println("Car with license plate " + licensePlate + " removed successfully.");
    }

    public void listCars() {
        if (cars.isEmpty()) {
            System.out.println("No cars in the service center.");
        } else {
            System.out.println("Cars currently in the service center:");
            for (Car car : cars) {
                System.out.println(car);
            }
        }
    }

    public void searchCarByLicense(String licensePlate) {
        for (Car car : cars) {
            if (car.getLicensePlate().equals(licensePlate)) {
                System.out.println("Car found: " + car);
                return;
            }
        }
        System.out.println("Car with license plate " + licensePlate + " not found.");
    }
}
