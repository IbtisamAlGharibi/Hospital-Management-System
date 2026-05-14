package Entities;

import Behaviours.DisplayableInterface;

import java.time.LocalDate;
import java.util.Collections;

import static Entities.Doctor.patient;
import static Services.PatientService.patients;

public class EmergencyPatient extends InPatient implements DisplayableInterface {
    private String emergencyType;
    private String arrivalMode;
    private int triageLevel;
    private boolean admittedViaER;

    public EmergencyPatient(String emergencyType, String arrivalMode, int triageLevel, boolean admittedViaER) {
        this.emergencyType = emergencyType;
        this.arrivalMode = arrivalMode;
        this.triageLevel = triageLevel;
        this.admittedViaER = admittedViaER;
    }

    public EmergencyPatient() {

    }

    public String getEmergencyType() {
        return emergencyType;
    }

    public void setEmergencyType(String emergencyType) {
        this.emergencyType = emergencyType;
    }

    public String getArrivalMode() {
        return arrivalMode;
    }

    public void setArrivalMode(String arrivalMode) {
        this.arrivalMode = arrivalMode;
    }

    public int getTriageLevel() {
        return triageLevel;
    }

    public void setTriageLevel(int triageLevel) {
        this.triageLevel = triageLevel;
    }

    public boolean isAdmittedViaER() {
        return admittedViaER;
    }

    public void setAdmittedViaER(boolean admittedViaER) {
        this.admittedViaER = admittedViaER;
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

        System.out.println("emergencyType : " + getEmergencyType());
        System.out.println("arrival Mode(Ambulance/Walk-in): " + getArrivalMode());
        System.out.println("triage Level(1-5) : " + getTriageLevel());
    }

    @Override
    public void displaySummary() {

    }

   /* @Override
    public Patient addPatient() {
        return null;
    }*/

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

        System.out.println("Please enter registrationDate (Please use formate 2025-05-12): ");
        String patientRegistrationDate = scanner.nextLine();
        setRegistrationDate(LocalDate.parse(patientRegistrationDate));

        System.out.println("Please enter emergency Type: ");
        String emergencyType = scanner.nextLine();
        setEmergencyType(emergencyType);

        System.out.println("Please enter arrival Mode: ");
        String arrivalMode = scanner.nextLine();
       setArrivalMode(arrivalMode);

        System.out.println("Please enter triage Level: ");
        String triageLevel = scanner.nextLine();
       setTriageLevel(Integer.parseInt(triageLevel));

        System.out.println("Please enter admitted Via ER(True/False): ");
        String admittedViaER = scanner.nextLine();
        setAdmittedViaER(Boolean.parseBoolean(admittedViaER));
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
