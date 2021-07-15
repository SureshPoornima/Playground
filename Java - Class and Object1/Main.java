import java.util.Scanner;
class Main
{
 public static void main(String [] args)
 {
   String teamname;
   String cityrep;
   Scanner scan = new Scanner(System.in);
     teamname = scan.nextLine();
     cityrep = scan.nextLine();
   Team t = new Team(teamname,cityrep);
   t.display(teamname,cityrep);
 }
}
class Team
{
 String teamname;
 String cityrep;
  Team(String teamname, String cityrep)
  {
   this.teamname= teamname;
   this.cityrep=cityrep;
  }
  void display(String teamname, String cityrep)
  {
   System.out.println("Team Details-");  
   System.out.println("Team: "+teamname);
    System.out.println("City: "+cityrep);
  }
}