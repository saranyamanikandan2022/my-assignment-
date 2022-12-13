package week3day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {
	public static void main(String[] args) {
		
	
	ChromeDriver driver=new  ChromeDriver();
		//EdgeDriver driver =new  EdgeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
   driver.manage().window().maximize();
   
  driver.findElement(By.id("username")).sendKeys("DemoCsr");
   driver.findElement(By.id("password")).sendKeys("crmsfa");
   driver.findElement(By.className("decorativeSubmit")).click();
   driver.findElement(By.linkText("CRM/SFA")).click();
   driver.findElement(By.linkText("Leads")).click();
   driver.findElement(By.partialLinkText("Create Lead")).click();
   driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CTS");
   driver.findElement(By.id("createLeadForm_firstName")).sendKeys("saranya");
   driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
   driver.findElement(By.name("firstNameLocal")).sendKeys("Saranya");
   driver.findElement(By.name("personalTitle")).sendKeys("Tester");
   driver.findElement(By.name("generalProfTitle")).sendKeys(" junior Software Tester");
   driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("9000000");
   driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("512015");
   driver.findElement(By.name("description")).sendKeys("Tester");
   driver.findElement(By.name("importantNote")).sendKeys("Tester");
   driver.findElement(By.name("lastNameLocal")).sendKeys("mani");
   driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("SoftwareTester");
   driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("123123123");
   driver.findElement(By.name("tickerSymbol")).sendKeys("#");
   driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("624107");
   driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("1826");
   driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("saranyavelumani1999@gmail.com");
   driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("917904616837");
   driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Tester");
   driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.website.com");
   driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("mani");
   driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("kolarpaati");
   driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
   driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("602001");
   driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("0323");
   driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("manikandan");
   driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("pollachi");
   driver.findElement(By.className("smallSubmit")).click();
}
}
