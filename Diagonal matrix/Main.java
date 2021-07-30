#include<iostream>
using namespace std;
int main()
{
  int n,f=0;
  cin>>n;
  int arr1[n][n], arr2[n][n];
  for(int i=0;i<n;i++)
  {
   for(int j=0;j<n;j++)
   {
    cin>>arr1[i][j]; 
   }
  }
  
   for(int i=0;i<n;i++)
  {
   for(int j=0;j<n;j++)
   {
       if (i == j)
            {
                if (arr1[i][j] == 0)
                    f = 1;
            }
            else
            {
                if (arr1[i][j] != 0)
                    f = 1;
            }
   }
   }
  if(f==1)
  {
   cout<<"No"; 
  }
  else
  {
   cout<<"Yes"; 
  }
 return 0; 
}