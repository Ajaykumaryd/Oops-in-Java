package classandobjects;

public class fractionuse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      fraction f1=new fraction(20,40);
      f1.print();//1/2
      
      f1.setnum(16);//16/2=8/1
      int d=f1.getdeno();//1
      int f=f1.getnum();//8
      System.out.println(d);//1
      System.out.println(f);//8     
      f1.print();//8
            
      f1.setnum(10);
      f1.setdeno(30);
      f1.print();// 1/3
      
      fraction f2=new fraction(3,4);
      f1.add(f2); //1/3+3/4=13/12
      f1.print();// 13/12
      f2.print();// 3/4
      
      fraction f3=new fraction(4,5);
      f3.multiply(f2);//4/5*3/4=3/5
      f3.print();//3/5
      f2.print();//3/4
      
      fraction f4=fraction.add(f1,f3); //static function
      f1.print();//13/12
      f2.print();//3/4
      f3.print();//3/5
      f4.print();//101/60
	}
     
}
