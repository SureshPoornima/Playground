import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
      Scanner s=new Scanner(System.in);
 int x=s.nextInt();
 double y=s.nextDouble();

 if(y==13.30 && x>13)
 {
  System.out.println("$5.00");
 }
 else if(y==13.30 && x<=13)
 {
    System.out.println("$2.00");
 }
 else if(x>13)
 {
    System.out.println("$8.00");
 }
 else
 {
    System.out.println("$4.00");
 }
 
}
}