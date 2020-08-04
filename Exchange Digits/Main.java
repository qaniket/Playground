#include<iostream>
#include<vector>
#include<algorithm>
#define MAX_SIZE 100
using namespace std;
int main(){
    int n1, n2;
    cin>>n1>>n2;
   int count = 0;
   int v1[MAX_SIZE];
    while(n1 != 0){
        v1[count] = n1%10;
        n1 = n1/ 10;
        count++;
    }
    reverse(v1, v1+count);
    sort(v1, v1+count);
    int is_true = 0;
    int number = 0;
    do{
        int k = 0, t = 0;
        for (int i = 0; i < count; i++) {
            if(v1[0] == 0){
                t++;
                number *= 10;
                number += v1[i];
                reverse(v1, v1+count);
                if(number > n2){
                    cout<<number;
                    is_true = 1;
                    break;
                }
            }
            number *= 10;
            number += v1[i];
        }
        if(number > n2){
            cout<<number;
            is_true = 1;
            break;
        }
        while(number != 0){
            v1[k++] = number%10;
            number = number/ 10;
        }
        reverse(v1, v1+count);
    }while(next_permutation(v1, v1+count));
    if(is_true == 0){
        cout<<"-1";
    }
}