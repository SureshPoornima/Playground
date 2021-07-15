import java.util.Scanner;
class Main
{
public static void main(String args[])
{
int numberOfRows;
int numberOfColumns;
Scanner scanner = null;
int[][] inputMatrixArray = null;
scanner = new Scanner(System.in);
numberOfRows = scanner.nextInt();
numberOfColumns = scanner.nextInt();
inputMatrixArray = new int[numberOfRows][numberOfColumns];
for (int i = 0; i < numberOfRows; i++) {
for (int j = 0; j < numberOfColumns; j++) {
inputMatrixArray[i][j] = scanner.nextInt();
}
}
//Displaying the entered matrix
for (int i = 0; i < inputMatrixArray.length; i++) {
for (int j = 0; j < inputMatrixArray[i].length; j++) {

}
}
findMaxElementFromEachRowInMatrix(inputMatrixArray);
 
}
 
//Method to find maximum element in each row of the matrix
public static void findMaxElementFromEachRowInMatrix(int[][] inputMatrixArray) {
int[] arrayToStoreMaxElementInEachRow = new int[inputMatrixArray.length];
     for (int i = 0; i < inputMatrixArray.length; i++) {
      //Initially assign first element of the row as maximum in first iteration
      int maxNumber = inputMatrixArray[i][0];
      for (int j = 0; j < inputMatrixArray[i].length; j++) {
       if(maxNumber < inputMatrixArray[i][j]){
        maxNumber = inputMatrixArray[i][j];
       }
       arrayToStoreMaxElementInEachRow[i] = maxNumber;
      }
    }
     
     //Printing maximum element in each row of the matrix
     for (int i = 0; i < arrayToStoreMaxElementInEachRow.length; i++) {
         System.out.println(arrayToStoreMaxElementInEachRow[i]);
     }
    }
}