https://www.codechef.com/viewsolution/44231326

#include <iostream>
using namespace std;

int main() {
	// your code goes here
	
	int t;
	cin>>t;
		while(t--)
		{
		    
		  double u ,v, a,s;
		  cin>>u>>v>>a>>s;
	
		   if( u*u - 2*a*s <= v*v)
    		  cout<<"yes"<<endl;
    		   else
    		  cout<<"no"<<endl;
		    }
	return 0;
}


Chef is playing Need For Speed. Currently, his car is running on a straight road with a velocity U metres per second and approaching a 90∘ turn which is S metres away from him. To successfully cross the turn, velocity of the car when entering the turn must not exceed V metres per second.

The brakes of Chef's car allow him to slow down with a deceleration (negative acceleration) not exceeding A metres per squared second. Tell him whether he can cross the turn successfully. The velocity v when entering the turn can be determined from Newton's 2nd law to be v2=U2+2⋅a⋅S if the car is moving with a uniform acceleration a.
Example Input
3
1 1 1 1
2 1 1 1
2 2 1 1
Example Output
Yes
No
Yes
