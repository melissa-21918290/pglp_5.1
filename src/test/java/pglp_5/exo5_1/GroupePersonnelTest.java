package pglp_5.exo5_1;
import static org.junit.Assert.assertEquals;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test; 

public class GroupePersonnelTest {

	GroupePersonnel G,G2, G3;
	
	@Before
	public void SetUp(){
		G= new GroupePersonnel("groupe personnel");
		G2 = new GroupePersonnel("groupe personnel n2");
		G3 = new GroupePersonnel("groupe personnel n3");
	}
	
	@Test
	public void addTest(){
		G.add(G3);
		assertEquals(G.getList().get(0),G3);
		
	}
	
	   @Test
	    public void removeTest() {
	        G.add(G2);
	        G.add(G3);
	        G.remove(G2);
	        assertEquals(G.getList().get(0), G3);
	    }
	
	
	   private Object deserialize(final byte[] bytes) throws ClassNotFoundException, IOException {
	        ByteArrayInputStream a = new ByteArrayInputStream(bytes);
	        ObjectInputStream b = new ObjectInputStream(a);
	        return b.readObject();
	    }
	   
	   private byte[] serialize(final Object obj) throws IOException {
	        ByteArrayOutputStream a = new ByteArrayOutputStream();
	        ObjectOutputStream b = new ObjectOutputStream(a);
	        b.writeObject(obj);
	        return a.toByteArray();
	    }
	   
	   @Test
	    public void serialisableTest() throws IOException, ClassNotFoundException {
	        byte[] serialisable = serialize(G);
	        byte[] serialisable2= serialize(G);

	        Object deserialisable = deserialize(serialisable);
	        Object deserialisable2 = deserialize(serialisable2);
	        Assert.assertEquals(deserialisable, deserialisable2);
	        Assert.assertEquals(G, deserialisable);
	        Assert.assertEquals(G, deserialisable2);
	    }
	   
	
}
