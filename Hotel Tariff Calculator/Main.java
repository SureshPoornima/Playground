import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
      Scanner s=new Scanner(System.in);
    int m, d;
    float r, total;
    m=s.nextInt();
    r=s.nextInt();
    d=s.nextInt();
    switch(m)
    {
        case 1:
        case 2:
        case 3:
        total = r*d;
       System.out.println(total);
        break;
        case 4:
        case 5:
        case 6:
        total = r*d;
        total+=0.2*total;
        System.out.println(total);
        break;
        case 7:
        case 8:
        case 9:
        case 10:
        total = r*d;
        System.out.println(total);
        break;
        case 11:
        case 12:
        total = r*d;
        total+=0.2*total;
         System.out.println(total);
        break;
        default:
        System.out.println("Invalid Input");
    }
    }

}