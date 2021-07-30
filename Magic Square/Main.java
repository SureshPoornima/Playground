import java.util.Scanner;
class Main
{
public static void main(String args[])
{
      Scanner s=new Scanner(System.in);
int size=s.nextInt();
  int [][]matrix=new int[size][size];
 
   int row, column = 0;
   int sum, sum1, sum2;
   int flag = 0;
 
   for (row = 0; row < size; row++) {
      for (column = 0; column < size; column++)
         matrix[row][column]=s.nextInt();
   }
 
   //For diagonal elements
   sum = 0;
   for (row = 0; row < size; row++) {
      for (column = 0; column < size; column++) {
         if (row == column)
            sum = sum + matrix[row][column];
      }
   }
 
   //For Rows
   for (row = 0; row < size; row++) {
      sum1 = 0;
      for (column = 0; column < size; column++) {
         sum1 = sum1 + matrix[row][column];
      }
      if (sum == sum1)
         flag = 1;
      else {
         flag = 0;
         break;
      }
   }
 
   //For Columns
   for (row = 0; row < size; row++) {
      sum2 = 0;
      for (column = 0; column < size; column++) {
         sum2 = sum2 + matrix[column][row];
      }
      if (sum == sum2)
         flag = 1;
      else {
         flag = 0;
         break;
      }
   }
 
   if (flag == 1)
     System.out.println("yes");
   else
      System.out.println("no");
 }
}