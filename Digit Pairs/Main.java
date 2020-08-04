#include<iostream>
using namespace std;
int bit(int n)
{
  int min=999, max=0;
  while(n!=0)
  {
    int rem = n%10;
    if(min>rem)
      min =rem ;
    if(max<rem)
      max=rem;
    n/=10;
  }
  int ans = (max*11 + min*7)%100;
  return ans;
}
int main()
{
  int i,j,size;
  cin>>size;
  if(size>0 && size<=500)
  {
    int arr[size];
    for(i=0;i<size;i++)
    {
      cin>>arr[i];
      int count=0;
      int temp=arr[i];
      while(temp)
      {
        count++;
        temp/=10;
      }
      if(count!=3)
      {
        cout<<"Invalid Input";
        return 0;
      }
      arr[i] = bit(arr[i]);
    }
    int msb_count=0,pairs=0;
    for(i=0;i<size;i++)
    {
      msb_count=0;
      for(j=i+2;j<size;j=j+2)
      {
        if(arr[i] ==0)
          break;
        else if(arr[i] /10 == arr[j]/10)
        {
          msb_count++;
          arr[j]=0;
          if(msb_count<=2)
            pairs++;
        }
      }
    }
    cout<<pairs;
  }
  else
  {
    cout<<"Invalid Input";
  }
  return 0;
}