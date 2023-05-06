package Genrics;

public class pairuse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    pair <String,String> a=new  pair<String,String>("ab","cd");
     
    a.setfirst("abc"); 
   
    pair <Integer,String> a1= new pair <Integer,String>(10,"cde");
    a1.setsecond("edf");
    
    int q=12;
    int w=13;
    int e=14;

    pair<Integer,Integer> a2=new  pair <>(q,w);
    pair<pair<Integer,Integer>,Integer> a3 = new pair<>(a2,e);
           
    System.out.println(a.getfirst()+" "+a.getsecond());
    
    System.out.println(a1.getfirst()+a1.getsecond());
    
    System.out.println(a2.getfirst()+a3.getsecond());
    
    System.out.println(a2.getfirst()+" "+a2.getsecond()+" "+a3.getsecond());
         
	}

}
