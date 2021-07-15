import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
 Scanner sm=new Scanner(System.in);
 int k,n,r,s,sum1,sum2,i,temp,l,sum,a;
 a=1;
 k=sm.nextInt();
 n = 0;
 sum1 = 0;
 sum2 = 0;
 temp = k;
 s = k*k;
 do{
++n;
temp /= 10;
 }while(temp>0);
 for(i = 0; i < n; i++){
  r = s % 10;
  s = s/10;//8    
sum1 = sum1 + r*a;
a*=10;
 }
 a=1;
 while(s>0){
  r = s %10;
  s = s/10;
sum2 = sum2 +r*a;
a*=10;
 }
 sum  = sum1 + sum2;
 if(sum == k){
System.out.println("Kaprekar Number");  
 }
 else{
System.out.println("Not a Kaprekar Number");
 }  
}
    }
