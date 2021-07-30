import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner scan = new Scanner(System.in);
      int n1,n2;
      n1 = scan.nextInt();
      n2 = scan.nextInt();
        if(n1 == n2){
         System.out.println(n1 +" and " +n2 +" are equal"); 
        }
      else if(n1 < n2)
      {
        System.out.println(n1 +" less than " +n2); 
      }
      else
      {
        System.out.println(n1 +" greater than " +n2);
      }
    }
}