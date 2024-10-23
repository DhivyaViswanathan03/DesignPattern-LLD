package ParkingSlotDesign;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
	List<Compact> compactSpotsList = new ArrayList();
	List<Large> largeSpotsList = new ArrayList();
	List<Bike> bikeSpotsList = new ArrayList();
	int freeCompactSpot;
	int freeLargeSpot;
	int freeBikeSpot;

	public ParkingLot(int freeCompactSpot, int freeLargeSpot, int freeBikeSpot) {
		this.freeCompactSpot = freeCompactSpot;
		this.freeLargeSpot = freeLargeSpot;
		this.freeBikeSpot = freeBikeSpot;
	}

	// parking vehicle

	void parkingVehicle(Vehicle vehicle) {
		if (vehicle.getType().equals(VehicleType.truck)) {
			if (freeLargeSpot > 0)
				parkYourLargeVehicle(vehicle);
			else
				System.out.println("Sorry large space not available to park truck..");

		} else if (vehicle.getType().equals(VehicleType.car)) {
			if (freeCompactSpot > 0)
				parkYourCompactVehicle(vehicle);
			else if (freeLargeSpot > 0)
				parkYourLargeVehicle(vehicle);
			else
				System.out.println("Sorry Compact and large space not available to park car..");

		} else if (vehicle.getType().equals(VehicleType.bike)) {
			if (freeBikeSpot > 0)
				parkYourBikeVehicle(vehicle);
			else if (freeCompactSpot > 0)
				parkYourCompactVehicle(vehicle);
			else if (freeLargeSpot > 0)
				parkYourLargeVehicle(vehicle);
			else
				System.out.println("Sorry compact and large and bike space not available to park Bike.. ");

		}
	}

	// unparking vehicle
	private void parkYourLargeVehicle(Vehicle vehicle) {
		Large largeSpot = new Large(SpotType.large);
		largeSpot.setFree(false);
		largeSpot.setVehicle(vehicle);
		vehicle.setSpot(largeSpot);
		largeSpotsList.add(largeSpot);
		System.out.println("Successfully parked ur vehicle==>" + vehicle.getType());
		freeLargeSpot--;

	}

	private void parkYourCompactVehicle(Vehicle vehicle) {
		Compact compactSpot = new Compact(SpotType.compact);
		compactSpot.setFree(false);
		compactSpot.setVehicle(vehicle);
		vehicle.setSpot(compactSpot);
		compactSpotsList.add(compactSpot);
		System.out.println("Successfully parked ur vehicle==>" + vehicle.getType());
		freeCompactSpot--;

	}

	private void parkYourBikeVehicle(Vehicle vehicle) {
		Bike bikeSpot = new Bike(SpotType.bike);
		bikeSpot.setFree(false);
		bikeSpot.setVehicle(vehicle);
		vehicle.setSpot(bikeSpot);
		bikeSpotsList.add(bikeSpot);
		System.out.println("Successfully parked ur vehicle==>" + vehicle.getType());
		freeBikeSpot--;
	}

	void unParkingVehicle(Vehicle vehicle) {
		ParkingSpot parkingSpot = vehicle.getSpot();
		parkingSpot.setFree(true);

		if (parkingSpot.getType().equals(SpotType.large)) {
			if (largeSpotsList.remove(parkingSpot)) {
				System.out.println("Successfully removed :" + vehicle.getType());
				freeLargeSpot++;
			}
		} else if (parkingSpot.getType().equals(SpotType.compact)) {
			if (compactSpotsList.remove(parkingSpot)) {
				System.out.println("successfully removed :" + vehicle.getType());
				freeCompactSpot++;
			}
		}
		else if (parkingSpot.getType().equals(SpotType.bike)) {
			if (bikeSpotsList.remove(parkingSpot)) {
				System.out.println("successfully removed :" + vehicle.getType());
				freeBikeSpot++;
			}
		}

	}

}
