package wrappers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import utils.Reporting;

public class GenericWrappers extends Reporting  implements Wrappers{

	public RemoteWebDriver driver;
	
	int i=1;
	
	public static Properties prop ;
	
	public void loadObject() {
		try {
			 prop = new Properties();
			prop.load(new FileInputStream("./src/test/java/object.properties"));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void unloadObject() {
		prop=null;
	}
	
	public void invokeApp(String browser, String url) {
		// TODO Auto-generated method stub
	try {
		if (browser.equalsIgnoreCase("chrome")) {
		    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		    driver=new ChromeDriver();
		}else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		    driver=new FirefoxDriver();
		}else if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver","./drivers/IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		    driver.manage().window().maximize();
		                                                                                             
		    driver.get(url);	
		    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		    //System.out.println("The browser "+browser+" is launched with the given URL "+url+" successfully");
		    reportStep("The browser "+browser+" is launched with the given URL "+url+" successfully", "pass");
		    
	   } catch (SessionNotCreatedException e) {
		// TODO Auto-generated catch block
		//System.err.println("The browser "+browser+" is not launched due to session not created error");
		reportStep("The browser "+browser+" is not launched due to session not created error", "fail");
		
	   } catch (WebDriverException e) {
		// TODO: handle exception
		//System.err.println("The browser "+browser+" is not launched due to unknown error");
		reportStep("The browser "+browser+" is not launched due to unknown error", "fail");
	   }
	}

	
	public void enterById(String idValue, String data) {
		// TODO Auto-generated method stub
	try {
		driver.findElementById(idValue).sendKeys(data);
		//System.out.println("The Element with Id "+idValue+" is entered with data "+data);
		reportStep("The Element with Id "+idValue+" is entered with data "+data, "pass");
		
	} catch (NoSuchElementException e) {
		// TODO Auto-generated catch block
		//System.err.println("The Element with Id "+idValue+" is not found in DOM");
		reportStep("The Element with Id "+idValue+" is not found in DOM", "fail");
		
	} catch (ElementNotVisibleException e) {
		// TODO: handle exception
		//System.err.println("The Element with Id "+idValue+" is not visible in the application");
		reportStep("The Element with Id "+idValue+" is not visible in the application", "fail");
		
	} catch (ElementNotInteractableException e) {
		// TODO: handle exception
		//System.err.println("The Element with Id "+idValue+" is not Interactable in the application");
		reportStep("The Element with Id "+idValue+" is not Interactable in the application", "fail");
		
	} catch (StaleElementReferenceException e) {
		// TODO: handle exception
		//System.err.println("The Element with Id "+idValue+" is not Stable in the application");
		reportStep("The Element with Id "+idValue+" is not Stable in the application", "fail");
		
	} catch (WebDriverException  e) {
		// TODO: handle exception
		//System.err.println("The Element with Id "+idValue+" is not entered with data "+data+"due to Unknown error");
		reportStep("The Element with Id "+idValue+" is not entered with data "+data+"due to Unknown error", "fail");
	}
  }

	
	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(nameValue).sendKeys(data);
			//System.out.println("The Element with Name "+nameValue+" is entered with data "+data);
			reportStep("The Element with Name "+nameValue+" is entered with data "+data, "pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with Name "+nameValue+" is not found in DOM");
			reportStep("The Element with Name "+nameValue+" is not found in DOM", "fail");
			
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The Element with Name "+nameValue+" is not visible in the application");
			reportStep("The Element with Name "+nameValue+" is not visible in the application", "fail");
			
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The Element with Name "+nameValue+" is not Interactable in the application");
			reportStep("The Element with Name "+nameValue+" is not Interactable in the application", "fail");

		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Element with Name "+nameValue+" is not Stable in the application");
			reportStep("The Element with Name "+nameValue+" is not Stable in the application", "fail");

		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The Element with Name "+nameValue+" is not entered with data "+data+"due to Unknown error");
			reportStep("The Element with Name "+nameValue+" is not entered with data "+data+"due to Unknown error", "fail");
		}
	}

	
	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
			//System.out.println("The Element with Xpath "+xpathValue+" is entered with data "+data);
			reportStep("The Element with Xpath "+xpathValue+" is entered with data "+data, "pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with Xpath "+xpathValue+" is not found in DOM");
			reportStep("The Element with Xpath "+xpathValue+" is not found in DOM", "fail");

		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The Element with Xpath "+xpathValue+" is not visible in the application");
			reportStep("The Element with Xpath "+xpathValue+" is not visible in the application", "fail");

		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The Element with Xpath "+xpathValue+" is not Interactable in the application");
			reportStep("The Element with Xpath "+xpathValue+" is not Interactable in the application", "fail");

		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Element with Xpath "+xpathValue+" is not Stable in the application");
			reportStep("The Element with Xpath "+xpathValue+" is not Stable in the application", "fail");

		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The Element with Xpath "+xpathValue+" is not entered with data "+data+"due to Unknown error");
			reportStep("The Element with Xpath "+xpathValue+" is not entered with data "+data+"due to Unknown error", "fail");
		}
	}
 
	
	public void verifyTitle(String title) {
		// TODO Auto-generated method stub
		try {
			String actualtext=driver.getTitle();
			if (actualtext.equals(title)) {
				//System.out.println("The Title of the page "+actualtext+" is matched with expected title "+title);
				reportStep("The Title of the page "+actualtext+" is matched with expected title "+title, "pass");
				
			} else {
			    //System.err.println("The Title of the page "+actualtext+" is not matched with expected title "+title);
				reportStep("The Title of the page "+actualtext+" is not matched with expected title "+title, "fail");
			}
			
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Title of the page cannot be verified due to unknown error");
			reportStep("The Title of the page cannot be verified due to unknown error", "fail");
		} 
	}

	
	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
		try {
			String actualtext=driver.findElementById(id).getText();
			if (actualtext.equals(text)) {
				//System.out.println("The Element with Id "+id+" is having the text "+actualtext+" matched with expected text "+text);		
				reportStep("The Element with Id "+id+" is having the text "+actualtext+" matched with expected text ", "pass");

			} else {
				//System.err.println("The Element with Id "+id+" is having the text "+actualtext+" not matched with expected text "+text);
				reportStep("The Element with Id "+id+" is having the text "+actualtext+" not matched with expected text ", "fail");
			}
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with Id "+id+" is not found in DOM");
			reportStep("The Element with Id "+id+" is not found in DOM", "fail");

		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The Element with Id "+id+" is not visible in the application");
			reportStep("The Element with Id "+id+" is not visible in the application", "fail");

		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The Element with Id "+id+" is not Interactable in the application");
			reportStep("The Element with Id "+id+" is not Interactable in the application", "fail");

		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Element with Id "+id+" is not Stable in the application");
			reportStep("The Element with Id "+id+" is not Stable in the application", "fail");

		} catch (WebDriverException  e) {
			// TODO: handle exception
			//System.err.println("The text in the Element with Id "+id+" cannot be verified due to Unknown error");
			reportStep("The text in the Element with Id "+id+" cannot be verified due to Unknown error", "fail");
		}
	}

	
	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String actualtext=driver.findElementByXPath(xpath).getText();
			if (actualtext.equals(text)) {
				//System.out.println("The Element with Xpath "+xpath+" is having the text "+actualtext+" matched with expected text "+text);
				reportStep("The Element with Xpath "+xpath+" is having the text "+actualtext+" matched with expected text ", "pass");

			} else {
				//System.err.println("The Element with Xpath "+xpath+" is having the text "+actualtext+" not matched with expected text "+text);
				reportStep("The Element with Xpath "+xpath+" is having the text "+actualtext+" not matched with expected text ", "fail");
			}
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with Xpath "+xpath+" is not found in DOM");
			reportStep("The Element with Xpath "+xpath+" is not found in DOM", "fail");

		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The Element with Xpath "+xpath+" is not visible in the application");
			reportStep("The Element with Xpath "+xpath+" is not visible in the application", "fail");

		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The Element with Xpath "+xpath+" is not Interactable in the application");
			reportStep("The Element with Xpath "+xpath+" is not Interactable in the application", "fail");

		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Element with Xpath "+xpath+" is not Stable in the application");
			reportStep("The Element with Xpath "+xpath+" is not Stable in the application", "fail");

		} catch (WebDriverException  e) {
			// TODO: handle exception
			//System.err.println("The text in the Element with Xpath "+xpath+" cannot be verified due to Unknown error");
			reportStep("The text in the Element with Xpath "+xpath+" cannot be verified due to Unknown error", "fail");
		}
	}
		

	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String actualtext=driver.findElementByXPath(xpath).getText();
			if (actualtext.contains(text)) {
				//System.out.println("The Element with Xpath "+xpath+" is having the text "+actualtext+" matched with expected text "+text);
				reportStep("The Element with Xpath "+xpath+" is having the text "+actualtext+" matched with expected text ", "pass");

			} else {
				//System.err.println("The Element with Xpath "+xpath+" is having the text "+actualtext+" not matched with expected text "+text);
				reportStep("The Element with Xpath "+xpath+" is having the text "+actualtext+" not matched with expected text ", "fail");
			}
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with Xpath "+xpath+" is not found in DOM");
			reportStep("The Element with Xpath "+xpath+" is not found in DOM", "fail");

		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The Element with Xpath "+xpath+" is not visible in the application");
			reportStep("The Element with Xpath "+xpath+" is not visible in the application", "fail");

		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The Element with Xpath "+xpath+" is not Interactable in the application");
			reportStep("The Element with Xpath "+xpath+" is not Interactable in the application", "fail");

		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Element with Xpath "+xpath+" is not Stable in the application");
			reportStep("The Element with Xpath "+xpath+" is not Stable in the application", "fail");

		} catch (WebDriverException  e) {
			// TODO: handle exception
			//System.err.println("The text in the Element with Xpath "+xpath+" cannot be verified due to Unknown error");
			reportStep("The text in the Element with Xpath "+xpath+" cannot be verified due to Unknown error", "fail");
		}
	 }

	
	public void clickById(String id) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(id).click();
			//System.out.println("The Element with Id "+id+" is clicked");
			reportStep("The Element with Id "+id+" is clicked", "pass");

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with Id "+id+" is not found in DOM");
			reportStep("The Element with Id "+id+" is not found in DOM", "fail");

		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The Element with Id "+id+" is not visible in the application");
			reportStep("The Element with Id "+id+" is not visible in the application", "fail");

		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
		    //System.err.println("The Element with Id "+id+" is not Intercepted in the application");
			reportStep("The Element with Id "+id+" is not Intercepted in the application", "fail");

		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The Element with Id "+id+" is not Interactable in the application");
			reportStep("The Element with Id "+id+" is not Interactable in the application", "fail");

		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Element with Id "+id+" is not Stable in the application");
			reportStep("The Element with Id "+id+" is not Stable in the application", "fail");

		} catch (WebDriverException  e) {
			// TODO: handle exception
			//System.err.println("The Element with Id "+id+" is not clicked due to Unknown error");
			reportStep("The Element with Id "+id+" is not clicked due to Unknown error", "fail");
		}
	}

	
	public void clickByClassName(String classVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByClassName(classVal).click();
			//System.out.println("The Element with ClassName "+classVal+" is clicked");
			reportStep("The Element with ClassName "+classVal+" is clicked", "pass");

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with ClassName "+classVal+" is not found in DOM");
			reportStep("The Element with ClassName "+classVal+" is not found in DOM", "fail");

		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The Element with ClassName "+classVal+" is not visible in the application");
			reportStep("The Element with ClassName "+classVal+" is not visible in the application", "fail");

		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The Element with ClassName "+classVal+" is not Intercepted in the application");
			reportStep("The Element with ClassName "+classVal+" is not Intercepted in the application", "fail");

		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The Element with ClassName "+classVal+" is not Interactable in the application");
			reportStep("The Element with ClassName "+classVal+" is not Interactable in the application", "fail");

		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Element with ClassName "+classVal+" is not Stable in the application");
			reportStep("The Element with ClassName "+classVal+" is not Stable in the application", "fail");

		} catch (WebDriverException  e) {
			// TODO: handle exception
			//System.err.println("The Element with ClassName "+classVal+" is not clicked due to Unknown error");
			reportStep("The Element with ClassName "+classVal+" is not clicked due to Unknown error", "fail");
		}
	}

	
	public void clickByName(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(name).click();
			//System.out.println("The Element with Name "+name+" is clicked");
			reportStep("The Element with Name "+name+" is clicked", "pass");

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with Name "+name+" is not found in DOM");
			reportStep("The Element with Name "+name+" is not found in DOM", "fail");

		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The Element with Name "+name+" is not visible in the application");
			reportStep("The Element with Name "+name+" is not visible in the application", "fail");

		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The Element with Name "+name+" is not Intercepted in the application");
			reportStep("The Element with Name "+name+" is not Intercepted in the application", "fail");

		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The Element with Name "+name+" is not Interactable in the application");
			reportStep("The Element with Name "+name+" is not Interactable in the application", "fail");

		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Element with Name "+name+" is not Stable in the application");
			reportStep("The Element with Name "+name+" is not Stable in the application", "fail");

		} catch (WebDriverException  e) {
			// TODO: handle exception
			//System.err.println("The Element with Name "+name+" is not clicked due to Unknown error");
			reportStep("The Element with Name "+name+" is not clicked due to Unknown error", "fail");
		}
	}

	
	public void clickByLink(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			//System.out.println("The Element with LinkText "+name+" is clicked");
			reportStep("The Element with LinkText "+name+" is clicked", "pass");

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with LinkText "+name+" is not found in DOM");
			reportStep("The Element with LinkText "+name+" is not found in DOM", "fail");

		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The Element with LinkText "+name+" is not visible in the application");
			reportStep("The Element with LinkText "+name+" is not visible in the application", "fail");

		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The Element with LinkText "+name+" is not Intercepted in the application");
			reportStep("The Element with LinkText "+name+" is not Intercepted in the application", "fail");

		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The Element with LinkText "+name+" is not Interactable in the application");
			reportStep("The Element with LinkText "+name+" is not Interactable in the application", "fail");

		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Element with LinkText "+name+" is not Stable in the application");
			reportStep("The Element with LinkText "+name+" is not Stable in the application", "fail");

		} catch (WebDriverException  e) {
			// TODO: handle exception
			//System.err.println("The Element with LinkText "+name+" is not clicked due to Unknown error");
			reportStep("The Element with LinkText "+name+" is not clicked due to Unknown error", "fail");
		}
	}

	
	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			//System.out.println("The Element with LinkText "+name+" is clicked");
			reportStep("The Element with LinkText "+name+" is clicked", "pass");

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with LinkText "+name+" is not found in DOM");
			reportStep("The Element with LinkText "+name+" is not found in DOM", "fail");

		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The Element with LinkText "+name+" is not visible in the application");
			reportStep("The Element with LinkText "+name+" is not visible in the application", "fail");

		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The Element with LinkText "+name+" is not Intercepted in the application");
			reportStep("The Element with LinkText "+name+" is not Intercepted in the application", "fail");

		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The Element with LinkText "+name+" is not Interactable in the application");
			reportStep("The Element with LinkText "+name+" is not Interactable in the application", "fail");

		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Element with LinkText "+name+" is not Stable in the application");
			reportStep("The Element with LinkText "+name+" is not Stable in the application", "fail");

		} catch (WebDriverException  e) {
			// TODO: handle exception
			//System.err.println("The Element with LinkText "+name+" is not clicked due to Unknown error");
			reportStep("The Element with LinkText "+name+" is not clicked due to Unknown error", "fail");
		}
	}

	
	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The Element with Xpath "+xpathVal+" is clicked");
			reportStep("The Element with Xpath "+xpathVal+" is clicked", "pass");

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with Xpath "+xpathVal+" is not found in DOM");
			reportStep("The Element with Xpath "+xpathVal+" is not found in DOM", "fail");

		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The Element with Xpath "+xpathVal+" is not visible in the application");
			reportStep("The Element with Xpath "+xpathVal+" is not visible in the application", "fail");

		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The Element with Xpath "+xpathVal+" is not Intercepted in the application");
			reportStep("The Element with Xpath "+xpathVal+" is not Intercepted in the application", "fail");

		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
		//	System.err.println("The Element with Xpath "+xpathVal+" is not Interactable in the application");
			reportStep("The Element with Xpath "+xpathVal+" is not Interactable in the application", "fail");

		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Element with Xpath "+xpathVal+" is not Stable in the application");
			reportStep("The Element with Xpath "+xpathVal+" is not Stable in the application", "fail");

		} catch (WebDriverException  e) {
			// TODO: handle exception
			//System.err.println("The Element with Xpath "+xpathVal+" is not clicked due to Unknown error");
			reportStep("The Element with Xpath "+xpathVal+" is not clicked due to Unknown error", "fail");
		}
	}

    
	public void clickByXpath(String xpathVal, String expectedValue) {
		// TODO Auto-generated method stub
		
		String actualXPath=null;
		try {
			
			if(xpathVal.contains("option")) {
				 actualXPath = xpathVal.replace("option", expectedValue);
				 driver.findElementByXPath(actualXPath).click();
			} else {
				driver.findElementByXPath(xpathVal).click();
			}
			
			//System.out.println("The Element with Xpath "+xpathVal+" is clicked");
			reportStep("The Element with Xpath "+actualXPath+" is clicked", "pass");

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with Xpath "+xpathVal+" is not found in DOM");
			reportStep("The Element with Xpath "+actualXPath+" is not found in DOM", "fail");

		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The Element with Xpath "+xpathVal+" is not visible in the application");
			reportStep("The Element with Xpath "+actualXPath+" is not visible in the application", "fail");

		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The Element with Xpath "+xpathVal+" is not Intercepted in the application");
			reportStep("The Element with Xpath "+actualXPath+" is clickable in the application", "fail");

		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
		//	System.err.println("The Element with Xpath "+xpathVal+" is not Interactable in the application");
			reportStep("The Element with Xpath "+actualXPath+" is not Interactable in the application", "fail");

		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Element with Xpath "+xpathVal+" is not Stable in the application");
			reportStep("The Element with Xpath "+actualXPath+" is not Stable in the application", "fail");

		} catch (WebDriverException  e) {
			// TODO: handle exception
			//System.err.println("The Element with Xpath "+xpathVal+" is not clicked due to Unknown error");
			reportStep("The Element with Xpath "+actualXPath+" is not clicked due to Unknown error", "fail");
		}
	}

	
	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The Element with Xpath "+xpathVal+" is clicked");
			reportStep("The Element with Xpath "+xpathVal+" is clicked", "pass");

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with Xpath "+xpathVal+" is not found in DOM");
			reportStep("The Element with Xpath "+xpathVal+" is not found in DOM", "fail");

		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The Element with Xpath "+xpathVal+" is not visible in the application");
			reportStep("The Element with Xpath "+xpathVal+" is not visible in the application", "fail");

		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The Element with Xpath "+xpathVal+" is not Intercepted in the application");
			reportStep("The Element with Xpath "+xpathVal+" is not Intercepted in the application", "fail");

		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The Element with Xpath "+xpathVal+" is not Interactable in the application");
			reportStep("The Element with Xpath "+xpathVal+" is not Interactable in the application", "fail");

		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Element with Xpath "+xpathVal+" is not Stable in the application");
			reportStep("The Element with Xpath "+xpathVal+" is not Stable in the application", "fail");

		} catch (WebDriverException  e) {
			// TODO: handle exception
			//System.err.println("The Element with Xpath "+xpathVal+" is not clicked due to Unknown error");
			reportStep("The Element with Xpath "+xpathVal+" is not clicked due to Unknown error", "fail");
		}
	}

	
	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		String actualtext=null;
		try {
			actualtext=driver.findElementById(idVal).getText();
			//System.out.println("The Element with Id "+idVal+" having the text "+actualtext);
			reportStep("The Element with Id "+idVal+" having the text "+actualtext, "pass");

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with Id "+idVal+" is not found in DOM");
			reportStep("The Element with Id "+idVal+" is not found in DOM", "fail");

		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The Element with Id "+idVal+" is not visible in the application");
			reportStep("The Element with Id "+idVal+" is not visible in the application", "fail");

		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The Element with Id "+idVal+" is not Interactable in the application");
			reportStep("The Element with Id "+idVal+" is not Interactable in the application", "fail");

		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Element with Id "+idVal+" is not Stable in the application");
			reportStep("The Element with Id "+idVal+" is not Stable in the application", "fail");

		} catch (WebDriverException  e) {
			// TODO: handle exception
			//System.err.println("The Element with Id "+idVal+" Text is not getting due to Unknown error");
			reportStep("The Element with Id "+idVal+" Text is not getting due to Unknown error", "fail");
		}
		return actualtext;
	}

	
	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		String actualtext=null;
		try {
		    actualtext=driver.findElementByXPath(xpathVal).getText();
			//System.out.println("The Element with Xpath "+xpathVal+" having the text "+actualtext);
			reportStep("The Element with Xpath "+xpathVal+" having the text "+actualtext, "pass");

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with Xpath "+xpathVal+" is not found in DOM");
			reportStep("The Element with Xpath "+xpathVal+" is not found in DOM", "fail");

		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The Element with Xpath "+xpathVal+" is not visible in the application");
			reportStep("The Element with Xpath "+xpathVal+" is not visible in the application", "fail");

		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The Element with Xpath "+xpathVal+" is not Interactable in the application");
			reportStep("The Element with Xpath "+xpathVal+" is not Interactable in the application", "fail");

		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Element with Xpath "+xpathVal+" is not Stable in the application");
			reportStep("The Element with Xpath "+xpathVal+" is not Stable in the application", "fail");

		} catch (WebDriverException  e) {
			// TODO: handle exception
			//System.err.println("The Element with Xpath "+xpathVal+" Text is not getting due to Unknown error");
			reportStep("The Element with Xpath "+xpathVal+" Text is not getting due to Unknown error", "fail");
		}
		return actualtext;
	}

	
	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement element=driver.findElementById(id);
			Select sel=new Select(element);
			sel.selectByVisibleText(value);
			//System.out.println("The Dropdown Element with Id "+id+" is selected with VisibleText value "+value);
			reportStep("The Dropdown Element with Id "+id+" is selected with VisibleText value ", "pass");

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		    //System.err.println("The Dropdown Element with Id "+id+" is not found in DOM");
			reportStep("The Dropdown Element with Id "+id+" is not found in DOM", "fail");

		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The Dropdown Element with Id "+id+" is not visible in the application");
			reportStep("The Dropdown Element with Id "+id+" is not visible in the application", "fail");

		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The Dropdown Element with Id "+id+" is not Interactable in the application");
			reportStep("The Dropdown Element with Id "+id+" is not Interactable in the application", "fail");

		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Dropdown Element with Id "+id+" is not Stable in the application");
			reportStep("The Dropdown Element with Id "+id+" is not Stable in the application", "fail");

		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The Dropdown Element with Id "+id+" is not selectable in the application");
			reportStep("The Dropdown Element with Id "+id+" is not selectable in the application", "fail");

		} catch (WebDriverException  e) {
			// TODO: handle exception
			//System.err.println("The Dropdown Element with Id "+id+" is not functioning due to Unknown error");
			reportStep("The Dropdown Element with Id "+id+" is not functioning due to Unknown error", "fail");
		}
	}
	

	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub
		try {
			WebElement element=driver.findElementById(id);
			Select sel=new Select(element);
			sel.selectByIndex(value);
			//System.out.println("The Dropdown Element with Id "+id+" is selected with Index value "+value);
			reportStep("The Dropdown Element with Id "+id+" is selected with Index value ", "pass");

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		    //System.err.println("The Dropdown Element with Id "+id+" is not found in DOM");
			reportStep("The Dropdown Element with Id "+id+" is not found in DOM", "fail");

		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The Dropdown Element with Id "+id+" is not visible in the application");
			reportStep("The Dropdown Element with Id "+id+" is not visible in the application", "fail");

		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The Dropdown Element with Id "+id+" is not Interactable in the application");
			reportStep("The Dropdown Element with Id "+id+" is not Interactable in the application", "fail");

		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Dropdown Element with Id "+id+" is not Stable in the application");
			reportStep("The Dropdown Element with Id "+id+" is not Stable in the application", "fail");

		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The Dropdown Element with Id "+id+" is not selectable in the application");
			reportStep("The Dropdown Element with Id "+id+" is not selectable in the application", "fail");

		} catch (WebDriverException  e) {
			// TODO: handle exception
			//System.err.println("The Dropdown Element with Id "+id+" is not functioning due to Unknown error");
			reportStep("The Dropdown Element with Id "+id+" is not functioning due to Unknown error", "fail");
		}
	}

	
	public void switchToParentWindow() {
		// TODO Auto-generated method stub
		try {
			Set<String> allWinIDAfterClick=driver.getWindowHandles();
			for (String eachID : allWinIDAfterClick) {
				driver.switchTo().window(eachID);
				break;
			}
	        //System.out.println("The Window is a Parent Window which is switched from latest window");
			reportStep("The Window is a Parent Window which is switched from latest window", "pass");

		} catch (NoSuchWindowException e) {
			// TODO: handle exception
			//System.err.println("The Window is not switched to Parent Window due to No Such Window in that browser");
			reportStep("The Window is not switched to Parent Window due to No Such Window in that browser", "fail");

		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The Window is not switched to Parent Window due to Unknown error");
			reportStep("The Window is not switched to Parent Window due to Unknown error", "fail");
		}
	}

	
	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		try {
			Set<String> allWinIDAfterClick=driver.getWindowHandles();
			for (String eachID : allWinIDAfterClick) {
				driver.switchTo().window(eachID);
			}
	        //System.out.println("The Window is a Latest(Last) Window which is switched from parent window");
			reportStep("The Window is a Latest(Last) Window which is switched from parent window", "pass");

		} catch (NoSuchWindowException e) {
			// TODO: handle exception
			//System.err.println("The Window is not switched to Latest(Last) Window due to No Such Window in that browser");
			reportStep("The Window is not switched to Latest(Last) Window due to No Such Window in that browser", "fail");

		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The Window is not switched to Latest(Last) Window due to Unknown error");
			reportStep("The Window is not switched to Latest(Last) Window due to Unknown error", "fail");
		}
	}

	
	public void acceptAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().accept();
			//System.out.println("The Alert is Accepted");
			reportStep("The Alert is Accepted", "pass");

		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("Alert is not Accepted due to No Alert is Present");
			reportStep("Alert is not Accepted due to No Alert is Present", "fail");

		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Alert is not Accepted due to Unknown error");
			reportStep("Alert is not Accepted due to Unknown error", "fail");
		}	
	}

	
	public void dismissAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().dismiss();
			//System.out.println("The Alert is Dismiss");
			reportStep("The Alert is Dismiss", "pass");

		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("Alert is not Dismiss due to No Alert is Present");
			reportStep("Alert is not Dismiss due to No Alert is Present", "fail");

		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Alert is not Dismiss due to Unknown error");
			reportStep("Alert is not Dismiss due to Unknown error", "fail");
		}	
	}

	
	public String getAlertText() {
		// TODO Auto-generated method stub
		String alertText=null;
		try {
			alertText=driver.switchTo().alert().getText();
			//System.out.println("The Text from Alert "+alertText);
			reportStep("The Text from Alert "+alertText, "pass");

		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("Alert Text is not get due to No Alert is Present");
			reportStep("Alert Text is not get due to No Alert is Present", "fail");

		} catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("Alert Text is not get due to Unhandled Alert is Present");
			reportStep("Alert Text is not get due to Unhandled Alert is Present", "fail");

		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Alert Text is not get due to Unknown error");
			reportStep("Alert Text is not get due to Unknown error", "fail");
		}
		return alertText;
	}

	
	public long takeSnap() {
		// TODO Auto-generated method stub	
		
		long number =0;
		try {
			
			number = (long) (Math.floor(Math.random()*100000000)+100000);
			
			File temp = driver.getScreenshotAs(OutputType.FILE);
			
			File dest = new File("./reports/screenshots/"+number+".png");
			
			FileUtils.copyFile(temp, dest);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	return number;
		
	}

	
	public void closeBrowser() {
		// TODO Auto-generated method stub
		try {
			driver.close();
			//System.out.println("The Browser is closed");
			reportStep("The Browser is closed", "pass");

		} catch (SessionNotCreatedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Browser is not closed due to Session Not Created");
			reportStep("The Browser is not closed due to Session Not Created", "fail");

		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The Browser is not closed due to Unknown error");
			reportStep("The Browser is not closed due to Unknown error", "fail");
		}	
	}

	
	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		try {
			driver.quit();
			//System.out.println("The All Browsers are closed");
			reportStep("The All Browsers are closed", "pass", false);

		} catch (SessionNotCreatedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The All Browsers are not closed due to Session Not Created");
			reportStep("The All Browsers are not closed due to Session Not Created", "fail", false);

		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The All Browsers are not closed due to Unknown error");
			reportStep("The All Browsers are not closed due to Unknown error", "fail", false);
		}
     }


	public void waitProperty(long time)  {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(time);
			//System.out.println("The Sleep is activated for time "+time+" milliseconds");
			reportStep("The Sleep is activated for time "+time+" milliseconds", "pass");

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Sleep is not working due to Interrupted error");
			reportStep("The Sleep is not working due to Interrupted error", "fail");

		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The Sleep is not working due to Unknown error");
			reportStep("The Sleep is not working due to Unknown error", "fail");
		} 		
	 }


	public void pagedown() {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
			//System.out.println("The Pagedown method is accessed");
			reportStep("The Pagedown method is accessed", "pass");

		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Pagedown is not working due to Unknown error");
			reportStep("The Pagedown is not working due to Unknown error", "fail");
		} 
	}


	public void selectVisibileTextByXpath(String xpath, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement element=driver.findElementByXPath(xpath);
			Select sel=new Select(element);
			sel.selectByVisibleText(value);
			//System.out.println("The Dropdown Element with Xpath "+xpath+" is selected with VisibleText value "+value);
			reportStep("The Dropdown Element with Xpath "+xpath+" is selected with VisibleText value ", "pass");

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		    //System.err.println("The Dropdown Element with Xpath "+xpath+" is not found in DOM");
			reportStep("The Dropdown Element with Xpath "+xpath+" is not found in DOM", "fail");

		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The Dropdown Element with Xpath "+xpath+" is not visible in the application");
			reportStep("The Dropdown Element with Xpath "+xpath+" is not visible in the application", "fail");

		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The Dropdown Element with Xpath "+xpath+" is not Interactable in the application");
			reportStep("The Dropdown Element with Xpath "+xpath+" is not Interactable in the application", "fail");

		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Dropdown Element with Xpath "+xpath+" is not Stable in the application");
			reportStep("The Dropdown Element with Xpath "+xpath+" is not Stable in the application", "fail");

		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The Dropdown Element with Xpath "+xpath+" is not selectable in the application");
			reportStep("The Dropdown Element with Xpath "+xpath+" is not selectable in the application", "fail");

		} catch (WebDriverException  e) {
			// TODO: handle exception
			//System.err.println("The Dropdown Element with Xpath "+xpath+" is not functioning due to Unknown error");
			reportStep("The Dropdown Element with Xpath "+xpath+" is not functioning due to Unknown error", "fail");
		}
	 }


	public void TABkey() {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath("//html/body").sendKeys(Keys.TAB);
			//System.out.println("The TAB Key is accessed");
			reportStep("The TAB Key is accessed", "pass");

		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The TAB Key is not working due to Unknown error");
			reportStep("The TAB Key is not working due to Unknown error", "fail");
		}
	  }


	public void mouseHoverByXpath(String xpath) {
		// TODO Auto-generated method stub
		
		try {
			Actions builder =new Actions(driver);
			WebElement element = driver.findElementByXPath(xpath);
			builder.moveToElement(element).perform();
			//System.out.println("The MouseHover Element with Xpath "+xpath+" is on element");
			reportStep("The MouseHover Element with Xpath "+xpath+" is on element", "pass");

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		    //System.err.println("The MouseHover Element with Xpath "+xpath+" is not found in DOM");
			reportStep("The MouseHover Element with Xpath "+xpath+" is not found in DOM", "fail");

		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The MouseHover Element with Xpath "+xpath+" is not visible in the application");
			reportStep("The MouseHover Element with Xpath "+xpath+" is not visible in the application", "fail");

		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The MouseHover Element with Xpath "+xpath+" is not Interactable in the application");
			reportStep("The MouseHover Element with Xpath "+xpath+" is not Interactable in the application", "fail");

		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The MouseHover Element with Xpath "+xpath+" is not Stable in the application");
			reportStep("The MouseHover Element with Xpath "+xpath+" is not Stable in the application", "fail");

		} catch (WebDriverException  e) {
			// TODO: handle exception
			//System.err.println("The MouseHover Element with Xpath "+xpath+" is not functioning due to Unknown error");
			reportStep("The MouseHover Element with Xpath "+xpath+" is not functioning due to Unknown error", "fail");
		}	
		
	
	
	}

	/*@Override
	public String replaceXpath(String xpath, String expectedValue) {
		// TODO Auto-generated method stub
		String modifiedXPath=null;
		try {
			if(xpath.contains("option")) {
				 modifiedXPath = xpath.replace("option", expectedValue);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return modifiedXPath;
	}*/
	
}