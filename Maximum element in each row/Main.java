#include<iostream>
using namespace std;
int main()
{
 int m,n,lar=0;
  cin>>m;
  cin>>n;
  int arr[m][n];
  for(int i=0;i<m;i++)
  {
   for(int j=0;j<n;j++)
   {
    cin>>arr[i][j];
     if(lar >arr[i][j] )
     {
       
     }
     else
     {
      lar = arr[i][j]; 
     }
   }
    cout<<lar<<endl;
    lar =0;
  }
}