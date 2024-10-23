package ParkingSlotDesign;

public class ParkingSpot {
	private Vehicle vehicle;
	private SpotType type;
	Boolean free;

	public ParkingSpot(SpotType type) {
		this.type = type;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}


	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}


	public SpotType getType() {
		return type;
	}


	public void setType(SpotType type) {
		this.type = type;
	}


	public Boolean isFree() {
		return free;
	}


	public void setFree(Boolean free) {
		this.free = free;
	}


	@Override
	public String toString() {
		return "ParkingSpot [vehicle=" + vehicle + ", type=" + type + ", free=" + free + "]";
	}
	
	

}
