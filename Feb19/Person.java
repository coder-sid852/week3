package Feb19;

public class Person
{
   // fields
   private String name;
   private String email;
   private String phoneNumber;
   

   public Person()
   {
      this.name = "";
      this.email = "";
      this.phoneNumber = "";
   }

   // constructor
   public Person(String theName, String theEmail, String thePhone)
   {
      this.name = theName;
      this.email = theEmail;
      this.phoneNumber = thePhone;
   }

   // methods - getters
   public String getName() { return this.name;}
   public String getEmail() { return this.email;}
   public String getPhoneNumber() { return this.phoneNumber;}

   // methods - setters
   public void setName(String theName) { this.name = theName;}
   public void setEmail(String theEmail) {this.email = theEmail;}
   public void setPhoneNumber(String thePhoneNumber) { this.phoneNumber = thePhoneNumber;}
   public String toString()
   {
      return this.name + " " + this.email + " " + this.phoneNumber;
   }

   // main method for testing
   public static void main(String[] args)
   {
      Person p1 = new Person("Sana", "sana@gmail.com", "425 623-8945");
      System.out.println(p1);
      Person p2 = new Person("Jean", "jean@gmail.com","404 899-9955");
   
      System.out.println(p2);
   }
}
