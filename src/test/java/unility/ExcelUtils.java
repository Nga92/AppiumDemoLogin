package unility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell Cell;
	private static XSSFRow Row;
	public static void setExcelFile(String Path, String SheetName) throws Exception{
		try { 
			//Open file excel 
			FileInputStream ExcelFile=new FileInputStream(Path);
			//Access the required test data sheet 
			ExcelWBook=new XSSFWorkbook(ExcelFile);
			ExcelWSheet=ExcelWBook.getSheet(SheetName);
		}catch (Exception e) {
			throw(e);
		}
		
	}
	
	public static Object[][] getTableArray(String FilePath, String SheetName) throws Exception {
		String[][] tabArray = null;

		try {

			FileInputStream ExcelFile = new FileInputStream(FilePath);

			// Access the required test data sheet

			ExcelWBook = new XSSFWorkbook(ExcelFile);

			ExcelWSheet = ExcelWBook.getSheet(SheetName);

			int startRow = 1;

			int startCol = 0;

			int ci,cj;

			int totalRows = ExcelWSheet.getLastRowNum();
			// int totalRows = 2;

			// you can write a function as well to get Column count

			int totalCols =8;

			tabArray = new String[totalRows][totalCols];

			ci = 0;

			for (int i = startRow; i <= totalRows; i++, ci++) {

				cj = 0;

				for (int j = startCol; j < totalCols; j++, cj++) {

					tabArray[ci][cj] = getCellData(i, j);

					System.out.println(tabArray[ci][cj]);

				}

			}

		}

		catch (IOException e) {

			System.out.println("Could not read the Excel sheet");

			e.printStackTrace();

		}

		return (tabArray);

	}

	public static String getCellData1(int RowNum, int ColNum,String SheetName) throws Exception {

		String value = null;
		try {
			FileInputStream fileOut1 = new FileInputStream(Constant.Path_Data + Constant.File_DataTest);
			ExcelWBook = new XSSFWorkbook(fileOut1);
			ExcelWSheet = ExcelWBook.getSheet(SheetName);
			Row = ExcelWSheet.getRow(RowNum);
			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
			value = Cell.getStringCellValue();
			
		} catch (Exception e) {
		}
		return  value;
	}
	public static String getCellData(int RowNum, int ColNum) throws Exception {

		try {
			DecimalFormat formatter = new DecimalFormat("##.############");
			int type;
			Object result;
			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
			type = Cell.getCellType();
			switch (type) {
			case 0:
				result =NumberToTextConverter.toText(Cell.getNumericCellValue());
				//result =Cell.getNumericCellValue();
				break;    
			case 1:
				result = Cell.getStringCellValue();
				break;
			default:
				throw new RuntimeException("There are no support for this type of cell");
			}
			return  result.toString();
		} catch (Exception e) {

			return "";
		}
	}

	public static void setCellData(String Result, int LastRow, int Col,String SheetName) throws Exception {
		try {
			FileInputStream fileOut1 = new FileInputStream(Constant.Path_Data + Constant.File_DataTest);
			ExcelWBook = new XSSFWorkbook(fileOut1);
			ExcelWSheet = ExcelWBook.getSheet(SheetName);
			XSSFRow row = ExcelWSheet.getRow(LastRow); 
			XSSFCell cell = ExcelWSheet.getRow(LastRow).createCell(Col);
			cell.setCellValue(Result);// Shift the cell value depending
			// upon column size

			// Constant variables Test Data path and Test Data file name

			FileOutputStream fileOut = new FileOutputStream(Constant.Path_Data + Constant.File_DataTest);
			ExcelWSheet = ExcelWBook.getSheet(SheetName);
			ExcelWBook.write(fileOut);
			fileOut.flush();
			fileOut.close();

			System.out.println("viet dduoc Excel ");

		} catch (Exception e) {
			System.out.println("Khong viet dduoc Excel ");
		}
	}
	// -------------------------------------------------------------------------------

	public static void setCellData_Result(String Result, int ColExcepted, int LastRow, int Col_Result,String SheetName)
			throws Exception {
		try {
			setExcelFile(Constant.Path_Data + Constant.File_DataTest, SheetName);
			FileInputStream fileOut1 = new FileInputStream(Constant.Path_Data + Constant.File_DataTest);
			ExcelWBook = new XSSFWorkbook(fileOut1);
			ExcelWSheet = ExcelWBook.getSheet(SheetName);
			CellStyle cellStyle = ExcelWSheet.getWorkbook().createCellStyle();
			XSSFFont font = ExcelWSheet.getWorkbook().createFont();
			font.setFontHeightInPoints((short) 16);
			// set color
			font.setColor((short) 2);
			// set in dam
			font.setBold(true);
			cellStyle.setFont(font);
			XSSFRow row = ExcelWSheet.getRow(LastRow);
			XSSFCell cell = ExcelWSheet.getRow(LastRow).getCell(ColExcepted);
			XSSFCell cell_result = ExcelWSheet.getRow(LastRow).createCell(Col_Result);
			String value = cell.getStringCellValue();
			if (Result.equals(value)) {
				cell_result.setCellValue("PASS");
			} else {
				cell_result.setCellStyle(cellStyle);
				cell_result.setCellValue("FAIL");

			}

			FileOutputStream fileOut = new FileOutputStream(Constant.Path_Data + Constant.File_DataTest);
			ExcelWSheet = ExcelWBook.getSheet("invalidate");
			ExcelWBook.write(fileOut);
			fileOut.flush();
			fileOut.close();

			System.out.println("viet dduoc Excel ");

		} catch (Exception e) {
			System.out.println("Khong viet dduoc Excel ");
		}
	}

	public static String getTestCaseName(String sTestCase) throws Exception {

		String value = sTestCase;

		try {

			int posi = value.indexOf("@");

			value = value.substring(0, posi);

			posi = value.lastIndexOf(".");

			value = value.substring(posi + 1);

			return value;

		} catch (Exception e) {

			throw (e);

		}

	}

	public static int getRowContains(String sTestCaseName, int colNum) throws Exception {

		int i;

		try {

			int rowCount = ExcelUtils.getRowUsed();

			for (i = 0; i < rowCount; i++) {

				if (ExcelUtils.getCellData(i, colNum).equalsIgnoreCase(sTestCaseName)) {

					break;

				}

			}

			return i;

		} catch (Exception e) {

			throw (e);

		}

	}

	public static int getRowUsed() throws Exception {

		try {

			int RowCount = ExcelWSheet.getLastRowNum();

			return RowCount;

		} catch (Exception e) {

			System.out.println(e.getMessage());

			throw (e);

		}

	}
}
