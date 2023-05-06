package classandobjects;

public class fraction {
    
	private int num;
	private int deno;
	
	public fraction(int num,int deno){  //constructors
	this.num=num;
	if(deno==0){
	//error out	
	}
	this.deno=deno;
	simplify();
	}

	public void setdeno(int d){
	this.deno=d;
	simplify();
	}
	
	public int getdeno() {
	return deno;}
	
	public void setnum(int n){
	this.num=n;
	simplify();
	}
		
	public int getnum() {
	return num;}
		
	public void print(){
	if(deno==1){
	System.out.println(num);	
	}else {
    System.out.println(num+"/"+deno);
	}		
	}
	
	public static fraction add(fraction f1,fraction f2){
	int newnum=f1.num*f2.deno+f2.num*f1.deno;
	int newdeno=f1.deno*f2.deno;
	fraction f=new fraction(newnum,newdeno);
	return f;
	}
	
    public void add(fraction f2){
	this.num=this.num*f2.deno+this.deno*f2.num;
	this.deno=this.deno*f2.deno;
	simplify();
    }
	
	public void multiply(fraction f2){
	this.num=this.num*f2.num;
	this.deno=this.deno*f2.deno;
	simplify();
	}	
	
	private void simplify(){// can only be used in this class
	int gcd=1;
	int smaller=Math.min(num,deno);
	for(int i=2;i<=smaller;i++){
	    if(num%i==0 && deno%i==0){
	    gcd=i;
	    }}
	 num=num/gcd;
	 deno=deno/gcd;
	}
	
}
