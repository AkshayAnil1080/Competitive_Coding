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
		int n = sc.nextInt();
		int h = sc.nextInt();
		int x = sc.nextInt();
		int p = 0;
		int a[]  = new int[n];
		for(int i = 0 ; i<n ; i++)
		{
		    a[i] = sc.nextInt();
		    
		}
		
		for(int i = 0 ; i<n; i++)
		{
		    if(x+a[i] >= h)
		    {
		    p = 0;
		    break;
	        }
	        else
	        p=1;
	        
		}
		if(p==0)
		System.out.println("YES");
		else
		System.out.println("NO");
		
	}
}

Submission: https://www.codechef.com/MARCH21C/status/NOTIME,crazy_romeo
Problem : https://www.codechef.com/MARCH21C/problems/NOTIME

Example Input 1
2 5 3
1 2
Example Output 1
YES
Explanation
Chef already has 3 hours left. He can go to the 2-nd time zone, which is 2 hours back in time. Then he has a total of 3+2=5 hours, which is sufficient to solve the problem