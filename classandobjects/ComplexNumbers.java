package classandobjects;

public class ComplexNumbers {
       int real;
       int imaginary;

       public ComplexNumbers(int re,int im){
	   real=re;
	   imaginary=im;
       }
       
       //print function
       public void print(){
       System.out.println(real+" +"+" i"+imaginary);                                    
       }

       //addfunction
       public void plus(ComplexNumbers n){
       //int re=real+n.real;
       //int im=imaginary+n.imaginary;
       //real=re;
       //imaginary=im;	
    	real=real+n.real;
    	imaginary=imaginary+n.imaginary;
       }

       //multiplyfunction
       public void multiply(ComplexNumbers m){
//       int re=(real*m.real)-(imaginary*m.imaginary);
//       int im=(real*m.imaginary)+(imaginary*m.real);
//       real=re;
//       imaginary=im;	
    	real=(real*m.real)-(imaginary*m.imaginary);
        imaginary=(real*m.imaginary)+(imaginary*m.real);
       }
  }