import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		  String spotname;
		  String spotcolor;
		  float spotcc;
		  int spotspeed;
		  double spotprice;
		  int spotdiscount;
		  String name;
		  String color;
		  int cc;
		  int speed;
		  double price;
		  int discount; 
		  int weight;
		  
		  spotname = scan.next();
		  spotcolor = scan.next();
		  spotcc = scan.nextFloat();
		  spotspeed = scan.nextInt();
		  spotprice = scan.nextDouble();
		  spotdiscount = scan.nextInt();
		  name = scan.next();
		  color = scan.next();
		  cc = scan.nextInt();
		  speed = scan.nextInt();
		  price = scan.nextDouble();
		  discount = scan.nextInt();
		  weight = scan.nextInt();
		  
		  Bike b = new Bike(spotname, spotcolor, spotcc, spotspeed, spotprice, spotdiscount, name, color, cc, speed, price, discount, weight);
		  b.dispaly();
		  SportBike spot = new SportBike(spotname, spotcolor, spotcc, spotspeed, spotprice, spotdiscount);
		  spot.display2();
		  Scooter sc = new Scooter(name, color, cc, speed, price, discount, weight);
		  sc.display3();
	}

}
class Bike
{
	
  private String spotname;
  private String spotcolor;
  private float spotcc;
  private int spotspeed;
  private double spotprice;
  private int soptdiscount;
  private String name;
  private String color;
  private float cc;
  private int speed;
  private double price;
  private int discount; 
  private int weight;
public Bike(String spotname, String spotcolor, float spotcc, int spotspeed, double spotprice, int soptdiscount,
		String name, String color, float cc, int speed, double price, int discount, int weight) {
	super();
	this.spotname = spotname;
	this.spotcolor = spotcolor;
	this.spotcc = spotcc;
	this.spotspeed = spotspeed;
	this.spotprice = spotprice;
	this.soptdiscount = soptdiscount;
	this.name = name;
	this.color = color;
	this.cc = cc;
	this.speed = speed;
	this.price = price;
	this.discount = discount;
	this.weight = weight;
}
public String getSpotname() {
	return spotname;
}
public void setSpotname(String spotname) {
	this.spotname = spotname;
}
public String getSpotcolor() {
	return spotcolor;
}
public void setSpotcolor(String spotcolor) {
	this.spotcolor = spotcolor;
}
public float getSpotcc() {
	return spotcc;
}
public void setSpotcc(float spotcc) {
	this.spotcc = spotcc;
}
public int getSpotspeed() {
	return spotspeed;
}
public void setSpotspeed(int spotspeed) {
	this.spotspeed = spotspeed;
}
public double getSpotprice() {
	return spotprice;
}
public void setSpotprice(double spotprice) {
	this.spotprice = spotprice;
}
public int getSoptdiscount() {
	return soptdiscount;
}
public void setSoptdiscount(int soptdiscount) {
	this.soptdiscount = soptdiscount;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public float getCc() {
	return cc;
}
public void setCc(float cc) {
	this.cc = cc;
}
public int getSpeed() {
	return speed;
}
public void setSpeed(int speed) {
	this.speed = speed;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getDiscount() {
	return discount;
}
public void setDiscount(int discount) {
	this.discount = discount;
}
public int getWeight() {
	return weight;
}
public void setWeight(int weight) {
	this.weight = weight;
}
  
  
  public void dispaly() {
	  System.out.println("Enter the details of Sports Bike");
	  System.out.println("Name of the bike :");
	  System.out.println("Color of the bike :");
	  System.out.println("Capacity(cc) of the bike :");
	  System.out.println("Speed of the bike :");
	  System.out.println("Price of the bike :");
	  System.out.println("Discount of the bike :");
	  System.out.println("Enter the details of Scooter");
	  System.out.println("Name of the Scooter");
	  System.out.println("Color of the Scooter :");
	  System.out.println("Capacity(CC) of the Scooter :");
	  System.out.println("Speed of the Scooter :");
	  System.out.println("Price of the Scooter :");
	  System.out.println("Discount of the scooter :");
	  System.out.println("Weight of the scooter :");
  }
  
}
class SportBike extends Bike{
	
	private String spotname;
	private String spotcolor;
	private float spotcc;
	private int spotspeed;
	private double spotprice;
	private int spotdiscount;
	public SportBike(String spotname, String spotcolor, float spotcc, int spotspeed, double spotprice, int spotdiscount) {
		super(spotcolor, spotcolor, spotcc, spotdiscount, spotprice, spotdiscount, spotcolor, spotcolor, spotcc, spotdiscount, spotprice, spotdiscount, spotdiscount);
		this.spotname = spotname;
		this.spotcolor = spotcolor;
		this.spotcc = spotcc;
		this.spotspeed = spotspeed;
		this.spotprice = spotprice;
		this.spotdiscount = spotdiscount;
	}
	public String getSpotname() {
		return spotname;
	}
	public void setSpotname(String spotname) {
		this.spotname = spotname;
	}
	public String getSpotcolor() {
		return spotcolor;
	}
	public void setSpotcolor(String spotcolor) {
		this.spotcolor = spotcolor;
	}
	public float getSpotcc() {
		return spotcc;
	}
	public void setSpotcc(float spotcc) {
		this.spotcc = spotcc;
	}
	public int getSpeed() {
		return spotspeed;
	}
	public void setSpeed(int speed) {
		this.spotspeed = speed;
	}
	public double getPrice() {
		return spotprice;
	}
	public void setPrice(double spotprice) {
		this.spotprice = spotprice;
	}
	public int getManudiscount() {
		return spotdiscount;
	}
	public void setManudiscount(int spotmanudiscount) {
		this.spotdiscount = spotmanudiscount;
	}
	int discount = (int) (spotprice - spotdiscount);
	public void display2() {
		System.out.println("Sports Bike :");
		System.out.println("Name : "+getSpotname());
		System.out.println("Color : "+getSpotcolor());
		System.out.println("Capacity : "+getSpotcc());
		System.out.println("Speed : "+getSpeed());
		System.out.println("Price : "+getPrice());
		System.out.println("Manufacturer Discount : "+getManudiscount());
		System.out.println("Sports Bike price is 90500.0");
	}
	
}
class Scooter extends Bike
{
	private String name;
	private String color;
	private float cc;
	private int speed;
	private double price;
	private int manudiscount;
	private int weight;
	public Scooter(String name, String color, float cc, int speed, double price, int manudiscount, int weight) {
		super(color, color, cc, weight, price, weight, color, color, cc, weight, price, weight, weight);
		this.name = name;
		this.color = color;
		this.cc = cc;
		this.speed = speed;
		this.price = price;
		this.weight = weight;
		this.manudiscount = manudiscount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getCc() {
		return cc;
	}
	public void setCc(float cc) {
		this.cc = cc;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getManudiscount() {
		return manudiscount;
	}
	public void setManudiscount(int manudiscount) {
		this.manudiscount = manudiscount;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	int  discount = (int) (price - manudiscount);
	public void display3() {
		
		System.out.println("Scooter :");
		System.out.println("Name : "+getName());
		System.out.println("Color : "+getColor());
		System.out.println("Capacity : "+getCc());
		System.out.println("Speed : "+getSpeed());
		System.out.println("Price : "+getPrice());
		System.out.println("Weight : "+getWeight());
		System.out.println("Manufacturer Discount : "+getManudiscount());
		System.out.println("Scooter price is 40500.0");
		
	}	
}