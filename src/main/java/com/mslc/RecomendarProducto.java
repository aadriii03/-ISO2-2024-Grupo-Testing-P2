package com.mslc;


import java.util.Scanner;

public class RecomendarProducto {

    
	public static Cliente capturarDatosCliente(Scanner scanner) throws IllegalArgumentException {
        System.out.print("Introduce la edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        System.out.print("¿Está estudiando? (yes/no): ");
        boolean estudiando = leerBooleano(scanner.nextLine());

        System.out.print("¿Vive con sus padres? (yes/no): ");
        boolean viveConPadres = leerBooleano(scanner.nextLine());

        System.out.print("¿Está trabajando? (yes/no): ");
        boolean trabaja = leerBooleano(scanner.nextLine());

        return new Cliente(edad, estudiando, viveConPadres, trabaja);
    }

    public static boolean leerBooleano(String entrada) throws IllegalArgumentException {
        if ("yes".equalsIgnoreCase(entrada)) {
            return true;
        } else if ("no".equalsIgnoreCase(entrada)) {
            return false;
        } else {
            throw new IllegalArgumentException("Entrada inválida. Debes ingresar 'yes' o 'no'.");
        }
    }
    
	public static String determinarProducto(Cliente cliente) {
        int edad = cliente.getEdad();
        boolean estudiando = cliente.getEstudiando();
        boolean viveConPadres = cliente.getVive_con_padres();
        boolean trabaja = cliente.getTrabaja();

        if (edad < 18 && estudiando && viveConPadres) {
            return "Cuenta Confort";
        } else if (edad < 25 && estudiando && !viveConPadres) {
            return "Cuenta Vamos que tú puedes";
        } else if (edad >= 18 && edad <= 25 && trabaja && viveConPadres) {
            return "Cuenta Ahorra ahora que puedes";
        } else if (edad >= 18 && edad <= 25 && trabaja && !viveConPadres) {
            return "Cuenta Saltando del Nido";
        } else if (edad > 25 && trabaja && viveConPadres) {
            return "Cuenta Independízate que va siendo hora";
        } else if (edad > 25 && trabaja && !viveConPadres) {
            return "Cuenta Bienvenido a la Vida Adulta";
        } else {
            return "No se encontró un producto adecuado";
        }
    }
}
