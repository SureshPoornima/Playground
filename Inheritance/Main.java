
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name,major;
		int age,year;
		String gender;
		long idnum;
		double cgpa;
		name = scan.nextLine();
		age = scan.nextInt();
		gender = scan.next();
		idnum = scan.nextLong();
		major = scan.next();
		cgpa = scan.nextDouble();
		year = scan.nextInt();
		 
		System.out.println("Name");
		System.out.println("Age");
		System.out.println("Gender");
		System.out.println("ID Number");
		System.out.println("Major");
		System.out.println("CGPA");
		System.out.println("Year");
		System.out.println("The Student details is");
		
		Student st = new Student(name, major, age, year,gender, idnum, cgpa);
		st.display();
       CollegeStudent stud = new CollegeStudent(name,major, age,year, gender, idnum, cgpa);
       stud.display2();
	}

}
 class Student
 {
	    private String name,major;
		private int age,year;
		private String gender;
		private long idnum;
		private double cgpa;
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getMajor() {
			return major;
		}

		public void setMajor(String major) {
			this.major = major;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public long getIdnum() {
			return idnum;
		}

		public void setIdnum(long idnum) {
			this.idnum = idnum;
		}

		public double getCgpa() {
			return cgpa;
		}

		public void setCgpa(double cgpa) {
			this.cgpa = cgpa;
		}

		

	

	public Student(String name, String major, int age, int year, String gender, long idnum, double cgpa) {
			super();
			this.name = name;
			this.major = major;
			this.age = age;
			this.year = year;
			this.gender = gender;
			this.idnum = idnum;
			this.cgpa = cgpa;
		}

	public void display()
	   {
		System.out.println("ID : "+idnum);
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Gender : "+gender);
		
	   }
	 
 }
 class CollegeStudent extends Student
 {
	 private String name,major;
		private int age,year;
		private String gender;
		private long idnum;
		private double cgpa;
  
 
public CollegeStudent(String name, String major, int age, int year, String gender, long idnum, double cgpa) {
			super(name, major, age, year, gender, idnum, cgpa);
			this.name = name;
			this.major = major;
			this.age = age;
			this.year = year;
			this.gender = gender;
			this.idnum = idnum;
			this.cgpa = cgpa;
		}
public String getMajor() {
	return major;
}
public void setMajor(String major) {
	this.major = major;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public double getCgpa() {
	return cgpa;
}
public void setCgpa(double cgpa) {
	this.cgpa = cgpa;
}
  
  public void display2()
  {
	  System.out.println("Major : "+major);
	  System.out.println("CGPA : "+cgpa);
	  System.out.println("Year : "+year);
	  
  }
  
 }
 
 
