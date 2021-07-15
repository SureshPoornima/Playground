#include <iostream>  
#include <stack>  
using namespace std;  
int main()  
{  
    std::stack<int> newstack;  
  int x;
  cin>>x;
  while(x > 0)
  {
    newstack.push(x); 
    cin>>x;
  }
    cout << newstack.size()*8;  
    return 0;  
}  