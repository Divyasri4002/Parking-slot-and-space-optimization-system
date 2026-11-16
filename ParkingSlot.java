public class ParkingSlot {

    int slotNumber;
    boolean occupied;
    boolean evSlot;
    Vehicle vehicle;

    public ParkingSlot(int slotNumber, boolean evSlot) {
        this.slotNumber = slotNumber;
        this.evSlot = evSlot;
        this.occupied = false;
    }
}
