#include<iostream>
using namespace std;
int main()
{
 int size,flag = 0;
  cin>>size;
  int arr[size][size];
  for(int i=0;i<size;i++)
  {
    for(int j=0;j<size;j++)
    {
     cin>>arr[i][j]; 
    }
  }
   for(int i=0;i<size;i++)
  {
    for(int j=0;j<size;j++)
    {
     if(j < i)
     {
      if(arr[i][j] == 0)
      { 
      }
       else
       {
        flag = 1; 
       }
     }
    }
  }
  if(flag == 0)
  {
   cout<<"Upper Triangular Matrix"; 
  }
  else
  {
   cout<<"Not an Upper Triangular Matrix";  
  }
}