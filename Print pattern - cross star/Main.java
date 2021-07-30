#include<stdio.h>
int main()
{
 int num;
  scanf("%d",&num);
  int n= ((2 * num) -1);
 for(int i=0;i<n;i++)
 {
   for(int j=0;j<n;j++)
   {
    if(i == j ||(j == n-i-1))
    {
     printf("*");
    }
     else
     {
      printf(" ");
     }
   }
  printf("\n");
 }
  return 0;
}