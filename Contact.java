public class Contact {
   // varaibles for menbers
   private String contactId;
   private String firstName;
   private String lastName;
   private String address;

   // contructor for the contact object
   public Contact(String contactId, String firstName, String lastName, String address) {
       this.contactId = contactId;
       this.firstName = firstName;
       this.lastName = lastName;
       this.address = address;
   }

   // get contactId method
   public String getContactId() {
       return contactId;
   }

   // get first name method
   public String getFirstName() {
       return firstName;
   }

   // set first name method
   public void setFirstName(String firstName) {
       this.firstName = firstName;
   }

   // get last name method
   public String getLastName() {
       return lastName;
   }

   // set last name method
   public void setLastName(String lastName) {
       this.lastName = lastName;
   }

   // get address method
   public String getAddress() {
       return address;
   }

   // set address method
   public void setAddress(String address) {
       this.address = address;
   }

   // check if 2 contacts are the same
   //@Override
   public boolean equals(Object obj) {
       if (this == obj)
           return true;

       if (obj == null)
           return false;

       if (getClass() != obj.getClass())
           return false;

       Contact other = (Contact) obj;

       if (contactId == null) {
           if (other.contactId != null)
               return false;

       } else if (!contactId.equals(other.contactId))
           return false;

       if (firstName == null) {
           if (other.firstName != null)
               return false;

       } else if (!firstName.equals(other.firstName))
           return false;

       if (lastName == null) {
           if (other.lastName != null)
               return false;

       } else if (!lastName.equals(other.lastName))
           return false;

       if (address == null) {
           if (other.address != null)
               return false;

       } else if (!address.equals(other.address))
           return false;
       return true;
   }
}
