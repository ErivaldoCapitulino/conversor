package conversor;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        CurrencyConverter currencyConverter = new CurrencyConverter();
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        
        while (true) {
            String[] options = {"Converter moeda", "Converter temperatura", "Sair"};
            int choice = JOptionPane.showOptionDialog(
                null,
                "Escolha uma opção:",
                "Conversor",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                options,
                options[0]
            );
            
            if (choice == 0) {
                String[] currencyOptions = {
                    "Reais para Dólar",
                    "Dólar para Reais",
                };
                
                int currencyChoice = JOptionPane.showOptionDialog(
                    null,
                    "Escolha uma opção de conversão de moeda:",
                    "Conversão de Moeda",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    currencyOptions,
                    currencyOptions[0]
                );
                
                if (currencyChoice == 0) {
                    String amountInReaisStr = JOptionPane.showInputDialog("Digite o valor em Reais:");
                    double amountInReais = Double.parseDouble(amountInReaisStr);
                    double result = currencyConverter.convertReaisToDollar(amountInReais);
                    JOptionPane.showMessageDialog(null, "Valor em Dólar: $" + result);
                } else if (currencyChoice == 1) {
                    String amountInDollarStr = JOptionPane.showInputDialog("Digite o valor em Dólar:");
                    double amountInDollar = Double.parseDouble(amountInDollarStr);
                    double result = currencyConverter.convertDollarToReais(amountInDollar);
                    JOptionPane.showMessageDialog(null, "Valor em Reais: R$" + result);
                }
                
            } else if (choice == 1) { // Converter temperatura
                String[] tempOptions = {
                    "Celsius para Fahrenheit",
                    "Fahrenheit para Celsius",
                    // Adicione outras opções de conversão de temperatura aqui
                };
                
                int tempChoice = JOptionPane.showOptionDialog(
                    null,
                    "Escolha uma opção de conversão de temperatura:",
                    "Conversão de Temperatura",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    tempOptions,
                    tempOptions[0]
                );
                
                if (tempChoice == 0) { // Celsius para Fahrenheit
                    String celsiusStr = JOptionPane.showInputDialog("Digite a temperatura em Celsius:");
                    double celsius = Double.parseDouble(celsiusStr);
                    double result = temperatureConverter.celsiusToFahrenheit(celsius);
                    JOptionPane.showMessageDialog(null, "Temperatura em Fahrenheit: " + result + " °F");
                } else if (tempChoice == 1) { // Fahrenheit para Celsius
                    String fahrenheitStr = JOptionPane.showInputDialog("Digite a temperatura em Fahrenheit:");
                    double fahrenheit = Double.parseDouble(fahrenheitStr);
                    double result = temperatureConverter.fahrenheitToCelsius(fahrenheit);
                    JOptionPane.showMessageDialog(null, "Temperatura em Celsius: " + result + " °C");
                }
                // Adicione outras opções de conversão de temperatura aqui
                
            } else if (choice == 2) { // Sair
                JOptionPane.showMessageDialog(null, "Saindo do programa.");
                break;
            }
        }
    }
}
