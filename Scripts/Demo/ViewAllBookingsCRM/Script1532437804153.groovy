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



WebUI.navigateToUrl(GlobalVariable.URL1)
WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_JobyCo/input_ctl00ContentPlaceHolder1 (3)'), 'avishek101@mailinator.com')
WebUI.setEncryptedText(findTestObject('Page_JobyCo/input_ctl00ContentPlaceHolder1_1 (2)'), 'aeHFOx8jV/A=')
WebUI.click(findTestObject('Page_JobyCo/input_ctl00ContentPlaceHolder1_2 (2)'))

WebUI.click(findTestObject('Page_/button_toggle navigation (4)'))
WebUI.click(findTestObject('Page_/a_Booking (1)'))
WebUI.click(findTestObject('Page_/a_View All Bookings (1)'))


WebUI.click(findTestObject('Page_/a_JBCO000000144'))
WebUI.waitForJQueryLoad(10)
WebUI.mouseOver(findTestObject('Page_/button_ (1)'))
WebUI.click(findTestObject('Page_/button_ (1)'))


WebUI.waitForJQueryLoad(10)
WebUI.scrollToElement(findTestObject('Page_/a_2'), 10)
WebUI.mouseOver(findTestObject('Page_/a_2'))
WebUI.waitForJQueryLoad(20)
WebUI.click(findTestObject('Page_/a_2'))


if(WebUI.verifyElementPresent(findTestObject('Object Repository/ObjectViewBookingsCRM/Page_/a_JBCO000000135'), 10)== true)
{
	WebUI.click(findTestObject('Object Repository/ObjectViewBookingsCRM/Page_/a_JBCO000000135'))
	WebUI.waitForJQueryLoad(10)
	WebUI.mouseOver(findTestObject('Object Repository/ObjectViewBookingsCRM/Page_/button_'))
	WebUI.click(findTestObject('Object Repository/ObjectViewBookingsCRM/Page_/button_'))
	}
	
	
WebUI.waitForJQueryLoad(10)
WebUI.scrollToElement(findTestObject('Object Repository/ObjectViewBookingsCRM/Page_/a_5'), 10)
WebUI.mouseOver(findTestObject('Object Repository/ObjectViewBookingsCRM/Page_/a_5'))
WebUI.waitForJQueryLoad(20)
WebUI.click(findTestObject('Object Repository/ObjectViewBookingsCRM/Page_/a_5'))
	
if(WebUI.verifyElementPresent(findTestObject('Object Repository/ObjectViewBookingsCRM/Page_/a_JBCO000000115'),10)==true)
	{
	WebUI.scrollToElement(findTestObject('Object Repository/ObjectAddBookingCRM/Page_/Page_/input_ctl00ContentPlaceHolder1'),10)
	WebUI.click(findTestObject('Object Repository/ObjectViewBookingsCRM/Page_/a_JBCO000000115'))
	WebUI.waitForJQueryLoad(10)
	WebUI.mouseOver(findTestObject('Object Repository/ObjectViewBookingsCRM/Page_/button_'))
	WebUI.click(findTestObject('Object Repository/ObjectViewBookingsCRM/Page_/button_'))
	}
	

WebUI.click(findTestObject('Page_/span_glyphicon glyphicon-user (4)'))

WebUI.click(findTestObject('Page_/button_Sign Out (4)'))





