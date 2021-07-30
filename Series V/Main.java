import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{Scanner s=new Scanner(System.in);
		 int a,b,n,i,c;
n=s.nextInt();
a=121;
b=11;
if(n==1)
{
System.out.println("121"+" ");
}
else
{
System.out.print("121"+" ");
for(i=2;i<=n;i++)
{
b=b+4;
c=b*b;
System.out.print(c+" ");
}
}
}
}