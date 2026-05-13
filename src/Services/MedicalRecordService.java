package Services;

import Behaviours.ManageableInterface;
import Behaviours.SearchableInterface;
import Entities.Doctor;
import Entities.MedicalRecord;
import Entities.Patient;
import Util.MenuMessages;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MedicalRecordService implements ManageableInterface, SearchableInterface {
    static MedicalRecord medicalRecord = new MedicalRecord();
    static PatientService patientService = new PatientService();
    static DoctorService doctorService = new DoctorService();
    static MenuMessages menuMessages = new MenuMessages();
    static Scanner scanner = new Scanner(System.in);
    static List<Patient> patients = new ArrayList<>();
    static List<Doctor> doctors = new ArrayList<>();
    static List<String > medicalRecords = new ArrayList<>();

    static Patient patient = new Patient() {
        @Override
        public Patient addPatient() {
            return null;
        }
    };

    public void getRecordsByPatientId(){
        System.out.println("Please enter the patient Id");
        String  patientId = scanner.nextLine();
        for (int i =0; i < patients.size();i++){
            String searchedId = String.valueOf(patients.get(i));
            if (patientId.equalsIgnoreCase(searchedId)){
                medicalRecord.displayInfo();
            }else {
                System.out.println("NOT FOUND");
            }
        }
    }

    public void getRecordsByDoctorId(){
        System.out.println("Please enter the doctor Id:");
        String doctorId = scanner.nextLine();
        for (int i =0; i < doctors.size();i++){
            String searchedId = String.valueOf(doctors.get(i));
            if (doctorId.equalsIgnoreCase(searchedId)){
                medicalRecord.displayInfo();
            }else {
                System.out.println("NOT FOUND");
            }
        }
    }

    public void displayPatientHistory(){
        System.out.println("Please enter the patient name");
        String patientName = scanner.nextLine();
        for (int i =0; i < patients.size();i++){
            String searchedName = String.valueOf(patients.get(i));
            if (patientName.equalsIgnoreCase(searchedName)){
                medicalRecord.displayInfo();
            }else {
                System.out.println("NOT FOUND");
            }
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
    public void updateMedicalRecord(){
        System.out.println("UPDATING MEDICAL RECORD");
        System.out.println("-------------------------------------");
        System.out.println("Please enter medical record ID you want to update");
        String medicalRecordIDToSearch = scanner.nextLine();
        for (int i = 0; i < medicalRecords.size(); i++) {
            String oldId = String.valueOf(medicalRecords.get(i));
            if (medicalRecordIDToSearch.equalsIgnoreCase(oldId)) {
                patient.addNewMedicalRecord();
            }
        }
    }

    public boolean HandleMedicalRecordMenu(){
        System.out.println(menuMessages.MEDICALRECORD_MENU_MESSAGE);
        System.out.println("Please enter number");
        String medicalRecordOption = scanner.nextLine();
        switch (medicalRecordOption) {
            case  "5.1" -> {
                System.out.println("CREATING MEDICAL RECORD");
                patient.addNewMedicalRecord();
            }
            case "5.2" -> {
                System.out.println("DISPLAYING ALL RECORDS");
                medicalRecord.displayInfo();
            }
            case "5.3" -> {
                System.out.println("VIEWING RECORD BY PATIENT");
                getRecordsByPatientId();
            }

            case  "5.4" -> {
                System.out.println("VIEWING RECORD BY DOCTOR");
                getRecordsByDoctorId();
            }
            case "5.5" -> {
                updateMedicalRecord();
            }case "5.6" -> {


            }case "5.7"-> {

            }
            case "5.8" -> {
                return false;
            }
        }
        return true;
    }
}
