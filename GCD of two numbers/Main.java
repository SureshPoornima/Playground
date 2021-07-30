#include<stdio.h>
int main()
{
  int num1,num2,large;
  scanf("%d %d",&num1,&num2);
  for(int i=1;i<=num1 && i<=num2;++i)
  {
    if(num1 % i == 0 && num2 % i == 0)
    {
       large = i; 
    }
   }
  printf("%d",large);
  return 0;
}