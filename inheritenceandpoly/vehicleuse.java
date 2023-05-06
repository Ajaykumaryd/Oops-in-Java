package inheritenceandpoly;

public class vehicleuse {

	public static void main(String[] args) {
		
		
	  		
	//polymorphism
//		Vehicle obj = new Vehicle();//possible
//		Vehicle obj = new Car(); //possible
//		Car obj = new Car();	//possible
//      Car obj = new Vehicle(); not possible 		
	vehicle v=new car(20,30);
	
	//v.iscovertible; not possible as it lies in car class
	v.print(); //possible as it is function of vehicle class but would contains the elements of car class
	
		
//     vehicle v1=new vehicle(80);
//    // v1.print();      //functionaloverloading
//     v.set(10);
//     
       car c = new car(50,80);
	//c.numofgears = 60;
		c.colour = "Black";
	c.print();
		//c.set(10);
		//c.get();		
		//c.print();   //functional overloading
		//c.get();		
	}
  }
