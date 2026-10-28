package edu.monmouth.hw1;
// Joe Wheiler s1409757 Oct 21 FA26

import edu.monmouth.vehicle.*;

public class VehicleList {

	private VehicleNode head;
	
	public VehicleList() {
		head = null;
	}
	
	public void insert(Vehicle v) {
		VehicleNode n = new VehicleNode(v);
		n.setNext(head);
		head = n;
	}
	
	public Vehicle first() {
		if (head == null) return null;
		return head.getVehicle();
	}
	
	public Vehicle last() {
		if (head == null) return null;
		VehicleNode temp = head;
		while (temp.getNext() != null) temp = temp.getNext();
		return temp.getVehicle();
	}
	
	public Vehicle removeFirst() {
		if (head == null) return null;
		VehicleNode temp = head;
		head = head.getNext();
		return temp.getVehicle();		
	}
	
	public void insertEnd(Vehicle v) {
		VehicleNode n = new VehicleNode(v);
		if (head == null) {
			n.setNext(head); head = n; return;
		}
		VehicleNode temp = head;
		while (temp.getNext() != null) temp = temp.getNext();
		temp.setNext(n);
	}
	
	public boolean isEmpty() {
		if (head == null) return true;
		else return false;
	}
	
	public int size() {
		if (head == null) return 0;
		int count = 1;
		VehicleNode temp = head;
		while (temp.getNext() != null) {
			temp = temp.getNext();
			count++;
		}
		return count;
	}
	
	@Override
	public String toString() {
		if (head == null) return "List is empty";
		StringBuilder sb = new StringBuilder();
		VehicleNode temp = head;
		
		while (temp.getNext() != null) {
			sb.append (temp.toString() + "\n");
			temp = temp.getNext();
		}
		
		sb.append (temp.toString() + "\n");
		
		return sb.toString();
	}
}