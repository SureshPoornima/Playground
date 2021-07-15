import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
      int n,m;
      n= scan.nextInt();
      m = scan.nextInt();
      for(int i=n;i>=m;i--){
       System.out.println(i); 
      }
    }
}