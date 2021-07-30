#include<iostream>
using namespace std;
int main(){
  int size,temp;
  cin>>size;
  int arr[size];
  for(int i=0;i<size;i++){
   cin>>arr[i]; 
  }
  cout<<"Enter the number of values to be inserted:"<<endl;
  cout<<"Enter the values to be inserted in priority queue:"<<endl;
  cout<<"The priority queue elements are:"<<endl;
  	for(int i=0;i<size;i++)
	{		
		for(int j=i+1;j<size;j++)
		{
			if(arr[i]<arr[j])
			{
				temp  =arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	for(int i=0;i<size;i++)
		cout<<arr[i]<<" ";
	cout<<endl;
 return 0; 
}
