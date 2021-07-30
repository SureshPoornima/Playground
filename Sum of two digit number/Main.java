#include<stdio.h>
int main()
{
 int n,m;
  scanf("%d",&n);
  m = n%10;
  n = n/10;
  m = m+n;
  printf("%d",m);
  return 0;
}