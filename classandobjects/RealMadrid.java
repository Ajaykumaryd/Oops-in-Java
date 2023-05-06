package classandobjects;

public class RealMadrid {

	String name;
	String color;
	private int jerseynum;
	
	public RealMadrid(String n,int num){
		name=n;
		jerseynum=num;
	}	
	public void setnum(int n){
		if(n<0){
			return;
		}
		jerseynum=n;
	}
	public int getnum(){
		return jerseynum;
	}
	
    public static void main(String[] args) {
	// TODO Auto-generated method stub
    RealMadrid p1=new RealMadrid("Benzema",9);
    RealMadrid p2=new RealMadrid("vini",20);
    // p1.name="benzema";
    // p1.setnum(9);

    System.out.println(p1.getnum()+" "+p2.getnum());
    System.out.println(p1.name+" "+p2.name); 
     }
    
}

