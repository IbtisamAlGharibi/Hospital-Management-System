package Services;

import Entities.Doctor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DoctorService {
    static Doctor doctor = new Doctor();
    static List<Doctor> doctors = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public Doctor addDoctor(){
        System.out.println("ADDING NEW DOCTOR");
        System.out.println("----------------------------");

        System.out.println("Please enter Doctor first name: ");
        String doctorFirstName = scanner.nextLine();
       doctor.setFirstName(doctorFirstName);

        System.out.println("Please enter Doctor last name: ");
        String doctorLastName = scanner.nextLine();
       doctor.setLastName(doctorLastName);

        System.out.println("Please enter Doctor ID: ");
        String doctorID = scanner.nextLine();
        doctor.setDoctorId(doctorID);

        System.out.println("Please enter qualification: ");
        String doctorQualification = scanner.nextLine();
        doctor.setQualification(doctorQualification);

        System.out.println("Please enter specialization: ");
        String doctorSpecialization = scanner.nextLine();
        doctor.setSpecialization(doctorSpecialization);

        System.out.println("Please enter Doctor experience Years: ");
        String doctorExperienceYears = scanner.nextLine();
        doctor.setExperienceYears(Integer.parseInt(doctorExperienceYears));

        System.out.println("Please enter department Id: ");
        String departmentId = scanner.nextLine();
        doctor.setDepartmentId(departmentId);

        System.out.println("Please enter consultation Fee: ");
        String consultationFee = scanner.nextLine();
        doctor.setConsultationFee(Double.parseDouble(consultationFee));
        return null;
    }

    public void addNewDoctor(){
        boolean flag = true;
        while (flag){
            doctors.add(addDoctor());
            System.out.println("Please enter E to Stop");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("E")){
                flag = false;
            }
        }
    }

    public void editDoctor(){
        System.out.println("UPDATING DOCTOR");
        System.out.println("-------------------------------------");
        System.out.println("Please enter doctor ID you want to update");
        String doctorIDToSearch = scanner.nextLine();
        for (int i =0; i< doctors.size();i++){
            String oldId = String.valueOf(doctors.get(i));
            if (doctorIDToSearch.equalsIgnoreCase(oldId)){
                addNewDoctor();
            }
        }
    }
    public void removeDoctor(String doctorId){
        System.out.println("REMOVING DOCTOR");
        System.out.println("-------------------------------------");
        System.out.println("Please enter the Doctor Id you want to remove");
        String doctorIdToRemove = scanner.nextLine();
        for (int i =0; i < doctors.size();i++){
            String searchedId = String.valueOf(doctors.get(i));
            if (doctorIdToRemove.equalsIgnoreCase(searchedId)){
                System.out.println("Are you sure you want to remove?Yes/No");
                String confirm = scanner.nextLine();
                if (confirm.equalsIgnoreCase("Yes")){
                    doctors.remove(doctorIdToRemove);
                }else {
                    System.out.println("REMOVING REJECTED");
                }
            }else {
                System.out.println("NOT FOUND");
            }
        }
    }

    public void getDoctorById(String doctorId){
        System.out.println("Please enter the doctor Id you want to find");
        String doctorIdToFind = scanner.nextLine();
        for (int i =0; i < doctors.size();i++){
            String searchedId = String.valueOf(doctors.get(i));
            if (doctorIdToFind.equalsIgnoreCase(searchedId)){
                doctor.displayInfo();
            }else {
                System.out.println("NOT FOUND");
            }
        }
    }
}
