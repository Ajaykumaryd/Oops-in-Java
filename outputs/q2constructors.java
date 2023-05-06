package outputs;

public class q2constructors {
	
}
//q1
//	class Ninja 
//	{ 
//	    Ninja(String name) 
//	    { 
//	        System.out.println("Constructor one " + name); 
//	    } 
//	    Ninja(String name, int age) 
//	    { 
//	        System.out.println("Constructor two " + name + " "+ age); 
//	    } 
//	    Ninja(long id) 
//	    { 
//	        System.out.println("Constructor three " + id); 
//	    } 
//	} 
//
//	class Student 
//	{ 
//	    public static void main(String[] args) 
//	    {  
//	        Ninja geek3 = new Ninja("Dharmesh", 26); 
//	    } 
//	} 
//ans The constructor with two arguments string and integer is called ie Constructor two Dharmesh 26
//}

//Q2

//class Box{
//    int width;
//    int height;
//    int length;
//    void volume(){
//        System.out.println(length * width * height);
//    }
//}
//
//public class BoxUse {
//    public static void main(String[] args) {
//        Box b = new Box();
//        b.height = 5;
//        b.width = 4;
//        b.volume();
//    }
//}
//ans 
//####Default value for an integer data member of a class is 0.
//Thus default value for length is 0, whereas height and width are initialised to 5 and 4 respectively. 
//Volume will thus be 0.

//Q3
//class Student{
//    String name;
//    int rollNo;
//    Student(int num){
//    rollNo = num;
//    }   
//    public void print(){
//    System.out.print(name +" " + rollNo+” “);
//    }
//}
//
//public class StudentUse {
//    public static void main(String[] args) {
//    Student s = new Student(12);
//    s.print();
//    }
//
//ans  
//####Constructor is called when an object is created, 
//here when we create a Student object coressponding student object is created and 
//rollNo is assigned to 12, whereas name is assigned null 
//(as default value for String data member is null). So output is null 12


//Q4
//class Student{
//    String name;
//    int rollNo;
//
//    // Constructor 1
//    Student(int num){
//            rollNo = num;
//            name = "abc";
//    }   
//
//    // Constructor 2
//    Student(int num, String str){
//            rollNo = num;
//            name = str;
//    }
//
//    public void print(){
//            System.out.print(name +" " + rollNo+" ");
//    }
//}
//
//public class StudentUse {
//    public static void main(String[] args) {
//            Student s1 = new Student(101);
//            s1.print();
//            Student s2 = new Student(150, "xyz");
//            s2.print();
//    }
//}
//ans  abc 101 xyz 150
//####While creating first Student object we have just passed single integer argument,
//hence constructor 1 will be called and for second Student object constructor 2 will be called.
//So output will be abc 101 xyz 150