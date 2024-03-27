package com.mycompany.mavenproject1;

import com.mycompany.mavenproject1.Persona;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */



/**
 *
 * @author Alumno
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        Persona p1 = new Persona("Joaquin","andreis");
        p1.setEdad(18);
        
        System.out.println("Mi nombre es"+ p1.getNombre());
    
    
    
    }
}
