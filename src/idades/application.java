package idades;
import java.util.Locale;
import java.util.Scanner;

public class application {

	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("en", "US"));
		
		Scanner input = new Scanner(System.in);
		
		int num, soma = 0, quant = 0;
		
		
		do {
			
			num = input.nextInt();
			
			if(num < 0) {
				
				break;
				
			} else {

				soma += num;
				quant += 1;
				
			}
			
		} while(num >= 0);
		
		double media = (double)soma/quant;
		
		System.out.printf("%.2f", media);
		
		input.close();

	}

}
