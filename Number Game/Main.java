#include<iostream>
using namespace std;
int main()
{
  int n,sum=0;
  cin>>n;
  int num[n];
  for (int i=0;i<=n-1;i++)
  {
    cin>>num[i];
  }
  for (int j=0;j<=n-1;j++)
    sum=sum^num[j];
  if(sum==0)
    cout<<"JASBIR ";
  else
    cout<<"AMAN ";
}