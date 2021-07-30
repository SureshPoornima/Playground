#include<iostream>
using namespace std;
int main(){
  int num;
  cin>>num;
  if(num > 0)
    cout<<"Positive number";
  else if(num < 0)
    cout<<"Negative number";
  else
    cout<<"Input is 0";
  
 return 0; 
}