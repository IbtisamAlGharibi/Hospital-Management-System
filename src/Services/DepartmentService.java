package Services;

import Entities.Department;
import Entities.Doctor;
import Entities.Nurse;
import Entities.Patient;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DepartmentService {
    static Scanner scanner = new Scanner(System.in);
    static List<Patient> patients = new ArrayList<>();
    static List<Doctor> doctors = new ArrayList<>();
    static Nurse nurse = new Nurse();
    static Doctor doctor = new Doctor();
    static List<String > departments = new ArrayList<>();
    static Department department = new Department();


    public void getDepartmentById(){
        System.out.println("Please enter the department Id:");
        String departmentId = scanner.nextLine();
        for (int i =0; i < departments.size();i++){
            String searchedId = String.valueOf(departments.get(i));
            if (departmentId.equalsIgnoreCase(searchedId)){
                department.displayInfo();
            }else {
                System.out.println("NOT FOUND");
            }
        }
    }

}
