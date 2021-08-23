import static org.junit.Assert.*;
import org.junit.Test;

public class ContactServiceTest {

   @Test
   public void testAddPass() {
       ContactService cs = new ContactService();
       Contact contact1 = new Contact("1234", "Tony", "Ocasio", "1234 lane st");
       Contact contact2 = new Contact("4321", "Nicole", "Ryan", "4321 st lane");
       Contact contact3 = new Contact("9876", "Jane", "Doe", "1144 lane rd");
       assertEquals(true, cs.add(contact1));
       assertEquals(true, cs.add(contact2));
       assertEquals(true, cs.add(contact3));
       
   }

   @Test
   public void testAddFail() {
       ContactService cs = new ContactService();
       Contact contact1 = new Contact("1234", "Tony", "Ocasio", "1234 lane st");
       Contact contact2 = new Contact("4321", "Nicole", "Ryan", "4321 st lane");
       Contact contact3 = new Contact("9876", "Jane", "Doe", "1144 lane rd");
       assertEquals(true, cs.add(contact1));
       assertEquals(false, cs.add(contact1));
       assertEquals(true, cs.add(contact2));
       assertEquals(true, cs.add(contact3));

   }

   @Test
   public void testDeletePass() {
       ContactService cs = new ContactService();
       Contact contact1 = new Contact("1234", "Tony", "Ocasio", "1234 lane st");
       Contact contact2 = new Contact("4321", "Nicole", "Ryan", "4321 st lane");
       Contact contact3 = new Contact("9876", "Jane", "Doe", "1144 lane rd");
       assertEquals(true, cs.add(contact1));
       assertEquals(true, cs.add(contact2));
       assertEquals(true, cs.add(contact3));
       assertEquals(true, cs.remove("4321"));
       assertEquals(true, cs.remove("9876"));

   }

   @Test
   public void testDeleteFail() {
       ContactService cs = new ContactService();
       Contact contact1 = new Contact("1234", "Tony", "Ocasio", "1234 lane st");
       Contact contact2 = new Contact("4321", "Nicole", "Ryan", "4321 st lane");
       Contact contact3 = new Contact("9876", "Jane", "Doe", "1144 lane rd");
       assertEquals(true, cs.add(contact1));
       assertEquals(true, cs.add(contact2));
       assertEquals(true, cs.add(contact3));
       assertEquals(true, cs.remove("4321"));
       assertEquals(false, cs.remove("4455"));

   }

   @Test
   public void testUpdatePass() {
       ContactService cs = new ContactService();
       Contact contact1 = new Contact("1234", "Tony", "Ocasio", "1234 lane st");
       Contact contact2 = new Contact("4321", "Nicole", "Ryan", "4321 st lane");
       Contact contact3 = new Contact("9876", "Jane", "Doe", "1144 lane rd");
       assertEquals(true, cs.add(contact1));
       assertEquals(true, cs.add(contact2));
       assertEquals(true, cs.add(contact3));
       assertEquals(true, cs.update("4321", "Chunk", "Chunk", "124 LA ST"));
       assertEquals(true, cs.update("9876", "Janey", "Does", ""));

   }

   @Test
   public void testUpdateFail() {
       ContactService cs = new ContactService();
       Contact contact1 = new Contact("1234", "Tony", "Ocasio", "1234 lane st");
       Contact contact2 = new Contact("4321", "Nicole", "Ryan", "4321 st lane");
       Contact contact3 = new Contact("9876", "Jane", "Doe", "1144 lane rd");
       assertEquals(true, cs.add(contact1));
       assertEquals(true, cs.add(contact2));
       assertEquals(true, cs.add(contact3));
       assertEquals(false, cs.update("4455", "Chunk", "Chunk", ""));
       assertEquals(true, cs.update("4321", "Janey", "Does", "124 LA ST"));

   }

}
