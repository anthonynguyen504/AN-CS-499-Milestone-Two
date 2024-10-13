package contact;

/**
 * This class represents a Contact with attributes such as contact ID, 
 * first name, last name, phone number, and address.
 */
public class Contact {
    // Attributes of the Contact class
    private String contactID;    // Unique ID for the contact
    private String firstName;    // First name of the contact
    private String lastName;     // Last name of the contact
    private String phoneNumber;  // Phone number of the contact
    private String address;      // Address of the contact

    /**
     * Constructor for the Contact class to initialize all fields.
     * 
     * @param contactID   The unique ID for the contact
     * @param firstName   The first name of the contact
     * @param lastName    The last name of the contact
     * @param phoneNumber The contact's phone number (should be 10 digits)
     * @param address     The contact's address
     */
    public Contact(String contactID, String firstName, String lastName, String phoneNumber, String address) {
        this.contactID = contactID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    // Getter and Setter methods for each attribute

    /**
     * Gets the contact ID.
     * 
     * @return The contact's ID
     */
    public String getContactID() {
        return contactID;
    }

    /**
     * Sets the contact ID.
     * 
     * @param contactID The unique ID to be set for the contact
     */
    public void setContactID(String contactID) {
        this.contactID = contactID;
    }

    /**
     * Gets the first name of the contact.
     * 
     * @return The contact's first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name of the contact.
     * 
     * @param firstName The first name to be set for the contact
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the last name of the contact.
     * 
     * @return The contact's last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name of the contact.
     * 
     * @param lastName The last name to be set for the contact
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the contact's phone number.
     * 
     * @return The contact's phone number
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the contact's phone number. Basic validation is done to check 
     * if the phone number is a valid 10-digit number.
     * 
     * @param phoneNumber The phone number to be set for the contact
     * @throws IllegalArgumentException if the phone number is not 10 digits long
     */
    public void setPhoneNumber(String phoneNumber) {
        // Basic validation for phone number format (can be expanded)
        if (phoneNumber.matches("\\d{10}")) {
            this.phoneNumber = phoneNumber;
        } else {
            throw new IllegalArgumentException("Invalid phone number. It should be 10 digits.");
        }
    }

    /**
     * Gets the contact's address.
     * 
     * @return The contact's address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the contact's address.
     * 
     * @param address The address to be set for the contact
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Returns a string representation of the contact, including all attributes.
     * 
     * @return A formatted string with the contact's details
     */
    @Override
    public String toString() {
        return "Contact [contactID=" + contactID + ", firstName=" + firstName + ", lastName=" + lastName
                + ", phoneNumber=" + phoneNumber + ", address=" + address + "]";
    }
}
