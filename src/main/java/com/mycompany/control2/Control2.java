/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.control2;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;

/**
 *
 * @author jdelr
 */
public class Control2 {

    public static void main(String[] args) throws ParseException {
        Inicio inicio = new Inicio();
        inicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inicio.setVisible(true);
        System.out.println("Ingrese numero de notas");
        Scanner scanner = new Scanner(System.in);
        int NumNotas = scanner.nextInt();
        ArrayList<Nota> ListaNotas = new ArrayList<Nota>();
        for(int i = 0 ; i<NumNotas;i++)
        {
            Nota nota = new Nota();
            ListaNotas.add(nota.crearNota());
        }
    }
}
