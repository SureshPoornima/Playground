import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    String name,address,contact,email,prooftype,proofid;
     int id;
    id = scan.nextInt();
    name = scan.next();
    address = scan.next();
    contact = scan.next();
    email = scan.next();
    prooftype = scan.next();
    proofid = scan.next();
    
    Customer cus = new Customer(id,name,address,contact,email,prooftype,proofid);
    cus.register(id,name,address,contact,email,prooftype,proofid);
  }
}
class Customer{
    private int id;
	private String name;
	private String address;
	private String contact;
	private String email;
	private String prooftype;
	private String proofid;
  
  public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
  
  public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProoftype() {
		return prooftype;
	}

	public void setProoftype(String prooftype) {
		this.prooftype = prooftype;
	}

	public String getProofid() {
		return proofid;
	}

	public void setProofid(String proofid) {
		this.proofid = proofid;
	}

  Customer(int id,String name,String address, String contact, String email,String prooftype,String proofid)
  {
    id = this.id;
    name = this.name;
    address = this.address;
    contact = this.contact;
    email = this.email;
    prooftype = this.prooftype;
    proofid = this.proofid;
  }

  void register(int id,String name,String address,String contact, String email, String prooftype, String proofid)
  {
   System.out.println("Enter the number of Customer"); 
   System.out.println("Enter the name"); 
   System.out.println("Enter the address"); 
    System.out.println("Enter the contact number"); 
    System.out.println("Enter the email"); 
    System.out.println("Enter the ProofType"); 
    System.out.println("Enter the proof ID"); 
    System.out.println("Registration Successfull");
     System.out.println("Your Details:"); 
    System.out.println(name);
    System.out.println(address);
    System.out.println(contact);
    System.out.println(email);
    System.out.println(prooftype);
    System.out.println(proofid);
    System.out.println("Your id is "+id);
  }
}