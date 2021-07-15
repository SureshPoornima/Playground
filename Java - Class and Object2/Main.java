import java.util.Scanner;
class Main
{
 public static void main(String [] args)
 {
   String playername;
   String position;
   Scanner scan = new Scanner(System.in);
     playername = scan.nextLine();
     position = scan.nextLine();
   Team t = new Team(playername,position);
   t.display(playername,position);
 }
}
class Team
{
 String playername;
 String position;
  Team(String playername, String position)
  {
   this.playername= playername;
   this.position=position;
  }
  void display(String playername, String position)
  { 
   System.out.println("Player Name: "+playername);
    System.out.println("Position: "+position);
  }
}