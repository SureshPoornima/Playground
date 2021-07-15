#include<iostream>
using namespace std;
void reverse(string);
int main()
{
  string ch;
  getline(cin, ch);
  cout<<"The reversed String is "; 
  reverse(ch);
  cout<<".";
}
  void reverse(string str) 
{ 
   for (int i=str.length()-1; i>=0; i--) 
      cout << str[i];  
}