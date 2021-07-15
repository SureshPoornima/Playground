import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       int a,b,temp;
      Scanner scan = new Scanner(System.in);
      a = scan.nextInt();
      b = scan.nextInt();
      temp = a;
      a = b;
      b = temp;
      System.out.println(a);
      System.out.println(b);
    }
}