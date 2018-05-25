
public class Counter1 {


private int counter ;
private int limit;

private static int nCounters=0;

public Counter1( int counter,int limit){
	
	this.limit=limit;
	this.counter=counter;
	
	nCounters++;
}

public void decrement(){
	
	if( counter >0)
		
		counter--;			
}
	

	
public void increment(){
	
	if( counter < limit)
		
		counter++;			
}
	

public int getValue (){
	
	return counter;
}

public static  int getNCounters (){
	
	return nCounters;
	
}
	
}