package com.mslc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class TestCliente {

    private Cliente clienteValido;

    @Before
    public void setUp() throws Exception {
        
        clienteValido = new Cliente(25, true, false, true);

    }

    @Test
    public void testConstructorValido() {
        assertEquals(25, clienteValido.getEdad());
        assertTrue(clienteValido.getEstudiando());
        assertEquals(false, clienteValido.getVive_con_padres());
        assertTrue(clienteValido.getTrabaja());
    }

    @Test
    public void testSetEdadValida() {
        clienteValido.setEdad(30);
        assertEquals(30, clienteValido.getEdad());
    }

    @Test
    public void testSetEdadInvalida() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            clienteValido.setEdad(150);
        });
        assertEquals("La edad debe ser un número positivo mayor que cero y menor o igual a 99.", exception.getMessage());
    }

    @Test
    public void testSetEstudiandoValido() {
        clienteValido.setEstudiando(false);
        assertEquals(false, clienteValido.getEstudiando());
    }

    @Test
    public void testSetEstudiandoNulo() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            clienteValido.setEstudiando(null);
        });
        assertEquals("El valor de 'estudiando' no puede ser nulo.", exception.getMessage());
    }

    @Test
    public void testSetViveConPadresValido() {
        clienteValido.setViveConPadres(true);
        assertEquals(true, clienteValido.getVive_con_padres());
    }

    @Test
    public void testSetViveConPadresNulo() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            clienteValido.setViveConPadres(null);
        });
        assertEquals("El valor de 'vive_con_padres' no puede ser nulo.", exception.getMessage());
    }

    @Test
    public void testSetTrabajaValido() {
        clienteValido.setTrabaja(false);
        assertEquals(false, clienteValido.getTrabaja());
    }

    @Test
    public void testSetTrabajaNulo() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            clienteValido.setTrabaja(null);
        });
        assertEquals("El valor de 'trabaja' no puede ser nulo.", exception.getMessage());
    }
}