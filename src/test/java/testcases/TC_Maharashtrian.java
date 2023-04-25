package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageobjects.CusinePageElements;
import utilities.ExcelRead;

public class TC_Maharashtrian extends BaseClass
{
	@Test
	   public void Finalsetup() throws InterruptedException, IOException  
	   {		   
		   MouseHoverReceipes();
		   MouseHoveCusine();
		   
		   CusinePageElements CPE=new CusinePageElements();
		   CPE.CusineName("Maharashtrian");
		   
		   Filters_Intialization();
		   
		   try
		   {
			   ReceipeList();   
		   }
		   catch( Exception e)
			{
				System.out.println(e.getMessage());
				
			}	
		   
		   ExcelRead excel=new ExcelRead();
		   excel.DatasToExcel("MaharashtrianDatas",ArrayListCounter );
		   
		   tearDown();		   
	   }
}
