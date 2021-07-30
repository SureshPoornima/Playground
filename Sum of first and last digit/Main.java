/* ***Test Instructions***
* There are multiple test cases to evaluate the program.
* Some test cases are visible and others are hidden.
* Your program should be generic so that it will satisfy all the test cases.
* Scan the input from stdin and print the exact output only which is as given in the sample test cases.
*/
#include<iostream>
using namespace std;
int main()
{
  int num,temp;
  cin>>num;
  temp = num;
  temp = num % 10;
  while(num >= 10)
  {
   num = num / 10; 
  }
  num = num + temp;
  cout<<num;
  return 0;
}