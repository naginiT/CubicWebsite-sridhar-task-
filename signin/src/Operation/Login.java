package Operation;

import Excl.ExcelCode;
import Repository.InspectElements;

public class Login {
	static String s;
	static String s1;
	public static void Actions () throws Exception {
		
		InspectElements.signin().click();
		ExcelCode.Code(" Test Data for USER LOGIN","C:\\Users\\sridhar\\Desktop\\BookStoreSummary.xlsx");
		try {
		for(int i=4;i<=6;i++) {
			s=ExcelCode.RowColumn1(i, 1);
			Thread.sleep(4000);
		InspectElements.user().sendKeys(s);
		s1=ExcelCode.RowColumn1(i, 2);
		Thread.sleep(4000);
		InspectElements.pswd().sendKeys(s1);
		Thread.sleep(400);
		InspectElements.login().click();
		}
		}
		finally{
			InspectElements.login1().click();
			
		}

	}
}
