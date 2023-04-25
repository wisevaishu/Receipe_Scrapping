package pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import testcases.BaseClass;

public class CusinePageElements  extends BaseClass
{
	public void CusineName(String CuisineName) 
	{
		WebElement RecipeLink = driver.findElement(By.xpath("(//a[contains(text(), '"+CuisineName+"')])[1]"));
		Actions action = new Actions(driver);
		action.moveToElement(RecipeLink).perform();
		RecipeLink.click();
	}
}
