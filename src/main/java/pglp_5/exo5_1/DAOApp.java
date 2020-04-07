package pglp_5.exo5_1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public abstract class DAOApp<T> {
	protected File f;
    protected FileOutputStream fileOut;
    protected ObjectOutputStream objOut;
    
  //creer le constructeur de DAO
    public DAOApp(int id) throws IOException{
    	f = new File(id +".txt");
    	fileOut = new FileOutputStream(f);
    	objOut = new ObjectOutputStream(fileOut);
    }
}
