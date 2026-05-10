package Entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Doctor extends Person{
    private String doctorId;
    private String specialization;
    private String qualification;
    private int experienceYears;
    private String departmentId;
    private double consultationFee;
    private List<String > availableSlots = new ArrayList<>();
    private List<String > assignedPatients = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
     static Patient patient =new Patient();

    public Doctor(String ID, String firstName, String lastName, LocalDate dateOfBirth, String gender, String phoneNumber, String email, String address, String doctorId, String specialization, String qualification, int experienceYears, String departmentId, double consultationFee, List<String > availableSlots, List<String> assignedPatients) {
        super(ID, firstName, lastName, dateOfBirth, gender, phoneNumber, email, address);
        this.doctorId = doctorId;
        this.specialization = specialization;
        this.qualification = qualification;
        this.experienceYears = experienceYears;
        this.departmentId = departmentId;
        this.consultationFee = consultationFee;
        this.availableSlots = availableSlots;
        this.assignedPatients = assignedPatients;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public double getConsultationFee() {
        return consultationFee;
    }

    public void setConsultationFee(double consultationFee) {
        this.consultationFee = consultationFee;
    }

    public List<String> getAvailableSlots() {
        return availableSlots;
    }

    public void setAvailableSlots(List<String > availableSlots) {
        this.availableSlots = availableSlots;
    }

    public List<String> getAssignedPatients() {
        return assignedPatients;
    }

    public void setAssignedPatients(List<String> assignedPatients) {
        this.assignedPatients = assignedPatients;
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
        System.out.println("doctor Id : " + getDoctorId() );
        System.out.println("specialization : " + getSpecialization() );
        System.out.println("qualification : " + getQualification() );
        System.out.println("experience Years: " + getExperienceYears() );
        System.out.println("department Id : " + getDepartmentId());
        System.out.println("consultation Fee: " + getConsultationFee());
        System.out.println("available Slots : " + getAvailableSlots());
        System.out.println("assigned Patients : " + getAssignedPatients());
    }
    public void assignPatient(){
        System.out.println("Please enter the patient full name to be assigned");
        String patientNameToAssign = scanner.nextLine();
        String patientFullName = patient.getFirstName() + " "+ patient.getLastName();
        if (patientNameToAssign.equalsIgnoreCase(patientFullName)){
            assignedPatients.add(patientNameToAssign);
            System.out.println(patientNameToAssign + "Added to assigned Patients list SUCCESSFULLY");
        }else {
            System.out.println("No patient with this name");
        }
    }
    public void removePatient(){
        System.out.println("Please enter the patient full name you want to remove");
        String patientNameToRemove = scanner.nextLine();
        for (int i =0; i<assignedPatients.size();i++){
            String patientFullName = assignedPatients.get(i);
            if (patientNameToRemove.equalsIgnoreCase(patientFullName)) {
                assignedPatients.remove(patientNameToRemove);
                System.out.println(patientNameToRemove + " " + "REMOVED SUCCESSFULLY");
            }else{
                System.out.println("This patient not in the list");
            }
        }
    }
    public void updateAvailability(){
        System.out.println("Please enter the availability you want to update");
        String availabilityToUpdate = scanner.nextLine();
        System.out.println("Please enter the new availability");
        String newAvailability = scanner.nextLine();

        for (int i =0;i<availableSlots.size();i++){
            String availability = availableSlots.get(i);
            if (availabilityToUpdate.equalsIgnoreCase(availability)){
                availability = newAvailability;
                availableSlots.add(availability);
                System.out.println("AVAILABILITY UPDATED SUCCESSFULLY");
            }else {
                System.out.println("NOT FOUND");
            }
        }
    }
}
