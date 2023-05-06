package qabstract;

public  class Car extends Vehicle {

	int numGears;
	boolean isConvertible;
	
	public Car() {
		super(100);
	}
	
	public Car(int numGears, int maxSpeed) {
		super(maxSpeed);
		this.numGears = numGears;
		System.out.println("Car Constructor");
	}
	
	@Override
	public boolean isMotorized() {
		return false;
	}
	
	public String getCompany() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public boolean isConvertible() {
		return isConvertible;
	}
	
	public void print() {
		super.print();
		System.out.println("Car numGears : " + numGears);
		System.out.println("Car isConvertible : " + isConvertible);
}
}