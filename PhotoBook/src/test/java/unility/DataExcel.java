package unility;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataExcel  {

  @DataProvider(name = "Authentication")
	public Object[][] Authentication() throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_Data + Constant.File_DataTest, "Register");
		Log.info(" Excel sheet opened");
		Object[][] testObjArray = ExcelUtils.getTableArray(Constant.Path_Data + Constant.File_DataTest, "Register",4);
		return (testObjArray);
	}
  @DataProvider(name = "Login")
 	public Object[][] Login() throws Exception {
 		ExcelUtils.setExcelFile(Constant.Path_Data + Constant.File_DataTest, "Register");
 		Log.info(" Excel sheet opened");
 		Object[][] testObjArray = ExcelUtils.getTableArray(Constant.Path_Data + Constant.File_DataTest, "Login",9);
 		return (testObjArray);
 	}
}
