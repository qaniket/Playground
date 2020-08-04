#include<iostream>
using namespace std;
int main()
{
	int n,m;
	cin>>n;
	long long int h[n+1];
	long long int cap[n+1];  
		for(int i=0;i<n;i++)
		{
			cin>>h[i];
			cap[i]=i+1; 
		}
	cin>>m;
	long long int b[m+1];
	int res=0;
	int ctr=0;  
	for(int i=0;i<m;i++)
	{
		ctr=0;  
		cin>>b[i];  
		for(int j=n-1;j>=0;j--)
		{
			if(b[i]<=h[j] && cap[j]!=0)
			{
				cout<<(j+1)<<" "; 
				cap[j]--;
				ctr=1;
				break;  
			}
		}
		if(ctr==0)
			cout<<"0"<<" ";
	}
}