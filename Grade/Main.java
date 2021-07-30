#include<stdio.h>
int main()
{
  int mar;
  scanf("%d",&mar);
  if(mar > 84)
    printf("A");
  else if(mar > 74 && mar < 85)
    printf("B");
  else if(mar > 64 && mar < 75)
    printf("C");
  else if(mar > 49 && mar < 65)
    printf("D");
  else
    printf("Fail");
  return 0;
}