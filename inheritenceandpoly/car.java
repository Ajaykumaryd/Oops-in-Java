package inheritenceandpoly;

public class car extends vehicle{
	
   int numofgears;
   boolean isconvertible;

      //constructor
     car(int numofgears,int maxspeed){
     super(maxspeed);	 
     this.numofgears=numofgears;	 
     System.out.println("car constructor");	     	 	 
     }
     
   public void print (){  
	   //printcar can also work
	   
	System.out.println("car maxspeed is  "+get());
   	System.out.println("car color is  "+colour);  
   	System.out.println("car numofgears is  "+numofgears);
	System.out.println("car is convertible is  "+isconvertible);
	//super.print(); //superkeyword it will print value of car from parent class vehicle
   }
}
