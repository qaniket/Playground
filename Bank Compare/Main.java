#include<bits/stdc++.h>
using namespace std;
double power(double b,int a)
{
    int i;
    double pow=1;
    for(i=0;i<a;i++)
    {
        pow=pow*b;
    }
    return pow;
}
int main() {
	double p,s,mi,sum,emi,j1,j,bank[5],sq;
	int y,n,k,i,yrs,y1,l=0;
    cin>>p;
	scanf("%d",&y);
	for(k=0;k<2;k++)
	{
	cin>>n;
	sum=0;
	for(i=0;i<n;i++)
	{
	    cin>>yrs;
	    cin>>s;
	    mi=0;
	    j=s/1200;
	    j1=1+j;
	    y1=yrs*12;
	    sq=power(j1,y1);
	    emi=p*(j/(1-(1/(sq))));
	    mi=emi*y1;
	    sum=sum+mi;
	}
	bank[l++]=sum;
	}
	if(bank[0]<bank[1])
	cout<<"Bank A";
	else
	cout<<"Bank B";
	return 0;
}