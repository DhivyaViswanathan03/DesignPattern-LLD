package ParkingSlotDesign;

public class Vehicle {
	private int vehicleNo;
	private VehicleType type;
	private ParkingSpot spot;
	
	Vehicle(VehicleType type){
		this.type=type;
	}
	
	public ParkingSpot getSpot() {
		return spot;
	}

	public void setSpot(ParkingSpot spot) {
		this.spot = spot;
	}

	
	
	public int getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(int vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public VehicleType getType() {
		return type;
	}
	public void setType(VehicleType type) {
		this.type = type;
	}
	

}
