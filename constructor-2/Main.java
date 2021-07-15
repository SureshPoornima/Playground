import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    String name;
    int id;
    String department;
    name = scan.nextLine();
    id = scan.nextInt();
    department = scan.next();
    System.out.println("Name");
    System.out.println("Id");
    System.out.println("Department");
    System.out.println("Original:-");
    Department depart = new Department(id,department);
    Student st = new Student(name,id,department);
    st.student(name,id,department);
    System.out.println("Duplicate:-");
    Student st1 = new Student(name,id,department);
    st1.student(name,id,department);
   }
}
class Department
{
  private String name;
  private int id;
  private String department;
  
  public String getName(String name)
  {
   return name; 
  }
  public void setName(String name)
  {
   this.name= name; 
  }
   public int getId(int id)
  {
   return id; 
  }
  public void setId(int id)
  {
   this.id= id; 
  }
   public String getDepartment(String department)
  {
   return department;
  }
  public void setDepartment(String department)
  {
   this.department= department; 
  }
  public Department(int id,String department)
  {
   this.id = id;
   this.department = department;
  }
}
class Student
{
 private String name;
 private int id;
 private String department;
  
  public String getName(String name)
  {
   return name; 
  }
  public void setName(String name)
  {
   this.name= name; 
  }
   public int getId(int id)
  {
   return id; 
  }
  public void setId(int id)
  {
   this.id= id; 
  }
   public String getDepartment(String department)
  {
   return department;
  }
  public void setDepartment(String department)
  {
   this.department= department; 
  }
  public Student(String name,int id,String department)
  {
   this.name = name;
   this.id = id;
   this.department = department;
  }
  public void student(String name,int id, String department)
  {
    System.out.println("Id: "+id);
    System.out.println("Name: "+name);   
    System.out.println("Department Id: "+id);
    System.out.println("Department:"+department);
  }
  
}
