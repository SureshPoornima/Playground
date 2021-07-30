#include<iostream>
using namespace std;
int prime(int , int);
int main()
{
  int num, check;
  cin>>num;
  check = prime(num,num/2);
 if(check == 1)
 {
   cout<<"Prime Number";
 }
  else
  {
    cout<<"Not a Prime Number";
  }
  return 0;
}

int prime(int num , int i)
{
  if(i == 1) 
    {
      return 1; 
    }
  else
    {
      if(num % i == 0)
        {
           return 0; 
        }
      else
        {
           return prime(num , i-1); 
        }
  }
}