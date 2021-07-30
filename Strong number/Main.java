#include<stdio.h>
int main()
{
  int num,fact = 1,cpy,temp,sum = 0;
   scanf("%d",&num);
  cpy = num;
  while(num != 0)
  {
    temp = num % 10;
   for(int i=1;i<=temp;i++)
   {
     fact = fact * i; 
     //printf("%d ",fact);
   }
    sum = sum + fact;
    fact = 1;
    num = num / 10;
  }
  if(cpy == sum)
    printf("Yes");
  else
    printf("No");
  return 0;
}