package Entities;

public class EmergencyPatient extends Patient {
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
}
