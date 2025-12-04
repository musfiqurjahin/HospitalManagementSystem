// Doctor class inherits from Person
class Doctor extends Person {
    // Private variables specific to Doctor
    private String specialization;
    private double consultationFee;

    // Constructor using super() - calls parent constructor
    public Doctor(String name, int age, String id, String specialization, double consultationFee) {
        super(name, age, id); // Calls Person constructor
        this.specialization = specialization;
        this.consultationFee = consultationFee;
    }

    // POLYMORPHISM - Overriding showInfo() differently
    @Override
    public void showInfo() {
        System.out.println("=== Doctor Information ===");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("ID: " + getId());
        System.out.println("Specialization: " + specialization);
        System.out.println("Consultation Fee: $" + consultationFee);
        System.out.println("==========================\n");
    }

    // Additional getters/setters for Doctor-specific properties
    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public double getConsultationFee() {
        return consultationFee;
    }

    public void setConsultationFee(double consultationFee) {
        this.consultationFee = consultationFee;
    }
}