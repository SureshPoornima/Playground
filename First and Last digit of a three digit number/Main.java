#include<stdio.h>
int main()
{
  int num,rem;
  scanf("%d",&num);
  rem = num % 10;
  num = num / 100;
  /*while(num > 0 && num<10)
  {
    num = num/10;
  }*/
 // printf("%d\n%d",rem,num);
  if(rem==num)
  {
   printf("Equal"); 
  }
  else
  {
   printf("Not Equal"); 
  }
 return 0; 
}