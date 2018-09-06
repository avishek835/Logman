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
//Open the browser and navigate to the URL
//WebUI.openBrowser('')
//WebUI.navigateToUrl('http://portal.logmanproj.com/Login.aspx')
//WebUI.maximizeWindow()
WebUI.navigateToUrl(GlobalVariable.URL1)
//Login to the CRM Portal by giving id and password
WebUI.setText(findTestObject('Object Repository/AddBookingCRM/Page_JobyCo/input_ctl00ContentPlaceHolder1 (2)'), 'avishek101@mailinator.com')
WebUI.setEncryptedText(findTestObject('Object Repository/AddBookingCRM/Page_JobyCo/input_ctl00ContentPlaceHolder1_1 (1)'), 
    'aeHFOx8jV/A=')
WebUI.click(findTestObject('CRM_ObjectRepositoryShipping/Page_JobyCo/input_ctl00ContentPlaceHolder1_2'))

//Click on left panel navigation bar
WebUI.click(findTestObject('CRM_ObjectRepositoryShipping/Page_/button_toggle navigation'))
WebUI.click(findTestObject('CRM_ObjectRepositoryShipping/Page_/a_Shipping'))
WebUI.click(findTestObject('CRM_ObjectRepositoryShipping/Page_/a_Add Shipping'))

//Provide data in respective field to add shipping
WebUI.setText(findTestObject('CRM_ObjectRepositoryShipping/Page_/input_ctl00ContentPlaceHolder1'), 'CVF6789')
WebUI.setText(findTestObject('CRM_ObjectRepositoryShipping/Page_/input_ctl00ContentPlaceHolder1_1'), '89255896')
WebUI.selectOptionByValue(findTestObject('Object Repository/CRM_ObjectRepositoryShipping/Page_ (8)/select_Select Booking NumberJB'),'JBCO000000001',true)
WebUI.selectOptionByValue(findTestObject('CRM_ObjectRepositoryShipping/Page_/select_Select Shipping FromAbe'), '285', true)
WebUI.selectOptionByValue(findTestObject('CRM_ObjectRepositoryShipping/Page_/select_Select Shipping ToAberd'), '286', true)
WebUI.setText(findTestObject('CRM_ObjectRepositoryShipping/Page_/input_ctl00ContentPlaceHolder1_2'), 'Ferryport')
WebUI.selectOptionByValue(findTestObject('CRM_ObjectRepositoryShipping/Page_/select_Select Freight TypeFrei'), 'Freight', true)
WebUI.click(findTestObject('Object Repository/CRM_ObjectRepositoryShipping/Page_ (3)/input_ctl00ContentPlaceHolder1'))
WebUI.click(findTestObject('Object Repository/CRM_ObjectRepositoryShipping/Page_ (4)/div_July 2018SuMoTuWeThFrSa242'))
WebUI.waitForJQueryLoad(5)
WebUI.click(findTestObject('Object Repository/CRM_ObjectRepositoryShipping/Page_ (6)/input_ctl00ContentPlaceHolder1 (1)'))
WebUI.click(findTestObject('Object Repository/CRM_ObjectRepositoryShipping/Page_ (6)/div_July 2018SuMoTuWeThFrSa242 (1)'))
WebUI.waitForJQueryLoad(5)
WebUI.setText(findTestObject('CRM_ObjectRepositoryShipping/Page_/input_ctl00ContentPlaceHolder1_3'), '7896')
WebUI.setText(findTestObject('CRM_ObjectRepositoryShipping/Page_/input_ctl00ContentPlaceHolder1_4'), '100')
WebUI.setText(findTestObject('CRM_ObjectRepositoryShipping/Page_/input_ctl00ContentPlaceHolder1_5'), '1')
WebUI.setText(findTestObject('CRM_ObjectRepositoryShipping/Page_/textarea_ctl00ContentPlaceHold'), 'test')
WebUI.click(findTestObject('CRM_ObjectRepositoryShipping/Page_/input_ctl00ContentPlaceHolder1_6'))
WebUI.mouseOver(findTestObject('CRM_ObjectRepositoryShipping/Page_/button_OK'))
WebUI.waitForJQueryLoad(5)
WebUI.takeScreenshot()

//Confirmation popup will populate for successful added shipping
WebUI.click(findTestObject('CRM_ObjectRepositoryShipping/Page_/button_OK'))
WebUI.waitForJQueryLoad(5)

//Redirect the shipping list page and clik the download pdf button
WebUI.mouseOver(findTestObject('CRM_ObjectRepositoryShipping/Page_/a_SHIP000000005'))
WebUI.click(findTestObject('CRM_ObjectRepositoryShipping/Page_/a_SHIP000000005'))
WebUI.waitForJQueryLoad(10)
WebUI.mouseOver(findTestObject('CRM_ObjectRepositoryShipping/Page_/i_fa fa-file-pdf-o'))
WebUI.click(findTestObject('CRM_ObjectRepositoryShipping/Page_/i_fa fa-file-pdf-o'))
WebUI.takeScreenshot()

//Initiate the signout process
WebUI.click(findTestObject('Object Repository/CRM_ObjectRepositoryShipping/Page_ (7)/span_glyphicon glyphicon-user'))
WebUI.click(findTestObject('Object Repository/CRM_ObjectRepositoryShipping/Page_ (7)/button_Sign Out'))
WebUI.takeScreenshot()


WebUI.waitForJQueryLoad(5)


