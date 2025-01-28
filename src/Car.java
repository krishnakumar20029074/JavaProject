public class Car {
     String licensePlate;
     String ownerName;
     String carModel;
     String serviceType;

    public Car(String licensePlate, String ownerName, String carModel, String serviceType) {
        this.licensePlate = licensePlate;
        this.ownerName = ownerName;
        this.carModel = carModel;
        this.serviceType = serviceType;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getServiceType() {
        return serviceType;
    }

    @Override
    public String toString() {
        return "Car {" +
                "License Plate='" + licensePlate + '\'' +
                ", Owner Name='" + ownerName + '\'' +
                ", Car Model='" + carModel + '\'' +
                ", Service Type='" + serviceType + '\'' +
                '}';
    }
}
