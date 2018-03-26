package operateTextFile;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

public class ReadTextFile {

	public List<String> readText() throws IOException {

		BufferedReader reader = null;
		List<String> textInput = new LinkedList<String>();
		try {
			reader = new BufferedReader(new InputStreamReader(System.in));
			textInput = Files.readAllLines(Paths.get(reader.readLine()));
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file ");
		} catch (IOException ex) {
			System.out.println("Error reading file ");
			throw ex;
		} finally {
			//reader.close();
		}
		return textInput;
	}
}
