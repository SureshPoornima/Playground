#include<stdio.h>
int main()
{
 int n,m,flag=0;
  scanf("%d%d",&n,&m);
  int arr[n];
  int brr[m];
  for(int i=0;i<n;i++)
  {
   scanf("%d",&arr[i]); 
  }
  for(int i=0;i<m;i++)
  {
   scanf("%d",&brr[i]); 
  }
  for(int i=0;i<n;i++)
  {
   if(arr[i] == brr[i])
   {
     flag = 1;
   }
    else
    {
      flag = 0;
    }
  }
    if(flag == 1)
  {
  printf("Same");
  }
  else 
  {
    printf("Not Same");
  }
  return 0;
}
