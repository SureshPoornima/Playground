import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{Scanner s=new Scanner(System.in);
		 int n,i;
  int x=5,e;
  int w=1;
 n=s.nextInt();
 System.out.print(x+" ");
 for(i=1;i<n;i++)
 {
 
 x=x+11*w;
System.out.print(x+" ");
 w=w+2;
 }
    }
 }