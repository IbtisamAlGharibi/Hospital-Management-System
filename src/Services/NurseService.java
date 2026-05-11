package Services;

import Entities.Nurse;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Scanner;

public class NurseService {
    static Scanner scanner = new Scanner(System.in);
    static Nurse nurse = new Nurse();

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

}
