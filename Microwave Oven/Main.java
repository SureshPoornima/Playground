import java.util.Scanner;
class Main
{
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
int a=s.nextInt();
 float b=s.nextFloat();
 switch(a)
 {
   case 1:
 System.out.println(b);
 break;
 case 2:
 System.out.println((b+0.5*b));
 break;
 case 3:
 System.out.println(2*b);
 break;
 default:
System.out.println("Number of items is more");
   break;
}

}
}