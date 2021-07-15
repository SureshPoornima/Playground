#include<iostream>
using namespace std;
int main()
{
  int n;
    cin>>n;
  int count=0;
  int arr[n];
 
  for(int i=0;i<n;i++){
    cin>>arr[i];
  }
 
  for(int i=0;i<n;i++){
   if(arr[i] == arr[i+1]){
     
   }
    else
    {
     count++; 
    }
  }
  cout<<"There are "<<count<<" distinct element in the array.";
  }
