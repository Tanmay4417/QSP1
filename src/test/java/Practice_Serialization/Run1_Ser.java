package Practice_Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class NFSGame implements Serializable {
	String name;
	int level;
	long score;
	int life;

	public NFSGame(String name, int level, long score, int life) {
		
		this.name = name;
		this.level = level;
		this.score = score;
		this.life = life;
	}

}

public class Run1_Ser {

	public static void main(String[] args) throws IOException {
		NFSGame obj = new NFSGame("Tanmay", 10, 10000, 2);
		FileOutputStream fileout = new FileOutputStream("./serialize.txt");

		ObjectOutputStream objout = new ObjectOutputStream(fileout);
		objout.writeObject(obj);

		System.out.println(" End ");

	}

}
