import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner scan = new Scanner(System.in);
      int num,n,mul;
      num = scan.nextInt();
      n= scan.nextInt();
      for(int i=1;i<=n;i++){
        mul = i * num;
        System.out.println(i +"*" +num +"=" +mul);
      }
    }
}