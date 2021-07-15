#include<iostream>
using namespace std;
int main()
{
int m,n,arr[m][n],sum =0;
  cin>>m;
  cin>>n;
  for(int i=0;i<m;i++)
  {
     for(int j=0;j<n;j++)
  {
    cin>>arr[i][j];
    sum= sum + arr[i][j];
  }
    cout<<sum<<endl;
    sum=0;
  }
  
}