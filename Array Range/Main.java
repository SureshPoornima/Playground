import java.util.*;
class Main
{
  public static void main(String args[])
  {
   Scanner scan = new Scanner(System.in);
    int n,max=0,min=0;
    n = scan.nextInt();
    int [] arr1;
    arr1 = new int[n];
    for(int i=0;i<n;i++){
     arr1[i] = scan.nextInt();
      if(max < arr1[i]){
        max = arr1[i];
      }
      min= max;
      if(min > arr1[i]){
        min = arr1[i];
      }
    }
    
     int range = max-min;
    System.out.println("The range of the array is "+ range);
  }
}