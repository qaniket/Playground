// A Dynamic Programming based C++ program to find minimum of coins 
// to make a given change V 
#include<bits/stdc++.h> 
using namespace std; 

// m is size of coins array (number of different coins) 
int minCans(int cans[], int m, int V) 
{ 
	// table[i] will be storing the minimum number of cans 
	// required for i value. So table[V] will have result 
	int table[V+1]; 

	// Base case (If given value V is 0) 
	table[0] = 0; 

	// Initialize all table values as Infinite 
	for (int i=1; i<=V; i++) 
		table[i] = INT_MAX; 

	// Compute minimum cans required for all 
	// values from 1 to V 
	for (int i=1; i<=V; i++) 
	{ 
		// Go through all cans smaller than i 
		for (int j=0; j<m; j++) 
		if (cans[j] <= i) 
		{ 
			int sub_res = table[i-cans[j]]; 
			if (sub_res != INT_MAX && sub_res + 1 < table[i]) 
				table[i] = sub_res + 1; 
		} 
	} 
	return table[V]; 
} 

// Driver program to test above function 
int main() 
{ 
	int cans[] = {1,5,7,10}; 
	int m = sizeof(cans)/sizeof(cans[0]); 
	int V,i,n;
    cin>>n;
   
   
  	for(i=0;i<n;i++)
      { 
        cin>>V; 
	    cout << minCans(cans, m, V)<<endl; 
      }
	return 0; 
} 