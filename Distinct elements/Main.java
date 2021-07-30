import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int count=0;
int n=s.nextInt();
int[]a=new int[n];
int j,i;
for(i=1;i<n;i++)
{
a[i]=s.nextInt();
}
for (i = 0; i < n; i++) {
        for (j =0; j < i; j++)
           if (a[i] == a[j])//check each element in array
              break;
           if (i == j)//check index of array
              count++;
}
    System.out.println(count);
}
}