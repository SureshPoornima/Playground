import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{Scanner s=new Scanner(System.in);
      
		 int n,b;
 n=s.nextInt();
 for (int i = 1; i <= n; i++)  
   {
   b=i*i;
   if (b%2==0)
   System.out.print(b-2+" ");
 else
   System.out.print(b-1+" ");
   }  
    }
}