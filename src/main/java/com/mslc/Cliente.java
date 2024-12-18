package com.mslc;


public class Cliente {
    
    public static final int MAX_EDAD = 99;

    private Boolean estudiando;
    private Boolean vive_con_padres;
    private Boolean trabaja; 
    private int edad;

    
    public Cliente(int edad, Boolean estudiando, Boolean vive_con_padres, Boolean trabaja) {
        try {
            this.setEdad(edad);
            this.setEstudiando(estudiando);
            this.setViveConPadres(vive_con_padres);
            this.setTrabaja(trabaja); 
        } catch (IllegalArgumentException e) {
            System.err.println("Error al establecer un valor: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Ocurrió un error inesperado: " + e.getMessage());
        }
    }

    // Getters y setters
    public Boolean getVive_con_padres() {
        return vive_con_padres;
    }

    public Boolean getEstudiando() {
        return estudiando;
    }

    public Boolean getTrabaja() {
        return trabaja;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0 && edad <= MAX_EDAD) {
            this.edad = edad;
        } else {
            throw new IllegalArgumentException("La edad debe ser un número positivo mayor que cero y menor o igual a " + MAX_EDAD + ".");
        }
    }

    public void setEstudiando(Boolean estudiando) {
        if (estudiando != null) {
            this.estudiando = estudiando;
        } else {
            throw new IllegalArgumentException("El valor de 'estudiando' no puede ser nulo.");
        }
    }

    public void setViveConPadres(Boolean vive_con_padres) {
        if (vive_con_padres != null) {
            this.vive_con_padres = vive_con_padres;
        } else {
            throw new IllegalArgumentException("El valor de 'vive_con_padres' no puede ser nulo.");
        }
    }

    public void setTrabaja(Boolean trabaja) {
        if (trabaja != null) {
            this.trabaja = trabaja;
        } else {
            throw new IllegalArgumentException("El valor de 'trabaja' no puede ser nulo.");
        }
    }
}