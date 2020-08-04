#include <bits/stdc++.h>
using namespace std;
long int minproduct(long int a[], long int b[], long int n, long int k)
{
	long int diff = 0, res = 0;
	long int temp;
	for (long int i = 0; i < n; i++)
	{
		long int pro = a[i] * b[i];
		res = res + pro;
		if (pro < 0 && b[i] < 0)  // b[i] is -ve
			temp = (a[i] + 2 * k) * b[i];
			
		else if (pro < 0 && a[i] < 0) // pro -ve and a[i] -ve
			temp = (a[i] - 2 * k) * b[i];
			
		else if (pro > 0 && a[i] < 0) // pro +ve and a[i] -ve
			temp = (a[i] + 2 * k) * b[i];
			
		else if (pro > 0 && a[i] > 0) // pro +ve and a[i] +ve
			temp = (a[i] - 2 * k) * b[i];
			
		long int d = abs(pro - temp);
		if (d > diff)
			diff = d;
	}
	return res - diff;
}
int main()
{
	long int n,mod;
	cin>>n>>mod;
	long int a[n], b[n];
	for (long int i = 0; i < n; i++)
	{
		cin>>a[i];
	}
	for (long int i = 0; i < n; i++)
	{
		cin>>b[i];
	}
	cout<<minproduct(a, b, n, mod);
	return 0;
}