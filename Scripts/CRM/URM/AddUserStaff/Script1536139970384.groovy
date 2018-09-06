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
WebUI.setText(findTestObject('Object Repository/AddStaffUser/Page_JobyCo/input_ctl00ContentPlaceHolder1'), 'support@switch2web.com')

WebUI.setEncryptedText(findTestObject('Object Repository/AddStaffUser/Page_JobyCo/input_ctl00ContentPlaceHolder1_1'), 'Ap3LhOHjBS4=')

WebUI.click(findTestObject('Object Repository/AddStaffUser/Page_JobyCo/input_ctl00ContentPlaceHolder1_2'))

WebUI.waitForPageLoad(10)
WebUI.waitForJQueryLoad(10)
WebUI.click(findTestObject('Object Repository/AddStaffUser/Page_/span_drawer-hamburger-icon'))

WebUI.click(findTestObject('Object Repository/AddStaffUser/Page_/a_User'))

WebUI.click(findTestObject('Object Repository/AddStaffUser/Page_/a_New User'))

WebUI.setText(findTestObject('Object Repository/AddStaffUser/Page_/input_ctl00ContentPlaceHolder1'), 'avistaff6@mailinator.com')

WebUI.setText(findTestObject('Object Repository/AddStaffUser/Page_/input_ctl00ContentPlaceHolder1_1'), 'avistaff6@mailinator.com')

WebUI.setEncryptedText(findTestObject('Object Repository/AddStaffUser/Page_/input_ctl00ContentPlaceHolder1_2'), 'aeHFOx8jV/A=')

WebUI.setEncryptedText(findTestObject('Object Repository/AddStaffUser/Page_/input_ctl00ContentPlaceHolder1_3'), 'aeHFOx8jV/A=')

WebUI.selectOptionByValue(findTestObject('Object Repository/AddStaffUser/Page_/select_Select TitleMrMrsMissMs'), '1', true)

WebUI.setText(findTestObject('Object Repository/AddStaffUser/Page_/input_ctl00ContentPlaceHolder1_4'), 'avistaff6')

WebUI.setText(findTestObject('Object Repository/AddStaffUser/Page_/input_ctl00ContentPlaceHolder1_5'), 'avistaff6')



WebUI.click(findTestObject('Object Repository/RoleObjectCapture/Page_/input_ctl00ContentPlaceHolder1'))
WebUI.click(findTestObject('Object Repository/AddStaffUser/Page_/th_September 2018'))

WebUI.click(findTestObject('Object Repository/AddStaffUser/Page_/th_2018'))

WebUI.click(findTestObject('Object Repository/AddStaffUser/Page_/th_'))

WebUI.click(findTestObject('Object Repository/AddStaffUser/Page_/span_2000'))

WebUI.click(findTestObject('Object Repository/AddStaffUser/Page_/span_Jan'))

WebUI.click(findTestObject('Object Repository/AddStaffUser/Page_/td_3'))

WebUI.setText(findTestObject('Object Repository/AddStaffUser/Page_/input_ctl00ContentPlaceHolder1_6'), 'kolkata')

WebUI.setText(findTestObject('Object Repository/AddStaffUser/Page_/input_ctl00ContentPlaceHolder1_7'), 'Bristol')

WebUI.selectOptionByValue(findTestObject('Object Repository/AddStaffUser/Page_/select_Select CountryAfghanist'), '156', 
    true)

WebUI.setText(findTestObject('Object Repository/AddStaffUser/Page_/input_ctl00ContentPlaceHolder1_8'), '7898654512')

WebUI.setText(findTestObject('Object Repository/AddStaffUser/Page_/input_ctl00ContentPlaceHolder1_9'), 'pet name')

WebUI.setText(findTestObject('Object Repository/AddStaffUser/Page_/input_ctl00ContentPlaceHolder1_10'), 'katty')

WebUI.selectOptionByValue(findTestObject('Object Repository/AddStaffUser/Page_/select_Select RoleAdministrato'), '12', true)

WebUI.click(findTestObject('Object Repository/AddStaffUser/Page_/input_ctl00ContentPlaceHolder1_11'))


WebUI.waitForJQueryLoad(30)
WebUI.waitForPageLoad(30)
WebUI.click(findTestObject('Object Repository/AddStaffUser/Page_/button_OK'))


WebUI.waitForPageLoad(20)
WebUI.waitForJQueryLoad(20)

WebUI.setText(findTestObject('Object Repository/AddStaffUser/Page_/input'), 'avi')

WebUI.click(findTestObject('Object Repository/AddStaffUser/Page_/span_glyphicon glyphicon-user'))

WebUI.click(findTestObject('Object Repository/AddStaffUser/Page_/button_Sign Out'))



