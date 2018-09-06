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

//WebUI.openBrowser('')
//WebUI.navigateToUrl('http://portal.logmanproj.com/Login.aspx')
//WebUI.maximizeWindow()
WebUI.navigateToUrl(GlobalVariable.URL1)
WebUI.maximizeWindow()
WebUI.setText(findTestObject('Object Repository/AddBookingCRM/Page_JobyCo/input_ctl00ContentPlaceHolder1 (2)'), 'avishek101@mailinator.com')
WebUI.setEncryptedText(findTestObject('Object Repository/AddBookingCRM/Page_JobyCo/input_ctl00ContentPlaceHolder1_1 (1)'), 
    'aeHFOx8jV/A=')
WebUI.click(findTestObject('Page_JobyCo/input_ctl00ContentPlaceHolder1_2'))

WebUI.waitForJQueryLoad(10)

WebUI.click(findTestObject('Object Repository/Page_/button_toggle navigation'))
WebUI.click(findTestObject('Object Repository/Page_/a_Zone'))
WebUI.click(findTestObject('Object Repository/Page_/a_View All Zones'))
WebUI.click(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1 (1)'))
WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_1'), 'London')
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_Select Zone LocationGre'), 'LOC000000003', true)
WebUI.click(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_2'))

WebUI.waitForPageLoad(20)
WebUI.waitForJQueryLoad(20)

WebUI.mouseOver(findTestObject('Object Repository/Page_/button_OK'))
WebUI.click(findTestObject('Object Repository/Page_/button_OK'))

WebUI.click(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_3'))

WebUI.click(findTestObject('Object Repository/Page_/span_glyphicon glyphicon-user'))
WebUI.click(findTestObject('Object Repository/Page_/button_Sign Out'))



