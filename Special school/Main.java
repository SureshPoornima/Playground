#include<cstring>
#include<iostream>
using namespace std;
int main()
{
  int flag;
  char str1[20], str2[20];
  cin>>str1;
  cin>>str2;
  int len1 = strlen(str1);
  int len2 = strlen(str2);

  for(int i=0;i<len1;i++)
  {
   if(str1[i] != str2[len2-i-1])
   {
    flag =1; 
   }
    else
    {
      
    }
   }
    if(flag)
    {
     cout<<"It is wrong";
    }
    else
    {
      cout<<"It is correct";
    }
  
  
}