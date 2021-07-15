#include<iostream>
using namespace std;
int main()
{
  char str[50];
  cin>>str;
  int count = 0;
   for(int i = 0; str[i] != '\0'; i++) 
   {
      count++;
   }
  cout<<"The number of letters in the name is "<<count;
}