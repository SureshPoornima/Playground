#include<stdio.h>
int main()
{
  int num1,num2;
  scanf("%d%d",&num1,&num2);
  for(int i=0;i<num1;i++)
  {
    for(int j=0;j<num2;j++)
    {
      printf("*");
    }
    printf("\n");
  }
  return 0;
}