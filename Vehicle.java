public class Vehicle {
    protected String vehicleNumber;
    protected int hours;

    public Vehicle(String vehicleNumber, int hours) {
        this.vehicleNumber = vehicleNumber;
        this.hours = hours;
    }

    public double calculateFee() {
        return hours * 30;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }
}
