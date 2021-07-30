import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
      Scanner s=new Scanner(System.in);
		 int n,i,j=6,sum=5;
  n=s.nextInt();
  for(i=1;i<=n;i++)
  {
   System.out.print(j+" ");
    j=j+sum;
    sum=sum+5;
  }
}
}