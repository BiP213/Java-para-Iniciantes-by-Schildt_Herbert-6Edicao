package edu.feliphe.exercicios;
import java.util.Scanner;

/*
Tente Isto 1-1
Este programa converte galões em litros solicitando inputs do usuário.
*/

public class GalToLit {
    public static void main(String[] args) {
        int i;
        do {
            double litros; // armazena a conversão para litros

            Scanner objGaloes = new Scanner(System.in);
            System.out.print("Digite o número de galões a ser convertido: ");
            double galoes = objGaloes.nextDouble(); // números de galões

            litros = galoes * 3.7854; // converte para litros
            System.out.println(galoes + " galões são equivalentes a " + litros + " litros.");
            Scanner objControle = new Scanner(System.in);
            System.out.println("Deseja realizar outra conversão?");
            System.out.println("Digite '0' para finalizar o programa ou outro número para continuar: ");
            i = objControle.nextShort(); // menor alocação de memória que int, de 0 a 255

        } while (i != 0);
    }
}