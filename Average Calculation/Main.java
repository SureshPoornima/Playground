import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        float a,b,c,d,e,avg;
      a = scan.nextInt();
      b = scan.nextInt();
      c = scan.nextInt(); 
      d = scan.nextInt();
      e = scan.nextInt();
      avg = (a + b + c + d + e)/5;
      System.out.println(avg);
    }
}