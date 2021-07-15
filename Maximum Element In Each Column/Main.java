import java.util.Scanner;
class Main
{
public static void main(String args[])
{ Scanner in=new Scanner(System.in);
      int max,c,d;
int m = in.nextInt();
    int  n  = in.nextInt();
   
     int first[][] = new int[m][n];
for (c = 0; c < m; c++)
        for (d = 0; d < n; d++)
           first[c][d] = in.nextInt();
for(d = 0;d < n;d++){

max = first[0][d];

for(c = 1;c<m;c++){

if(max < first[c][d])
  max = first[c][d];
}
System.out.println(max);
}
}
}