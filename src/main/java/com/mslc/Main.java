package com.mslc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            Cliente cliente = capturarDatosCliente(scanner);
            String producto = RecomendarProducto.determinarProducto(cliente);
            System.out.println("El producto recomendado para el cliente es: " + producto);

        } catch (InvalidBoolean e) {
            System.err.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("Error en los datos del cliente: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Ocurri� un error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static Cliente capturarDatosCliente(Scanner scanner) throws InvalidBoolean {
        System.out.print("Introduce la edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de l�nea

        System.out.print("�Est� estudiando? (yes/no): ");
        boolean estudiando = leerBooleano(scanner.nextLine());

        System.out.print("�Vive con sus padres? (yes/no): ");
        boolean viveConPadres = leerBooleano(scanner.nextLine());

        System.out.print("�Est� trabajando? (yes/no): ");
        boolean trabaja = leerBooleano(scanner.nextLine());

        return new Cliente(edad, estudiando, viveConPadres, trabaja);
    }

    public static boolean leerBooleano(String entrada) throws InvalidBoolean {
        if ("yes".equalsIgnoreCase(entrada)) {
            return true;
        } else if ("no".equalsIgnoreCase(entrada)) {
            return false;
        } else {
            throw new InvalidBoolean("Entrada inv�lida. Debes ingresar 'yes' o 'no'.");
        }
    }
}