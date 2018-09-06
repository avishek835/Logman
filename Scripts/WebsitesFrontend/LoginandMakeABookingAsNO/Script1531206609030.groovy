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

//OpenBrowser
WebUI.openBrowser('')
WebUI.navigateToUrl('http://172.16.20.5:94/Login.aspx')
WebUI.maximizeWindow()
WebUI.takeScreenshot()


//Login
WebUI.setText(findTestObject('Bookings/Page_JobyCo/input_ctl00ContentPlaceHolder1'), 'avishek20@mailinator.com')
WebUI.setText(findTestObject('Bookings/Page_JobyCo/input_ctl00ContentPlaceHolder1_1'), '123456')
WebUI.click(findTestObject('Bookings/Page_JobyCo/input_ctl00ContentPlaceHolder1_2'))
WebUI.takeScreenshot()

//Navigate make a booking
WebUI.click(findTestObject('Object Repository/CaptureObject/Page_ (3)/label_Make a Booking'))
WebUI.selectOptionByValue(findTestObject('Bookings/Page_/select_Please SelectYesNo'), '0', true)
WebUI.selectOptionByValue(findTestObject('Bookings/Page_/select_Please SelectYesNoI am'), '1', true)
WebUI.selectOptionByValue(findTestObject('Bookings/Page_/select_Pickup Category'), '52', true)
WebUI.selectOptionByValue(findTestObject('Bookings/Page_/select_Pickup ItemSuitCaseGhan'), '1', true)
WebUI.setText(findTestObject('Bookings/Page_/input_estimatedValue'), '45')
WebUI.click(findTestObject('Bookings/Page_/button_Add Row'))
WebUI.selectOptionByValue(findTestObject('Bookings/Page_/select_Pickup CategoryAir Cond'), '53', true)
WebUI.setText(findTestObject('Bookings/Page_/input_estimatedValue_1'), '115')
//WebUI.click(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1'))
WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1'), '02-08-2018')
//WebUI.click(findTestObject('Object Repository/CaptureObject/Page_/Page_/table_July 2018SuMoTuWeThFrSa2'))
//WebUI.mouseOver(findTestObject('Object Repository/Page_/td_31'))
//WebUI.click(findTestObject('Object Repository/Page_/td_31'))
//WebUI.mouseOver(findTestObject('Object Repository/Bookings/Page_/td_31'))
//WebUI.click(findTestObject('Object Repository/Bookings/Page_/th_'))
//WebUI.click(findTestObject('Object Repository/Bookings/Page_/td_31'))
//WebUI.click(findTestObject('Object Repository/Bookings/Page_/td_23'))
WebUI.click(findTestObject('Bookings/Page_/input_ctl00ContentPlaceHolder1'))
WebUI.click(findTestObject('Bookings/Page_/input_next'))


//Navigate make a booking next page
WebUI.setText(findTestObject('Bookings/Page_/input_ctl00ContentPlaceHolder1_1'), 'Avishek')

WebUI.setText(findTestObject('Bookings/Page_/input_ctl00ContentPlaceHolder1_2'), 'Kolkata')

WebUI.setText(findTestObject('Bookings/Page_/input_ctl00ContentPlaceHolder1_3'), '2563')

WebUI.setText(findTestObject('Bookings/Page_/input_ctl00ContentPlaceHolder1_4'), '1234567890')

WebUI.click(findTestObject('Bookings/Page_/div_Pickup Email Address'))

WebUI.setText(findTestObject('Bookings/Page_/input_ctl00ContentPlaceHolder1_5'), 'avishek5@mailinator.com')

WebUI.setText(findTestObject('Bookings/Page_/input_ctl00ContentPlaceHolder1_6'), 'Avi')

WebUI.setText(findTestObject('Bookings/Page_/input_ctl00ContentPlaceHolder1_7'), 'Kolkata')

WebUI.setText(findTestObject('Bookings/Page_/input_ctl00ContentPlaceHolder1_8'), '4578')

WebUI.setText(findTestObject('Bookings/Page_/input_ctl00ContentPlaceHolder1_9'), '1234567890')

WebUI.setText(findTestObject('Bookings/Page_/input_ctl00ContentPlaceHolder1_10'), 'avisshek@mailinator.com')

//WebUI.click(findTestObject('Bookings/Page_/input_next'))

WebUI.click(findTestObject('Object Repository/Bookings/Page_ (1)/input_next'))
WebUI.waitForJQueryLoad(10)
WebUI.click(findTestObject('Bookings/Page_/input_ctl00ContentPlaceHolder1_11'))

WebUI.click(findTestObject('Bookings/Page_/input_ctl00ContentPlaceHolder1_12'))

WebUI.mouseOver(findTestObject('Bookings/Page_/button_Pay at  Kolkata'))
WebUI.click(findTestObject('Bookings/Page_/button_Pay at  Kolkata'))

WebUI.waitForAlert(40)
WebUI.mouseOver(findTestObject('Bookings/Page_/a_Back to Dashboard'))
WebUI.click(findTestObject('Bookings/Page_/a_Back to Dashboard'))

WebUI.closeBrowser()

