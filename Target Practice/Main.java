import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {Scanner s=new Scanner(System.in);
   int target, score, attempt=0, sum=0;
target=s.nextInt();
while(sum<target)
{
 score=s.nextInt();
 sum=sum+score;
 attempt++;
}
System.out.println("The number of turns is "+attempt);
    }
}