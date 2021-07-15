import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int sum=0;
    int sum1=0;
int size=s.nextInt();
int []a1=new int[size];
for(int i=0;i<size;i++)
a1[i]=s.nextInt();
for(int i=0;i<size;i++)
if(a1[i]%2==0)
{
sum=sum+a1[i];
}
    else
    {
      sum1=sum1+a1[i];
    }
System.out.println("The sum of the even numbers in the array is "+sum);
    System.out.println("The sum of the odd numbers in the array is "+sum1);

}

}