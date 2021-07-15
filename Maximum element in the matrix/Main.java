#include<iostream>
using namespace std;
int main()
{
int m,n,sum=0;
  cin>>m;
  cin>>n;
  int arr[m][n];
  for(int i=0;i<m;i++)
  {
   for(int j=0;j<n;j++)
   {
    cin>>arr[i][j]; 
     if(sum > arr[i][j])
     {
       
     }
     else
     {
      sum = arr[i][j]; 
     }
   }
  }
  cout<<"The maximum element is "<<sum;
}