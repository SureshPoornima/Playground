import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner s=new Scanner(System.in);
int n1=0,n2=1,n3=0,i,number;    
number=s.nextInt();
for(i=2;i<number;++i)  
{    
 n3=n1+n2;    
 n1=n2;    
 n2=n3;    
}  
System.out.println(n3);
}
}