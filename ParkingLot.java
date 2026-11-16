public class ParkingLot {

    ParkingSlot[] slots;

    public ParkingLot(int totalSlots) {

        slots = new ParkingSlot[totalSlots];

        for (int i = 0; i < totalSlots; i++) {
            slots[i] = new ParkingSlot(
                i + 1, i < 2
            );
        }
    }

    public void parkVehicle(Vehicle vehicle)
            throws ParkingException {

        for (ParkingSlot slot : slots) {

            if (!slot.occupied &&
                slot.evSlot == (vehicle instanceof EVVehicle)) {

                slot.vehicle = vehicle;
                slot.occupied = true;

                System.out.println(
                    vehicle.getVehicleNumber() +
                    " parked in slot " + slot.slotNumber
                );

                return;
            }
        }

        throw new ParkingException(
            "No suitable parking slot available!"
        );
    }

    public void removeVehicle(String number)
            throws ParkingException {

        for (ParkingSlot slot : slots) {

            if (slot.occupied &&
                slot.vehicle.getVehicleNumber().equals(number)) {

                System.out.println(
                    "Parking Fee: Rs. " +
                    slot.vehicle.calculateFee()
                );

                slot.vehicle = null;
                slot.occupied = false;

                System.out.println("Vehicle removed successfully.");
                return;
            }
        }

        throw new ParkingException("Vehicle not found!");
    }

    public void displaySlots() {

        for (ParkingSlot slot : slots) {

            System.out.println(
                "Slot " + slot.slotNumber + " : " +
                (slot.occupied ? "Occupied" : "Available")
            );
        }
    }
}
