#include<iostream>
using namespace std;
int main(){
  int size;
   cout<<"Enter the number of values to be inserted:"<<endl;
   cin>>size;
  if(size > 0){
 
  int arr[size];
 
   for(int i=0;i<size;i++){
   cout<<"Enter the value:"<<endl;
  }
  for(int i=0;i<size;i++){
   cin>>arr[i]; 
  }
  cout<<"List before sorting:"<<endl;
   for(int i=0;i<size;i++){
   cout<<arr[i]<<" "; 
  }
  cout<<endl;
   cout<<"List after sorting:"<<endl;
  int temp;
  for(int i=0;i<size;i++)
	{		
		for(int j=i+1;j<size;j++)
		{
			if(arr[i]>arr[j])
			{
				temp  =arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
    for(int i=0;i<size;i++){
   cout<<arr[i]<<" "; 
  }
  }
  else
  {
   cout<<"No values has been inserted"; 
  }
 return 0; 
}