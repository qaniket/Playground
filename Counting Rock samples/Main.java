#include<iostream>
using namespace std;

int main()
{
  int s,r,count=0;
  cin>>s>>r;
  int sample[s];
  for(int i=0;i<=s-1;i++)
  {
    cin>>sample[i];
  }
  int size[2*r];
  for(int j=0;j<=r-1;j++)
  {
    cin>>size[j]>>size[j+1];
    for(int i=0;i<=s-1;i++)
    {
      if(sample[i]>=size[j] && sample[i]<=size[j+1])
         count++;
    }
    cout<<count<<" ";
    count=0;
  }
  
}