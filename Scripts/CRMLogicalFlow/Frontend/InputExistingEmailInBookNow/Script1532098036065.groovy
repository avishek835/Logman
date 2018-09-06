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



WebUI.navigateToUrl('http://172.16.20.5:94/Landing.aspx')
WebUI.maximizeWindow()



WebUI.setText(findTestObject('Object Repository/FrontendInputExistingEmail/Page_JobyCo/input_ctl00ContentPlaceHolder1'), 
    'avishek20@mailinator.com')

WebUI.click(findTestObject('Object Repository/FrontendInputExistingEmail/Page_JobyCo/button_Book Now'))

WebUI.waitForJQueryLoad(20)

WebUI.click(findTestObject('Object Repository/FrontendInputExistingEmail/Page_JobyCo/button_OK'))

WebUI.waitForPageLoad(20)

WebUI.setText(findTestObject('Demo/Page_JobyCo/input_ctl00ContentPlaceHolder1'),'avishek20@mailinator.com')

WebUI.setEncryptedText(findTestObject('Object Repository/FrontendInputExistingEmail/Page_JobyCo/input_ctl00ContentPlaceHolder1_1'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/FrontendInputExistingEmail/Page_JobyCo/input_ctl00ContentPlaceHolder1_2'))

WebUI.click(findTestObject('Object Repository/FrontendInputExistingEmail/Page_/span_glyphicon glyphicon-user'))

WebUI.click(findTestObject('Object Repository/FrontendInputExistingEmail/Page_/button_Sign Out'))



