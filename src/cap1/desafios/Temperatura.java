package cap1.desafios;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        final int AJUSTE =  32;
        double tempFahrenheit, tempCelsius;

        System.out.println("Informe uma temperatura em Fahrenheit: ");
        tempFahrenheit = scan.nextDouble();

        tempCelsius = (tempFahrenheit - AJUSTE) / 1.8;

        System.out.printf("A temperatura em celsius é %s º C %n", tempCelsius);
    }
}
