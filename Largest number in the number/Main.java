#include <iostream>
using namespace std;
int main()
{
  int num,rem =0, large = 0;
  cin>>num;
 while (num > 0) {
  rem = num % 10;
  if (rem > large)
  {
    large = rem;
  }
   num = num / 10;
        }
  cout<<"Maximum number = "<<large;
   return 0;
}