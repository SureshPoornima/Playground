#include <stdio.h>
#include<string.h>
int main()
{ 
  int len;
  char name[100];
  gets(name);
  len =strlen(name);
  printf("0%d",len);
    return 0;
}