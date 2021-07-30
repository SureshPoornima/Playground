#include<stdio.h>
int main()
{
  int num,val =0;
  scanf("%d",&num);
  for(int i = 1; i<=num;i++)
  {
   for(int j = 1;j<=i;j++)
   {
       ++val;
       if(val % 2 == 0)
       {
        printf("#"); 
       }
       else
       {
        printf("*"); 
       }
   }
    printf("\n");
  }
  return 0;
}