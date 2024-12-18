package com.mslc;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            Cliente cliente = RecomendarProducto.capturarDatosCliente(scanner);
            String producto = RecomendarProducto.determinarProducto(cliente);
            System.out.println("El producto recomendado para el cliente es: " + producto);

        } catch (IllegalArgumentException e) {
            System.err.println("Error en los datos del cliente: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Ocurrió un error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    
}