import java.util.Scanner;
class Main
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int m, n, c, d;    
     m = in.nextInt();
     n  = in.nextInt();
   
     int first[][] = new int[m][n];
     int second[][] = new int[m][n];
   
     for (c = 0; c < m; c++)
        for (d = 0; d < n; d++)
           first[c][d] = in.nextInt();
         
     
      int max=first[0][0];
for (c = 0; c < m; c++)
        for (d = 0; d < n; d++)
if(first[c][d]>max)
{
max=first[c][d];
}
      System.out.println(max);
}
}