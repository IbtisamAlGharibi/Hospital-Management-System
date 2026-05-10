package Entities;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String departmentId;
    private String departmentName;
    private String headDoctorId;
    private List<String > doctors =new ArrayList<>();
    private List<String > nurses = new ArrayList<>();
    private int bedCapacity ;
    private int availableBeds;

    public Department(String departmentId, String departmentName, String headDoctorId, List<String> doctors, List<String> nurses, int availableBeds, int bedCapacity) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.headDoctorId = headDoctorId;
        this.doctors = doctors;
        this.nurses = nurses;
        this.availableBeds = availableBeds;
        this.bedCapacity = bedCapacity;
    }
}
