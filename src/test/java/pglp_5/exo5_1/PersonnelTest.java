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
	
	 @Before
	    public void setUp() {
	   
	        NumeroTel portable = new NumeroTel("portable","0651624519");
			Builder b = new Builder("bafdel","melissa", "secrétaire", LocalDate.of(1995,4,1));
			b.numTelephones(portable);
			Personnel secretaire = b.build();
	        
	    }
	

}
