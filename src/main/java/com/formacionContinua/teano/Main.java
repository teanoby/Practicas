package com.formacionContinua.teano;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor();
        myDoctor.name = "Alejandro Rodríguez";
        myDoctor.showName();
        myDoctor.showId();
        System.out.println(Doctor.id);


        Doctor MyDoctorAnn = new Doctor();
        myDoctor.showId();
        System.out.println(Doctor.id);
    }

    public static void showMenu() {
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Exit");

            Scanner scanner = new Scanner(System.in);
            response = Integer.valueOf(scanner.nextLine());

            switch (response) {
                case 1:
                    System.out.println("Doctor");
                    break;
                case 2:
                    response = 0;
                    showPatientMenu();
                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        } while (response != 0);

        public static void showPatientMenu () {
        }
        public static void showPatientMenu () {
            int response = 0;
            do{
                System.out.println("\n\n");
                System.out.println("Patient");
                System.out.println("1. Book an appointments");
                System.out.println("2. My appoinments");
                System.out.println("0. Return");

                Scanner scanner = new Scanner(System.in);
                response = Integer.parseInt(scanner.nextLine());

                switch (response){
                    case 1:
                        System.out.println("::Book an appointment");
                        break;
                    case 2:

                }
            }
        }
    }
}