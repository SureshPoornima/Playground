#include<stdio.h>
#include<string.h>
int main(){
 char str[20];
  int count = 1;
  scanf("%s",str);
  int len = strlen(str);
  for(int i=0;i<len;i++)
  {
    if(str[i] == str[i+1])
    {
     count++; 
    }
    else
    {
     printf("%c%d",str[i],count); 
      count = 1;
    }
  }
  return 0;
}