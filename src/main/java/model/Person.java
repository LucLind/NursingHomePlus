package model;

/**
 * An abstract class to avoid duplicated code for persons like patients or caregivers
 */
public abstract class Person {
    private String firstName;
    private String surname;

    /**
     * constructor for a person model
     * @param firstName the first name of the person
     * @param surname the surname of the person
     */
    public Person(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;
    }

    /**
     * Getter for the first name
     * @return the first name as String
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter for the first name
     * @param firstName the first name of the person
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Getter for the surname
     * @return the surname as String
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Setter for the surname
     * @param surname the surname of the person
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * turns the person model to a string.
     * @return string-representation of the person
     */
    public String toString() {
        return "\nPerson" + "\nFirst name: " + this.firstName +
                "\nSurname: " + this.surname + "\n";

    }
}
