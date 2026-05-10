package Entities;

import java.util.ArrayList;
import java.util.List;

public class Doctor{
    private String doctorId;
    private String specialization;
    private String qualification;
    private int experienceYears;
    private String departmentId;
    private double consultationFee;
    private List<Integer> availableSlots = new ArrayList<>();
    private List<String > assignedPatients = new ArrayList<>();

}
