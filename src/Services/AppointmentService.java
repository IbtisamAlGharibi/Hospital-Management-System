package Services;

import Entities.Doctor;
import Entities.MedicalRecord;
import Entities.Patient;

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
}
