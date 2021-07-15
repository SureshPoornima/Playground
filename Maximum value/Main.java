#include <stdio.h>
int main()
{
  int array[100], maximum, n;
  scanf("%d", &n);

  for (int i = 0; i < n; i++)
    scanf("%d", &array[i]);

  //maximum = array[0];
 int j=0;
  for (int i = 1; i < n; i++)
  {
    if (array[i] >array[j])
    {
       array[j]  = array[i];
      
    }
    
  }

  printf("%d",array[j]);
  return 0;
}