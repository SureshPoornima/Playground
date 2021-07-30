#include<iostream>
using namespace std;
int main()
{
 string str1, str2,com;
  getline(cin, str1);
  getline(cin, str2);
  com = str1 + str2;
  cout<<"The concatenated string is "<<com;
}