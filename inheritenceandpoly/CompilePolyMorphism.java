package inheritenceandpoly;

public class CompilePolyMorphism {

    //by method overloading
//    when a class contains more than ane method with same name but different parameters,data types

//
   static class A {
    void add() {
        int a = 10;
        int b = 20;
        System.out.println(a + b);
    }

    void add(int a, int b) {
        System.out.println(a * b);
    }

    void add(int a, double b) {
        System.out.println(a + b);

    }
}
    public static void main(String[] args) {
      A a= new A();
      a.add();
      a.add(1,2);
      a.add(4,2.2);



    }
}

