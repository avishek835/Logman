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

//WebUI.openBrowser('')
//WebUI.navigateToUrl('http://portal.logmanproj.com/Login.aspx')
//WebUI.maximizeWindow()
WebUI.navigateToUrl(GlobalVariable.URL1)
WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/AddBookingCRM/Page_JobyCo/input_ctl00ContentPlaceHolder1 (2)'), 'avishek101@mailinator.com')
WebUI.setEncryptedText(findTestObject('Object Repository/AddBookingCRM/Page_JobyCo/input_ctl00ContentPlaceHolder1_1 (1)'), 
    'aeHFOx8jV/A=')
WebUI.click(findTestObject('Location/Page_JobyCo/input_ctl00ContentPlaceHolder1_2'))

WebUI.click(findTestObject('Location/Page_/span_drawer-hamburger-icon'))

WebUI.click(findTestObject('Location/Page_/a_Location'))
WebUI.waitForPageLoad(10)
WebUI.waitForJQueryLoad(10)
WebUI.click(findTestObject('Location/Page_/a_View All Locations'))
WebUI.waitForPageLoad(10)
WebUI.waitForJQueryLoad(10)
WebUI.click(findTestObject('Location/Page_/input_ctl00ContentPlaceHolder1'))
WebUI.selectOptionByValue(findTestObject('Location/Page_/select_Select CountryAfghanist'), '271', true)
WebUI.selectOptionByValue(findTestObject('Location/Page_/select_Select CityAberdeenArma'), '38', true)
WebUI.selectOptionByValue(findTestObject('Location/Page_/select_Select CityAberdeenArma'), '37', true)
WebUI.selectOptionByValue(findTestObject('Location/Page_/select_Select LocationBarking'), '2', true)
WebUI.click(findTestObject('Location/Page_/input_ctl00ContentPlaceHolder1_2'))
WebUI.waitForPageLoad(10)
WebUI.waitForJQueryLoad(20)

WebUI.mouseOver(findTestObject('Location/Page_/button_OK'))
WebUI.click(findTestObject('Location/Page_/button_OK'))
WebUI.waitForPageLoad(30)
WebUI.waitForJQueryLoad(30)

WebUI.click(findTestObject('Location/Page_/input_ctl00ContentPlaceHolder1'))
WebUI.waitForPageLoad(30)
WebUI.waitForJQueryLoad(30)
WebUI.selectOptionByValue(findTestObject('Location/Page_/select_Select CountryAfghanist'), '271', true)
WebUI.waitForPageLoad(30)
WebUI.waitForJQueryLoad(30)
WebUI.selectOptionByValue(findTestObject('Location/Page_/select_Select CityAberdeenArma'), '37', true)
WebUI.waitForPageLoad(30)
WebUI.waitForJQueryLoad(30)
WebUI.selectOptionByValue(findTestObject('Location/Page_/select_Select LocationBarking'), '23', true)

WebUI.click(findTestObject('Location/Page_/input_ctl00ContentPlaceHolder1_2'))
WebUI.waitForPageLoad(10)
WebUI.waitForJQueryLoad(10)
WebUI.mouseOver(findTestObject('Location/Page_/button_OK'))
WebUI.click(findTestObject('Location/Page_/button_OK'))

WebUI.click(findTestObject('Location/Page_/i_fa fa-pencil'))
WebUI.click(findTestObject('Location/Page_/span_glyphicon glyphicon-user'))
WebUI.click(findTestObject('Location/Page_/button_Sign Out'))



