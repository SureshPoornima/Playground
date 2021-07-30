#include<stdio.h>
int main()
{
  int num,sum = 0,temp,r;
  scanf("%d",&num);
  r=num;
  while(num != 0)
  {
    temp = num % 10;
    sum +=temp * temp * temp;
    num = num / 10;
  }
  if(r == sum)
    printf("Armstrong number");
  else
    printf("Not an Armstrong number");
  return 0;
}