package Entities;

import java.time.LocalDate;
import java.util.Scanner;

public class Appointment {
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

    public String getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
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
        String newAppointmentDate = scanner.nextLine();
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
}
