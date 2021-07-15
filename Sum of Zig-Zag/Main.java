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
    }
  }
    for(int i=0;i<m;i++)
 	 {
  	  for(int j=0;j<n;j++)
  	  {
    	if(i == 0 || i == (n-1) || (i+j)==n-1)
        {
         sum = sum + arr[i][j]; 
        }
        
      }
 	 }
  cout<<"Sum of Zig-Zag pattern is "<<sum;
}