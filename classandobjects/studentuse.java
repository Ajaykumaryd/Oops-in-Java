package classandobjects;

public class studentuse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  
		
    Student st1=new Student("ajay",55);
    Student st2=new Student("ayush",22);
   // st1.name="ajay";
    
   // st1.rollnumber=21;
   // st1.setrollnumber(20);
    //st2.name="asheesh";
  //  st2.rollnumber=21;
   // st2.setrollnumber(10);
  //Student.numstudent=10;// we add private to static function so that its value can't be changed
    System.out.println(st1.name +" "+st2.name);
  // System.out.println(st1.rollnumber+" "+st2.rollnumber);
    System.out.println(st1.getrollnumber()+ " "+ st2.getrollnumber());
    st1.print();
    st2.print();
    //System.out.println(st1.numstudent);// static calls
   // System.out.println(Student.numstudent);//better way to call static
    System.out.println(st1.getnumsttudent());
    System.out.println(Student.getnumsttudent());
	}
	
	
}
