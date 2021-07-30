#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  int  count=0;
  char ch[50];
  cin>>ch;
  for(int i=0; ch[i] != '\0';i++)
  {
   count++; 
  }
  cout<<"The length of word "<<ch<<" is "<<count;
  return 0;
}