#include<stdio.h>
#include<string.h>
int main()
{
  char str[20];
  scanf("%s",str);
  int vowel=0,con=0;
  int len = strlen(str);
  for(int i=0;i<len;i++)
  {
   if(str[i] == 'a'|| str[i] == 'e'||str[i] == 'i'||str[i] == 'o'|| str[i] == 'u') 
   {
    vowel++; 
   }
   else
   {
    con++; 
   }   
  }
  printf("Vowels = %d\n",vowel);
  printf("Consonants = %d",con);
}