package inheritenceandpoly;

public class RunTimePol {
   
//Runtime polymorphism, also known as the Dynamic Method Dispatch, is a process that resolves a call to an overridden method at runtime.
  //The process involves the use of the reference variable of a superclass to call for an overridden method.   
   
//    method overiding
//      we write methods on super and sub classes in Inertience in such a way that method name and parameter must be same called method overiding

//    rules
//                 method
   static class shape{
       void draw(){
         System.out.println("can't say");
       }
   }

   static class circle extends shape {

       @Override
       void draw() {
           System.out.println("circle");
       }
   }

    public static void main(String[] args) {

    circle c=new circle();
        System.out.println(c.drawyy;


    }}
