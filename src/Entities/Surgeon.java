package Entities;

import Behaviours.DisplayableInterface;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static Services.DoctorService.doctor;
import static Services.DoctorService.doctors;

public class Surgeon extends Doctor implements DisplayableInterface {
    private int surgeriesPerformed;
    private List<String> surgeryTypes = new ArrayList<>();
    private boolean operationTheatreAccess;
    static Scanner scanner = new Scanner(System.in);

    public Surgeon(String ID, String firstName, String lastName, LocalDate dateOfBirth, String gender, String phoneNumber, String email, String address, String doctorId, String specialization, String qualification, int experienceYears, String departmentId, double consultationFee, List<String> availableSlots, List<String> assignedPatients, int surgeriesPerformed, List<String> surgeryTypes, boolean operationTheatreAccess) {
        super(ID, firstName, lastName, dateOfBirth, gender, phoneNumber, email, address, doctorId, specialization, qualification, experienceYears, departmentId, consultationFee, availableSlots, assignedPatients);
        this.surgeriesPerformed = surgeriesPerformed;
        this.surgeryTypes = surgeryTypes;
        this.operationTheatreAccess = operationTheatreAccess;
    }

    public Surgeon(int surgeriesPerformed, List<String> surgeryTypes, boolean operationTheatreAccess) {
        this.surgeriesPerformed = surgeriesPerformed;
        this.surgeryTypes = surgeryTypes;
        this.operationTheatreAccess = operationTheatreAccess;
    }

    public Surgeon() {

    }

    public int getSurgeriesPerformed() {
        return surgeriesPerformed;
    }

    public void setSurgeriesPerformed(int surgeriesPerformed) {
        this.surgeriesPerformed = surgeriesPerformed;
    }

    public List<String> getSurgeryTypes() {
        return surgeryTypes;
    }

    public void setSurgeryTypes(List<String> surgeryTypes) {
        this.surgeryTypes = surgeryTypes;
    }

    public boolean isOperationTheatreAccess() {
        return operationTheatreAccess;
    }

    public void setOperationTheatreAccess(boolean operationTheatreAccess) {
        this.operationTheatreAccess = operationTheatreAccess;
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
        System.out.println("surgeries Performed : " + getSurgeriesPerformed());
        System.out.println("surgery Types : " + getSurgeryTypes());

    }

    public void performSurgery(){
        if (!operationTheatreAccess) {
            System.out.println("No Operation Theatre Access");
        }else {
            System.out.println("Please enter surgery type:");
            String surgeryType = scanner.nextLine();
            System.out.println(surgeryType + " " + "Surgery performed");
            surgeriesPerformed++;
            surgeryTypes.add(surgeryType);
        }
    }
    public void updateSurgeryCount(){
        System.out.println("UPDATE SURGERY COUNT");
        System.out.println("-------------------------------");

        System.out.println("Please enter surgery type:");
        String surgeryType = scanner.nextLine();
        System.out.println(surgeryType + " " + "Surgery performed");
        surgeriesPerformed++;
        System.out.println(surgeriesPerformed +" "+ "Surgeries Done");
    }
    @Override
    public Doctor addDoctor(){
        System.out.println("ADDING NEW DOCTOR");
        System.out.println("----------------------------");

        System.out.println("Please enter Doctor first name: ");
        String doctorFirstName = scanner.nextLine();
        setFirstName(doctorFirstName);

        System.out.println("Please enter Doctor last name: ");
        String doctorLastName = scanner.nextLine();
        setLastName(doctorLastName);

        System.out.println("Please enter Doctor ID: ");
        String doctorID = scanner.nextLine();
        setDoctorId(doctorID);

        System.out.println("Please enter qualification: ");
        String doctorQualification = scanner.nextLine();
        setQualification(doctorQualification);

        System.out.println("Please enter specialization: ");
        String doctorSpecialization = scanner.nextLine();
        setSpecialization(doctorSpecialization);

        System.out.println("Please enter Doctor experience Years: ");
        String doctorExperienceYears = scanner.nextLine();
       setExperienceYears(Integer.parseInt(doctorExperienceYears));

        System.out.println("Please enter department Id: ");
        String departmentId = scanner.nextLine();
        setDepartmentId(departmentId);

        System.out.println("Please enter consultation Fee: ");
        String consultationFee = scanner.nextLine();
      setConsultationFee(Double.parseDouble(consultationFee));


        System.out.println("Please enter surgeries Performed: ");
        String surgeriesPerformed = scanner.nextLine();
        setSurgeriesPerformed(Integer.parseInt(surgeriesPerformed));

        System.out.println("Please enter surgery Types: ");
        String surgeryTypes = scanner.nextLine();
        setSurgeryTypes(Collections.singletonList(surgeryTypes));

        System.out.println("Please enter operation Theatre Access(True/False): ");
        String operationTheatreAccess = scanner.nextLine();
        setOperationTheatreAccess(Boolean.parseBoolean(operationTheatreAccess));
        return doctor;
    }

    public void addNewDoctor(){
        boolean flag = true;
        while (flag){
            doctors.add(addDoctor());
            System.out.println("Please enter E to Stop");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("E")){
                flag = false;
            }
        }
    }
}
