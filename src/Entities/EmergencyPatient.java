package Entities;

public class EmergencyPatient {
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
}
