package Services;

import Entities.Patient;
import com.sun.source.tree.WhileLoopTree;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PatientService {
    static List<Patient> patients = new ArrayList<>();
    static Patient patient = new Patient();
    static Scanner scanner= new Scanner(System.in);

    public Patient addPatient(){
        System.out.println("ADDING NEW PATIENT");
        System.out.println("----------------------------");

        System.out.println("Please enter patient first name: ");
        String patientFirstName = scanner.nextLine();
        patient.setFirstName(patientFirstName);

        System.out.println("Please enter patient last name: ");
        String patientLastName = scanner.nextLine();
        patient.setLastName(patientLastName);

        System.out.println("Please enter patient ID: ");
        String patientID = scanner.nextLine();
        patient.setPatientId(patientID);

        System.out.println("Please enter blood Group: ");
        String patientBloodGroup = scanner.nextLine();
        patient.setBloodGroup(patientBloodGroup);

        System.out.println("Please enter emergency Contact: ");
        String patientEmergencyContact = scanner.nextLine();
        patient.setEmergencyContact(patientEmergencyContact);

        System.out.println("Please enter insurance Id: ");
        String patientInsuranceId = scanner.nextLine();
        patient.setInsuranceId(patientInsuranceId);

        System.out.println("Please enter allergies: ");
        String patientAllergies = scanner.nextLine();
        patient.setAllergies(Collections.singletonList(patientAllergies));

        System.out.println("Please enter registrationDate: ");
        String patientRegistrationDate = scanner.nextLine();
        patient.setRegistrationDate(LocalDate.parse(patientRegistrationDate));
        return null;
    }
    public void addNewPatient(){
        boolean flag = true;
        while (flag){
        patients.add(addPatient());
            System.out.println("Please enter E to Stop");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("E")){
                flag = false;
            }
        }
    }
}
