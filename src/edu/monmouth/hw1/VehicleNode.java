package edu.monmouth.hw1;
// Joe Wheiler s1409757 Oct 21 FA26

import edu.monmouth.vehicle.*;

public class VehicleNode {

	private Vehicle vehicle;
	private VehicleNode next;
	
	public VehicleNode(Vehicle vehicle) {
		this.setVehicle(vehicle);
		this.next = null;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public VehicleNode getNext() {
		return next;
	}

	public void setNext(VehicleNode next) {
		this.next = next;
	}
	
	@Override
	public String toString() {
		return vehicle.toString();
	}
	
}