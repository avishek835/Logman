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


WebUI.openBrowser('')
WebUI.navigateToUrl('http://172.16.20.5:94/Login.aspx')
WebUI.maximizeWindow()
WebUI.takeScreenshot()
WebUI.setText(findTestObject('LoginandRequestAQuote/Page_JobyCo/input_ctl00ContentPlaceHolder1'), 'avishek20@mailinator.com')

WebUI.setText(findTestObject('LoginandRequestAQuote/Page_JobyCo/input_ctl00ContentPlaceHolder1_1'), '123456')

WebUI.click(findTestObject('LoginandRequestAQuote/Page_JobyCo/input_ctl00ContentPlaceHolder1_2'))


WebUI.takeScreenshot()



WebUI.click(findTestObject('LoginandRequestAQuote/Page_/label_Request A Quote'))

WebUI.selectOptionByValue(findTestObject('LoginandRequestAQuote/Page_/select_Please SelectYesNo'), '0', true)

WebUI.selectOptionByValue(findTestObject('LoginandRequestAQuote/Page_/select_Please SelectYesNoI am'), '1', true)

WebUI.selectOptionByValue(findTestObject('LoginandRequestAQuote/Page_/select_Pickup Category'), '52', true)

WebUI.selectOptionByValue(findTestObject('LoginandRequestAQuote/Page_/select_Pickup ItemSuitCaseGhan'), '1', true)

WebUI.setText(findTestObject('LoginandRequestAQuote/Page_/input_estimatedValue'), '120')

WebUI.click(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1'))
WebUI.click(findTestObject('Object Repository/CaptureObject/Page_/Page_/table_July 2018SuMoTuWeThFrSa2'))

WebUI.check(findTestObject('LoginandRequestAQuote/Page_/input_ctl00ContentPlaceHolder1'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('LoginandRequestAQuote/Page_/input_next'))
WebUI.takeScreenshot()

WebUI.setText(findTestObject('LoginandRequestAQuote/Page_/input_ctl00ContentPlaceHolder1_1'), 'Avishek')

WebUI.setText(findTestObject('LoginandRequestAQuote/Page_/input_ctl00ContentPlaceHolder1_2'), 'Kol')


WebUI.setText(findTestObject('LoginandRequestAQuote/Page_/input_ctl00ContentPlaceHolder1_2'), 'Kolkata')

WebUI.setText(findTestObject('LoginandRequestAQuote/Page_/input_ctl00ContentPlaceHolder1_3'), '700039')

WebUI.setText(findTestObject('LoginandRequestAQuote/Page_/input_ctl00ContentPlaceHolder1_4'), '1234567890')

WebUI.setText(findTestObject('LoginandRequestAQuote/Page_/input_ctl00ContentPlaceHolder1_5'), 'avishek20@mailinator.com')

WebUI.setText(findTestObject('LoginandRequestAQuote/Page_/input_ctl00ContentPlaceHolder1_6'), 'Avishek')

WebUI.setText(findTestObject('LoginandRequestAQuote/Page_/input_ctl00ContentPlaceHolder1_7'), 'Kolkata')



WebUI.setText(findTestObject('LoginandRequestAQuote/Page_/input_ctl00ContentPlaceHolder1_8'), '700090')

WebUI.setText(findTestObject('LoginandRequestAQuote/Page_/input_ctl00ContentPlaceHolder1_9'), '5645641252')

WebUI.setText(findTestObject('LoginandRequestAQuote/Page_/input_ctl00ContentPlaceHolder1_10'), 'avishek20@mailinator.com')


WebUI.takeScreenshot()
WebUI.click(findTestObject('Object Repository/CaptureObject/Page_ (1)/Page_ (1)/input_next'))
WebUI.takeScreenshot()

WebUI.click(findTestObject('LoginandRequestAQuote/Page_/input_ctl00ContentPlaceHolder1_11'))

WebUI.click(findTestObject('LoginandRequestAQuote/Page_/input_ctl00ContentPlaceHolder1_12'))


WebUI.waitForAlert(10)
WebUI.mouseOver(findTestObject('Object Repository/CaptureObject/Page_ (1)/Page_ (1)/Page_/a_Back to Dashboard'))

WebUI.click(findTestObject('Object Repository/CaptureObject/Page_ (1)/Page_ (1)/Page_/a_Back to Dashboard'))

WebUI.takeScreenshot()
WebUI.click(findTestObject('LoginandRequestAQuote/Page_/span_glyphicon glyphicon-user'))

WebUI.click(findTestObject('LoginandRequestAQuote/Page_/button_Sign Out'))
WebUI.takeScreenshot()

WebUI.closeBrowser()

