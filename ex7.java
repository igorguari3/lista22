/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cas;

import java.util.Scanner;

public class ex7 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float[] n = new float[5];
		float aux = 0;
		for (int i = 0; i < n.length; i++) {
			System.out.println("Digite o " + (i + 1) + "º número:");
			n[i] = ler.nextFloat();
		}
		for (int i = 0; i < n.length; i++) {
			for (int j = i + 1; j < n.length; j++) {
				if (n[j] > n[i] && n[j] > aux) {
					aux = n[j];
				} else if (n[i] > n[j] && n[i] > aux) {
					aux = n[i];
				}
			}
		}
		System.out.println(aux);
	}
}