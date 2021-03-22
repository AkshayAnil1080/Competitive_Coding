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
	sc.nextLine();
	while(t-- >0)
	{
	    String s =  sc.nextLine();
	   
	    String str =  s.replace("party" , "pawri");
	   
	    System.out.println(str);
	    
	}
	}
}

Submission : https://www.codechef.com/viewsolution/43986529
Problem : https://www.codechef.com/COOK127C/problems/PAWRI

Example Input
3
part
partypartiparty
yemaihuyemericarhaiauryahapartyhorahihai
Example Output
part
pawripartipawri
yemaihuyemericarhaiauryahapawrihorahihai