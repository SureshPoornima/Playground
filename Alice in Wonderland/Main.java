import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{Scanner s=new Scanner(System.in);
		 int b,a,c;
 b=s.nextInt();
  a=b%10;
  c=b/10;
     int z=a+c;
  System.out.println("Alice must go in path-"+z);
    }
}