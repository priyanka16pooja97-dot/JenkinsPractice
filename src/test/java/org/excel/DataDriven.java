package org.excel;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
	public static void main(String[] args) throws IOException {

		// Find the excel and read the data

		File path = new File(ARRAY_MISMATCH_TEMPLATE);
				
				String string = "search-ms:displayname=Search%20Results%20in%20Desktop&crumb=System.Generic.String%3Abook&crumb=location:C%3A%5CUsers%5Cpriya%5CDesktop";
		FileInputStream stream = new FileInputStream(path);

		// Excel File
		Workbook excelDoc = new XSSFWorkbook(stream);

		// Sheet
		Sheet sheet = excelDoc.getSheet("Sheet1");

		// Row
		Row row = sheet.getRow(1);

		// Column
		Cell cell = row.getCell(1);

		String stringcellvalue = cell.getStringCellValue();
		System.out.println(stringcellvalue);

		int rowsData = sheet.getPhysicalNumberOfRows();

		for (int i = 0; i < rowsData; i++) {
			Row row1 = sheet.getRow(i);

			int columns = row.getPhysicalNumberOfCells();

			for (int j = 0; j < columns; j++) {
				Cell cell1 = row1.getCell(j);

				CellType cellType = cell1.getCellType();

				if (cellType == CellType.STRING) {
					String text = cell.getStringCellValue();
					System.out.println(text);

				} else {
					DataFormatter dataformatter = new DataFormatter();
					String fcv = dataformatter.formatCellValue(cell1);
					System.out.println(fcv);

				}
			}

		}

	}
}
