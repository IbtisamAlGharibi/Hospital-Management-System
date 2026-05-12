package Entities;

import Behaviours.DisplayableInterface;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static Services.DoctorService.doctor;
import static Services.DoctorService.doctors;

public class Consultant extends Doctor implements DisplayableInterface {
    private List<String > consultationTypes = new ArrayList<>();
    private boolean onlineConsultationAvailable;
    private int consultationDuration;
    static Scanner scanner = new Scanner(System.in);


    public Consultant(String ID, String firstName, String lastName, LocalDate dateOfBirth, String gender, String phoneNumber, String email, String address, String doctorId, String specialization, String qualification, int experienceYears, String departmentId, double consultationFee, List<String> availableSlots, List<String> assignedPatients, List<String> consultationTypes, boolean onlineConsultationAvailable, int consultationDuration) {
        super(ID, firstName, lastName, dateOfBirth, gender, phoneNumber, email, address, doctorId, specialization, qualification, experienceYears, departmentId, consultationFee, availableSlots, assignedPatients);
        this.consultationTypes = consultationTypes;
        this.onlineConsultationAvailable = onlineConsultationAvailable;
        this.consultationDuration = consultationDuration;
    }

    public Consultant(List<String> consultationTypes, boolean onlineConsultationAvailable, int consultationDuration) {
        this.consultationTypes = consultationTypes;
        this.onlineConsultationAvailable = onlineConsultationAvailable;
        this.consultationDuration = consultationDuration;
    }

    public List<String> getConsultationTypes() {
        return consultationTypes;
    }

    public void setConsultationTypes(List<String> consultationTypes) {
        this.consultationTypes = consultationTypes;
    }

    public boolean isOnlineConsultationAvailable() {
        return onlineConsultationAvailable;
    }

    public void setOnlineConsultationAvailable(boolean onlineConsultationAvailable) {
        this.onlineConsultationAvailable = onlineConsultationAvailable;
    }

    public int getConsultationDuration() {
        return consultationDuration;
    }

    public void setConsultationDuration(int consultationDuration) {
        this.consultationDuration = consultationDuration;
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
        System.out.println("consultation Types : " + getConsultationTypes());
        System.out.println("consultation Duration : " + getConsultationDuration());
    }

    @Override
    public void displaySummary() {

    }

    /*@Override
    public Doctor addDoctor() {
        return null;
    }*/

    public void scheduleConsultation(){
        System.out.println("SCHEDULING CONSULTATION");
        System.out.println("-------------------------------");

        if (onlineConsultationAvailable){
        System.out.println("Please enter consultation Types:");
        String consultationTypes = scanner.nextLine();
        setConsultationTypes(Collections.singletonList(consultationTypes));

        System.out.println("Please enter consultation Duration:");
        String consultationDuration = scanner.nextLine();
         setConsultationDuration(Integer.parseInt(consultationDuration));
        }else {
            System.out.println("Online consultation is not available ");
        }
    }
    public void  provideSecondOpinion(){
        System.out.println("Do you want the consultation online or offline please select ");
        String option = scanner.nextLine();
        if (option.equalsIgnoreCase("offline")){
            System.out.println("Please come and meet the doctor in the hospital");
        }else {
            if (onlineConsultationAvailable){
                System.out.println("Please enter consultation Types:");
                String consultationTypes = scanner.nextLine();
                setConsultationTypes(Collections.singletonList(consultationTypes));

                System.out.println("Please enter consultation Duration:");
                String consultationDuration = scanner.nextLine();
                setConsultationDuration(Integer.parseInt(consultationDuration));
            }else {
                System.out.println("Online consultation is not available ");
            }
        }
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


        System.out.println("Please enter consultation Duration: ");
        String consultationDuration = scanner.nextLine();
        setConsultationDuration(Integer.parseInt(consultationDuration));

        System.out.println("Please enter consultation Types: ");
        String consultationTypes = scanner.nextLine();
        setConsultationTypes(Collections.singletonList(consultationTypes));

        System.out.println("Please enter operation online Consultation Available(True/False): ");
        String onlineConsultationAvailable = scanner.nextLine();
        setOnlineConsultationAvailable(Boolean.parseBoolean(onlineConsultationAvailable));
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
