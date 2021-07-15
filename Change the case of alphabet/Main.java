 #include<stdio.h>
 #include<string.h>
 int main()
 {
   //char s[100];
   //scanf("%[^\n]",s);
   char ch;
   scanf("%c",&ch);
   if(ch >= 'a' &&  ch<= 'z')
   {
     ch = ch - 32;
     printf("%c",ch);
   }
   else
   {
     ch = ch + 32;
     printf("%c",ch);
   }
   return 0;
 }