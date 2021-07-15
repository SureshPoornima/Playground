#include<iostream>
using namespace std;
int main()
{
  int num;
  cin>>num;
  int temp=num;
  num = (num / 10)*10;
  int a=temp%10;
  if(a>5)
  {
    num=num+10;
  }
  else
  {
    num=num;
  }
  cout<<num;
  
  return 0;
}