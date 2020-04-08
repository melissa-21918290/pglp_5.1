package pglp_5.exo5_1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NumeroTelTest {
	NumeroTel numero;
	
	@Before
	public void SetUp(){
		numero = new NumeroTel("portable","0698552310");
	}
	
	@Test
	public void getDescriptif(){
		String Type ="portable";
		assertEquals(Type,numero.getDescriptif());
	}
	@Test
	public void getNumeroTest(){
		NumeroTel numero = new NumeroTel("portable","0698552310");
		String num ="0698552310";
		assertEquals(num, numero.getNumero());
	}
}
