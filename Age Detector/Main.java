import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	Scanner s=new Scanner(System.in);
  int cy,by,age;
      cy=s.nextInt();
      by=s.nextInt();
  
  if(cy>by)
  {
    age=cy-by;
   System.out.println(100-age);
  }
  else
  {
    age = cy-by+100;
     System.out.println(100-age);
  }
}
}