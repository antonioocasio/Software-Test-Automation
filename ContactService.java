import java.util.ArrayList;

public class ContactService {
   // list of contacts
   private ArrayList<Contact> contacts;

   // contructor
   public ContactService() {
       contacts = new ArrayList<>();
   }

   // adds contact to contacts if not already in there
   public boolean add(Contact contact) {
       // check if contact is already in contacts
       boolean contactIn = false;

       for (Contact c:contacts) {
           if (c.equals(contact)) {
               contactIn = true;
           }
       }

       // if contact isn't in contacts then add
       if (!contactIn) {
           contacts.add(contact);
           System.out.println("Contact Added");
           return true;

       } else {
           System.out.println("Contact already added");
           return false;
       }
   }

   // remove contact
   public boolean remove(String contactId) {
       for (Contact c:contacts) {
           // if contactId's match remove contact
           if (c.getContactId().equals(contactId)) {
               contacts.remove(c);
               System.out.println("Contact removed");
               return true;
           }
       }

       System.out.println("Contact not in contacts");
       return false;
   }

   // update contact
   public boolean update(String contactId, String firstName, String lastName, String address) {
       for (Contact c:contacts) {
           // if contactId match
           if (c.getContactId().equals(contactId)) {
               // if firstName isn't empty update it
               if (!firstName.equals(""))
                   c.setFirstName(firstName);
               // if lastName isn't empty update it
               if (!lastName.equals(""))
                   c.setLastName(lastName);
               // if address isn't empty update it
               if (!address.equals(""))
                   c.setAddress(address);
               System.out.println("Contact updated");
               return true;
           }
       }

       System.out.println("Contact not found");
       return false;
   }
}
