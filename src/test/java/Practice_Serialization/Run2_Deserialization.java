
package Practice_Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Run2_Deserialization {
	
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		FileInputStream input=new FileInputStream("./serialize.txt");
		
		ObjectInputStream objin=new ObjectInputStream(input);
		NFSGame user1Obj= (NFSGame) objin.readObject();
		
		System.out.println(user1Obj.name);
		System.out.println(user1Obj.level);
		System.out.println(user1Obj.score);
		System.out.println(user1Obj.life);
		
	}

}
