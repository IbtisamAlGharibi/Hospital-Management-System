package Services;

import Behaviours.ManageableInterface;
import Behaviours.SearchableInterface;
import Entities.Department;
import Entities.Doctor;
import Entities.Nurse;
import Entities.Patient;
import Util.MenuMessages;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DepartmentService implements ManageableInterface, SearchableInterface {
    static Scanner scanner = new Scanner(System.in);
    static List<Patient> patients = new ArrayList<>();
    static List<Doctor> doctors = new ArrayList<>();
    static Nurse nurse = new Nurse();
    static MenuMessages menuMessages = new MenuMessages();
    static Doctor doctor = new Doctor() {
        @Override
        public Doctor addDoctor() {
            return null;
        }
    };
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

    public void displayAllDepartments(){
        System.out.println("DISPLAYING ALL DEPARTMENTS");
        System.out.println("--------------------------------");
        for (int i =0;i<departments.size();i++){
            department.displayInfo();
        }
    }

    public void assignDoctorToDepartment(){
        System.out.println("Please enter the doctor full name to be assigned");
        String doctorNameToAssign = scanner.nextLine();
        String doctorFullName = doctor.getFirstName() + " "+ doctor.getLastName();
        if (doctorNameToAssign.equalsIgnoreCase(doctorFullName)){
            departments.add(doctorNameToAssign);
            System.out.println(doctorNameToAssign + "Added to department list SUCCESSFULLY");
        }else {
            System.out.println("No doctor with this name");
        }
    }

    public void assignNurseToDepartment(){
        System.out.println("Please enter the Nurse full name to be assigned");
        String nurseNameToAssign = scanner.nextLine();
        String nurseFullName = nurse.getFirstName() + " "+nurse.getLastName();
        if (nurseNameToAssign.equalsIgnoreCase(nurseFullName)){
            departments.add(nurseNameToAssign);
            System.out.println(nurseNameToAssign + "Added to department list SUCCESSFULLY");
        }else {
            System.out.println("No nurse with this name");
        }
    }

    @Override
    public void add(Object entity) {

    }

    @Override
    public void remove(String id) {

    }

    @Override
    public void getAll() {

    }

    @Override
    public void search(String keyword) {

    }

    @Override
    public void searchById(String id) {

    }

    public boolean HandleDepartmentMenu(){
        System.out.println(menuMessages.DEPARTMENT_MENU_MESSAGE);
        System.out.println("Please enter number");
        String departmentOption = scanner.nextLine();
        switch (departmentOption) {
            case  "6.1" -> {
                department.addNewDepartment();
            }
            case "6.2" -> {
                displayAllDepartments();
            }
            case "6.3" -> {
                department.displayInfo();
            }

            case  "6.4" -> {
                System.out.println("ASSIGNING DOCTOR TO DEPARTMENT");
                assignDoctorToDepartment();
            }
            case "6.5" -> {

            }case "6.6" -> {


            }case "6.7"-> {

            }
            case "6.8" -> {
                return false;
            }
        }
        return true;
    }
}
