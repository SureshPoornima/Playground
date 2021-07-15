import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int n,num,countp=0,countn=0;
      n = scan.nextInt();
      for(int i=0;i<n;i++){
        num = scan.nextInt();
        if(num >0){
         countp++; 
        }
        else
        {
         countn++; 
        }
      }
      
      System.out.println("Number of positive numbers is "+countp+" and the number of negative numbers is "+countn);
    }
}