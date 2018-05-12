package operateExcelSheet;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.*;

public class ReadExcelSheet {

	public void readExcel() throws Exception {

		BufferedReader readerExcel = null;
		try {

			// Take input from user
			readerExcel = new BufferedReader(new InputStreamReader(System.in));
			String filePath = readerExcel.readLine();
			Workbook workbook = WorkbookFactory.create(new File(filePath));
			System.out.println("Workbook has " + workbook.getNumberOfSheets() + " Sheets : ");
			Iterator<Sheet> sheetIterator = workbook.sheetIterator();

			// SOP Java 8
			System.out.println("Retrieving Sheets using Iterator");
			System.out.println("Retrieving Sheets using Java 8 forEach");
			workbook.forEach(sheet -> {
				System.out.println("=> " + sheet.getSheetName());
			});

			// Parse excel
			DataFormatter dataFormatter = new DataFormatter();
			while (sheetIterator.hasNext()) {
				Sheet sheet = sheetIterator.next();
				Iterator<Row> rowIterator = sheet.rowIterator();
				System.out.println(sheet.getRow(0).getLastCellNum());
				while (rowIterator.hasNext()) {
					Row row = rowIterator.next();

					// iterate over the columns of the current row
					Iterator<Cell> cellIterator = row.cellIterator();

					while (cellIterator.hasNext()) {
						Cell cell = cellIterator.next();
						String cellValue = dataFormatter.formatCellValue(cell);
						System.out.print(cellValue + "\t");
					}
					System.out.println();
				}
			}
		} catch (Exception e) {
			throw e;
		} finally {
			//readerExcel.close();
		}
	}
}
