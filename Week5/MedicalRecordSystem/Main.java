package Week5.MedicalRecordSystem;

public class Main {
    static void main(String[] args) {
        Patient patient=new Patient("Sochan",23);
        patient.setMedicalhistory(": Parkinson Disease", "doctor");
        System.out.println("name: "+patient.getName());
        System.out.println("age :"+patient.getAge());
        System.out.println("Previous medical history :"+patient.getMedicalhistory());

    }
}
