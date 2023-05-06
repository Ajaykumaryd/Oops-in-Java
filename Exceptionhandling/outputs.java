package Exceptionhandling;

public class outputs {
//	class ThrowsExecp { 
//		static void fun() throws Exception 
//		{ 
//		    throw new Exception(); 
//		} 
//		public static void main(String args[]) 
//		{   
//		    try { 
//		        fun(); 
//		    } 
//		    catch (Exception e) { 
//		        System.out.print("caught in main."); 
//		    }
//		    System.out.print("All is well"); 
//		} 
//		} 
//ans caught in main.All is well


//Q2
//class ExceptionThrown 
//{ 
//    static int divideByZero(int a, int b){ 
//        int i = a/b;  
//        return i; 
//    } 
//    static int computeDivision(int a, int b) { 
//        int res =0; 
//        try
//        { 
//          res = divideByZero(a,b); 
//        } 
//        catch(NumberFormatException ex) 
//        { 
//           System.out.println("Exception occured");  
//        } 
//        return res; 
//    } 
//    public static void main(String args[]){ 
//        int a = 1; 
//        int b = 1; 
//        int i=0;  
//        try
//        { 
//             i = computeDivision(a,b); 
//
//        } 
//        catch(ArithmeticException ex) 
//        { 
//            System.out.println(ex.getMessage()); 
//        }
//        System.out.print(i);
//    } 
//} 
//ans 1

//q3
//class A{
//    public static void main(String[] args){
//
//    try{
//        return;
//    }
//    finally{
//        System.out.println("Hello coding ninjas");
//    }
//  }
//Hello coding ninjas

//class A{
//    public static void A(){
//        System.out.print("Good ");
//        throw new RuntimeException();
//    }
//    public static void B(){
//         A();
//         System.out.print("This ");
//    }
//    public static void main(String[] args){
//        try{
//           B();
//        }
//        catch(Exception e){
//           System.out.print("Time ");
//        }
//        finally{
//           System.out.print("at CodingNinjas");
//        }
//    }
//}


}


