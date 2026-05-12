package Entities;

import Behaviours.BillableInterface;
import Behaviours.DisplayableInterface;
import Util.HelperUtils;

import java.time.LocalDate;
import java.time.Period;
import java.util.Collections;
import java.util.List;

import static Entities.Doctor.patient;
import static Services.PatientService.patients;

public class InPatient extends  Patient implements DisplayableInterface, BillableInterface {
    private LocalDate admissionDate;
    private LocalDate dischargeDate;
    private String roomNumber;
    private String bedNumber;
    private String admittingDoctorId;
    private double dailyCharges;
    static HelperUtils helperUtils = new HelperUtils();

    public InPatient(LocalDate admissionDate, LocalDate dischargeDate, String roomNumber, String bedNumber, String admittingDoctorId, double dailyCharges) {
        this.admissionDate = admissionDate;
        this.dischargeDate = dischargeDate;
        this.roomNumber = roomNumber;
        this.bedNumber = bedNumber;
        this.admittingDoctorId = admittingDoctorId;
        this.dailyCharges = dailyCharges;
    }

    public InPatient(String ID, String firstName, String lastName, LocalDate dateOfBirth, String gender, String phoneNumber, String email, String address, String patientId, String bloodGroup, List<String> allergies, String emergencyContact, LocalDate registrationDate, String insuranceId, List<String> medicalRecords, List<String> appointments, LocalDate admissionDate, LocalDate dischargeDate, String roomNumber, String bedNumber, String admittingDoctorId, double dailyCharges) {
        super(ID, firstName, lastName, dateOfBirth, gender, phoneNumber, email, address, patientId, bloodGroup, allergies, emergencyContact, registrationDate, insuranceId, medicalRecords, appointments);
        this.admissionDate = admissionDate;
        this.dischargeDate = dischargeDate;
        this.roomNumber = roomNumber;
        this.bedNumber = bedNumber;
        this.admittingDoctorId = admittingDoctorId;
        this.dailyCharges = dailyCharges;
    }

    public InPatient() {

    }

    public LocalDate getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(LocalDate admissionDate) {
        this.admissionDate = admissionDate;
    }

    public LocalDate getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(LocalDate dischargeDate) {
        this.dischargeDate = dischargeDate;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = String.valueOf(helperUtils.isPositive(Integer.parseInt(roomNumber)));
    }

    public String getBedNumber() {
        return bedNumber;
    }

    public void setBedNumber(String bedNumber) {
        this.bedNumber = String.valueOf(helperUtils.isPositive(Integer.parseInt(bedNumber)));
    }

    public String getAdmittingDoctorId() {
        return admittingDoctorId;
    }

    public void setAdmittingDoctorId(String admittingDoctorId) {
        this.admittingDoctorId = helperUtils.generateId();
    }

    public double getDailyCharges() {
        return dailyCharges;
    }

    public void setDailyCharges(double dailyCharges) {
        this.dailyCharges = Double.parseDouble(String.valueOf(helperUtils.isPositive(dailyCharges)));
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

        System.out.println("admission Date : " + getAdmissionDate());
        System.out.println("discharge Date : " + getDischargeDate());
        System.out.println("room Number : " + getRoomNumber());
        System.out.println("bedNumber : " + getBedNumber());
        System.out.println("admitting Doctor Id : " + getAdmittingDoctorId());
        System.out.println("dailyCharges : " + getDailyCharges());

    }

    @Override
    public void displaySummary() {

    }

    public int calculateStayDuration(){
        System.out.println("CALCULATING STAY DURATION");
        System.out.println("-------------------------------");

        System.out.println("Please  enter admissionDate (Please use this formate 2026-05-12):");
        LocalDate admissionDate = LocalDate.parse(scanner.nextLine());
        System.out.println("Please  enter dischargeDate (Please use this formate 2026-05-12) ");
        LocalDate dischargeDate = LocalDate.parse(scanner.nextLine());

        Period period = Period.between(admissionDate ,dischargeDate);
        int days = period.getDays();
        System.out.println(days);

        return days;
    }

    public void calculateTotalCharges(){
        System.out.println("CALCULATING TOTAL CHARGES");
        System.out.println("-------------------------------");

        int totalStay = calculateStayDuration();
        double totalAmount = getDailyCharges() * totalStay;
        System.out.println(totalAmount);
    }

    @Override
    public void calculateCharges() {

    }

    @Override
    public void generateBill() {

    }

    @Override
    public void processPayment(double amount) {

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

        System.out.println("Please enter admission Date: ");
        String admissionDate = scanner.nextLine();
       setAdmissionDate(LocalDate.parse(admissionDate));

        System.out.println("Please enter discharge Date: ");
        String dischargeDate = scanner.nextLine();
       setDischargeDate(LocalDate.parse(dischargeDate));

        System.out.println("Please enter room Number: ");
        String roomNumber = scanner.nextLine();
        setRoomNumber(roomNumber);

        System.out.println("Please enter Bed Number: ");
        String bedNumber = scanner.nextLine();
        setBedNumber(bedNumber);

        System.out.println("Please enter admitting Doctor Id: ");
        String admittingDoctorId = scanner.nextLine();
        setAdmittingDoctorId(admittingDoctorId);

        System.out.println("Please enter daily Charges: ");
        String dailyCharges = scanner.nextLine();
        setDailyCharges(Double.parseDouble(dailyCharges));

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
