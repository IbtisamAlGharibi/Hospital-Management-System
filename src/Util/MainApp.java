package Util;

import Entities.*;
import Services.*;
import com.sun.tools.javac.Main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
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


        doctorService.add(new Consultant(
                "D001","Salim","Nasser",LocalDate.of(1977,5,12),
                "Male","9345661","salim@gmail.com","Muscat",
                "Cardiology","MBBS",15,"DEP-001",
                30.0,new ArrayList<>(Arrays.asList("Heart Check","ECG")),
                true,30));

        doctorService.add(new Consultant(
                "D002","Muna","Hussain",LocalDate.of(1988,5,11),
                "Female","94365782","muna@gmail.com","Nizwa",
                "General Medicine","MD",10,"DEP-002",
                25.0,new ArrayList<>(Arrays.asList("General Consultation")),
                true,20));

        doctorService.add(new Surgeon(
                "D003","Ahmed","Njeem",LocalDate.of(1990,12,24),
                "Male","4567683","ahmed@gmail.com","Sohar",
                "Orthopedic","PhD",18,"DEP-003",
                50.0,300,true));

        doctorService.add(new Surgeon(
                "D004","Noor","Ali",LocalDate.of(1999,10,23),
                "Female","92334404","Noor@gmail.com","Sohar",
                "Neurosurgery","MD",12,"DEP-003",
                60.0,150,true));


        doctorService.add(new GeneralPractitioner(
                "D005","Ali","Saied",LocalDate.of(1985,2,20),
                "Male","9345675","ali@gmail.com","Muscat",
                "Family Medicine","MBBS",8,"DEP-002",
                20.0,true,true,true));

        doctorService.add(new GeneralPractitioner(
                "D006","Anfal","Rashid",LocalDate.of(2000,8,18),
                "Female","90000006","noor@hospital.com","Ibra",
                "General Practice","MBBS",6,"DEP-002",
                18.0,true,false,true));

        doctorService.add(new Consultant(
                "D007","Muhammed","Usama",LocalDate.of(1995,6,14),
                "Male","96677887","muhammed@gmail.com","Seeb",
                "Pediatrics","MD",14,"DEP-001",
                28.0,new ArrayList<>(Arrays.asList("Child Consultation")),
                false,25));

        doctorService.add(new Surgeon(
                "D008","Nora","Majeed",LocalDate.of(1987,1,1),
                "Female","9456678","nora@gmail.com","Sur",
                "General Surgery","PhD",20,"DEP-003",
                55.0,400,true));


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
