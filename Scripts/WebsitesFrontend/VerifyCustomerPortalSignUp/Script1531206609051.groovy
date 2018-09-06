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

WebUI.click(findTestObject('VerifyCustomerPortalSignUp/Page_JobyCo/a_Customer Portal'))

WebUI.click(findTestObject('VerifyCustomerPortalSignUp/Page_JobyCo/a_Sign Up'))

WebUI.setText(findTestObject('VerifyCustomerPortalSignUp/Page_JobyCo/input_ctl00ContentPlaceHolder1'), 'Avishek')

WebUI.setText(findTestObject('VerifyCustomerPortalSignUp/Page_JobyCo/input_ctl00ContentPlaceHolder1_1'), 'avishek22@mailinator.com')

WebUI.setText(findTestObject('VerifyCustomerPortalSignUp/Page_JobyCo/input_ctl00ContentPlaceHolder1_2'), 'password123456!@#$%^')

WebUI.setText(findTestObject('VerifyCustomerPortalSignUp/Page_JobyCo/input_phone'), '1234567898')

WebUI.click(findTestObject('VerifyCustomerPortalSignUp/Page_JobyCo/input_ctl00ContentPlaceHolder1_3'))

WebUI.setText(findTestObject('VerifyCustomerPortalSignUp/Page_JobyCo/input_ctl00ContentPlaceHolder1_2'), '123456')

WebUI.click(findTestObject('VerifyCustomerPortalSignUp/Page_JobyCo/input_ctl00ContentPlaceHolder1_3'))
WebUI.takeScreenshot()

WebUI.mouseOver(findTestObject('Object Repository/VerifyCustomerPortalSignUp/Popoverbutton/Page_JobyCo/button_OK'))
WebUI.click(findTestObject('Object Repository/VerifyCustomerPortalSignUp/Popoverbutton/Page_JobyCo/button_OK'))
WebUI.takeScreenshot()

WebUI.closeBrowser()

