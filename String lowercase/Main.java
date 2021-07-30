#include <cctype>
#include <iostream>
#include <cstring>
#include <cstdio>
using namespace std;
int main()
{
 char ch[50];
  cin>>ch;
  cout<<"String in lowercase is ";
     for (int i=0; i<strlen(ch); i++)
        putchar(tolower(ch[i]));
  
}