package Week5.MedicalRecordSystem;
//Ishant
public class Patient {
    private String name;
    private String medicalhistory;
    private int age;

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMedicalhistory() {
        return medicalhistory;
    }

    public void setMedicalhistory(String medicalhistory, String departmentname) {
        if(departmentname.equalsIgnoreCase("Doctor")){
            this.medicalhistory = medicalhistory;
        }else{
            System.out.println("not allowed to see salary");
        }


    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }}
