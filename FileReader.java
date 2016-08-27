
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner input = new Scanner(new File("cleo.txt"));
		while (input.hasNextLine()){
		   System.out.println(input.nextLine());
		}
		input.close();
	}

}