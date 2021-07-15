#include <stdio.h>
int main()
{
  int num,sum;
  scanf("%d",&num);
  for(int i=1;i<=num;i++)
  {
    sum = sum + i;
  }
  printf("Sum of Natural Numbers = %d",sum);
   return 0;
}