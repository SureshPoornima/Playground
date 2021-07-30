#include<iostream>
#include<cstring>
using namespace std;
int main()
{
 char str[20];
  cin>>str;
  int len,flag;
   len = strlen(str);
  for(int i=0;i<len;i++)
  {
   if(str[i] != str[len-i-1])
   {
    flag = 1; 
   }
  }
  
  if(flag)
  {
    cout<<"Not a Palindrome";
  }
  else
  {
    cout<<"Palindrome";
  }
  
}