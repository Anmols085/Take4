package main;

import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import operateExcelSheet.ReadExcelSheet;
import operateTextFile.ReadTextFile;
import operateTextFile.WriteTextFile;

public class MainClass {

	public static void main(String[] args) {
		ReadTextFile readTxtFile = new ReadTextFile();
		WriteTextFile writeTextFile = new WriteTextFile();
		ReadExcelSheet readExcel = new ReadExcelSheet();
		try {
			System.out.println("Enter file path");
			List<String> textInput = readTxtFile.readText();
			System.out.println("List is " + textInput);
			System.out.println("Enter output file path");
			writeTextFile.writeToTextFile(textInput);
			System.out.println("Enter excel file path");
			readExcel.readExcel();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InvalidFormatException ex) {
			System.out.println("Error reading excel");
		} catch (Exception exc) {
			System.out.println("Unknown exception");
			exc.printStackTrace();
		}
	}
}
