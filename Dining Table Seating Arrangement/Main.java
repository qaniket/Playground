#include<bits/stdc++.h>
using namespace std;
int main()
{
  int test_case;
  cin >> test_case;
  for(int i = 1; i <= test_case; i++)
  {
    int tables, attendees, PA, PB, TA, TB, j;
    cin >> tables >> attendees;
    long long int fact[attendees + 2];
    long long int divide, arrange;
    //for cases where tables are greater than the number of attendees
    if(tables >= attendees)
    {
      cout << "1" << endl;
    }
    //for all other cases
    else
    {
      //find the number of attendees to be seated in each type A and type B table
      PA = attendees / tables;
      PB = PA + 1;
      //find the number of type A and type B tables
      TB = attendees % tables;
      TA = tables - TB;
      //calculating the factorial values and storing in an array
      fact[0] = 1;
      for(j = 1; j <= attendees + 1; j++)
      {
        fact[j] = j * fact[j-1];
      }
      //Dividing people between tables
      divide = fact[attendees] / (pow(fact[PA], TA) * pow(fact[PB], TB) * fact[TA] * fact[TB]);
      //Arranging the people after dividing them
      if(PB >= 4)
      {
        arrange = divide * (pow(fact[PA - 1] / 2, TA) * pow((fact[PB - 1] / 2), TB));
      }
      else
      {
        arrange = divide;
      }
	cout << arrange << endl;
    }
  }
  return 0;
}