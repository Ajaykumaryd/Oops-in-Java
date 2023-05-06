package classandobjects;

public class DynamicArray {
	int data[];
	int nextindex;
	
	public DynamicArray(){
	data=new int[5];
	nextindex=0;		
	}
	
	public int size(){
	return nextindex;			
	}	
	//addfunctiion
	public void add(int element){
	if(nextindex==data.length)	
	{	
	restructure();	
	}
	 data[nextindex]=element;
	 nextindex++;	
	}
	
	//restructure
	public void restructure(){
	int temp[]=data;
	data=new int[data.length*2];
	for(int i=0;i<temp.length;i++){
	data[i]=temp[i];	
	}}	
		
	public void set(int index,int element){	
	if(index>nextindex){	
	return;	
	}else if(index<nextindex){	
	 data[index]=element;	
	}else{	
	 add(element);		
	 }
	}
	//get element of index
	public int get(int index){
	if(index>=nextindex){
	return -1;	
	}else{
    return data[index]; 
	}
    }
	//isEmpty
	public boolean isEmpty(){
		if(size()==0){
		return true;	
		}
		else{
			return false;
		}
	}
	
	public int removeLast(){
	int value=data[nextindex-1];
	data[nextindex-1]=0;
	nextindex--;
	return value;	
	}
}
	
	
