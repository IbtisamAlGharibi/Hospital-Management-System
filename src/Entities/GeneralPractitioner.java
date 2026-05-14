package Entities;

import Behaviours.DisplayableInterface;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

import static Services.DoctorService.doctor;
import static Services.DoctorService.doctors;

public class GeneralPractitioner extends Doctor implements DisplayableInterface {
    private boolean walkinAvailable;
    private boolean homeVisitAvailable;
    private boolean vaccinationCertified;

    public GeneralPractitioner(String ID, String firstName, String lastName, LocalDate dateOfBirth, String gender, String phoneNumber, String email, String address, String doctorId, String specialization, String qualification, int experienceYears, String departmentId, double consultationFee, List<String> availableSlots, List<String> assignedPatients, boolean walkinAvailable, boolean homeVisitAvailable, boolean vaccinationCertified) {
        super(ID, firstName, lastName, dateOfBirth, gender, phoneNumber, email, address, doctorId, specialization, qualification, experienceYears, departmentId, consultationFee, availableSlots, assignedPatients);
        this.walkinAvailable = walkinAvailable;
        this.homeVisitAvailable = homeVisitAvailable;
        this.vaccinationCertified = vaccinationCertified;
    }

    public GeneralPractitioner(boolean walkinAvailable, boolean homeVisitAvailable, boolean vaccinationCertified) {
        this.walkinAvailable = walkinAvailable;
        this.homeVisitAvailable = homeVisitAvailable;
        this.vaccinationCertified = vaccinationCertified;
    }

    public GeneralPractitioner() {

    }

    public GeneralPractitioner(String d005, String ali, String saied, LocalDate of, String male, String number, String mail, String muscat, String familyMedicine, String mbbs, int i, String s, double v, boolean b, boolean b1, boolean b2) {
    }

    public boolean isWalkinAvailable() {
        return walkinAvailable;
    }

    public void setWalkinAvailable(boolean walkinAvailable) {
        this.walkinAvailable = walkinAvailable;
    }

    public boolean isHomeVisitAvailable() {
        return homeVisitAvailable;
    }

    public void setHomeVisitAvailable(boolean homeVisitAvailable) {
        this.homeVisitAvailable = homeVisitAvailable;
    }

    public boolean isVaccinationCertified() {
        return vaccinationCertified;
    }

    public void setVaccinationCertified(boolean vaccinationCertified) {
        this.vaccinationCertified = vaccinationCertified;
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

    /*@Override
    public Doctor addDoctor() {
        return null;
    }*/

    public void scheduleHomeVisit(){
        System.out.println("SCHEDULING HOME VISIT");
        System.out.println("-------------------------------");
        if (homeVisitAvailable){
            System.out.println("Please enter the location");
            String location = scanner.nextLine();
           // System.out.println("location of the visit" + " "+ location);
            System.out.println("Please enter the duration");
            String duration = scanner.nextLine();

            System.out.println("Please enter Doctor Name");
            String doctorName = scanner.nextLine();

            System.out.println("Home visit details: " + "Location->" +location+ "Duration->" + duration + "Doctor Name->" + doctorName);
        }
    }

    public void administerVaccine(){
        System.out.println("ADMINISTER VACCINE");
        System.out.println("-------------------------------");

        if (vaccinationCertified){
            System.out.println("Enter patient ID:");
            String patientId = scanner.nextLine();

             System.out.println("Enter vaccine name:");
             String vaccineName = scanner.nextLine();

            System.out.println("Vaccine " + vaccineName + " administered to patient " + patientId);
        }else {
            System.out.println("NOT Certified");
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


        System.out.println("Please enter walking Available(True/False): ");
        String walkinAvailable = scanner.nextLine();
        setWalkinAvailable(Boolean.parseBoolean(walkinAvailable));

        System.out.println("Please enter home Visit Available(True/False): ");
        String homeVisitAvailable = scanner.nextLine();
        setHomeVisitAvailable(Boolean.parseBoolean(homeVisitAvailable));

        System.out.println("Please enter vaccination Certified(True/False): ");
        String vaccinationCertified = scanner.nextLine();
        setVaccinationCertified(Boolean.parseBoolean(vaccinationCertified));
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
