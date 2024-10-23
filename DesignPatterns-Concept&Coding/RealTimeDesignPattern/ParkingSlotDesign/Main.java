package ParkingSlotDesign;

public class Main {

	public static void main(String[] args) {
		
		ParkingLot lot=new ParkingLot(2, 2, 2);
		
		Vehicle vehicle=new Vehicle(VehicleType.truck);
		lot.parkingVehicle(vehicle);
		
		lot.unParkingVehicle(vehicle);

	}

}
