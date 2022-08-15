/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cas;

import java.util.Scanner;

/**
 *
 * @author Igor
 */
public class ex2 {
    public static void main(String[] args) {
        float vCarro, vMaxima, multa;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe a velocidade do carro: ");
        vCarro = sc.nextFloat();
        
        System.out.println("Informe a velocidade máxima da rua: ");
        vMaxima = sc.nextFloat();
        
        if(vCarro >= (vMaxima + 1) && vCarro <= (vMaxima + 10)){
            multa = 50;
            System.out.println("Multa: "+ multa +" reais");
        }else if(vCarro >= (vMaxima + 11) && vCarro <= (vMaxima + 30)){
            multa = 100;
            System.out.println("Multa: "+ multa +" reais");
        }else if(vCarro > (vMaxima + 31)){
            multa = 300;
            System.out.println("Multa: "+ multa +" reais");
        }
    }
}
