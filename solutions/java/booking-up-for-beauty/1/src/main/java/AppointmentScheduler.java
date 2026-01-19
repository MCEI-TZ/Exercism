import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/d/yyyy HH:mm:ss");
        return LocalDateTime.parse(appointmentDateDescription, format);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int hour = appointmentDate.getHour();
        return hour >= 12 && hour <18;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        DateTimeFormatter printter = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy, 'at' h:mm a.");
        return "You have an appointment on "+printter.format(appointmentDate);
    }

    public LocalDate getAnniversaryDate() {
        return LocalDate.of(LocalDate.now().getYear(), 9 ,15);
    }
}
