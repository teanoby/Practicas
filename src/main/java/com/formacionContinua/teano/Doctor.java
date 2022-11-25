package com.formacionContinua.teano;
//una receta de cocina, primero va el nombre de la receta = clase
//despues van los ingredientes = atributos y el comportamiento
//por ultimo los pasos a seguir para la preparacion = constructor
public class Doctor {
    static int id = 0; //autoincrement
    String name;
    String speciality;

    Doctor (){
        System.out.println("Construyendo el Objeto Doctor");
        id++;
    }
    Doctor(String name){
        System.out.println("El nombre del Doctor asignado es: " + name);
    }

    //comportamiento
    public void showName () {
        System.out.println(name);
    }
    public void showId(){
        System.out.println("ID Doctor: " + id);
    }


}
