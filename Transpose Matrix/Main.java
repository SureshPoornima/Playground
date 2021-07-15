#include<iostream>
using namespace std;
int main()
{
  int r;cin>>r;
  int a[r][r];
  for(int i=0;i<r;i++){
  for(int j=0;j<r;j++){
  cin>>a[i][j];
  }
  }
    for(int i=0;i<r;i++){
  for(int j=0;j<r;j++){
  cout<<a[i][j];
    cout<<" ";
  }
     cout<<"\n";
  }
  cout<<"Transpose matrix is:"<<endl;
   for(int i=0;i<r;i++){
  for(int j=0;j<r;j++){
  cout<<a[j][i];
    cout<<" ";
  }
     cout<<"\n";
  }
  
return 0;
}