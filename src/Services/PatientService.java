package Services;

import Behaviours.ManageableInterface;
import Behaviours.SearchableInterface;
import Entities.EmergencyPatient;
import Entities.InPatient;
import Entities.OutPatient;
import Entities.Patient;
import Util.MenuMessages;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PatientService implements ManageableInterface, SearchableInterface {
    public static List<Patient> patients = new ArrayList<>();
    static Patient patient = new Patient() {
        @Override
        public Patient addPatient() {
            return null;
        }
    };
    static Scanner scanner = new Scanner(System.in);
    MenuMessages menuMessages = new MenuMessages();
    static InPatient inPatient = new InPatient();
    static OutPatient outPatient = new OutPatient();
    static EmergencyPatient emergencyPatient = new EmergencyPatient();


    public Patient addPatient() {
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
        return patient;
    }

    public void addNewPatient() {
        boolean flag = true;
        while (flag) {
            patients.add(addPatient());
            System.out.println("Please enter E to Stop");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("E")) {
                flag = false;
            }
        }
    }

    public void editPatient() {
        System.out.println("UPDATING PATIENT");
        System.out.println("-------------------------------------");
        System.out.println("Please enter patient ID you want to update");
        String patientIDToSearch = scanner.nextLine();
        for (int i = 0; i < patients.size(); i++) {
            String oldId = String.valueOf(patients.get(i));
            if (patientIDToSearch.equalsIgnoreCase(oldId)) {
                addNewPatient();
            }
        }
    }

    public void removePatient() {
        System.out.println("Please enter the patient Id you want to remove");
        String patientIdToRemove = scanner.nextLine();
        for (int i = 0; i < patients.size(); i++) {
            String searchedId = String.valueOf(patients.get(i));
            if (patientIdToRemove.equalsIgnoreCase(searchedId)) {
                System.out.println("Are you sure you want to remove?Yes/No");
                String confirm = scanner.nextLine();
                if (confirm.equalsIgnoreCase("Yes")) {
                    patients.remove(patientIdToRemove);
                } else {
                    System.out.println("REMOVING REJECTED");
                }
            } else {
                System.out.println("NOT FOUND");
            }
        }
    }

    public void getPatientById() {
        System.out.println("Please enter the patient Id you want to find");
        String patientId = scanner.nextLine();
        for (int i = 0; i < patients.size(); i++) {
            String searchedId = String.valueOf(patients.get(i));
            if (patientId.equalsIgnoreCase(searchedId)) {
                patient.displayInfo();
            } else {
                System.out.println("NOT FOUND");
            }
        }
    }

    public void displayAllPatients() {
        System.out.println("DISPLAYING ALL PATIENTS");
        System.out.println("--------------------------------");
        for (int i = 0; i < patients.size(); i++) {
            patient.displayInfo();
        }
    }

    public void searchPatientsByName() {
        System.out.println("Please enter the patient name you want to find");
        String patientNameToFind = scanner.nextLine();
        for (int i = 0; i < patients.size(); i++) {
            String searchedName = String.valueOf(patients.get(i));
            if (patientNameToFind.equalsIgnoreCase(searchedName)) {
                patient.displayInfo();
            } else {
                System.out.println("NOT FOUND");
            }
        }
    }

    public boolean HandlePatientMenu() {
        PatientService patientService = new PatientService();
        System.out.println(menuMessages.PATIENT_MENU_MESSAGE);
        System.out.println("Please enter number");
        String patientOption = scanner.nextLine();

        switch (patientOption) {
            case "1.1" -> {
                System.out.println("Register New Patient");
                patientService.addNewPatient();
            }
            case "1.2" -> {
                System.out.println("Register In Patient");
                inPatient.addNewPatient();
            }
            case "1.3" -> {
                System.out.println("Register Out Patient");
                outPatient.addPatient();
            }

            case "1.4" -> {

            }
            case "1.5" -> {
                patientService.displayAllPatients();
            }
            case "1.6" -> {
                System.out.println("Do you want to search by Name or Id?");
                String confirm = scanner.nextLine();
                if (confirm.equalsIgnoreCase("Name")) {
                    patientService.searchPatientsByName();
                } else {
                    patientService.getPatientById();
                }
            }
            case "1.7" -> {
                patientService.editPatient();

            }
            case "1.8" -> {
                patientService.removePatient();
            }
            case "1.9" -> {

            }

            case "1.10" -> {
                return false;
            }
        }
        return true;
    }

    public void addPatient(String firstName, String lastName, String phone) {
        System.out.println("Please enter patient first name: ");
        firstName = scanner.nextLine();
        patient.setFirstName(firstName);

        System.out.println("Please enter patient last name: ");
        lastName = scanner.nextLine();
        patient.setLastName(lastName);

        System.out.println("Please enter patient phone: ");
        phone = scanner.nextLine();
        patient.setPhoneNumber(phone);
    }

    public void addPatient(String firstName, String lastName, String phone, String bloodGroup, String email) {
        System.out.println("Please enter patient first name: ");
        firstName = scanner.nextLine();
        patient.setFirstName(firstName);

        System.out.println("Please enter patient last name: ");
        lastName = scanner.nextLine();
        patient.setLastName(lastName);

        System.out.println("Please enter patient phone: ");
        phone = scanner.nextLine();
        patient.setPhoneNumber(phone);

        System.out.println("Please enter blood Group: ");
        bloodGroup = scanner.nextLine();
        patient.setBloodGroup(bloodGroup);


        System.out.println("Please enter Email: ");
        email = scanner.nextLine();
        patient.setEmail(email);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
        addNewPatient();
    }

    public void searchPatients(String keyword) {
        System.out.println("You can search patient by any field:");
        keyword = scanner.nextLine();
        for (int i = 0; i < patients.size(); i++) {
            if (patients.get(i).equals(keyword)) {
                patient.displayInfo();
            }
        }
    }

    public void searchPatients(String firstName, String lastName) {
        searchPatientsByName();
    }

    public void displayPatients() {
        displayAllPatients();
    }

    public void displayPatients(String filter) {
        System.out.println("Please enter the type of patient you want to display(InPatient/OutPatient/EmergencyPatient)");
        filter = scanner.nextLine();
        if (filter.equalsIgnoreCase("InPatient")) {
            inPatient.displayInfo();
        } else if (filter.equalsIgnoreCase("OutPatient")) {
            outPatient.displayInfo();
        } else {
            emergencyPatient.displayInfo();
        }
    }

    public void displayPatients(int limit) {

        System.out.println("DISPLAYING LIMITED PATIENTS");
        System.out.println("-------------------");

        System.out.println("please enter the number of patients you want to display:");
        limit = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < limit && i < patients.size(); i++) {
            displayPatients();
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
}