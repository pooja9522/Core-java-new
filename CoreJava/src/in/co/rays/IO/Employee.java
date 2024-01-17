package in.co.rays.IO;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;

public class Employee implements Externalizable {
	
	public String id=null;
	public String name=null;
	public String lastname=null;
	public double salary=0;
	
	
	
	
	
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		id=(String) in.readObject();
		name=(String)  in.readObject();
		lastname=(String) in.readObject();
		salary=(double) in.readObject();
		
	}
	
	
	

}
