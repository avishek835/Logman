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

WebUI.click(findTestObject('Object Repository/Page_/button_toggle navigation (1)'))

WebUI.click(findTestObject('Object Repository/Page_/a_Warehouse (1)'))
WebUI.click(findTestObject('Object Repository/Page_/a_New Warehouse (1)'))
WebUI.click(findTestObject('Object Repository/Page_/button_toggle navigation (1)'))
WebUI.click(findTestObject('Object Repository/Page_/a_Warehouse (1)'))

WebUI.waitForPageLoad(10)
WebUI.waitForJQueryLoad(10)

WebUI.click(findTestObject('Object Repository/Page_/a_View all Warehouses (1)'))

WebUI.waitForPageLoad(10)
WebUI.waitForJQueryLoad(10)

WebUI.click(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1 (1) (1)'))

WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_1 (1)'), 'centurocommx')
WebUI.waitForJQueryLoad(50)
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_Select Warehouse Locati (1)'), 'LOC000000004', 
    true)


WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_Select Warehouse ZoneEa'), 'ZONE000000001', true)
WebUI.click(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_2 (1)'))

WebUI.waitForPageLoad(10)
WebUI.waitForJQueryLoad(10)

WebUI.mouseOver(findTestObject('Object Repository/Page_/button_OK (1)'))
WebUI.click(findTestObject('Object Repository/Page_/button_OK (1)'))

WebUI.waitForPageLoad(30)
WebUI.waitForJQueryLoad(30)

WebUI.click(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_4 (1)'))

WebUI.click(findTestObject('Object Repository/Page_/span_glyphicon glyphicon-user (1)'))
WebUI.click(findTestObject('Object Repository/Page_/button_Sign Out (1)'))


