// Appointment class implements Billable interface
class Appointment implements Billable {
    // Static variable - shared by all objects
    private static int totalAppointments = 0;

    // Instance variables
    private Doctor doctor;
    private Patient patient;
    private String appointmentDate;
    private String appointmentTime;

    // Constructor
    public Appointment(Doctor doctor, Patient patient, String date, String time) {
        this.doctor = doctor;
        this.patient = patient;
        this.appointmentDate = date;
        this.appointmentTime = time;
        totalAppointments++; // Increase count for each new appointment
    }

    // Static method to get total appointments
    public static int getTotalAppointments() {
        return totalAppointments;
    }

    // Implementing interface method
    @Override
    public void generateBill() {
        double fee = doctor.getConsultationFee();
        System.out.println("=== Appointment Bill ===");
        System.out.println("Doctor: " + doctor.getName());
        System.out.println("Specialization: " + doctor.getSpecialization());
        System.out.println("Patient: " + patient.getName());
        System.out.println("Date: " + appointmentDate);
        System.out.println("Time: " + appointmentTime);
        System.out.println("Consultation Fee: $" + fee);
        System.out.println("=======================\n");
    }

    // Display appointment details
    public void showAppointmentDetails() {
        System.out.println("=== Appointment Details ===");
        System.out.println("Doctor: " + doctor.getName());
        System.out.println("Patient: " + patient.getName());
        System.out.println("Date: " + appointmentDate);
        System.out.println("Time: " + appointmentTime);
        System.out.println("==========================\n");
    }

    // Getters and setters
    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime;
    }
}