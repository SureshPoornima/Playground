import java.util.Scanner;
class Main
{
 public static void main(String [] args)
 {
   byte matchesPlayed;
   byte numOfWins;
   byte numOfLosses;
   float avgLapSpeed;
   float maxLapSpeed;
   float avgThrowDistance;
   float maxThrowDistance;
   Scanner scan = new Scanner(System.in);
     matchesPlayed = scan.nextByte();
     numOfWins = scan.nextByte();
     numOfLosses = scan.nextByte();
     avgLapSpeed = scan.nextFloat();
     maxLapSpeed = scan.nextFloat();
     avgThrowDistance = scan.nextFloat();
     maxThrowDistance = scan.nextFloat();
   
    int ratio1,ratio2;
    ratio1 = numOfWins/2;
    ratio2 = numOfLosses/2;
   
   Team t = new Team(matchesPlayed,ratio1,ratio2,avgLapSpeed,maxLapSpeed,avgThrowDistance,maxThrowDistance);
   t.display(matchesPlayed,ratio1,ratio2,avgLapSpeed,maxLapSpeed,avgThrowDistance,maxThrowDistance);
 }
}
class Team
{
 byte matchesPlayed;
 int ratio1;
 int ratio2;
 float avgLapSpeed;
 float maxLapSpeed;
 float avgThrowDistance;
 float maxThrowDistance;
  Team(byte matchesPlayed,int ratio1,int ratio2,float avgLapSpeed,float maxLapSpeed,float avgThrowDistance,float maxThrowDistance)
  {
    this.matchesPlayed = matchesPlayed;
    this.ratio1 = ratio1;
    this.ratio2 = ratio2;
    this.avgLapSpeed = avgLapSpeed;
    this.maxLapSpeed = maxLapSpeed;
    this.avgThrowDistance = avgThrowDistance;
    this.maxThrowDistance = maxThrowDistance;
  }
 
  void display(byte matchesPlayed,int ratio1,int ratio2,float avgLapSpeed,float maxLapSpeed,float avgThrowDistance,float maxThrowDistance)
  { 
   System.out.println("Matches Played: "+matchesPlayed);
    System.out.println("Win/Loss Ratio:"+ratio1+":"+ratio2);
    System.out.println("Avg/Max Lap Speed: "+avgLapSpeed+" | "+maxLapSpeed);
    System.out.println("Avg/Max Throw Distance: "+avgThrowDistance+" | "+maxThrowDistance);
  }
}