#include <algorithm> 
#include<iostream>
using namespace std;
int main()
{
    long int b,n;
    cin>>b>>n;
    long int z[n];
    for(long int i=0;i<n;i++)
        cin>>z[i];
    sort(z, z+n);     
    for(long int i=0;i<n;i++)
       b-=(z[i]%2)+(z[i]/2);
    if(b<0)
        cout<<"NO";
    else
        cout<<"YES";
}