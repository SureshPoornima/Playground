import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    String name,address,contact,email,prooftype,proofid;
     
    name = scan.next();
    address = scan.next();
    contact = scan.next();
    email = scan.next();
    prooftype = scan.next();
    proofid = scan.next();
    
    Customer cus = new Customer(name,address,contact,email,prooftype,proofid);
    cus.register(name,address,contact,email,prooftype,proofid);
  }
}
class Customer{
	private String name;
	private String address;
	private String contact;
	private String email;
	private String prooftype;
	private String proofid;
  
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

  Customer(String name,String address, String contact, String email,String prooftype,String proofid)
  {
    name = this.name;
    address = this.address;
    contact = this.contact;
    email = this.email;
    prooftype = this.prooftype;
    proofid = this.proofid;
  }

  void register(String name,String address,String contact, String email, String prooftype, String proofid)
  {
   System.out.println("Registration"); 
   System.out.println("Enter your name"); 
   System.out.println("Enter your address"); 
    System.out.println("Contact Number"); 
    System.out.println("E-Mail ID"); 
    System.out.println("Enter proof type"); 
    System.out.println("Enter proof id"); 
    System.out.println("Customer Details"); 
    System.out.println(name);
    System.out.println(address);
    System.out.println(contact);
    System.out.println(email);
    System.out.println(prooftype);
    System.out.println(proofid);
    System.out.println("Thank you for registering. Your id is 1...");
  }
}