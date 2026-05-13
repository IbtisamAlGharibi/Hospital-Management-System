package Util;

import Entities.*;
import Services.*;

import java.time.LocalDate;
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
    static ReportsService reportsService = new ReportsService();

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
                case 7 ->{
                    boolean seven = true;
                    reportsService.HandleReportsMenu();
                    System.out.println("Enter E to exit");
                    if (scanner.nextLine().equalsIgnoreCase("e")) {
                        seven = false;
                    }
                }
            }



}
}
    public void sampleData() {
        Department d1 = new Department();
        d1.setDepartmentId("D001");
        d1.setDepartmentName("Cardiology");

        Department d2 = new Department();
        d2.setDepartmentId("D002");
        d2.setDepartmentName("Emergency");

        Department d3 = new Department();
        d3.setDepartmentId("D003");
        d3.setDepartmentName("General Medicine");

        departmentService.add(d1);
        departmentService.add(d2);
        departmentService.add(d3);

        //Entering 8 doctors
        for (int i = 1; i <= 8; i++) {
            Doctor doctor = new Doctor() {
                @Override
                public Doctor addDoctor() {
                    return null;
                }
            };
            doctor.setDoctorId("DR00" + i);
            doctor.setFirstName("Doctor" + i);
            doctor.setSpecialization(
                    i % 3 == 0 ? "Surgeon" :
                            i % 3 == 1 ? "Consultant" : "GP"
            );
            doctorService.add(doctor);
        }

        //Entering 5 nurses
        for (int i = 1; i <= 5; i++) {
            Nurse nurse = new Nurse();
            nurse.setNurseId("N00" + i);
            nurse.setFirstName("Nurse" + i);
            nurseService.add(nurse);
        }

        //entering regular patient
        for (int i = 1; i <= 3; i++) {
            Patient p = new Patient() {
                @Override
                public Patient addPatient() {
                    return null;
                }
            };
            p.setPatientId("P00" + i);
            p.setFirstName("Patient" + i);
            patientService.add(p);
        }

        //Entering InPatient
        for (int i = 4; i <= 6; i++) {
            InPatient p = new InPatient();
            p.setPatientId("P00" + i);
            p.setFirstName("InPatient" + i);
            p.setAdmissionDate(LocalDate.now());
            p.setDailyCharges(150.0);
            patientService.add(p);
        }

        //Entering OutPatient
        for (int i = 7; i <= 8; i++) {
            OutPatient p = new OutPatient();
            p.setPatientId("P00" + i);
            p.setFirstName("OutPatient" + i);
            p.setVisitCount(1);
            p.setLastVisitDate(LocalDate.now());
            patientService.add(p);
        }
    }
}
