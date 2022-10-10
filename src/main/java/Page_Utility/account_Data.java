package Page_Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class account_Data {

	
	@DataProvider(name="createAcccount")
	public Object[][] AccountData() {
		Object[][] Data = new Object[2][2];

		Data[0][0] = "VisibleLLC";
		Data[0][1] = "Thinair";
		Data[1][0] = "preproduat100+0709_58@gmail.com";
		Data[1][1] = "$Thinair321";
		
		return Data;

	}

//	public void exelData() throws Exception {
//
//		// Read file
//		File exelFile = new File("C://Users//HP//eclipse-wp//com.beVisible//Visible_data.xlsx");
//		// Read raw data
//		FileInputStream fis = new FileInputStream(exelFile);
//		// Read workbook
//		XSSFWorkbook wb = new XSSFWorkbook(fis);
//		// get sheet
//		XSSFSheet sheet = wb.getSheetAt(0);
//		System.out.println(sheet.getSheetName());
//
//	}
}
