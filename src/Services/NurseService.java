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
}
