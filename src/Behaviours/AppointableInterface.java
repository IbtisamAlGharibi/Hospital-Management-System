package Behaviours;

import Entities.Appointment;

import java.time.LocalDate;

public interface AppointableInterface {
    void scheduleAppointment(Appointment appointment);
    void  cancelAppointment(String appointmentId);
    void rescheduleAppointment(String appointmentId, LocalDate newDate);
}
