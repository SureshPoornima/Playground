#include<stdio.h>
int main()
{
 int num,sum,n;
  scanf("%d",&num);
  while(num>0)
  { 
    n = num % 10;
    sum = sum + n;
    num = num / 10;
  }
  printf("%d",sum);
  return 0;
}