#include<iostream>
using namespace std;
int main()
{
 cout<<"Enter the number of elements in the array"<<endl;
  int size,max,min,range;
  cin>>size;
  cout<<"Enter the elements in the array"<<endl;
  int arr[size];
     for (int i = 0; i < size; i++)
        cin >> arr[i];
    max = arr[0];
    for (int i = 0; i < size; i++)
    {
        if (max < arr[i])
            max = arr[i];
    }
    min = arr[0];
    for (int i = 0; i < size; i++)
    {
        if (min > arr[i])
            min = arr[i];
    }
  
  range = max -min;
  cout<<"The range of the array is "<<range;
}