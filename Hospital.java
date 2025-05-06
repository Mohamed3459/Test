package com.mycompany.fun;
import java.util.ArrayList;
import java.util.Scanner;
public class Hospital {
    public ArrayList<Patient> patientsList= new ArrayList<Patient>();//default 10
    public ArrayList<Doctor> doctors = new ArrayList<Doctor>();
    public void addNewPatient(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Patient data: \nname:");
        String name = scanner.nextLine();
        System.out.print("age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("gender:");
        String gender = scanner.nextLine();
        int id = patientsList.size()+1;
        Patient patient = new Patient(name, age, gender, id);
        patientsList.add(patient);
        
    }
    public void getAllPatients(){
        for(int i = 0; i< patientsList.size();i++){
            System.out.println(patientsList.get(i).toString());
            System.out.println("I added this new thing to test and shit");
        }
    }
}
