public class StandardVehicle extends Vehicle {

    public StandardVehicle(String number, int hours) {
        super(number, hours);
    }

    @Override
    public double calculateFee() {
        return hours * 30;
    }
}
