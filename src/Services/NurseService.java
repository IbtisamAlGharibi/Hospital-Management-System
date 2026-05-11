package Services;

import Entities.Nurse;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NurseService {
    static Scanner scanner = new Scanner(System.in);
    static Nurse nurse = new Nurse();
    static List<Nurse> nurses = new ArrayList<>();

    public Nurse addNurse(){
        System.out.println("ADDING NEW NURSE");
        System.out.println("----------------------------");

        System.out.println("Please enter nurse first name: ");
        String nurseFirstName = scanner.nextLine();
        nurse.setFirstName(nurseFirstName);

        System.out.println("Please enter nurse last name: ");
        String nurseLastName = scanner.nextLine();
        nurse.setLastName(nurseLastName);

        System.out.println("Please enter nurse Id: ");
        String nurseId = scanner.nextLine();
        nurse.setNurseId(nurseId);

        System.out.println("Please enter department Id: ");
        String departmentId = scanner.nextLine();
        nurse.setDepartmentId(departmentId);

        System.out.println("Please enter shift (Morning/Evening/Night): ");
        String shift = scanner.nextLine();
        nurse.setShift(shift);

        System.out.println("Please enter qualification: ");
        String qualification = scanner.nextLine();
        nurse.setQualification(qualification);

        return nurse;
    }

    public void addNewNurse(){
        boolean flag = true;
        while (flag){
            nurses.add(addNurse());
            System.out.println("Please enter E to Stop");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("E")){
                flag = false;
            }
        }
    }
    public void editNurse(){
        System.out.println("UPDATING NURSE");
        System.out.println("-------------------------------------");
        System.out.println("Please enter nurse ID you want to update");
        String nurseIDToSearch = scanner.nextLine();
        for (int i =0; i< nurses.size();i++){
            String oldId = String.valueOf(nurses.get(i));
            if (nurseIDToSearch.equalsIgnoreCase(oldId)){
                addNewNurse();
            }
        }
    }

    public void removeNurse(){
        System.out.println("REMOVING NURSE");
        System.out.println("-------------------------------------");
        System.out.println("Please enter the nurse Id you want to remove");
        String nurseIdToRemove = scanner.nextLine();
        for (int i =0; i < nurses.size();i++){
            String searchedId = String.valueOf(nurses.get(i));
            if (nurseIdToRemove.equalsIgnoreCase(searchedId)){
                System.out.println("Are you sure you want to remove?Yes/No");
                String confirm = scanner.nextLine();
                if (confirm.equalsIgnoreCase("Yes")){
                    nurses.remove(nurseIdToRemove);
                }else {
                    System.out.println("REMOVING REJECTED");
                }
            }else {
                System.out.println("NOT FOUND");
            }
        }
    }

    public void getNurseById(){
        System.out.println("Please enter the nurse Id you want to find");
        String nurseIdToFind = scanner.nextLine();
        for (int i =0; i < nurses.size();i++){
            String searchedId = String.valueOf(nurses.get(i));
            if (nurseIdToFind.equalsIgnoreCase(searchedId)){
                nurse.displayInfo();
            }else {
                System.out.println("NOT FOUND");
            }
        }
    }

    public void displayAllNurses(){
        System.out.println("DISPLAYING ALL NURSES");
        System.out.println("--------------------------------");
        for (int i =0;i<nurses.size();i++){
           nurse.displayInfo();
        }
    }

    public void getNursesByDepartment(){
        System.out.println("Please enter the nurse department you want to find");
        String nurseDepartmentToFind = scanner.nextLine();
        for (int i =0; i < nurses.size();i++){
            String searchedDepartment = String.valueOf(nurses.get(i));
            if (nurseDepartmentToFind.equalsIgnoreCase(searchedDepartment)){
                nurse.displayInfo();
            }else {
                System.out.println("NOT FOUND");
            }
        }
    }
    public void getNursesByShift(){

    }
}
