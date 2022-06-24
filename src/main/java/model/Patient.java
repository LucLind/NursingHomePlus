package model;

import utils.DateConverter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Patients live in a NURSING home and are treated by nurses.
 */
public class Patient extends Person {
    private long pid;
    private LocalDate dateOfBirth;
    private String careLevel;
    private String roomnumber;
    private List<Treatment> allTreatments = new ArrayList<Treatment>();

    /**
     * constructs a patient from the given params.
     * @param firstName the first name
     * @param surname the surname
     * @param dateOfBirth the date of birth
     * @param careLevel the care level
     * @param roomnumber the roomnumber
     */
    public Patient(String firstName, String surname, LocalDate dateOfBirth, String careLevel, String roomnumber) {
        super(firstName, surname);
        this.dateOfBirth = dateOfBirth;
        this.careLevel = careLevel;
        this.roomnumber = roomnumber;

    }

    /**
     * constructs a patient from the given params.
     * @param pid the pid
     * @param firstName the first name
     * @param surname the surname
     * @param dateOfBirth the date of birth
     * @param careLevel the care level
     * @param roomnumber the roomnumber
     */
    public Patient(long pid, String firstName, String surname, LocalDate dateOfBirth, String careLevel, String roomnumber) {
        super(firstName, surname);
        this.pid = pid;
        this.dateOfBirth = dateOfBirth;
        this.careLevel = careLevel;
        this.roomnumber = roomnumber;
    }

    /**
     * Getter for the pid
     * @return patient id
     */
    public long getPid() {
        return pid;
    }

    /**
     * Getter for the birth date
     * @return date of birth as a string
     */
    public String getDateOfBirth() {
        return dateOfBirth.toString();
    }

    /**
     * convert given param to a localDate and store as new <code>birthOfDate</code>
     * @param dateOfBirth as string in the following format: YYYY-MM-DD
     */
    public void setDateOfBirth(String dateOfBirth) {
        LocalDate birthday = DateConverter.convertStringToLocalDate(dateOfBirth);
        this.dateOfBirth = birthday;
    }

    /**
     * Getter for the care level
     * @return the careLevel
     */
    public String getCareLevel() {
        return careLevel;
    }

    /**
     * Setter for the care level
     * @param careLevel new care level
     */
    public void setCareLevel(String careLevel) {
        this.careLevel = careLevel;
    }

    /**
     * Getter for the room number
     * @return roomNumber as string
     */
    public String getRoomnumber() {
        return roomnumber;
    }

    /**
     * Setter for the room number
     * @param roomnumber the roomnumber
     */
    public void setRoomnumber(String roomnumber) {
        this.roomnumber = roomnumber;
    }


    /**
     * adds a treatment to the treatment-list, if it does not already contain it.
     * @param m the treatment
     * @return true if the treatment was not already part of the list. otherwise false
     */
    public boolean add(Treatment m) {
        if (!this.allTreatments.contains(m)) {
            this.allTreatments.add(m);
            return true;
        }
        return false;
    }

    /**
     * turns the patient model to a string.
     * @return string-representation of the patient
     */
    public String toString() {
        return "Patient" + "\nMNID: " + this.pid +
                "\nFirstname: " + this.getFirstName() +
                "\nSurname: " + this.getSurname() +
                "\nBirthday: " + this.getDateOfBirth() +
                "\nCarelevel: " + this.getCareLevel() +
                "\nRoomnumber: " + this.getRoomnumber() +
                "\n";
    }
}