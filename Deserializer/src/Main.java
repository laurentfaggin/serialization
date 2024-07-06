import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//					Steps to Deserialize
		//					------------------------------------------------------------
		//					1. Declare your object ( don't instantiate)
		//					2. Your class should implement Serializable intreface
		//					3. add import java.io.Serializable;
		//					4. FileInputStream fileIn = new FileInputStream (file path);
		//					5. ObjectInputStream in = new ObjectInputStream(filein);
		//					6. objectNam = (Class) in.readObject();
		//					7. in.close(); fileIn.close();
		//					------------------------------------------------------------
		
		// important notes	1. children classes of a parent class that imolements Serializable will do as well
		//					2. static fields are not serialized (they belong to the class, not an individual object)
		//					3. the class's definition ("class file") itself is not recorded, cast it as the object type
		//					4. fields declared as "transient" aren't serialized, they're ignored
		//					5. serialversionUID is a unique version ID
		
		User user;
		
		FileInputStream fileIn = new FileInputStream ("/home/laurent/eclipse-workspace/Serializer/UserInfo.ser");
		ObjectInputStream in = new ObjectInputStream(fileIn);
		user = (User) in.readObject();
		in.close();
		fileIn.close();
		
		System.out.println(user.name);
		System.out.println(user.password);
		user.sayHello();
	}

}
