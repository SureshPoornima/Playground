import java.util.Scanner;
class Main
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int m, n, c, d;
      int sum=0;
     m = in.nextInt();
     n  = in.nextInt();
   
     int first[][] = new int[m][n];
      for (c = 0; c < m; c++)
        for (d = 0; d < n; d++)
           first[c][d] = in.nextInt();
      for (c = 0; c < m; c++)
        for (d = 0; d < n; d++)
                     sum=sum+first[c][d];

      System.out.println(sum);
}
}