#include<stdio.h>
#include<string.h>
int main()
{
  char str[20];
  scanf("%[^\n]%*c",str);
  int len = strlen(str);
  int count = 0;
 for (int i = 0; i < len; i++)
    {
        if (str[i] == ' ')
        {
            count++;
        }
    }
         
   int  newLength = len + count * 2;
    str[newLength] = '\0';
    for (int i = len - 1; i >= 0; i--)
    {
        if (str[i] == ' ')
        {
            str[newLength - 1] = '0';
            str[newLength - 2] = '2';
            str[newLength - 3] = '%';       
            newLength = newLength - 3;
             
        }
        else
        {
            str[newLength - 1] = str[i];       
            newLength = newLength - 1;
        }
    }

 printf("%s",str);
 return 0; 
}