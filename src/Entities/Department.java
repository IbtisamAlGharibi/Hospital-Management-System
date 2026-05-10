package Entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Department {
    private String departmentId;
    private String departmentName;
    private String headDoctorId;
    private List<String > doctors =new ArrayList<>();
    private List<String > nurses = new ArrayList<>();
    private int bedCapacity ;
    private int availableBeds;
    static Scanner scanner = new Scanner(System.in);

    public Department(String departmentId, String departmentName, String headDoctorId, List<String> doctors, List<String> nurses, int availableBeds, int bedCapacity) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.headDoctorId = headDoctorId;
        this.doctors = doctors;
        this.nurses = nurses;
        this.availableBeds = availableBeds;
        this.bedCapacity = bedCapacity;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getHeadDoctorId() {
        return headDoctorId;
    }

    public void setHeadDoctorId(String headDoctorId) {
        this.headDoctorId = headDoctorId;
    }

    public List<String> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<String> doctors) {
        this.doctors = doctors;
    }

    public List<String> getNurses() {
        return nurses;
    }

    public void setNurses(List<String> nurses) {
        this.nurses = nurses;
    }

    public int getBedCapacity() {
        return bedCapacity;
    }

    public void setBedCapacity(int bedCapacity) {
        this.bedCapacity = bedCapacity;
    }

    public int getAvailableBeds() {
        return availableBeds;
    }

    public void setAvailableBeds(int availableBeds) {
        this.availableBeds = availableBeds;
    }

    public void assignDoctor(){
        System.out.println("Please enter the doctor name you want to assign");
        String doctorTOBeAssigned = scanner.nextLine();
        doctors.add(doctorTOBeAssigned);
        System.out.println("Doctor assigned SUCCESSFULLY");
    }
    public void assignNurse(){
        System.out.println("Please enter the nurse name you want to assign");
        String nurseTOBeAssigned = scanner.nextLine();
        nurses.add(nurseTOBeAssigned);
        System.out.println("Nurse assigned SUCCESSFULLY");
    }
}
