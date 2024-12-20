package com.mslc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThrows;

import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

public class TestRecomendarProducto {	
	
	// Clientes con los valores de prueba de la decisión 1
	private Cliente c1Decision1;
	private Cliente c2Decision1;
	private Cliente c3Decision1;
	private Cliente c4Decision1;
	
	// Clientes con los valores de prueba de la decisión 2
	private Cliente c1Decision2;
	private Cliente c2Decision2;
	private Cliente c3Decision2;
	private Cliente c4Decision2;
	
	// Clientes con los valores de prueba de la decisión 3
	private Cliente c1Decision3;
	private Cliente c2Decision3;
	private Cliente c3Decision3;
	private Cliente c4Decision3;
	
	// Clientes con los valores de prueba de la decisión 4
	private Cliente c1Decision4;
	private Cliente c2Decision4;
	private Cliente c3Decision4;
	private Cliente c4Decision4;
	
	// Clientes con los valores de prueba de la decisión 5
	private Cliente c1Decision5;
	private Cliente c2Decision5;
	private Cliente c3Decision5;
	private Cliente c4Decision5;
	
	// Clientes con los valores de prueba de la decisión 6
	private Cliente c1Decision6;
	private Cliente c2Decision6;
	private Cliente c3Decision6;
	private Cliente c4Decision6;
	
	private Cliente clienteInvalido;
	
	@Before
	public void setUp() throws Exception {
		// Decisión 1
		c1Decision1 = new Cliente(21, false, true, true);
		c2Decision1 = new Cliente(15, false, false, true);
		c3Decision1 = new Cliente(15, true, false, true);
		c4Decision1 = new Cliente(15, true, true, true);
		
		//Decision 2
		c1Decision2 = new Cliente(28, false, false, false);
		c2Decision2 = new Cliente(21, false, true, true);
		c3Decision2 = new Cliente(15, true, true, true);
		c4Decision2 = new Cliente(21, true, false, false);
		
		//Decision 3
		c1Decision3 = new Cliente(34, false, true, true);
		c2Decision3 = new Cliente(21, false, true, false);
		c3Decision3 = new Cliente(21, true, false, false);
		c4Decision3 = new Cliente(21, true, true, true);
		
		//Decision 4
		c1Decision4 = new Cliente(34, false, true, false);
		c2Decision4 = new Cliente(21, false, true, false);
		c3Decision4 = new Cliente(21, true, true, true);
		c4Decision4 = new Cliente(21, false, false, true);
		
		//Decision 5
        c1Decision5 = new Cliente(15, false, true, false);
        c2Decision5 = new Cliente(18, false, false, false);
        c3Decision5 = new Cliente(34, true, false, true);
        c4Decision5 = new Cliente(28, true, true, true);

        //Decision 6
        c1Decision6 = new Cliente(21, false, false, false);
        c2Decision6 = new Cliente(34, false, true, false);
        c3Decision6 = new Cliente(28, true, true, true);
        c4Decision6 = new Cliente(34, true, false, true);
        
        //Cliente invalido
        clienteInvalido = new Cliente(99, false, false, false);
	}
	
	@Test
	public void testDeterminarProducto1Decision() {
		assertNotEquals(RecomendarProducto.determinarProducto(c1Decision1), "Cuenta Confort");
		assertNotEquals(RecomendarProducto.determinarProducto(c2Decision1), "Cuenta Confort");
		assertNotEquals(RecomendarProducto.determinarProducto(c3Decision1), "Cuenta Confort");
		assertEquals(RecomendarProducto.determinarProducto(c4Decision1), "Cuenta Confort");
	}
	
	@Test
	public void testDeterminarProducto2Decision() {
		assertNotEquals(RecomendarProducto.determinarProducto(c1Decision2), "Cuenta Vamos que tú puedes");
		assertNotEquals(RecomendarProducto.determinarProducto(c2Decision2), "Cuenta Vamos que tú puedes");
		assertNotEquals(RecomendarProducto.determinarProducto(c3Decision2), "Cuenta Vamos que tú puedes");
		assertEquals(RecomendarProducto.determinarProducto(c4Decision2), "Cuenta Vamos que tú puedes");
	}
	
	@Test
	public void testDeterminarProducto3Decision() {
		assertNotEquals(RecomendarProducto.determinarProducto(c1Decision3), "Cuenta Ahorra ahora que puedes");
		assertNotEquals(RecomendarProducto.determinarProducto(c2Decision3), "Cuenta Ahorra ahora que puedes");
		assertNotEquals(RecomendarProducto.determinarProducto(c3Decision3), "Cuenta Ahorra ahora que puedes");
		assertEquals(RecomendarProducto.determinarProducto(c4Decision3), "Cuenta Ahorra ahora que puedes");
	}
		
	@Test
	public void testDeterminarProducto4Decision() {
		assertNotEquals(RecomendarProducto.determinarProducto(c1Decision4), "Cuenta Saltando del Nido");
		assertNotEquals(RecomendarProducto.determinarProducto(c2Decision4), "Cuenta Saltando del Nido");
		assertNotEquals(RecomendarProducto.determinarProducto(c3Decision4), "Cuenta Saltando del Nido");
		assertEquals(RecomendarProducto.determinarProducto(c4Decision4), "Cuenta Saltando del Nido");
	}
	
	@Test
	public void testDeterminarProducto5Decision() {
		assertNotEquals(RecomendarProducto.determinarProducto(c1Decision5), "Cuenta Independízate que va siendo hora");
		assertNotEquals(RecomendarProducto.determinarProducto(c2Decision5), "Cuenta Independízate que va siendo hora");
		assertNotEquals(RecomendarProducto.determinarProducto(c3Decision5), "Cuenta Independízate que va siendo hora");
		assertEquals(RecomendarProducto.determinarProducto(c4Decision5), "Cuenta Independízate que va siendo hora");
	}
	
	@Test
	public void testDeterminarProducto6Decision() {
		assertNotEquals(RecomendarProducto.determinarProducto(c1Decision6), "Cuenta Bienvenido a la Vida Adulta");
		assertNotEquals(RecomendarProducto.determinarProducto(c2Decision6), "Cuenta Bienvenido a la Vida Adulta");
		assertNotEquals(RecomendarProducto.determinarProducto(c3Decision6), "Cuenta Bienvenido a la Vida Adulta");
		assertEquals(RecomendarProducto.determinarProducto(c4Decision6), "Cuenta Bienvenido a la Vida Adulta");
	}
	
	@Test
	public void testDeterminarProductoClienteInvalido() {
		assertEquals(RecomendarProducto.determinarProducto(clienteInvalido), "No se encontró un producto adecuado");
	}
	
    @Test
    public void testLeerBooleanoValidoYes() {
        boolean result = RecomendarProducto.leerBooleano("yes");
        assertEquals(true, result);
    }

    @Test
    public void testLeerBooleanoValidoNo() {
        boolean result = RecomendarProducto.leerBooleano("no");
        assertEquals(false, result);
    }

    @Test
    public void testLeerBooleanoInvalido() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            RecomendarProducto.leerBooleano("maybe");
        });
        assertEquals("Entrada inválida. Debes ingresar 'yes' o 'no'.", exception.getMessage());
    }

    @Test
    public void testLeerBooleanoCaseInsensitiveYes() {
        boolean result = RecomendarProducto.leerBooleano("YES");
        assertEquals(true, result);
    }

    @Test
    public void testLeerBooleanoCaseInsensitiveNo() {
        boolean result = RecomendarProducto.leerBooleano("No");
        assertEquals(false, result);
    }
    
    @Test
    public void testCapturarDatosClienteValido() {
        String input = "25\nyes\nno\nyes\n";
        Scanner scanner = new Scanner(input);
        Cliente cliente = RecomendarProducto.capturarDatosCliente(scanner);

        assertEquals(25, cliente.getEdad());
        assertEquals(true, cliente.getEstudiando());
        assertEquals(false, cliente.getVive_con_padres());
        assertEquals(true, cliente.getTrabaja());
    }

    @Test
    public void testCapturarDatosClienteEntradaInvalidaBooleano() {
        String input = "25\nmaybe\nyes\nno\n";
        Scanner scanner = new Scanner(input);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            RecomendarProducto.capturarDatosCliente(scanner);
        });
        assertEquals("Entrada inválida. Debes ingresar 'yes' o 'no'.", exception.getMessage());
    }

    @Test
    public void testCapturarDatosClienteSecuenciaCompleta() {
        String input = "18\nyes\nno\nno\n";
        Scanner scanner = new Scanner(input);
        Cliente cliente = RecomendarProducto.capturarDatosCliente(scanner);

        assertEquals(18, cliente.getEdad());
        assertEquals(true, cliente.getEstudiando());
        assertEquals(false, cliente.getVive_con_padres());
        assertEquals(false, cliente.getTrabaja());
    }

}

