#include<iostream>
using namespace std;
int main()
{
  int m,n,lar;
  cin>>m;
  cin>>n;
  int arr[m][n];
  for(int i=0;i<m;i++)
  {
   for(int j=0;j<n;j++)
   {
    cin>>arr[i][j]; 
   }
  }
   for(int i=0;i<n;i++)
  {
     lar = 0;
   for(int j=0;j<m;j++)
   {
    if(lar > arr[j][i])
    {
      
    }
     else
     {
       lar = arr[j][i];
     }
   }
     cout<<lar<<endl;
  }
}