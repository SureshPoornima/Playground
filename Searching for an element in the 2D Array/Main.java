#include<iostream>
using namespace std;
int main(){
  int row,col;
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
  int value,count = 0;
  cin>>value;
   for(int i=0;i<row;i++)
  {
   for(int j=0;j<col;j++)
   {
    if(value == arr[i][j])
    {
      cout<<i<<" "<<j;
      count = 1;
    }
   }
  }
  if(count == 0)
  {
   cout<<"-1 -1"; 
  }
  
  return 0;
}