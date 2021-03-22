#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t ;
	cin >>t;
	while(t--)
	{
	    string s ; cin>>s;
	    int c = 0;
	    for( int i  =0 ; i <s.size() ; i++)
	    {
	        if(s[i] == '0' )
	        {
	           continue;
	        }
	        else
	        {
	            c++;
	            
	            while(s[i] == '1')
	            {i++;}
	        }
	    }
	    cout<<c<<endl;
	}
	return 0;
}

Submission : https://www.codechef.com/viewsolution/43609951
Problem: https://www.codechef.com/MARCH21C/problems/GROUPS

Example Input
4
000
010
101
01011011011110
Example Output
0
1
2
4
