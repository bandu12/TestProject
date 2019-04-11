package com.src.main.CommonUtilLayer;

import org.testng.annotations.DataProvider;

import com.src.main.BaseLayer.NewTours_TestBase;
import com.src.main.Reader.Reader;

public class TestUtil extends NewTours_TestBase {

	public static long Page_Load_TimeOut = 35; // declaring time here to remove
	// hardcoded value from TestBase
	// class coz if time will be
	// incresing so problem is
	// facing
	public static long Implicit_Wait = 40;
	// String sheetName;

	@DataProvider(name="data")
	public static Object[][] getFormData(String sheetName) {
		Object data[][] = Reader.getTestData(sheetName);
		return data;
	}

}
