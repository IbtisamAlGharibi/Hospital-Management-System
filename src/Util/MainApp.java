package Util;

import Entities.Doctor;
import Entities.Patient;
import Services.DoctorService;
import Services.PatientService;

import java.util.Scanner;

public class MainApp {
    static Scanner scanner = new Scanner(System.in);
    static DoctorService doctorService = new DoctorService();
    static PatientService patientService = new PatientService();
    static Patient patient = new Patient();
    static Doctor doctor = new Doctor();

    public static void main(String[] args){
        System.out.println(MenuMessages.MAIN_MENU_MESSAGE);

    }
}
