import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // fill your code
    int l,w,res,res1;
    Scanner s = new Scanner(System.in);
    l=s.nextInt();
    w=s.nextInt();
    res=(2*l)+(2*w);
    res1=(l*w);
    System.out.println(res+"m");
      //System.out.println("m");
    System.out.println(res1+"sqm");
    //System.out.println("sqm");
  }
}