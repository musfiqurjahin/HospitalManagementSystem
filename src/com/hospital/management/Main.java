// Main class with main method
public class Main {
    public static void main(String[] args) {
        System.out.println("=== SMART HOSPITAL MANAGEMENT SYSTEM ===\n");

        // Step 1: Add Doctor Information
        System.out.println("1. ADDING DOCTOR INFORMATION");
        Doctor doctor1 = new Doctor("Dr. Smith", 45, "DOC001", "Cardiology", 150.0);
        Doctor doctor2 = new Doctor("Dr. Johnson", 38, "DOC002", "Pediatrics", 120.0);

        // Display doctor info using POLYMORPHISM
        doctor1.showInfo();
        doctor2.showInfo();

        // Step 2: Add Patient Information
        System.out.println("2. ADDING PATIENT INFORMATION");
        Patient patient1 = new Patient("John Doe", 30, "PAT001", "O+", "None");
        Patient patient2 = new Patient("Jane Smith", 25, "PAT002", "A+", "Diabetes");

        // Display patient info using POLYMORPHISM
        patient1.showInfo();
        patient2.showInfo();

        // Step 3: Create Appointments
        System.out.println("3. CREATING APPOINTMENTS");
        Appointment appointment1 = new Appointment(doctor1, patient1, "2024-01-15", "10:00 AM");
        Appointment appointment2 = new Appointment(doctor2, patient2, "2024-01-15", "11:30 AM");
        Appointment appointment3 = new Appointment(doctor1, patient2, "2024-01-16", "02:00 PM");

        // Show appointment details
        appointment1.showAppointmentDetails();
        appointment2.showAppointmentDetails();
        appointment3.showAppointmentDetails();

        // Step 4: Display Total Appointments (STATIC variable)
        System.out.println("4. TOTAL APPOINTMENTS CREATED: " + Appointment.getTotalAppointments());

        // Step 5: Generate Bills
        System.out.println("\n5. GENERATING BILLS");
        appointment1.generateBill();
        appointment2.generateBill();
        appointment3.generateBill();

        // Step 6: Demonstrate Encapsulation
        System.out.println("6. DEMONSTRATING ENCAPSULATION");
        // We can access private variables only through getters
        System.out.println("Doctor 1's Name (via getter): " + doctor1.getName());
        System.out.println("Patient 1's Age (via getter): " + patient1.getAge());

        // Using setters to modify values
        doctor1.setConsultationFee(160.0); // Increase fee
        System.out.println("\nUpdated Doctor 1's consultation fee: $" + doctor1.getConsultationFee());

        // Step 7: Demonstrate Polymorphism with Array
        System.out.println("\n7. DEMONSTRATING POLYMORPHISM WITH ARRAY");
        Person[] people = new Person[4];
        people[0] = doctor1;
        people[1] = doctor2;
        people[2] = patient1;
        people[3] = patient2;

        System.out.println("Showing all people info using polymorphism:");
        for (Person person : people) {
            person.showInfo(); // Calls appropriate version based on object type
        }
    }
}