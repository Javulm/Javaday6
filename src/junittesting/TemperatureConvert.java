package junittesting;

import java.util.Scanner;  //import scanner class

class utilityTemperatureConvert {

    Scanner sc = new Scanner(System.in); //create object for scanner class

    public utilityTemperatureConvert() {

        System.out.println("Welcome to temperature conversion .");
        System.out.println("For Degree Celsius to Fahrenheit Enter 1 ");
        System.out.println("For Fahrenheit to Degree Celsius Enter 2 ");
        System.out.print("Enter conversion you want : ");

        int conv = sc.nextInt();

        if (conv == 1){
            System.out.print("Enter temperature in degree celsius: ");
            double temp = sc.nextDouble();
            double fer = temp*(9/5f)+32;
            System.out.print("Temperature is :  " + fer +" Fahrenheit");

        }
        else {
            System.out.print("Enter temperature in Fahrenheit :  ");
            double temp = sc.nextDouble();
            double degCel = (temp-32)*(5/9f);
            System.out.print("Temperature is :  " + degCel +" Degree Celsius");

        }
    }
}

public class TemperatureConvert {
    public static void main(String[] args) {
        utilityTemperatureConvert temp = new utilityTemperatureConvert();

    }
}
