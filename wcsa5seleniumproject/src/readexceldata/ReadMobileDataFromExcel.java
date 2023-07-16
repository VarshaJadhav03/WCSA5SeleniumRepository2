package readexceldata;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMobileDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//Read data from IPL sheet
		
				//implementation of read the data from excel
				
				FileInputStream File = new FileInputStream("./data/MobileReadData.xlsx"); //Provide the path of file
				Workbook wb = WorkbookFactory.create(File); //Make the file for ready to read
				Sheet sheet = wb.getSheet("Mobile"); //get into the sheet
				Row row = sheet.getRow(2); //get into a desired row
				Cell cell = row.getCell(0); //get into the desired cell/column
				String data = cell.getStringCellValue(); //read the data from cell
				System.out.println(data);
				
			}

	}


