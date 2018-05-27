
public class RecursiveFunction {

	
	public int power(int x, int n){
		
		if(n==0){
			
			return 1;
		}
		
		else {
			
			return x * power( x, n-1);
		}
		
	}
	public int sum(int n){
		
		if(n==1){
			return 1;
		}
		else{
			
			return n + sum(n-1);
		}
		
	}
	public int quotient(int m ,int k){
		

		   if(k==1) return m;
		   if(k>m) return 0;
		   return quotient(m-k, k) +1;
		}
	public long fact(int val)
	{
		
		if(val==0){
			return 1;
		}
		
		return val *fact(val-1);
	}
	public long oddevenfact (int n){
		
		
		if (n>2) {
			return(oddevenfact(n-2) *  n);
		}
		else{
		      return(n);
		}

		
	}
	public double harmonic(int n){
		
		if(n==0){
			return 0;
		}
					
		return (1.0/n + harmonic(n-1));
	}
	public int fib(int n){
		
		
		if(n==0 || n==1 )  {
			return n;
		}else {
			
			
			return fib(n-1) + fib(n-2);
		}
		
		
	}
	
}
