package inheritenceandpoly;

public class vehicle {
       //int maxspeed;
       protected String colour;
       private int maxspeed;
       
//       constructor       
      vehicle(int maxspped){
       System.out.println("vehicle constructor");
       this.maxspeed=maxspeed;
       }
            
       public void set(int n){
    	maxspeed=n;
       }
       
       public int get(){
       return maxspeed;
       }
       
       public void print() {
    	System.out.println("maxspeed is  "+maxspeed);
        System.out.println("color is  "+colour);
      }
}
