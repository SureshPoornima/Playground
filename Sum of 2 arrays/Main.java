import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner scan = new Scanner(System.in);
      int n,sum=0;
      n = scan.nextInt();
       int [] arr1;
       int [] arr2;
      arr1 = new int[n];
      arr2 = new int[n];
      for(int i=0;i<n;i++){
       arr1[i] = scan.nextInt(); 
      }
      for(int i=0;i<n;i++){
       arr2[i] = scan.nextInt(); 
      }
      
      for(int i=0;i<n;i++){
       sum = arr1[i] + arr2[i]; 
        System.out.println(sum);
      }
    }
}