package Services;

import Entities.Appointment;
import Entities.Doctor;
import Entities.MedicalRecord;
import Entities.Patient;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppointmentService {
    static MedicalRecord medicalRecord = new MedicalRecord();
    static PatientService patientService = new PatientService();
    static DoctorService doctorService = new DoctorService();
    static Scanner scanner = new Scanner(System.in);
    static List<Patient> patients = new ArrayList<>();
    static List<Doctor> doctors = new ArrayList<>();
    static Appointment appointment =new Appointment();
    static Patient patient = new Patient();
    static  Doctor doctor = new Doctor();


    public void getAppointmentsByPatient(){
        System.out.println("Please enter the patient Id");
        String  patientId = scanner.nextLine();
        for (int i =0; i < patients.size();i++){
            String searchedId = String.valueOf(patients.get(i));
            if (patientId.equalsIgnoreCase(searchedId)){
                appointment.displayInfo();
            }else {
                System.out.println("NOT FOUND");
            }
        }
    }

    public void getAppointmentsByDoctor(){
        System.out.println("Please enter the doctor Id:");
        String doctorId = scanner.nextLine();
        for (int i =0; i < doctors.size();i++){
            String searchedId = String.valueOf(doctors.get(i));
            if (doctorId.equalsIgnoreCase(searchedId)){
                appointment.displayInfo();
            }else {
                System.out.println("NOT FOUND");
            }
        }
    }

    public void getAppointmentsByDate(){
        System.out.println("Please enter the date:");
        String date = scanner.nextLine();
        for (int i =0; i < doctors.size();i++){
            String searchedDate = String.valueOf(doctors.get(i));
            if (date.equalsIgnoreCase(searchedDate)){
                appointment.displayInfo();
            }else {
                System.out.println("NOT FOUND");
            }
        }
    }

    public void rescheduleAppointment(){
        appointment.reschedule();
    }

    public void cancelAppointment(){

        appointment.cancel();
    }

    public void  createAppointment(String patientId, String doctorId, LocalDate date){
        System.out.println("CREATING APPOINTMENT");
        System.out.println("--------------------------------");

        System.out.println("Please enter patient ID: ");
        patientId = scanner.nextLine();
        patient.setPatientId(patientId);

        System.out.println("Please enter Doctor ID: ");
         doctorId = scanner.nextLine();
         doctor.setDoctorId(doctorId);

        System.out.println("Please enter appointment Date ");
        date = LocalDate.parse(scanner.nextLine());
        appointment.setAppointmentDate(date);
    }

    public void createAppointment(String patientId, String doctorId, LocalDate date, String time){
        System.out.println("CREATING APPOINTMENT");
        System.out.println("--------------------------------");

        System.out.println("Please enter patient ID: ");
        patientId = scanner.nextLine();
        patient.setPatientId(patientId);

        System.out.println("Please enter Doctor ID: ");
        doctorId = scanner.nextLine();
        doctor.setDoctorId(doctorId);

        System.out.println("Please enter appointment Date ");
        date = LocalDate.parse(scanner.nextLine());
        appointment.setAppointmentDate(date);

        System.out.println("Please enter appointment time ");
        time = scanner.nextLine();
        appointment.setAppointmentTime(time);
    }

    public void createAppointment(Appointment appointment){
        patient.addNewAppointment();
    }
    public void rescheduleAppointment(String appointmentId, LocalDate newDate){
        System.out.println("Please enter appointment Id ");
        appointmentId = scanner.nextLine();
        appointment.setAppointmentId(appointmentId);

        System.out.println("Please enter appointment Date ");
        newDate = LocalDate.parse(scanner.nextLine());
        appointment.setAppointmentDate(newDate);
    }
}

