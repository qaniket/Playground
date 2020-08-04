#include<iostream>
#include<set>
using namespace std;
#define MAX_NOS 70

int concat_nos(int a, int b)
{
	if(b < 10)
	{
		return (a * 10) + b;
	}
	
	return (a * 100) + b;
}

int is_prime(int n)
{
	if(n <= 3)
	{
		return 1;
	}
	
	int i;
	for(i = 2; i <= (n/2); i++)
	{
		if(n % i == 0)
		{
			return 0;
		}
	}
	
	return 1;
}

int main()
{
	int primes[MAX_NOS];
	int N, prime_count = 0, concated_cnt = 0, i, j;
	
	cin>>N;
	for(i = 2; i <= N; i++)
	{
		if(is_prime(i))
		{
			primes[prime_count++] = i;
		}
	}
	set <int, greater <int> > s1;
	for(i = 0; i < prime_count; i++)
	{
		for(j = i + 1; j < prime_count; j++)
		{
			if(i == j)
			{
				continue;
			}
			int concated_no1 = concat_nos(primes[i], primes[j]);
			int concated_no2 = concat_nos(primes[j], primes[i]);
		
			if(is_prime(concated_no1))
			    s1.insert(concated_no1);
			if(is_prime(concated_no2))
			    s1.insert(concated_no2);
		}
	}
	concated_cnt = s1.size();
	cout<<concated_cnt;

	return 0;
}