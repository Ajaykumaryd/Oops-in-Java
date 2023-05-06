package qInterface;

public class Car extends Vehicle implements VehicleInterfaces,CarInterface{
	
	public int getSpeed() {
		return 20;
	}
	
	public void print() {
		
	}
	public String getcompany() {
		return null; 
	}
	
}
