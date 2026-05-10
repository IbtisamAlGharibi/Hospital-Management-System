package Entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Nurse extends Person {
    private String nurseId;
    private String departmentId;
    private String shift;
    private String qualification;
    private List<String > assignedPatients = new ArrayList<>();

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

}
