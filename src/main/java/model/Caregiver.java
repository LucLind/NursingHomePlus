package model;

public class Caregiver extends Person
{
    private long _cid;
    private String _telephone;

    /**
     * Constructor for the caregiver model with the following params
     * @param firstName the firts name of the caregiver
     * @param surname the surname of the caregiver
     * @param telephone the phone number of the caregiver
     */
    public Caregiver(String firstName, String surname, String telephone) {
        super(firstName, surname);
        _telephone = telephone;
    }

    /**
     * Constructor for the caregiver model with the following params
     * @param cid the cid of the caregiver
     * @param firstName the first name of the caregiver
     * @param surname the surname of the caregiver
     * @param telephone the phone number of the caregiver
     */
    public Caregiver(long cid, String firstName, String surname, String telephone) {
        super(firstName, surname);
        _cid = cid;
        _telephone = telephone;
    }

    /**
     * Getter for the cid
     * @return the cid
     */
    public long getCid() {

        return _cid;
    }

    /**
     * Setter  for the cid.
     * @param cid the cid to be set.
     */
    public void setCid(long cid) {
        _cid = cid;
    }

    /**
     * Getter for the phone Number
     */
    public String getTelephone() {
        return _telephone;
    }

    /**
     * Setter for the phone Number
     * @param telephone the phone number to be set
     */
    public void setTelephone(String telephone) {
        _telephone = telephone;
    }

    /**
     * turns the caregiver model to a string.
     * @return string-representation of the caregiver
     */
    public String toString() {
        return "\nPfleger*In" + "\nCID: " + this.getCid() +
                "\nVorname: " + this.getFirstName() +
                "\nNachname: " + this.getSurname() +
                "\nTelefonnummer: " + this.getTelephone() +
                "\n";
    }
}