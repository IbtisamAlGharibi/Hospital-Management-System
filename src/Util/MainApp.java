package Util;

import Entities.Doctor;
import Entities.Patient;
import Services.*;

import java.util.Scanner;

public class MainApp {
    static Scanner scanner = new Scanner(System.in);
    static DoctorService doctorService = new DoctorService();
    static NurseService nurseService = new NurseService();
    static PatientService patientService = new PatientService();
    static AppointmentService appointmentService = new AppointmentService();
    static MedicalRecordService medicalRecordService = new MedicalRecordService();
    static DepartmentService departmentService = new DepartmentService();
    static Patient patient = new Patient() {
        @Override
        public Patient addPatient() {
            return null;
        }
    };
    static Doctor doctor = new Doctor() {
        @Override
        public Doctor addDoctor() {
            return null;
        }
    };

    public static void main(String[] args){
        System.out.println(MenuMessages.MAIN_MENU_MESSAGE);

        boolean mainMenuContinue = true;
        while (mainMenuContinue) {
            int option = scanner.nextInt();

            switch (option){
                case 1 -> {
                    boolean first = true;
                    while (first){
                        patientService.HandlePatientMenu();
                        System.out.println("Enter E to exit");
                        if (scanner.nextLine().equalsIgnoreCase("e")) {
                            first = false;
                        }
                    }
                }
                case 2 ->{
                    boolean second = true;
                    doctorService.HandleDoctorMenu();
                        System.out.println("Enter E to exit");
                        if (scanner.nextLine().equalsIgnoreCase("e")) {
                            second = false;
                        }
                }
                case 3 ->{
                    boolean third = true;
                    nurseService.HandleNurseMenu();
                    System.out.println("Enter E to exit");
                    if (scanner.nextLine().equalsIgnoreCase("e")) {
                        third = false;
                    }
                }
                case 4 ->{
                    boolean fourth = true;
                    appointmentService.HandleAppointmentMenu();
                    System.out.println("Enter E to exit");
                    if (scanner.nextLine().equalsIgnoreCase("e")) {
                        fourth = false;
                    }
                }
                case 5 ->{
                    boolean fifth = true;
                    medicalRecordService.HandleMedicalRecordMenu();
                    System.out.println("Enter E to exit");
                    if (scanner.nextLine().equalsIgnoreCase("e")) {
                        fifth = false;
                    }
                }
                case 6 ->{
                    boolean six = true;
                    departmentService.HandleDepartmentMenu();
                    System.out.println("Enter E to exit");
                    if (scanner.nextLine().equalsIgnoreCase("e")) {
                        six = false;
                    }
                }
            }


}
}
}
