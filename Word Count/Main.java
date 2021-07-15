#include<stdio.h>
#include<string.h>
int main()
{
  char str[100];
  int count = 0;
  scanf("%[^\n]%*c",str);
  int len = strlen(str);
  for(int i=0;i<len-1;i++)
  {
   if(str[i] == ' ')
   {
    count++; 
   }
  }
  printf("%d",(count+1));
  
 return 0; 
}