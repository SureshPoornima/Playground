#include<iostream>
using namespace std;
int main()
{
  int n,a=1,b=3;
  cin>>n;
  for(int i=1;i<=n;i++){
    cout<<a<<" ";
    a = a + b;
    b= b + 2;
  }
}