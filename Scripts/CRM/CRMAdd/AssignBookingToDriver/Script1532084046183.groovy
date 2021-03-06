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

WebUI.setText(findTestObject('Object Repository/AssignBookingToDriver/Page_JobyCo/input_ctl00ContentPlaceHolder1'), 'avishek101@mailinator.com')

WebUI.setEncryptedText(findTestObject('Object Repository/AssignBookingToDriver/Page_JobyCo/input_ctl00ContentPlaceHolder1_1'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/AssignBookingToDriver/Page_JobyCo/input_ctl00ContentPlaceHolder1_2'))

WebUI.click(findTestObject('Object Repository/AssignBookingToDriver/Page_/button_toggle navigation'))

WebUI.click(findTestObject('Object Repository/AssignBookingToDriver/Page_/a_Booking'))

WebUI.click(findTestObject('Object Repository/AssignBookingToDriver/Page_/a_Assign Booking To Driver'))

WebUI.click(findTestObject('Object Repository/AssignBookingToDriver/Page_/input_ctl00ContentPlaceHolder1'))

WebUI.mouseOver(findTestObject('Object Repository/AssignBookingToDriver/Page_/button_OK'))
WebUI.click(findTestObject('Object Repository/AssignBookingToDriver/Page_/button_OK'))

WebUI.click(findTestObject('Object Repository/AssignBookingToDriver/Page_/input_SelectCheckBox'))

WebUI.click(findTestObject('Object Repository/AssignBookingToDriver/Page_/input_ctl00ContentPlaceHolder1'))

WebUI.click(findTestObject('Object Repository/AssignBookingToDriver/Page_/span_Select Driver'))
WebUI.click(findTestObject('Object Repository/AssignBookingToDriver/Page_/Page_/ul_Select Driver  Avishekthirt'))

WebUI.click(findTestObject('Object Repository/AssignBookingToDriver/Page_/input_ctl00ContentPlaceHolder1_1'))

WebUI.mouseOver(findTestObject('Object Repository/AssignBookingToDriver/Page_/button_OK_1'))
WebUI.click(findTestObject('Object Repository/AssignBookingToDriver/Page_/button_OK_1'))

WebUI.click(findTestObject('Object Repository/AssignBookingToDriver/Page_/input_ctl00ContentPlaceHolder1_2'))

WebUI.click(findTestObject('Object Repository/AssignBookingToDriver/Page_/span_glyphicon glyphicon-user'))

WebUI.click(findTestObject('Object Repository/AssignBookingToDriver/Page_/button_Sign Out'))



