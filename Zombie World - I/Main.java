#include <algorithm> 
#include <iostream>
using namespace std;
int main()
{
	int n, time, z[20],player, min,i,test,check=0;
 	cin>>test;//No. of test cases
 	while(test--)
 	{
  		cin>>n>>time;//No. of zombies & max time
  		for(i=0; i < n; i++)
   			cin>>z[i];//energy of zombies
  		cin>>player>>min;//initial energy and minimum energy required for next level
  		if(time<n) //if given time is less than no.of zombie the player can not complete the level
   			check++;
   		else
   		{
   			sort(z, z+n);
  			for(i=0;i<n;i++)
  			{
   				if(player>=z[i])
    				player+=(player-z[i]);//if player wins player gains the diffrence of energy
   				else
   				{
    				check++;
    				break;
   				}
  			}
		}
   		(player>=min && !check)?cout<<"YES":cout<<"NO";;//check energy for next level
 		check=0;
 	}
 	return 0;
}