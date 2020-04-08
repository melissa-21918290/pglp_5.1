package pglp_5.exo5_1;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

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
	
	private Object deserialize(final byte[] bytes) throws ClassNotFoundException, IOException {
        ByteArrayInputStream a = new ByteArrayInputStream(bytes);
        ObjectInputStream b = new ObjectInputStream(a);
        return b.readObject();
        }
	
	private byte[] serialize(final Object obj)throws IOException{
		
		 ByteArrayOutputStream a= new ByteArrayOutputStream(); 
		ObjectOutputStream b = new ObjectOutputStream(a);
		b.writeObject(obj);
		return a.toByteArray();
		
	}
	
	@Test
    public void serialisableTest() throws IOException, ClassNotFoundException {
        byte[] serialisable = serialize(numero);
        byte[] serialisable2= serialize(numero);

        Object deserialisable = deserialize(serialisable);
        Object deserialisable2 = deserialize(serialisable2);
        Assert.assertEquals(deserialisable, deserialisable2);
        Assert.assertEquals(numero, deserialisable);
        Assert.assertEquals(numero, deserialisable2);
    }
	
}
