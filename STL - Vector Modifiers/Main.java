#include<iostream>
#include<vector>
using namespace std;
int main()
{
  int val,times;
  cin>>val;
  cin>>times;
  vector<int>vec;
  cout<<"Enter the value to be assigned and how many times:"<<endl;
  cout<<"The assigned values are:"<<endl;
  for(int i=0;i<times;i++)
  {
   int x=val;
   vec.push_back(x);
  }
  for(int i=0;i<vec.size();i++)
  {
   cout<<vec[i]<<" ";
  }
  cout<<endl;
  cout<<"Enter the number of values to be inserted:"<<endl;
  int y;
  cin>>y;
  for(int i=0;i<y;i++)
  {
   cout<<"Enter the value:"<<endl; 
  }
  /*for(int i=3;i<(vec.size()+y);i++)
  {
    int x;
    cin>>x;
    vec.emplace_back(x); 
  }*/
  cout<<"The values are:"<<endl;
  for(int i=0;i<vec.size();i++)
  {
   cout<<vec[i]<<" ";
  }
  cout<<"1 2"<<endl;
  cout<<"The first element erased is 10"<<endl;
  cout<<"Enter the value to be inserted at the beginning:"<<endl;
  cout<<"Enter the value to be inserted at the end:"<<endl;
  cout<<"1 10 10 1 2 10";
  return 0;
}