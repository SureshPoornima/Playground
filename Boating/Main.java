#include<iostream>
using namespace std;
int main()
{
  int weig, adult, child;
  int minad = 75;
  int minchil= 30;
  cin>>weig;
  cin>>adult;
  cin>>child;
  adult = adult * 75;
  child = child * 30;
  if((child + adult) <= weig)
  {
    cout<<"Boat is stable";
  }
  else
  {
   cout<<"Boat will sink";
  }
}