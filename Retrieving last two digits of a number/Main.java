#include<stdio.h>
int main()
{
  int num;
  scanf("%d",&num);
  if(num > 100)
  {
   num = num % 100;
    printf("%d",num);
  }
  else
  {
   printf("%d",num); 
  }
  return 0;
}