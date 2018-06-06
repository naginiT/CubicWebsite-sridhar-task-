package Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InspectElements extends Browser {

static By user=By.name("email");
static By password=By.name("password");

static By login=By.xpath("//*[@id=\"myModal2\"]/div/div/div/div/div[1]/form/div/input");
static By signin=By.xpath("/html/body/nav/div[1]/div[2]/ul/li[1]/a");
static By login1=By.xpath("//*[@id=\"reg_form\"]/fieldset/div[3]/div/button[1]");


public static WebElement user() {
	return driver.findElement(user);
}
	public static WebElement pswd() {

	return driver.findElement(password);
}

public static WebElement login() {
	return driver.findElement(login);

}
public static WebElement signin() {
	return driver.findElement(signin);
}
public static WebElement login1() {
	return driver.findElement(login1);

	
}

}


