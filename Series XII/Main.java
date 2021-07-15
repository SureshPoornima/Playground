import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{Scanner s=new Scanner(System.in);
		int n,i,t1=9,t2=11,nextTerm;
 n=s.nextInt();
 for(i=1;i<=n;i++)
 {
   System.out.print(t1+" ");
 nextTerm = t1 + t2;
        t1 = t2;
        t2 = nextTerm;
 }
    }
 }