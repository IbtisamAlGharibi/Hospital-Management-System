package Entities;

import java.time.LocalDate;
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
    public void updateBedAvailability(){
        System.out.println("Please enter the number of available bed");
        String newAvailabile = scanner.nextLine();
        setAvailableBeds(Integer.parseInt(newAvailabile));
        System.out.println("number of beds updated SUCCESSFULLY");
    }
    public void displayInfo(){
        System.out.println("department Id : " + getDepartmentId() );
        System.out.println("department Name: " + getDepartmentName() );
        System.out.println("head Doctor Id: " + getHeadDoctorId() );
        System.out.println("bed Capacity: " + getBedCapacity() );
        System.out.println("available Beds: " + getAvailableBeds());
    }

    public String addDepartment(){
        System.out.println("ADDING NEW DEPARTMENT");
        System.out.println("----------------------------");
        System.out.println("Please enter department Id");
        String newID = scanner.nextLine();
        setDepartmentId(newID);

        System.out.println("Please enter department Name ");
        String deptName = scanner.nextLine();
        setDepartmentName(deptName);

        System.out.println("Please enter head Doctor Id ");
        String doctorID = scanner.nextLine();
        setHeadDoctorId(doctorID);

        System.out.println("Please enter bed Capacity ");
        String bedCapacity = scanner.nextLine();
        setBedCapacity(Integer.parseInt(bedCapacity));

        System.out.println("Please enter available Beds ");
        String availableBeds = scanner.nextLine();
        setAvailableBeds(Integer.parseInt(availableBeds));
        return newID;
    }
}
