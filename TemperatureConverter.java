import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature value: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter original unit (C for Celsius, F for Fahrenheit, K for Kelvin): ");
        char unit = scanner.next().charAt(0);

        switch (unit) {
            case 'C':
            case 'c':
                convertFromCelsius(temperature);
                break;
            case 'F':
            case 'f':
                convertFromFahrenheit(temperature);
                break;
            case 'K':
            case 'k':
                convertFromKelvin(temperature);
                break;
            default:
                System.out.println("Invalid unit. Please enter C, F, or K.");
        }

        scanner.close();
    }

    public static void convertFromCelsius(double celsius) {
        double fahrenheit = (celsius * 9/5) + 32;
        double kelvin = celsius + 273.15;

        System.out.printf("%.2f degrees Celsius is %.2f degrees Fahrenheit and %.2f Kelvin.%n", celsius, fahrenheit, kelvin);
    }

    public static void convertFromFahrenheit(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5/9;
        double kelvin = celsius + 273.15;

        System.out.printf("%.2f degrees Fahrenheit is %.2f degrees Celsius and %.2f Kelvin.%n", fahrenheit, celsius, kelvin);
    }

    public static void convertFromKelvin(double kelvin) {
        double celsius = kelvin - 273.15;
        double fahrenheit = (celsius * 9/5) + 32;

        System.out.printf("%.2f Kelvin is %.2f degrees Celsius and %.2f degrees Fahrenheit.%n", kelvin, celsius, fahrenheit);
    }
}
