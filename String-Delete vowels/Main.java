#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  int d=0;
  char str1[50],str2[50];
  cin>>str1;
  int len = strlen(str1);
  for(int i=0;i<len;i++)
  {
   if(str1[i] == 'a' ||str1[i] == 'e' ||str1[i] == 'i' ||str1[i] == 'o' ||str1[i] == 'u' ||str1[i] == 'A' ||str1[i] == 'E' ||str1[i] == 'I' ||str1[i] == 'O' ||str1[i] == 'U') 
   {
   }
    else
    {
      str2[d] = str1[i];
      d++;
    }
  }
  cout<<str2;
}