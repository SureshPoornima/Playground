#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char ch1[50],ch2[50];
  cin>>ch1;
  strcpy(ch2, ch1);
  cout<<"The copied string is "<<ch2;
  return 0;
}