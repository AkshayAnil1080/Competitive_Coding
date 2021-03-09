class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		long t = sc.nextInt();
		
		while(t>0){
		    	long b = sc.nextInt();
		long i = 0 ;
		while(( 1 << i) <= b)
		{
		    i++;    // returns 4 if b ==13  // or while(b>0)  {
		}
		
		
		long x = ( ( 1<< (i-1) ) -1 );   // 
		long y = b^x ;
		
		System.out.println(x*y);
		
		t--;
		}
	}
}


TC : O(logn)
SC : O(1)

Example Input
2
13
10
Example Output
70
91 

