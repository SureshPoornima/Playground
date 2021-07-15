#include<stdio.h>
int main()
{
  int num,num1,num2,num3,rev;
  scanf("%d",&num);
  num1 = num /100;
  num2 = (num % 100) / 10;
  num3 = num % 10;
  rev = (num3 *100) + (num2 * 10) + (num1);
  printf("%d",rev);
 
  return 0;
}