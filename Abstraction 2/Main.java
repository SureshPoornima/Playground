import java.util.*;
class Main
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in); 
    String title=sc.nextLine(); 
    
    MyMovie film=new MyMovie();
    film.setTitle(title); 
    System.out.println("The title is: "+film.getTitle());
 
  }
}
abstract class Movie{
 String title;
  abstract void setTitle(String title);
    
  String getTitle(){
   return title; 
  }
}
class MyMovie extends Movie{
 void setTitle(String title){
   this.title = title;
 }
  
}