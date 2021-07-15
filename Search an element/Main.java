import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
          int n,flag =0;
      n = scan.nextInt();
      int [] arr;
      arr = new int [n];
      for(int i=0;i<n;i++){
       arr[i] = scan.nextInt(); 
      }
      int search;
      search = scan.nextInt();
      for(int i=0;i<n;i++){
       if(search == arr[i]){
         flag =1;
       }
      } 
      if(flag == 1)
      {
        System.out.println(search + " is present in the array");
       }
        else
        {
          System.out.println(search + " is not present in the array");
        }
      
    }
}