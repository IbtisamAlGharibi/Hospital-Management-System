package Entities;

import Behaviours.DisplayableInterface;
import Util.HelperUtils;

import java.time.LocalDate;

public class MedicalRecord implements DisplayableInterface {
    private String recordId;
    private String patientId;
    private String doctorId;
    private LocalDate visitDate;
    private String diagnosis;
    private String prescription;
    private String testResults;
    private String notes;
    static HelperUtils helperUtils = new HelperUtils();

    public MedicalRecord(String recordId, String patientId, String doctorId, LocalDate visitDate, String diagnosis, String prescription, String testResults, String notes) {
        this.recordId = recordId;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.visitDate = visitDate;
        this.diagnosis = diagnosis;
        this.prescription = prescription;
        this.testResults = testResults;
        this.notes = notes;
    }

    public MedicalRecord() {

    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = helperUtils.generateId();
    }

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = helperUtils.generateId();
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = helperUtils.generateId();
    }

    public LocalDate getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(LocalDate visitDate) {
        this.visitDate = visitDate;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public String getTestResults() {
        return testResults;
    }

    public void setTestResults(String testResults) {
        this.testResults = testResults;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void displayInfo(){
        System.out.println("record Id: " + getRecordId() );
        System.out.println("patient Id: " + getPatientId() );
        System.out.println("doctor Id: " + getDoctorId() );
        System.out.println("visit Date: " + getVisitDate() );
        System.out.println("diagnosis: " + getDiagnosis() );
        System.out.println("prescription: " + getPrescription() );
        System.out.println("test Results: " + getTestResults() );
        System.out.println("notes: " + getNotes());
    }

    @Override
    public void displaySummary() {

    }
}
