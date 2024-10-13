package contact;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * This class contains JUnit test cases to test the add, delete, and update methods
 * of the ContactService class.
 */
public class ContactServiceTest {

    // Template contacts used in the test cases:
    /*
     * Contact("1413252", "John", "Doe", "5555555555", "Sample 24 Drive");
     * Contact("1309403", "Mike", "Shawn", "2187123404", "Valley of Thorns");
     * Contact("9752319", "Will", "Smith", "9215501793", "Land of Proxynee");
     */

    /**
     * Test case for adding a contact.
     * This ensures that the addContact() method returns true after successfully adding a contact.
     */
    @Test
    public void testAdd() {
        ContactService cs = new ContactService(); // Create a ContactService instance
        Contact test1 = new Contact("1413252", "John", "Doe", "5555555555", "Sample 24 Drive"); // Create a contact
        assertEquals(true, cs.addContact(test1)); // Check if adding the contact returns true
    }

    /**
     * Test case for deleting a contact.
     * This ensures that deleteContact() works properly by testing both successful and unsuccessful deletion scenarios.
     */
    @Test
    public void testDelete() {
        ContactService cs = new ContactService(); // Create a ContactService instance

        // Create multiple contact instances
        Contact test1 = new Contact("1413252", "John", "Doe", "5555555555", "Sample 24 Drive");
        Contact test2 = new Contact("1309403", "Mike", "Shawn", "2187123404", "Valley of Thorns");
        Contact test3 = new Contact("9752319", "Will", "Smith", "9215501793", "Land of Proxynee");

        // Add contacts to the service
        cs.addContact(test1);
        cs.addContact(test2);
        cs.addContact(test3);

        // Test successful deletion of contact with ID "1309403"
        assertEquals(true, cs.deleteContact("1309403"));

        // Test deletion of a non-existent contact ID (should return false)
        assertEquals(false, cs.deleteContact("1309404"));

        // Test deletion of an already deleted contact ID (should return false)
        assertEquals(false, cs.deleteContact("1309403"));
    }

    /**
     * Test case for updating a contact.
     * This ensures that updateContact() correctly updates an existing contact and returns true.
     * It also tests the behavior when trying to update a non-existent contact.
     */
    @Test
    public void testUpdate() {
        ContactService cs = new ContactService(); // Create a ContactService instance

        // Create multiple contact instances
        Contact test1 = new Contact("1413252", "John", "Doe", "5555555555", "Sample 24 Drive");
        Contact test2 = new Contact("1309403", "Mike", "Shawn", "2187123404", "Valley of Thorns");
        Contact test3 = new Contact("9752319", "Will", "Smith", "9215501793", "Land of Proxynee");

        // Add contacts to the service
        cs.addContact(test1);
        cs.addContact(test2);
        cs.addContact(test3);

        // Test successful update of contact with ID "9752319"
        assertEquals(true, cs.updateContact("9752319", "WillFirst", "SmithLast", "9215501793", "Land of Proxynee"));

        // Test update of a non-existent contact (should return false)
        assertEquals(false, cs.updateContact("9752322", "WillFirst", "SmithLast", "9215501793", "Land of Proxynee"));
    }
}
