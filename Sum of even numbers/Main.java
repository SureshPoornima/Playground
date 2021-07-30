import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    int n,sum=0;
    n = scan.nextInt();
    int []arr;
    arr = new int[n];
    for(int i=0;i<n;i++){
     arr[i] = scan.nextInt(); 
      if(arr[i] % 2 == 0){
       sum = sum + arr[i]; 
      }
    }
    System.out.println("The sum of the even numbers in the array is "+sum);  }
}