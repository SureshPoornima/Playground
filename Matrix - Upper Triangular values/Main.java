#include<iostream>
using namespace std;
int main()
{
  int row, col;
  cin>>row;
  cin>>col;
  int arr[row][col];
  for(int i=0;i<row;i++)
  {
   for(int j=0;j<col;j++)
   {
    cin>>arr[i][j];
   }
  }
  int k = 0;
  for(int i=0;i<row;i++)
  {
   for(int j=0;j<col;j++)
   {
    if( i == j)
    {
     cout<<arr[i][j]<<" ";
    }
   }
  }
   for(int i=0;i<row;i++)
  {
   for(int j=0;j<col;j++)
   {
    if( (j- i)== 1)
    {
     cout<<arr[i][j]<<" ";
    }
   }
  }
  for(int i=0;i<row;i++)
  {
   for(int j=0;j<col;j++)
   {
    if( (j- i)== 2)
    {
     cout<<arr[i][j]<<" ";
    }
   }
  }
  for(int i=0;i<row;i++)
  {
   for(int j=0;j<col;j++)
   {
    if( (j- i)== 3)
    {
     cout<<arr[i][j]<<" ";
    }
   }
  }
  for(int i=0;i<row;i++)
  {
   for(int j=0;j<col;j++)
   {
    if( (j- i)== 4)
    {
     cout<<arr[i][j]<<" ";
    }
   }
  }
}