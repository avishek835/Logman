import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
for (def index:(0..1))  {
	WebUI.openBrowser('')
	println("Browser opened")
	WebUI.navigateToUrl('http://portal.logmanproj.com/Login.aspx')
	println ("Url loaded into the browser")
	WebUI.setText(findTestObject('Demo/Multiplebrowseropening/Page_JobyCo/input_ctl00ContentPlaceHolder1'), 'support@switch2web.com')
	println ("provide the email id in the id field")
	WebUI.setText(findTestObject('Demo/Multiplebrowseropening/Page_JobyCo/input_ctl00ContentPlaceHolder1_1'), 'sup123')
	println ("provide the browser in the password field")
	WebUI.click(findTestObject('Driver/Page_JobyCo/input_ctl00ContentPlaceHolder1_2'))
	println ("click in the sign in button")
}

println("Closing the browser")


