public class EVVehicle extends Vehicle {

    public EVVehicle(String number, int hours) {
        super(number, hours);
    }

    @Override
    public double calculateFee() {
        return hours * 20;
    }
}
