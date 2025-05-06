/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fun;
import java.util.ArrayList;

public class Doctor extends Person {
   private String speciality;
   private ArrayList<Patient> assignedPatientsList = new ArrayList<>();
   public void printAllAssignedPatients(){
       int listSize = assignedPatientsList.size();
       for(int i = 0; i<listSize;i++){
           System.out.println(assignedPatientsList.get(i).name);
       }
       
   }
   public void assignPatient(Patient p){
       assignedPatientsList.add(p);
   }
   public Doctor(String name, int age, String gender, int id, String speciality){
       super(name, age, gender, id);
       this.speciality = speciality;
   }
}
