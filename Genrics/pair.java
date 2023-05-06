package Genrics;

public class pair<T,U> {

	T first;
	U second;
	
	public pair(T a,U b){
		first=a;
		second=b;
	}
	public void setfirst(T first){
	this.first=	first;
	}
	
	public T getfirst(){
		return first;
	}
	
	public void setsecond(U second){
		this.second= second;
		}
		
		public U getsecond(){
			return second;
		}
		
	
	}


