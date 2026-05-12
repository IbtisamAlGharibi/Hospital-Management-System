package Entities;

import Behaviours.DisplayableInterface;
import Util.HelperUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Appointment implements DisplayableInterface {
    static HelperUtils helperUtils = new HelperUtils();
    private String appointmentId;
    private String patientId;
    private String doctorId;
    private LocalDate appointmentDate;
    private String appointmentTime;
    private String status;
    private String reason;
    private String notes;
    static Scanner scanner = new Scanner(System.in);
    public Appointment(String appointmentId, String patientId, String doctorId, LocalDate appointmentDate, String appointmentTime, String status, String reason, String notes) {
        this.appointmentId = appointmentId;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
        this.status = status;
        this.reason = reason;
        this.notes = notes;
    }

    public Appointment() {

    }

    public String getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(String appointmentId) {
        this.appointmentId = helperUtils.generateId();
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = helperUtils.generateId();
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = helperUtils.generateId();
    }

    public LocalDate getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(LocalDate appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
    public void displayInfo(){
        System.out.println("appointment Id: " + getAppointmentId() );
        System.out.println("patient Id: " + getPatientId() );
        System.out.println("doctor Id: " + getDoctorId() );
        System.out.println("appointment Date: " + getAppointmentDate() );
        System.out.println("appointment Time: " + getAppointmentTime() );
        System.out.println("status: " + getStatus() );
        System.out.println("reason: " + getReason() );
        System.out.println("notes: " + getNotes());
    }

    @Override
    public void displaySummary() {

    }

    public void reschedule(){
    System.out.println("RESCHEDULING");
        System.out.println("Please enter appointment Id ");
        String newID = scanner.nextLine();
        setAppointmentId(newID);

        System.out.println("Please enter patient Id ");
        String newPatientID = scanner.nextLine();
        setPatientId(newPatientID);

        System.out.println("Please enter doctor Id ");
        String newDoctorID = scanner.nextLine();
        setDoctorId(newDoctorID);

        System.out.println("Please enter appointment Date ");
        String newAppointmentDate = String.valueOf(helperUtils.isValidDate(scanner.nextLine()));
        setAppointmentDate(LocalDate.parse(newAppointmentDate));

        System.out.println("Please enter appointment Time ");
        String newAppointmentTime = scanner.nextLine();
        setAppointmentTime(newAppointmentTime);

        System.out.println("Please enter status ");
        String newStatus = scanner.nextLine();
        setStatus(newStatus);

        System.out.println("Please enter reason ");
        String newReason = scanner.nextLine();
        setReason(newReason);

        System.out.println("Please enter notes ");
        String newNotes= scanner.nextLine();
        setNotes(newNotes);
    }
    public void cancel(){
        System.out.println("Are you sure you want to cancel? YES/NO");
        String confirm = scanner.nextLine();
        if(confirm.equalsIgnoreCase("YES")){
         setStatus("Cancelled");
         System.out.println("CANCELLED SUCCESSFULLY");
        }else {
            System.out.println("Cancel REJECTED");
        }
    }
    public void complete(){
        setStatus("Complete");
        System.out.println("COMPLETED");
    }
    public void addNotes(String notes){
        System.out.println("ADDING NOTES");
        System.out.println("------------------------");

        System.out.println("Please enter the notes: ");
        notes = scanner.nextLine();
       setNotes(notes);
    }

    public void addNotes(String notes, String addedBy){
        System.out.println("ADDING NOTES");
        System.out.println("------------------------");

        System.out.println("Please enter the notes: ");
        notes = scanner.nextLine();
        setNotes(notes);

        System.out.println("Please enter your name: ");
        addedBy = scanner.nextLine();
        System.out.println(addedBy);
    }

    public void addNotes(String notes, String addedBy, LocalDateTime timestamp){
        System.out.println("ADDING NOTES");
        System.out.println("------------------------");

        System.out.println("Please enter the notes: ");
        notes = scanner.nextLine();
        setNotes(notes);

        System.out.println("Please enter your name: ");
        addedBy = scanner.nextLine();
        System.out.println(addedBy);

        System.out.println("Please enter the date and time: ");
        timestamp = LocalDateTime.parse(scanner.nextLine());
        System.out.println(timestamp);
    }
}
