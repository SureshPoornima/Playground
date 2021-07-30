#include<iostream>
using namespace std;
int main()
{
  int n,c,d;
  cin>>n;
  int arr[n][n];
  for(int i=0;i<n;i++)
  {
   for(int j=0;j<n;j++)
   {
    cin>>arr[i][j]; 
   }
  }
   for(int i=0;i<n;i++)
  {
   for(int j=0;j<n;j++)
   {
    if(arr[i][j] % 2 == 0)
    {
      c = 1;
    }
     else
     {
       d= 1;
     }
   }
  }
  
  if(c == 1 && d==1)
  {
   cout<<"No"; 
  }
  else
  {
   cout<<"Yes"; 
  }
}