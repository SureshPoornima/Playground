import java.util.Scanner;
class Main
{
public static void main(String args[])
{Scanner s=new Scanner(System.in);
int a,b;
  a=s.nextInt();
 b=s.nextInt();
  int x=a/b;
  int y=a%b;
  System.out.println("The number of students in each team is "+x+" and left out is "+y);
}
}