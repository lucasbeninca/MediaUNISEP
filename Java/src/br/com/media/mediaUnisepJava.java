package br.com.media;

import java.util.Scanner;

public class mediaUnisepJava {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double g1, g2, media;
		
		System.out.println("informe a media de G1: ");
		g1 = ler.nextDouble();
		
		System.out.println("informe a media de G2: ");
		g2 = ler.nextDouble();
		
		media = (g1 + ( g2 * 2 )) / 3;

		System.out.println("a media de G1 e G2 e: " + media);		

	}

}
