#include<bits/stdc++.h>
using namespace std;
int main()
{
 long emptybox[100009];
 long candybox[100009];
 long a[100009];
 long T, i,time, N;
cin>>T;
cin>>N;
 i = 0;
 if( (T <= 10 && T >= 1) && (N <= 10000 && N >= 1)){
 while (i < N && scanf("%ld", &a[i]) == 1)
  i++;
   for(i = 0; i <= (N-1); i++)
 {
 candybox[i] = a[i];
 }
 for(i = 1; i < N; i++){
 candybox[i] = candybox[i-1] + candybox[i];
 emptybox[i-1] = candybox[i];
 }
 for(i = 0; i < N; i++){
 emptybox[i+1] = emptybox[i] + emptybox[i+1];
 time = emptybox[i+1];
 }
cout<<time;
 }
 return 0;
}