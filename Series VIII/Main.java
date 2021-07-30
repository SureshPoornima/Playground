import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{Scanner s=new Scanner(System.in);
		int n,i,a,d,e=5;
 n=s.nextInt();
  System.out.print("4"+" ");
 System.out.print(e+" ");
 for(i=2;i<n;i++)
 {
 d=i*i;
 a=e+d;
System.out.print(a+" ");
 e=a;
 }
    }
 }