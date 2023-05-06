package outputs;

public class staticfunctions {
	
//	class Car{
//	    static int year;
//	    String company_name;
//	}
//	class new_Car {
//	    public static void main (String[] args) {
//	        Car c=new Car();        
//	        Car.year=2018;              
//	        c.company_name="KIA";
//	        Car d=new Car();
//	        System.out.print(d.year);
//	    }
//	}
//ans Year is of static type i.e. only one memory block of year is created , same for every object.
	//So, it would print 2018.
	
//Q12 error
//	class Test{
//	    static int marks;
//	    void set_marks(int marks)
//	    {
//	        this.marks=marks;               //Line 1
//	    }
//	}
//	class MCQ {
//	    public static void main (String[] args) {
//	        Test t=new Test();              
//	        t.set_marks(78);                //Line 2
//	        System.out.print(Test.marks);   //Line 3
//	    }
//	}	
//	
//there is no error in this code. In this class, there is just a single variable, which is, static variable.
//Static variables are property of the class,but you can access it through objects.
//Hence, line 1 and 2 did not generate any error.  	

//q3	
//	class Vehicle {
//	    public void Print() {
//	        System.out.print("Vehicle's Print() ");
//	    }
//	}
//
//	class FourWheelers extends Vehicle {
//	    public void Print() {
//	        System.out.print("FourWheelers's Print() ");
//	    }
//	}
//
//	class Car extends FourWheelers {
//	    public void Print() {
//	        super.Print();
//	        System.out.print("Car's Print()");
//	    }
//	}
//
//	public class Main {
//	    public static void main(String[] args) {
//	        Car c = new Car();
//	        c.Print();
//	    }
//	}
//	
//ans FourWheelers's Print() Car's Print()	
	
	
	
//Q2
//	class Test 
//	{ 
//	    int a; 
//	    int b; 
//	    Test() 
//	    {   
//	        this(10, 20);   
//	        System.out.print("constructor one "); 
//	    } 
//	    Test(int a, int b) 
//	    { 
//	        this.a = a; 
//	        this.b = b; 
//	        System.out.print("constructor two "); 
//	    } 
//	}
//	class new_test{
//	    public static void main(String[] args) 
//	    { 
//	        Test object = new Test(); 
//	    } 
//	} 
//ans constructor two constructor one
// When the object of Test class is created,the constructor with no arguments is called.
// When  this(10,20) is encountered , the constructor with two arguments int and int is called 
// because this is the reference of the object.
// So using this way we can call more than one constructor.

}
