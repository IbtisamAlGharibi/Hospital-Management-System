package Entities;

import Behaviours.DisplayableInterface;
import Util.HelperUtils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Nurse extends Person implements DisplayableInterface {
    private String nurseId;
    private String departmentId;
    private String shift;
    private String qualification;
    private List<String > assignedPatients = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    Patient patient = new Patient() {
        @Override
        public Patient addPatient() {
            return null;
        }
    };
    static HelperUtils helperUtils = new HelperUtils();

    public Nurse(String ID, String firstName, String lastName, LocalDate dateOfBirth, String gender, String phoneNumber, String email, String address, String nurseId, String departmentId, String shift, String qualification, List<String> assignedPatients) {
        super(ID, firstName, lastName, dateOfBirth, gender, phoneNumber, email, address);
        this.nurseId = nurseId;
        this.departmentId = departmentId;
        this.shift = shift;
        this.qualification = qualification;
        this.assignedPatients = assignedPatients;
    }

    public Nurse(String nurseId, String departmentId, String shift, String qualification, List<String> assignedPatients) {
        this.nurseId = nurseId;
        this.departmentId = departmentId;
        this.shift = shift;
        this.qualification = qualification;
        this.assignedPatients = assignedPatients;
    }

    public Nurse() {

    }

    public Nurse(String n001, String nusaiba, String khalid, LocalDate of, String female, String number, String mail, String nizwa, String s, String morning, String bScNursing) {
    }

    public String getNurseId() {
        return nurseId;
    }

    public void setNurseId(String nurseId) {
        this.nurseId = helperUtils.generateId();
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = helperUtils.generateId();
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
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
        System.out.println("nurse Id : " + getNurseId() );
        System.out.println("department Id : " + getDepartmentId() );
        System.out.println("qualification : " + getQualification() );
        System.out.println("shift: " + getShift() );
        System.out.println("assigned Patients : " + getAssignedPatients());
    }

    @Override
    public void displaySummary() {

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
}
