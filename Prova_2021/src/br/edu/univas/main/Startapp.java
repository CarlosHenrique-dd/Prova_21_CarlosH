package br.edu.univas.main;

import java.util.Scanner;

import br.edu.univas.vo.Carro;
import br.edu.univas.vo.Competidor;
import br.edu.univas.vo.Moto;
import br.edu.univas.vo.Motor;
import br.edu.univas.vo.Veiculo;

public class Startapp {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[]args) {
		
		for(int i = 0;i<10;i++) {
			
			System.out.println(("\n")+"Rodada "+ (i+1)+("\n"));
			
			int ace1 = (int) Math.floor(Math.random() * 16) + 5  ;
			System.out.println("piloto 1 "+ace1);
			int ace2 = (int) Math.floor(Math.random() * 16) + 5  ;
			System.out.println("piloto 2 "+ace2);
			int ace3 = (int) Math.floor(Math.random() * 16) + 5  ;
			System.out.println("piloto 3 "+ace3);
			int ace4 = (int) Math.floor(Math.random() * 16) + 5  ;
			System.out.println("piloto 4 "+ace4);
			int ace5 = (int) Math.floor(Math.random() * 16) + 5  ;
			System.out.println("piloto 5 "+ace5);
			
		}
		
		
	}

}
