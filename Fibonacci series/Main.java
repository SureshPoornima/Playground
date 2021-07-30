#include<stdio.h>
int main()
{
  int num,t1=0,t2=1,nt;
  scanf("%d",&num);
  for(int i=0;i<num;i++)
  {
    printf("%d\n",t1);
    nt = t1 + t2;
    t1 = t2;
    t2 = nt;
  }
  return 0;
}