package com.mslc;

public class RecomendarProducto {

    public static String determinarProducto(Cliente cliente) {
        int edad = cliente.getEdad();
        boolean estudiando = cliente.getEstudiando();
        boolean viveConPadres = cliente.getVive_con_padres();
        boolean trabaja = cliente.getTrabaja();

        if (edad < 18 && estudiando && viveConPadres) {
            return "Cuenta Confort";
        } else if (edad < 25 && estudiando && !viveConPadres) {
            return "Cuenta Vamos que tu puedes";
        } else if (edad >= 18 && edad <= 25 && trabaja && viveConPadres) {
            return "Cuenta Ahorra ahora que puedes";
        } else if (edad >= 18 && edad <= 25 && trabaja && !viveConPadres) {
            return "Cuenta Saltando del Nido";
        } else if (edad > 25 && trabaja && viveConPadres) {
            return "Cuenta Independizate que va siendo hora";
        } else if (edad > 25 && trabaja && !viveConPadres) {
            return "Cuenta Bienvenido a la Vida Adulta";
        } else {
            return "No se encontro un producto adecuado";
        }
    }
}