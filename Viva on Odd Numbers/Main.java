import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {Scanner sn=new  Scanner(System.in);
       
   int a,n=0;
double s=0.0;
 do
 {
   a=sn.nextInt();
   if(a%2!=0&&a>0)
   {
     s=s+1;
     n=n+1;
   }
   else if(a%2==0&&a>0)
   {
     s=s-0.5;
   }
   else if(a<0)
   {
     s=s-1.0;
     break;
   }
   }while(n<3);
 System.out.println(s);
}
}