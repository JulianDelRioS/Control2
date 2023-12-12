/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.control2;

import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author jdelr
 */
public class Nota {
    private int id;
    private String frase;
    private Scanner scanner;

    public Nota() {
        this.id = 0;
        this.frase = "";
        this.scanner = new Scanner(System.in);
    }

    public Nota(int id, String frase) {
        this.id = id;
        this.frase = frase;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }
    public Nota crearNota()throws ParseException{
        System.out.println("Ingrese id");
        this.id = scanner.nextInt();
        System.out.println("Ingrese frase");
        scanner.nextLine();
        this.frase = scanner.nextLine();
        System.out.println("La nota tiene Hora?");
        int Respuesta = scanner.nextInt();
        if(Respuesta == 1){
            int HoraAlarma = scanner.nextInt();
            NotaAlarma notaConAlarma = new NotaAlarma(id, frase,HoraAlarma);
            return notaConAlarma;
        }
        else{
            return new Nota(this.id,this.frase);
            
        }
    }    
    
    
}
