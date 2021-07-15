import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int n,max=0;
        n = scan.nextInt();
      int []arr;
      arr = new int[n];
      for(int i=0;i<n;i++){
       arr[i] = scan.nextInt(); 
      }
       for(int i=0;i<n;i++){
       if(max < arr[i] )
       {
        max = arr[i]; 
       }
      }
      System.out.println(max + " is the maximum element in the array");
    }
}