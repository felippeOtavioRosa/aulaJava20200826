/*
Crie uma calculadora de IMC que leia o peso do usuário em kg 
e altura em metros e calcule e exiba o índice de massa 
corporal dele, Além disso, exiba as informações sobre IMC:

IMC = peso/(altura * altura)

Valores de IMC:
Abaixo do peso: menor que 18.5
Normal: entre 18.5 e 24.9
Sobrepeso: entre 25 e 29.9
Obeso: 30 ou maior
*/

import java.util.Scanner;

public class Imc {
	public static void main (String[] args){
		double altura;
		double peso;
		double imc;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe sua altura em metros: ");
		altura = entrada.nextDouble();
		
		System.out.print("Informe seu peso em kg: ");
		peso = entrada.nextDouble();
		
		entrada.close();
		
		imc=peso/(altura * altura);
		
		System.out.printf("Altura: %.2f",altura);
		System.out.printf("Peso: %.2f",peso);
		System.out.printf("IMC: %.2f",imc);
		
		if(imc >= 30){
			System.out.printf("Você está obeso!");
		}else if(imc >= 25 ){
			System.out.printf("Você está com sobrepeso!");
		}else if(imc >= 18.5 ){
			System.out.printf("Você está com o peso normal!");
		}else{
			System.out.println("Você está a baixo do peso!");
		}
	}
}
