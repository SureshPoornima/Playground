import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
      double start = 0.5;
int n=s.nextInt();
while(n-- != 0){

  System.out.print(start+" ");

   start *= 3;
}
}

}