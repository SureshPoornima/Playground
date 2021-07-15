import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{Scanner s=new Scanner(System.in);
		int n,i;
  double x=20.5,e=95;
n=s.nextInt();
 System.out.print(e+" ");
 for(i=1;i<n;i++)
 {
 
 e=e+x;
System.out.print(e+" ");
 x=x+2;
 }
    }
 }