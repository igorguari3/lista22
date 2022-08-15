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
public class ex1 {
    public static void main(String[] args) {
        float n1, n2, n3, soma;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o primero valor: ");
        n1 = sc.nextFloat();
        
        System.out.println("Digite o segundo valor: ");
        n2 = sc.nextFloat();
        
        System.out.println("Digite o terceiro valor: ");
        n3 = sc.nextFloat();
        
        soma = n2 + n3;
        
        if(n1 > soma){
            System.out.println("A soma dos dois ultimos valores é menor do que o primeiro valor.");
            
        }else{
            System.out.println("A soma dos dois ultimos valores é maior do que o primeiro valor");
        }
    }
}
