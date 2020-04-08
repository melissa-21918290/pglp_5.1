package pglp_5.exo5_1;
import static org.junit.Assert.assertEquals;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pglp_5.exo5_1.Personnel.Builder;

public class PersonnelTest {
	Personnel secretaire;
	
	 @Before
	    public void setUp() {
	   
	        NumeroTel portable = new NumeroTel("portable","0651624519");
			Builder b = new Builder("bafdel","melissa", "secretaire", LocalDate.of(1995,10,11));
			b.numTelephones(portable);
			Personnel p = b.build();
			secretaire = p;
	        
	 }
	 
	 @Test
	 public void PersonnelConstTest(){
		 String desc ="portable";
		 String num ="0651624519";
		 String nom = "bafdel";
		 String prenom = "melissa";
		 String fonction ="secretaire";
		 LocalDate date = LocalDate.of(1995, 10, 11);
		 
		 assertEquals(desc,secretaire.getNumTelephones().get(0).getDescriptif());
	        assertEquals(num, secretaire.getNumTelephones().get(0).getNumero());
	        assertEquals(nom, secretaire.getNom());
	        assertEquals(prenom, secretaire.getPrenom());
	        assertEquals(fonction, secretaire.getFonction());
	        assertEquals(date, secretaire.getDateNaissance());

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
	        Personnel p = secretaire;
	        byte[] serialisable = serialize(p);
	        byte[] serialisable2 = serialize(p);

	        Object deserialisable = deserialize(serialisable);
	        Object deserialisable2 = deserialize(serialisable2);
	        
	        Assert.assertEquals(deserialisable, deserialisable2);
	        Assert.assertEquals(p, deserialisable);
	        Assert.assertEquals(p, deserialisable2);
	    }
	 
	 
	 }
	
	 
	 
	


