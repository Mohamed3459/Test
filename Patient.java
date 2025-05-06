package com.mycompany.fun;
public class Patient extends Person{
    private Doctor assignedDoctor;
    private String medicalHistory;
    
    public Patient (Doctor assignedDocotor){
        this.assignedDoctor= assignedDocotor;
    }
    public Patient(String name, int age, String gender, int id){
        super(name, age, gender, id);
    }
     public Patient(String name, int age, String gender, int id, Doctor assignedDoctor){
        super(name, age, gender, id);
        this.assignedDoctor = assignedDoctor;
    }

    @Override
    public String toString() {
        return "Patient{ name= "+this.name+" gender: "+this.gender+" age: "+this.age + " assignedDoctor=" + assignedDoctor + ", medicalHistory=" + medicalHistory + '}';
    }
     
}
