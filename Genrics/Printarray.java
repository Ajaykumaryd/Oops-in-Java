package Genrics;

public class Printarray {

	public static <T> void print( T a[]){
	
	for(int i=0;i<a.length;i++){
		System.out.print(a[i]+" ");
	}						
	}		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Integer a[]=new Integer[10];   
    for(int i=0;i<a.length;i++){
    	a[i]=i+1;
    }
    
    String a1[]=new String[10];   
    for(int i=0;i<a1.length;i++){
    	a1[i]="arush";
    }
	print(a);
	System.out.println();
	print(a1);    
	}
}
