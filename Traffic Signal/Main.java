import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{Scanner sn=new Scanner(System.in);
  float s,d,t;
     s=sn.nextFloat();
      d=sn.nextInt();
      t=sn.nextInt();
  
  float dd=s/t;
  if(d>dd)
  {
    System.out.println("No");
}
  else
  {
   System.out.println("Yes");
  }
}
}
