#include<iostream>
#include<cstring>
using namespace std;
bool ispali(string s)
{ 
    for(int i=0,j=s.size()-1;i<j;i++,j--) 
        if(s[i]!=s[j]) 
            return false; 
    return true; 
}
void rotateFront(string& str)
{
    string s=str;
    for(int j=0;j<str.size();j++)
    {
        s[j]=str[(j+1)%str.size()];
    }
    str=s;
}
void rotateBack(string& str)
{ 
    string s=str;
    s[0]=str[str.size()-1];
    for(int j=str.size()-1;j>0;j--)
    {
        s[j]=str[j-1];
    }
    str=s;
}
int main()
{ 
    int T; 
    cin>>T; 
    while(T--)
    { 
        int res=-1; 
        string str,s1,s2; 
        cin>>str;
        if(ispali(str))
        {
            cout<<0<<endl;
        }
        else
        {
            s1=s2=str;
            for(int it=0;it<str.size();it++)
            {
                
                rotateFront(s1);
                rotateBack(s2);
                if(ispali(s1) or ispali(s2))
                {
                    res=it+1;
                    break;
                }
            }
            cout<<res<<endl;
        }
    }   
    return 0;
}