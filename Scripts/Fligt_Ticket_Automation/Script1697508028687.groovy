import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

TotalRow = findTestData('Flight_Ticket_Automation_Data').getRowNumbers()

for (rowNum = 1; rowNum <= TotalRow; rowNum++) {
	
originAirport = findTestData('Flight_Ticket_Automation_Data').getValue(1, rowNum)
destinationAirport = findTestData('Flight_Ticket_Automation_Data').getValue(2, rowNum)
departDate = findTestData('Flight_Ticket_Automation_Data').getValue(3, rowNum)
returnDate = findTestData('Flight_Ticket_Automation_Data').getValue(4, rowNum)
numberOfPassengers = findTestData('Flight_Ticket_Automation_Data').getValue(5, rowNum)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.aa.com/homePage.do')

WebUI.setText(findTestObject('Object Repository/Page_American Airlines - Airline tickets an_de6793/input_From_originAirport'), 
    '')

WebUI.click(findTestObject('Object Repository/Page_American Airlines - Airline tickets an_de6793/div_From                                   _245d91'))

WebUI.setText(findTestObject('Object Repository/Page_American Airlines - Airline tickets an_de6793/input_From_originAirport'), 
    originAirport)

WebUI.setText(findTestObject('Object Repository/Page_American Airlines - Airline tickets an_de6793/input_To_destinationAirport'), 
    destinationAirport)

WebUI.setText(findTestObject('Object Repository/Page_American Airlines - Airline tickets an_de6793/input_(date format mmddyyyy)_departDate'), 
    departDate )

WebUI.setText(findTestObject('Object Repository/Page_American Airlines - Airline tickets an_de6793/input_(date format mmddyyyy)_returnDate'), 
    returnDate )

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_American Airlines - Airline tickets an_de6793/select_1                                   _5ab068'), 
    numberOfPassengers , true)

WebUI.click(findTestObject('Object Repository/Page_American Airlines - Airline tickets an_de6793/input_Fare preference_flightSearchForm.butt_d1acf4'))

WebUI.delay(40)

WebUI.closeBrowser()
}


