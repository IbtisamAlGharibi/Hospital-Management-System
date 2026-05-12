package Entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Patient extends Person{
    private String patientId;
    private String bloodGroup;
    private List<String> allergies = new ArrayList<>();
    private String emergencyContact;
    private LocalDate registrationDate;
    private String insuranceId;
    private static List<String > medicalRecords = new ArrayList<>();
    private static List<String > appointments = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
     static MedicalRecord medicalRecord = new MedicalRecord();
    public Patient() {
        super();
    }
    static Appointment appointment = new Appointment();

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public List<String> getAllergies() {
        return allergies;
    }

    public void setAllergies(List<String> allergies) {
        this.allergies = allergies;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(String insuranceId) {
        this.insuranceId = insuranceId;
    }

    public List<String> getMedicalRecords() {
        return medicalRecords;
    }

    public void setMedicalRecords(List<String> medicalRecords) {
        this.medicalRecords = medicalRecords;
    }

    public List<String> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<String> appointments) {
        this.appointments = appointments;
    }

    public Patient(String ID, String firstName, String lastName, LocalDate dateOfBirth, String gender, String phoneNumber, String email, String address, String patientId, String bloodGroup, List<String> allergies, String emergencyContact, LocalDate registrationDate, String insuranceId, List<String> medicalRecords, List<String> appointments) {
        super(ID, firstName, lastName, dateOfBirth, gender, phoneNumber, email, address);
        this.patientId = patientId;
        this.bloodGroup = bloodGroup;
        this.allergies = allergies;
        this.emergencyContact = emergencyContact;
        this.registrationDate = registrationDate;
        this.insuranceId = insuranceId;
        this.medicalRecords = medicalRecords;
        this.appointments = appointments;

    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientId='" + patientId + '\'' +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", allergies=" + allergies +
                ", emergencyContact='" + emergencyContact + '\'' +
                ", registrationDate=" + registrationDate +
                ", insuranceId='" + insuranceId + '\'' +
                ", medicalRecords=" + medicalRecords +
                ", appointments=" + appointments +
                '}';
    }

    @Override
    public void displayInfo(){
        System.out.println("ID : " + getID() );
        System.out.println("First Name: " + getFirstName() );
        System.out.println("Last Name: " + getLastName() );
        System.out.println("Date of birth: " + getDateOfBirth() );
        System.out.println("Gender: " + getGender() );
        System.out.println("Phone Number: " + getPhoneNumber() );
        System.out.println("Email: " + getEmail() );
        System.out.println("Address: " + getAddress());
        System.out.println("patient Id : " + getPatientId() );
        System.out.println("blood Group : " + getBloodGroup() );
        System.out.println("allergies : " + getAllergies() );
        System.out.println("registrationDate : " + getRegistrationDate() );
        System.out.println("insurance Id : " + getInsuranceId());
        System.out.println("medical Records : " + getMedicalRecords());
        System.out.println("appointments : " + getAppointments());
    }
    public static String addMedicalRecord(){
        System.out.println("ADDING NEW MEDICAL RECORD");
        System.out.println("----------------------------");

        System.out.println("Please enter record Id: ");
        String recordId = scanner.nextLine();
        medicalRecord.setRecordId(recordId);

        System.out.println("Please enter patient ID: ");
        String patientID = scanner.nextLine();
        medicalRecord.setPatientId(patientID);

        System.out.println("Please enter Doctor ID: ");
        String doctorID = scanner.nextLine();
        medicalRecord.setDoctorId(doctorID);

        System.out.println("Please enter visit date: ");
        String visitDate = scanner.nextLine();
        medicalRecord.setVisitDate(LocalDate.parse(visitDate));

        System.out.println("Please enter diagnosis: ");
        String diagnosis = scanner.nextLine();
        medicalRecord.setDiagnosis(diagnosis);

        System.out.println("Please enter prescription: ");
        String prescription = scanner.nextLine();
        medicalRecord.setPrescription(prescription);

        System.out.println("Please enter test result: ");
        String testResult = scanner.nextLine();
        medicalRecord.setTestResults(testResult);

        System.out.println("Please enter notes: ");
        String notes = scanner.nextLine();
        medicalRecord.setNotes(notes);
        return recordId;
    }

    public void addNewMedicalRecord(){
        boolean flag = true;
        while (flag){
            medicalRecords.add(addMedicalRecord());
            System.out.println("Please enter E to Stop");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("E")){
                flag = false;
            }
        }
    }
    public static String addAppointment(){
        System.out.println("ADDING NEW APPOINTMENT");
        System.out.println("----------------------------");
        System.out.println("Please enter appointment Id ");
        String newID = scanner.nextLine();
        appointment.setAppointmentId(newID);

        System.out.println("Please enter patient Id ");
        String newPatientID = scanner.nextLine();
        appointment.setPatientId(newPatientID);

        System.out.println("Please enter doctor Id ");
        String newDoctorID = scanner.nextLine();
        appointment.setDoctorId(newDoctorID);

        System.out.println("Please enter appointment Date ");
        String newAppointmentDate = scanner.nextLine();
        appointment.setAppointmentDate(LocalDate.parse(newAppointmentDate));

        System.out.println("Please enter appointment Time ");
        String newAppointmentTime = scanner.nextLine();
        appointment.setAppointmentTime(newAppointmentTime);

        System.out.println("Please enter status ");
        String newStatus = scanner.nextLine();
        appointment.setStatus(newStatus);

        System.out.println("Please enter reason ");
        String newReason = scanner.nextLine();
        appointment.setReason(newReason);

        System.out.println("Please enter notes ");
        String newNotes= scanner.nextLine();
        appointment.setNotes(newNotes);
        return newID;
    }

    public void addNewAppointment(){
        boolean flag = true;
        while (flag){
           appointments.add(addAppointment());
            System.out.println("Please enter E to Stop");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("E")){
                flag = false;
            }
        }
    }
    public void updateInsurance(){
        System.out.println("Please enter the insurance Id you want to update");
        String insuranceToUpdate = scanner.nextLine();
        String oldInsurance = getInsuranceId();
         if (insuranceToUpdate.equalsIgnoreCase(oldInsurance)){
            setInsuranceId(insuranceToUpdate);
            System.out.println("Insurance Updated Successfully");
         }else{
             System.out.println("This ID is not found");
         }
    }
    public void updateContact(String phone){
        System.out.println("UPDATING CONTACT");
        System.out.println("---------------------------");

        System.out.println("Please enter the new phone number");
        phone = scanner.nextLine();
        setPhoneNumber(phone);
        System.out.println("Phone number updated successfully");
    }

    public void updateContact(String phone, String email){
        System.out.println("UPDATING CONTACT");
        System.out.println("---------------------------");

        System.out.println("Please enter the new phone number");
        phone = scanner.nextLine();
        setPhoneNumber(phone);
        System.out.println("Phone number updated successfully");

        System.out.println("Please enter the new email");
        email = scanner.nextLine();
        setEmail(email);
        System.out.println("Email updated successfully");
    }

    public void updateContact(String phone, String email,String address){
        System.out.println("UPDATING CONTACT");
        System.out.println("---------------------------");

        System.out.println("Please enter the new phone number");
        phone = scanner.nextLine();
        setPhoneNumber(phone);
        System.out.println("Phone number updated successfully");

        System.out.println("Please enter the new email");
        email = scanner.nextLine();
        setEmail(email);
        System.out.println("Email updated successfully");

        System.out.println("Please enter the new address");
        address = scanner.nextLine();
        setAddress(address);
        System.out.println("Address updated successfully");
    }
}
