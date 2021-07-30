#include<stdio.h>
int main()
{
  int num,rem,rev = 0,num2;
  scanf("%d",&num);
  num2 = num;
  while(num != 0)
  {
    rem = num % 10;
    rev = rev * 10 + rem;
    num = num / 10;
  }
  if(num2 == rev)
   printf("Palindrome"); 
  else
    printf("Not a Palindrome");
  return 0;
}