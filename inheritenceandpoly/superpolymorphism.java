package inheritenceandpoly;

public class superpolymorphism {
//	class Vehicle 
//	{ 
//	    int maxSpeed = 120; 
//	} 
//	class Car extends Vehicle 
//	{ 
//	    int maxSpeed = 180; 
//	    void display() 
//	    { 
//	        System.out.println(super.maxSpeed); 
//	    } 
//	} 
//	class Test 
//	{ 
//	    public static void main(String[] args) 
//	    { 
//	        Car c = new Car(); 
//	        c.display(); 
//	    } 
//	}} 
//ans 120	

//	class Person 
//	{ 
//	    void fun() 
//	    { 
//	        System.out.print("person class"); 
//	    } 
//	} 
//	class Student extends Person 
//	{ 
//	    void fun() 
//	    { 
//	        System.out.print("student class"); 
//	    } 
//	    void display() 
//	    { 
//	        fun(); 
//	        super.fun(); 
//	    } 
//	} 
//	class Test 
//	{ 
//	    public static void main(String args[]) 
//	    { 
//	        Student s = new Student(); 
//	            s.display(); 
//	    } 
//	} 
// ans student classperson class	
	
//q4
//	class Vehicle{
//	    void print(){
//	    System.out.print("Vehicle class");
//	    }
//	}
//	class Car extends Vehicle{
//	    void print(){
//	    System.out.print("Car class ");
//	    }
//	}
//
//	public class Main {
//	    public static void main(String[] args){   
//	    Vehicle obj1 = new Car();
//	    obj1.print();
//
//	    Vehicle obj2 = new Vehicle();
//	    obj2.print();  
//	    }
// ans Car class Vehicle class
		
//q5
//	class Vehicle{
//	    String colour;
//	    private int number;
//	    void print()
//	    {
//	        System.out.println("vehicle");
//	    }
//	}
//
//	class Car extends Vehicle{
//	    void print()
//	    {
//	        System.out.println("car");
//	    }
//	}
//	class Honda extends Car{
//	    void print()
//	    {
//	        System.out.println("Honda");
//	    }
//	}
//	class buy_car{
//	    public static void main (String[] args) {
//	        Car c=new Honda();
//	        c.print();
//	    }
//	}
//ans car	
}