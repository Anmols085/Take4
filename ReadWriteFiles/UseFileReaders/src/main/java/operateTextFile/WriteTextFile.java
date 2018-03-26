package operateTextFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class WriteTextFile {

	public void writeToTextFile(List<String> textInput) throws IOException {

		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new InputStreamReader(System.in));
			String filePath = reader.readLine();
			for (String str : textInput) {
				Files.write(Paths.get(filePath), str.getBytes());
			}
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file ");
		} catch (IOException ex) {
			System.out.println("Error reading file ");
			throw ex;
		} finally {
			// reader2.close();
		}
	}
}
