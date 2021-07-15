#include<stdio.h>
int main()
{
  int age,weight;
  float level;
  scanf("%d%d",&age,&weight);
  scanf("%f",&level);
  if(age >= 18 && weight >=45 && level >= 5.5)
  {
   printf("He or She can donate blood");
  }
  else
  {
    printf("He or She unable to donate blood");
  }
 return 0; 
}