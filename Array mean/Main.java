#include<iostream>
using namespace std;
int main()
{
 int size,value,sum=0,mean;
  cout<<"Enter the number of elements in the array"<<endl;
  cin>>size;
  int arr[size];
  cout<<"Enter the elements in the array"<<endl;
  for(int i=0;i<size;i++)
  {
   cin>>value;
    arr[i]= value;
    sum = sum + arr[i];
  }
  mean = sum / size;
  cout<<"The mean of the array is "<<mean;
}