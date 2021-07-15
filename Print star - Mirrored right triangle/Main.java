#include<stdio.h>
int main()
{
 int num;
  scanf("%d",&num);
 for(int m=1;m<=num;m++)
 {
   for(int n=m;n<num;n++)
   {
     printf(" ");
   }
   for(int j =1;j<=m;j++)
   {
   printf("*"); 
   }
    printf("\n");
 }
  return 0;
}