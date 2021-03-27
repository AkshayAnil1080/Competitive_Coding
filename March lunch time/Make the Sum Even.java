https://www.codechef.com/viewsolution/44232062


/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner sc =  new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
		    int n = sc.nextInt();
		    int a[] = new int[n];
		    double sum = 0;
		    for( int i = 0 ; i <n;i++)
		    {
		        a[i]= sc.nextInt();
		        sum = sum +a[i];
		    }
		    
		    if(sum%2==0)
		    System.out.println("0");
		    else
		    {
		    boolean ans = false;
		    for(int i =0 ; i<n; i++)
		    {
		      
		        double p =  Math.max(0 , Math.ceil(a[i]/2 -1) );
		        double temp =  Math.pow(a[i],p);
		        
		        if(a[i]%2==0 && ( (a[i]+1)/2 )-1 <=0 )  // search for even number and if p<=0 -  max(0,-ve num)= 0;=> make that number a[i] pow 0 =1 => now sum will be even
// we will not check for odd a[i] as no matter how many times you square them it will always give odd number.
 		        {
		            ans=true;
		             break;
		        }
		        
		      //  else if( a[i]%2 ==0 && temp%2!=0)
		      //  {
		      //      ans=true;
		      //       break;
		      //  }

		    }
		    
		    if(ans)
		    System.out.println("1");
		    if(ans==false)
		    System.out.println("-1");
		    }
		      
		    
		}
	}
}


Example Input
4
4
7 3 5 1
5
4 2 7 8 10
2
9 9
3
1 1 1
Example Output
0
1
0
-1