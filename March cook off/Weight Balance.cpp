#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t ;
	cin>>t;
	while(t--)
	{
	    int w1,w2,x1,x2,m;
	    cin>>w1>>w2>>x1>>x2>>m;
	    
	    int r1 = x1 * m; 
	    int r2 =  x2 * m;
	    int inc = w2 -w1;
	    
	    if(inc >= r1  && inc <= r2)
	    {
	        cout<<1<<endl;
	   
	    }
	    else
	    cout<<0<<endl;
	  
	}

	
	
	return 0;
}

Submission : https://www.codechef.com/viewsolution/43972646
Problem : https://www.codechef.com/COOK127C/problems/WEIGHTBL/
Example Input
5
1 2 1 2 2
2 4 1 2 2
4 8 1 2 2
5 8 1 2 2
1 100 1 2 2
Example Output
0
1
1
1
0