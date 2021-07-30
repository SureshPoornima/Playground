import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{Scanner s=new Scanner(System.in);
		 int n,i,y;
           
  int x=2;
  int w=2;
 n=s.nextInt();
 System.out.print(x+" ");
 for(i=1;i<n;i++)
 {
 
 y=x*w+1;;
 System.out.print(y+" ");
 x=y;
 }
   }
 }
