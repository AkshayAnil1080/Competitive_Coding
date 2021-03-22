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
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t!=0)
		{
		    int n = sc.nextInt();
		    int a[] =  new int[n];
		    for(int i = 0 ;i<n ;  i++)
		    {
		         a[i] = sc.nextInt();
		    }
		    Arrays.sort(a);
		    int val = 0;
		    int p  = 0 ;
		    for(int i = 0 ;i<n ; i++)
		    {
		        if(a[i] > i+1)
		        {
		            p=1;
		            break;
		        }
		        val = val + (i+1 - a[i]);
		    }
		    
		    if(p==1)
		    System.out.println("Second");
		    else{
		        if(val%2==0)
		        {
		            System.out.println("Second");
		        }
		        else{
		            System.out.println("First");
		        }
		    }
		    t--;
		}
	}
}

Submission : https://www.codechef.com/viewsolution/43632545
Problem : https://www.codechef.com/MARCH21C/problems/SPACEARR

Example Input
4
4
1 2 3 3
4
1 1 3 3
5
1 2 2 1 5
3
2 2 3
Example Output
First
Second
Second
Second