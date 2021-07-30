#include<iostream>
using namespace std;
int main()
{
  int num;
  cin>>num;
  num = num % 100;
  num = num / 10;
  cout<<num;
  return 0;
}