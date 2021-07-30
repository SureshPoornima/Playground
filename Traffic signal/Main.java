#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
   float d,s,t;
  cin>>s>>d>>t;
  int a=s/d;
  //cout<<a;
  if(a<t)
    cout<<"No";
  else
    cout<<"Yes";

  return 0;
}