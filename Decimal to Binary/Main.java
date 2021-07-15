#include<iostream>
using namespace std;
int binary(int);
int main()
{
  int de, bi;
  cin>>de;
 cout<<binary(de);
}
int binary(int decimal)
{
  if(decimal == 0)
  {
   return 0; 
  }
  else
  {
    return (decimal % 2 + 10 *  
               binary(decimal / 2)); 
  }
}