/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s07ejercicico02;

import java.util.Scanner;



/**
 *
 * @author alumno
 */
public class S07ejercicico02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
      final double METROS_POR_PIES=0.305;
        System.out.println("INGRESE UN VALORN EN PIES : ");
        double feet=input.nextDouble();
        double meters=feet*METROS_POR_PIES;
        System.out.println(feet +" pies son " + meters + "en metros.");
    }
      
    }
    

