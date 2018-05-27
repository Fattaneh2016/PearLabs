
public class RecursionStars {

	
	public boolean equals(int x,int y){
		
		if( (x<0) || (y<0) ) return false;

		
		if(x==0 && y==0 ) {
			return true;
		}
		
		
			
			return equals(x-1,y-1);

		
	}
	void printTriangle(int n){
		   if(n <= 0) return;
		   System.out.println(makeStars(n));
		   
		   printTriangle(n-1);
		}
	
	public void printTriangle(int n){
		   if(n <= 0) return;
			printTriangle(n-1);

		   printStars (n);
			
			}
	public   String makeStarBucks ( int n){
		
		if(n==0) 
				return "";
			
				else return "*" +  makeStarBucks(n-1) + "$"; 
		
	}
	public void printPowerOfTwoStars (int n ){
		
		if(n==0){
			
			System.out.print("*");
			
		}else
		{
			
			printPowerOfTwoStars(n-1);
			printPowerOfTwoStars(n-1);
			
		}
	}
	
}
