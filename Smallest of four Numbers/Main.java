#include<iostream>
using namespace std;
int main()
{
 int num1,num2,num3,num4;
  cin>>num1;
  cin>>num2;
  cin>>num3;
  cin>>num4;
  if(num1 < num2)
  {
   if(num1 < num3)
   {
    if(num1 < num4)
    {
     cout<<num1; 
    }
   }
  }
  else if(num2 < num3)
  {
   if(num2 < num4)
   {
    cout<<num2; 
   }
  }
  else if(num3 < num4)
  {
   cout<<num3; 
  }
  else
  {
    cout<<num4;
  }
  return 0;
}