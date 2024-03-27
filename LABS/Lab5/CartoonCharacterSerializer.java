import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

public class CartoonCharacterSerializer {
	
	private static ObjectOutputStream outputCartoon;
	private static ObjectInputStream inputCartoon;
	private static PrintWriter writer;
	
	public static void serializeCharacter(CartoonCharacter character) {
		try {
			// Create ObjectOutputStream with FileOutputStream
			outputCartoon = new ObjectOutputStream( new FileOutputStream("cartoonCharacters.ser"));
			// Write the CartoonCharacter object to the ObjectOutputStream
			outputCartoon.writeObject(character);			
			// Close the ObjectOutputStream to ensure proper resource management
			outputCartoon.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static CartoonCharacter deserializeCharacter() {
		CartoonCharacter cartoon = null;
		
		try {
			// Create ObjectInputStream with FileInputStream
			inputCartoon = new ObjectInputStream(new FileInputStream("cartoonCharacters.ser"));
			// Read the CartoonCharacter object from the ObjectInputStream and cast it
			cartoon = (CartoonCharacter)inputCartoon.readObject();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			try {
				inputCartoon.close();
				if (e instanceof EOFException) {//When end of file is reached, print this message
					System.out.println("Reached end of file, " + e);
				} else {
					e.printStackTrace();
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		
		return cartoon;
	}
	
	public static void printToFile(String stringToFile) throws FileNotFoundException {
		try{
			// Create PrintWriter with FileWriter
			writer = new PrintWriter(new FileWriter("printFile"));
		
			// Write the specified string to the file
			writer.write(stringToFile);
		
			// Print a formatted line to the file
			writer.println();
		
			// Close the PrintWriter to ensure proper resource management
			writer.close();
		}
		catch (FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
	}

}