package Entities;

import Behaviours.DisplayableInterface;
import Util.HelperUtils;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

import static Entities.Doctor.patient;
import static Services.PatientService.patients;

public class OutPatient extends Patient implements DisplayableInterface {
    private int visitCount;
    private LocalDate lastVisitDate;
    private String preferredDoctorId;
    static Appointment appointment = new Appointment();
    static HelperUtils helperUtils = new HelperUtils();


    public OutPatient(int visitCount, LocalDate lastVisitDate, String preferredDoctorId) {
        this.visitCount = visitCount;
        this.lastVisitDate = lastVisitDate;
        this.preferredDoctorId = preferredDoctorId;
    }

    public OutPatient(String ID, String firstName, String lastName, LocalDate dateOfBirth, String gender, String phoneNumber, String email, String address, String patientId, String bloodGroup, List<String> allergies, String emergencyContact, LocalDate registrationDate, String insuranceId, List<String> medicalRecords, List<String> appointments, int visitCount, LocalDate lastVisitDate, String preferredDoctorId) {
        super(ID, firstName, lastName, dateOfBirth, gender, phoneNumber, email, address, patientId, bloodGroup, allergies, emergencyContact, registrationDate, insuranceId, medicalRecords, appointments);
        this.visitCount = visitCount;
        this.lastVisitDate = lastVisitDate;
        this.preferredDoctorId = preferredDoctorId;
    }

    public OutPatient() {

    }

    public int getVisitCount() {
        return visitCount;
    }

    public void setVisitCount(int visitCount) {
        this.visitCount = visitCount;
    }

    public LocalDate getLastVisitDate() {
        return lastVisitDate;
    }

    public void setLastVisitDate(LocalDate lastVisitDate) {
        this.lastVisitDate = lastVisitDate;
    }

    public String getPreferredDoctorId() {
        return preferredDoctorId;
    }

    public void setPreferredDoctorId(String preferredDoctorId) {
        this.preferredDoctorId = preferredDoctorId;
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

        System.out.println("visit Count : " + getVisitCount());
        System.out.println("last Visit Date : " + getLastVisitDate());
        System.out.println("preferred Doctor Id : " + getPreferredDoctorId());
    }

    @Override
    public void displaySummary() {

    }

   /* @Override
    public Patient addPatient() {
        return null;
    }*/

    public void scheduleFollowUp(){
        appointment.reschedule();
    }

    public void updateVisitCount(){
        visitCount++;
        System.out.println(visitCount + " " + "has been visited");
    }

    @Override
    public Patient addPatient() {
        System.out.println("ADDING NEW  INPATIENT");
        System.out.println("----------------------------");

        System.out.println("Please enter patient first name: ");
        String patientFirstName = scanner.nextLine();
        setFirstName(patientFirstName);

        System.out.println("Please enter patient last name: ");
        String patientLastName = scanner.nextLine();
        setLastName(patientLastName);

        System.out.println("Please enter patient ID: ");
        String patientID = scanner.nextLine();
        setPatientId(patientID);

        System.out.println("Please enter blood Group: ");
        String patientBloodGroup = scanner.nextLine();
        setBloodGroup(patientBloodGroup);

        System.out.println("Please enter emergency Contact: ");
        String patientEmergencyContact = scanner.nextLine();
        setEmergencyContact(patientEmergencyContact);

        System.out.println("Please enter insurance Id: ");
        String patientInsuranceId = scanner.nextLine();
        setInsuranceId(patientInsuranceId);

        System.out.println("Please enter allergies: ");
        String patientAllergies = scanner.nextLine();
        setAllergies(Collections.singletonList(patientAllergies));

        System.out.println("Please enter registrationDate: ");
        String patientRegistrationDate = scanner.nextLine();
        setRegistrationDate(LocalDate.parse(patientRegistrationDate));

        System.out.println("Please enter visit Count: ");
        String visitCount = scanner.nextLine();
       setVisitCount(Integer.parseInt(visitCount));

        System.out.println("Please enter last Visit Date: ");
        String lastVisitDate = scanner.nextLine();
        setLastVisitDate(LocalDate.parse(lastVisitDate));

        System.out.println("Please enter preferred Doctor Id: ");
        String preferredDoctorId = scanner.nextLine();
        setPreferredDoctorId(preferredDoctorId);

        return patient;
    }

    public void addNewPatient() {
        boolean flag = true;
        while (flag) {
            patients.add(addPatient());
            System.out.println("Please enter E to Stop");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("E")) {
                flag = false;
            }
        }
    }
}

