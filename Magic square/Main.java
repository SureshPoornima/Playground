#include<iostream>
using namespace std;
int main()
{
 int num,sum = 0, sum2 = 0;
  cin>>num;
  int arr[num][num];
  for(int i=0;i<num;i++)
  {
    for(int j=0;j<num;j++)
    {
      cin>>arr[i][j];
    }
  }
   for(int i=0;i<num;i++)
  {
    for(int j=0;j<num;j++)
    {
      if(i == j)
      {
       sum = sum + arr[i][j]; 
      }
      if((num-1) == (i + j))
      {
       sum2 = sum2 + arr[i][j]; 
      }
    }  
  }

  if(sum == sum2)
  {
   cout<<"Yes"; 
  }
  else
  {
   cout<<"No"; 
  }
}