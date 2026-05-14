package Services;

import Behaviours.AppointableInterface;
import Behaviours.ManageableInterface;
import Behaviours.SearchableInterface;
import Entities.Appointment;
import Entities.Doctor;
import Entities.MedicalRecord;
import Entities.Patient;
import Util.MenuMessages;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppointmentService implements ManageableInterface, SearchableInterface, AppointableInterface {
    static MedicalRecord medicalRecord = new MedicalRecord();
    static PatientService patientService = new PatientService();
    static DoctorService doctorService = new DoctorService();
    static Scanner scanner = new Scanner(System.in);
    static List<Patient> patients = new ArrayList<>();
    static List<Doctor> doctors = new ArrayList<>();
    static Appointment appointment =new Appointment();
    static MenuMessages menuMessages = new MenuMessages();
    public static Patient patient = new Patient() {
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
        System.out.println("Please enter the date (Please use formate 2025-05-12):");
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

        System.out.println("Please enter appointment Date (Please use formate 2025-05-12)");
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

        System.out.println("Please enter appointment Date (Please use formate 2025-05-12) ");
        date = LocalDate.parse(scanner.nextLine());
        appointment.setAppointmentDate(date);

        System.out.println("Please enter appointment time ");
        time = scanner.nextLine();
        appointment.setAppointmentTime(time);
    }

    public void createAppointment(Appointment appointment){
        patient.addNewAppointment();
    }

    @Override
    public void scheduleAppointment(Appointment appointment) {

    }

    @Override
    public void cancelAppointment(String appointmentId) {

    }

    public void rescheduleAppointment(String appointmentId, LocalDate newDate){
        System.out.println("Please enter appointment Id ");
        appointmentId = scanner.nextLine();
        appointment.setAppointmentId(appointmentId);

        System.out.println("Please enter appointment Date (Please use formate 2025-05-12)");
        newDate = LocalDate.parse(scanner.nextLine());
        appointment.setAppointmentDate(newDate);
    }
    public void  rescheduleAppointment(String appointmentId, LocalDate newDate, String newTime){
        System.out.println("Please enter appointment Id ");
        appointmentId = scanner.nextLine();
        appointment.setAppointmentId(appointmentId);

        System.out.println("Please enter appointment Date (Please use formate 2025-05-12)");
        newDate = LocalDate.parse(scanner.nextLine());
        appointment.setAppointmentDate(newDate);

        System.out.println("Please enter appointment time ");
        newTime = scanner.nextLine();
        appointment.setAppointmentTime(newTime);
    }

    public void  rescheduleAppointment(Appointment appointment, LocalDate newDate, String newTime, String reason) {
        System.out.println("Please enter appointment Date (Please use formate 2025-05-12) ");
        newDate = LocalDate.parse(scanner.nextLine());
        appointment.setAppointmentDate(newDate);

        System.out.println("Please enter appointment time ");
        newTime = scanner.nextLine();
        appointment.setAppointmentTime(newTime);

        System.out.println("Please enter reason ");
        reason = scanner.nextLine();
        appointment.setReason(reason);
    }
    public void displayAppointments(LocalDate date){
        getAppointmentsByDate();
    }
    public void displayAppointments(String doctorId, LocalDate startDate, LocalDate endDate){
        System.out.println("Doctor Id: " + appointment.getDoctorId());
        System.out.println("Start Date: " + appointment.getAppointmentDate());
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

    public boolean HandleAppointmentMenu(){
        System.out.println(menuMessages.APPOINTMENT_MENU_MESSAGE);
        System.out.println("Please enter number");
        String appointmentOption = scanner.nextLine();
        switch (appointmentOption) {
            case  "4.1" -> {
                System.out.println("SCHEDULING NEW APPOINTMENT");
               patient.addNewAppointment();
            }
            case "4.2" -> {
                System.out.println("VIEWING ALL APPOINTMENTS");
                appointment.displayInfo();
            }
            case "4.3" -> {
                System.out.println("VIEWING APPOINTMENT BY PATIENT");
                getAppointmentsByPatient();
            }

            case  "4.4" -> {
                System.out.println("VIEWING APPOINTMENT BY DOCTOR");
                getAppointmentsByDoctor();

            }
            case "4.5" -> {
                System.out.println("VIEWING APPOINTMENT BY DATE");
                getAppointmentsByDate();
            }case "4.6" -> {
                System.out.println("RESCHEDULING APPOINTMENT");
                rescheduleAppointment();

            }case "4.7"-> {
                System.out.println("CANCELING APPOINTMENT");
                cancelAppointment();
            }case "4.8"-> {
                System.out.println("COMPLETING APPOINTMENT");
                appointment.complete();
            }case "4.9"-> {
                System.out.println("VIEWING UPCOMING APPOINTMENTS");
                getAppointmentsByDate();
            }
            case "4.10" -> {
                return false;
            }
        }
        return true;
    }
}

