import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Conversor{
    
    public static void main(String[] args) {
        
        Object[] options = {"Convertir divisas", "Convertir temperatura", "Salir"};
        int opcion = JOptionPane.showOptionDialog(null, "¿Qué operacion deseea realizar?", "Conversor", 
        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

            if(opcion == 2){
                JOptionPane.showMessageDialog(null, "Programa cerrado");
                System.exit(0);
            }

            if(opcion == 0){
                DecimalFormat nuevaDivisa = new DecimalFormat("#.##");
                boolean continuarPrograma = true;

                while(continuarPrograma){
                    String[] opciones = {"Pesos a Euros", "Pesos a Dolar", "Pesos a Libras Esterlinas", "Pesos a Yen Japones", "Pesos a Won Surcoreano", "Pesos a Rublo Ruso"};
                    String conversion = (String) JOptionPane.showInputDialog(null, "Elija un opcion", "Conversor de Divisa", 
                    JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

                    String input = JOptionPane.showInputDialog(null, "Ingrese una cantidad en Pesos Mexicanos:");
                    double pesos=1;
                    try {
                        pesos = Double.parseDouble(input);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Valor no valido");
                    }

                    if(conversion.equals("Pesos a Euros")){
                        double euros = pesos * 0.055;
                        JOptionPane.showMessageDialog(null, pesos + "pesos mexicanos son: " + nuevaDivisa.format (euros) + "Euros.");
                    } else if(conversion.equals("Pesos a Dolar")){
                        double dolares = pesos * 0.058;
                        JOptionPane.showMessageDialog(null, pesos + "pesos mexicanos son: " + nuevaDivisa.format (dolares) + "Dolares.");
                     } else if(conversion.equals("Pesos a Libras Esterlinas")){
                        double librasEsterlinas = pesos * 0.047;
                        JOptionPane.showMessageDialog(null, pesos + "pesos mexicanos son: " + nuevaDivisa.format (librasEsterlinas) + "Libras Esterlinas.");
                     } else if(conversion.equals("Pesos a Yen Japones")){
                        double yenJapones = pesos * 8.60;
                        JOptionPane.showMessageDialog(null, pesos + "pesos mexicanos son: " + nuevaDivisa.format (yenJapones) + "Yenes.");
                     } else if(conversion.equals("Pesos a Won Surcoreano")){
                        double wonCorea = pesos * 77.41;
                        JOptionPane.showMessageDialog(null, pesos + "pesos mexicanos son: " + nuevaDivisa.format (wonCorea) + "Wones.");
                     } else if(conversion.equals("Pesos a Rublo Ruso")){
                        double rubloRuso = pesos * 5.61;
                        JOptionPane.showMessageDialog(null, pesos + "pesos mexicanos son: " + nuevaDivisa.format (rubloRuso) + "Rublos.");
                     }

                     int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea continuar usando el programa?", "Confirmar", 
                     JOptionPane.YES_NO_CANCEL_OPTION);
                            if(confirmar == JOptionPane.NO_OPTION || confirmar== JOptionPane.CANCEL_OPTION){
                                continuarPrograma = false;
                                JOptionPane.showMessageDialog(null, "Programa finalizado");
                            }
             }
         }
   
            if(opcion == 1){
                DecimalFormat nuevaTemperatura = new DecimalFormat("#.##");
                boolean programaTemp = true;

                while(programaTemp){
                    String[] opciones = {"De Celsius a Fahrenheit", "De Celsius a Kelvin", "De Kelvin Celsius", "De Kelvin a Fahrenheit", "De Fahrenheit a Celsius", "De Fahrenheit a Kelvin"};
                    String conversion = (String) JOptionPane.showInputDialog(null, "Eliga una opción", "Consersor de Temperatura",
                    JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

                    String input = JOptionPane.showInputDialog(null, "Ingrese los grados que desee convertir");
                    double tempConversion = 1;

                    try {
                        tempConversion = Double.parseDouble(input);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Valor no valido");
                    }

                    if(conversion.equals("De Celsius a Fahrenheit")){
                        double fahrenheit = (tempConversion * 9/5) + 32;
                        JOptionPane.showMessageDialog(null, tempConversion + " grados Celsius son: " + fahrenheit + " grados Fahrentheit");
                    }

                    if(conversion.equals("De Celsius a Kelvin")){
                        double kelvin = tempConversion + 273.15;
                        JOptionPane.showMessageDialog(null, tempConversion + " grados Celsius son: " + kelvin + " Kelvin");
                    }

                    if(conversion.equals("De Kelvin Celsius")){
                        double celsius = tempConversion - 273.15;
                        JOptionPane.showMessageDialog(null, tempConversion + " Kelvin son: " + celsius + " grados Celsius");
                    }

                    if(conversion.equals("De Kelvin a Fahrenheit")){
                        double kelvinFahren = (tempConversion - 273.15) * 9/5 + 32;
                        JOptionPane.showMessageDialog(null, tempConversion + " Kelvin son: " + kelvinFahren + " grados Fahrentheit");
                    }

                    if(conversion.equals("De Fahrenheit a Celsius")){
                        double fahrenheitCel = (tempConversion - 32) * 5/9;
                        JOptionPane.showMessageDialog(null, tempConversion + " grados Fahrenheit son: " + fahrenheitCel + " grados Celsius");
                    }

                    if(conversion.equals("De Fahrenheit a Kelvin")){
                        double fahrenheitKel = (tempConversion - 32) * 5/9 + 273.15;
                        JOptionPane.showMessageDialog(null, tempConversion + " grados Fahrenheit son: " + fahrenheitKel + " Kelvin");
                    }

                    int continuarGrados = JOptionPane.showConfirmDialog(null, "¿Desea coninuar usando el programa?", "Confirmar",
                    JOptionPane.YES_NO_CANCEL_OPTION);

                    if(continuarGrados == JOptionPane.NO_OPTION || continuarGrados == JOptionPane.CANCEL_OPTION){
                        programaTemp = false;
                        JOptionPane.showMessageDialog(null, "Programa finalizado");
                    }

                }
            }
     }

}