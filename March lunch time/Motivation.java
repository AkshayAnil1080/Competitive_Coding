https://www.codechef.com/viewsolution/44148802

#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t ; 
	cin>>t;
	while(t--)
	{
	    int n,x;
	    int s, r;
	    int max=0;
	    
	    cin>>n>>x;
	    while(n--)
	    {   
	        cin>>s>>r;
	        
	        if(s<=x && r>=max)
	        max = r;
	    }
	    
	    cout<<max<<endl;
	}
	return 0;
	
}




Chef has been searching for a good motivational movie that he can watch during his exam time. His hard disk has X GB of space remaining. His friend has N movies represented with (Si,Ri) representing (space required, IMDB rating). Help Chef choose the single best movie (highest IMDB rating) that can fit in his hard disk.
Example Input
3
1 1
1 1
2 2
1 50
2 100
3 2
1 51
3 100
2 50
Example Output
1
100 
51

