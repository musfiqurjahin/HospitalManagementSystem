// Patient class inherits from Person
class Patient extends Person {
    // Private variables specific to Patient
    private String bloodGroup;
    private String medicalHistory;

    // Constructor using super()
    public Patient(String name, int age, String id, String bloodGroup, String medicalHistory) {
        super(name, age, id); // Calls Person constructor
        this.bloodGroup = bloodGroup;
        this.medicalHistory = medicalHistory;
    }

    // POLYMORPHISM - Overriding showInfo() differently
    @Override
    public void showInfo() {
        System.out.println("=== Patient Information ===");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("ID: " + getId());
        System.out.println("Blood Group: " + bloodGroup);
        System.out.println("Medical History: " + medicalHistory);
        System.out.println("===========================\n");
    }

    // Getters and setters
    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }
}