#include<iostream>
#include<cstring>
using namespace std;
int main()
{
 char str1[50],str2[50];
  cin>>str1;
  cin>>str2;
  if(strcmp(str1, str2) == 0)
  {
   cout<<"It is correct";
  }
  else
  {
    cout<<"It is wrong";
  }
}