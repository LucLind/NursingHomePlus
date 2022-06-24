package model;

import utils.DateConverter;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Class for the treatments
 */
public class Treatment {
    private long tid;
    private long pid;
    private LocalDate date;
    private LocalTime begin;
    private LocalTime end;
    private String description;
    private String remarks;

    /**
     * constructor for the treatment with the following params
     * @param pid patient ID
     * @param date birth date
     * @param begin begin of the treatment
     * @param end end of the treatment
     * @param description the description of the treatment
     * @param remarks remarks of the treatment
     */
    public Treatment(long pid, LocalDate date, LocalTime begin,
                     LocalTime end, String description, String remarks) {
        this.pid = pid;
        this.date = date;
        this.begin = begin;
        this.end = end;
        this.description = description;
        this.remarks = remarks;
    }

    /**
     * constructor of the treatment with the following params
     * @param tid treatment ID
     * @param pid patient ID
     * @param date birth date
     * @param begin begin of the treatment
     * @param end end of the treatment
     * @param description the description of the treatment
     * @param remarks remarks of the treatment
     */
    public Treatment(long tid, long pid, LocalDate date, LocalTime begin,
                     LocalTime end, String description, String remarks) {
        this.tid = tid;
        this.pid = pid;
        this.date = date;
        this.begin = begin;
        this.end = end;
        this.description = description;
        this.remarks = remarks;
    }

    /**
     * Getter for the tid
     * @return treatment ID
     */
    public long getTid() {
        return tid;
    }

    /**
     * Getter for the pid
     * @return patient ID
     */
    public long getPid() {
        return this.pid;
    }

    /**
     * Getter for the  date
     * @return the date as String
     */
    public String getDate() {
        return date.toString();
    }

    /**
     * Setter for the date
     * @param s_date the date as String
     */
    public void setDate(String s_date) {
        LocalDate date = DateConverter.convertStringToLocalDate(s_date);
        this.date = date;
    }

    /**
     * Getter for the beginning
     * @return the begin as Stirng
     */
    public String getBegin() {
        return begin.toString();
    }

    /**
     * Setter for the beginning
     * @param begin the begin of the treatment
     */
    public void setBegin(String begin) {
        LocalTime time = DateConverter.convertStringToLocalTime(begin);
        this.begin = time;
    }

    /**
     * Getter for the end of the treatment
     * @return the end as String
     */
    public String getEnd() {
        return end.toString();
    }

    /**
     * Setter for the end of the treatment
     * @param end the end of the treatment
     */
    public void setEnd(String end) {
        LocalTime time = DateConverter.convertStringToLocalTime(end);
        this.end = time;
    }

    /**
     * Getter for the description
     * @return the description as String
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter for the description
     * @param description the description of the treatment
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gette for the remarks of the treatment
     * @return the remarks as String
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Setter for the remarks of the treatment
     * @param remarks the remarks of the treatment
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * turns the treatment model to a string.
     * @return string-representation of the treatment
     */
    public String toString() {
        return "\nBehandlung" + "\nTID: " + this.tid +
                "\nPID: " + this.pid +
                "\nDate: " + this.date +
                "\nBegin: " + this.begin +
                "\nEnd: " + this.end +
                "\nDescription: " + this.description +
                "\nRemarks: " + this.remarks + "\n";
    }
}