package Util;

import Entities.*;
import Services.*;
import com.sun.tools.javac.Main;

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
        MainApp mainApp =new  MainApp();
        mainApp.sampleData();

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

        departmentService.add(new Department("DEPT-001", "Cardiology", "D001", 50));
        departmentService.add(new Department("DEPT-002", "General Medicine", "D002", 66));
        departmentService.add(new Department("DEPT-003", "Emergency", "D003", 78));



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

        //Entering Emergency Patient
        for (int i = 9; i <= 10; i++) {
            EmergencyPatient p = new EmergencyPatient();
            p.setPatientId("P00" + i);
            p.setFirstName("Emergency" + i);
            p.setAdmissionDate(LocalDate.now());
            p.setDailyCharges(300.0);
            p.setEmergencyType("Accident");
            p.setArrivalMode("Ambulance");
            p.setTriageLevel(1);
            p.setAdmittedViaER(true);
            patientService.add(p);
        }

        //Entering Appointments
        for (int i = 1; i <= 15; i++) {
            Appointment a = new Appointment();
            a.setAppointmentId("A00" + i);
            a.setAppointmentDate(LocalDate.now().plusDays(i));
            a.setStatus("Scheduled");
            appointmentService.add(a);
        }

        //Entering Medical Records
        for (int i = 1; i <= 12; i++) {
            MedicalRecord r = new MedicalRecord();
            r.setRecordId("R00" + i);
            r.setVisitDate(LocalDate.now());
            r.setDiagnosis("Diagnosis " + i);
            medicalRecordService.add(r);
        }

        System.out.println("Sample data created successfully.");
    }
}
