#include<iostream>
using namespace std;
int main()
{
  int num1,num2,num=1;
  cin>>num1;
  cin>>num2;
  for(int i=0;i<num2;i++)
  {
    num = num * num1; 
  }
  cout<<num;
  return 0;
}