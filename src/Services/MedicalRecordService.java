package Services;

import Entities.Doctor;
import Entities.MedicalRecord;
import Entities.Patient;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MedicalRecordService {
    static MedicalRecord medicalRecord = new MedicalRecord();
    static PatientService patientService = new PatientService();
    static DoctorService doctorService = new DoctorService();
    static Scanner scanner = new Scanner(System.in);
    static List<Patient> patients = new ArrayList<>();
    static List<Doctor> doctors = new ArrayList<>();

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
}
