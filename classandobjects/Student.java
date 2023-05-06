package classandobjects;

public class Student {
	String name;
//	 int rollnumber;
	private int rollnumber; 
    private static int numstudent;
//	public Student() {
//	rollnumber=100;	
//	}	
    //for private numstudents
    static public int getnumsttudent(){
    return numstudent;	
    }
    
	//constructor
	public Student(String a) {
	name=a;		
	}
	//for constructors
	public Student(String n,int m) {	
	name=n;	
	rollnumber=m;
	numstudent++;
	}
	//for calling private data
	public void setrollnumber(int n){
	rollnumber=n;
	}
	//for calling private data
	public int getrollnumber(){
    return rollnumber;	
	}
	
	public void print(){
	System.out.println(name+" :"+rollnumber);					

	}}
