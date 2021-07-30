#include<stdio.h>
#include<string.h>
int main()
{
  char str1[20], str2[20];
  scanf("%s",str1);
  scanf("%s",str2);
  int len = strlen(str2);
    for(int i=1;i<=len;i++)
    {
      if(str2[i] == '+')
      {
       printf("Matched"); 
      }
      else
      {
       printf("Does not match"); 
      }
      break;
    }
  return 0;
}