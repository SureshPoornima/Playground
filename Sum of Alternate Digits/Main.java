#include <stdio.h>
int main() 
{
	int num,sum1 = 0,sum2 = 0;
  scanf("%d",&num);
  while(num != 0)
  {
    sum1 = sum1 + (num % 10);
    num = num / 10;
    sum2 = sum2 + (num % 10);
    num = num / 10;
  }
  printf("%d\n",sum1);
  printf("%d",sum2);
}