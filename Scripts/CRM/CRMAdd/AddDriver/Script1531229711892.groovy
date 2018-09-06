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
////This will open the URL
//WebUI.navigateToUrl('http://portal.logmanproj.com/Login.aspx')
//WebUI.maximizeWindow()
WebUI.navigateToUrl(GlobalVariable.URL1)
WebUI.maximizeWindow()
//Provide userid and password and click on login button
WebUI.setText(findTestObject('Object Repository/AddBookingCRM/Page_JobyCo/input_ctl00ContentPlaceHolder1 (2)'), 'avishek101@mailinator.com')
WebUI.setEncryptedText(findTestObject('Object Repository/AddBookingCRM/Page_JobyCo/input_ctl00ContentPlaceHolder1_1 (1)'), 
    'aeHFOx8jV/A=')
WebUI.click(findTestObject('Driver/Page_JobyCo/input_ctl00ContentPlaceHolder1_2'))


WebUI.takeScreenshot()

//Click left hamburger menu and click on add drivers
WebUI.click(findTestObject('Driver/Page_/button_toggle navigation'))
WebUI.click(findTestObject('Driver/Page_/a_Drivers'))
WebUI.click(findTestObject('Driver/Page_/a_Add a Driver'))

//Provide the data in necessary field
WebUI.setText(findTestObject('Driver/Page_/input_ctl00ContentPlaceHolder1'), 'avishek45@mailinator.com')
WebUI.setText(findTestObject('Driver/Page_/input_ctl00ContentPlaceHolder1_1'), '123456')
WebUI.setText(findTestObject('Driver/Page_/input_ctl00ContentPlaceHolder1_2'), 'AvishekthirtyFoutyfive')
WebUI.click(findTestObject('Object Repository/Demo/Page_ (2)/input_ctl00ContentPlaceHolder1'))
WebUI.waitForJQueryLoad(10)
WebUI.mouseOver(findTestObject('Driver/Page_/th_July 2018'))
WebUI.click(findTestObject('Driver/Page_/th_July 2018'))
WebUI.waitForJQueryLoad(10)
WebUI.click(findTestObject('Object Repository/Demo/Driver_DOB/Page_/th_2018'))
WebUI.click(findTestObject('Object Repository/Demo/Driver_DOB/Page_/th_'))
WebUI.click(findTestObject('Object Repository/Demo/Driver_DOB/Page_/th_'))
WebUI.click(findTestObject('Object Repository/Demo/Driver_DOB/Page_/th_'))

WebUI.waitForJQueryLoad(10)

WebUI.click(findTestObject('Object Repository/Demo/Driver_DOB/Page_/span_1985'))
WebUI.click(findTestObject('Object Repository/Demo/Driver_DOB/Page_/span_Aug'))
WebUI.click(findTestObject('Object Repository/Demo/Driver_DOB/Page_/td_23'))
WebUI.setText(findTestObject('Driver/Page_/input_txtAddressLine1'), 'Kolkata')
WebUI.setText(findTestObject('Driver/Page_/input_ctl00ContentPlaceHolder1_3'), '700091')

WebUI.setText(findTestObject('Driver/Page_/input_txtMobile'), '1234567890')
WebUI.click(findTestObject('Driver/Page_/input_ctl00ContentPlaceHolder1_4'))
WebUI.click(findTestObject('Driver/Page_/input_ctl00ContentPlaceHolder1_5'))
WebUI.click(findTestObject('Driver/Page_/input_ctl00ContentPlaceHolder1_6'))
WebUI.mouseOver(findTestObject('Driver/Page_/button_OK'))

WebUI.takeScreenshot()


//Successful added driver pop up will show
WebUI.waitForJQueryLoad(10)
WebUI.click(findTestObject('Driver/Page_/button_OK'))
WebUI.waitForJQueryLoad(10)
WebUI.mouseOver(findTestObject('Driver/Page_/i_fa fa-eye'))
WebUI.click(findTestObject('Driver/Page_/i_fa fa-eye'))

WebUI.waitForJQueryLoad(10)
WebUI.click(findTestObject('Driver/Page_/i_fa fa-file-pdf-o'))
WebUI.waitForJQueryLoad(10)

WebUI.mouseOver(findTestObject('Driver/Page_/i_fa fa-eye'))
WebUI.click(findTestObject('Driver/Page_/i_fa fa-eye'))
WebUI.waitForJQueryLoad(10)
WebUI.click(findTestObject('Driver/Page_/button_'))
WebUI.click(findTestObject('Driver/Page_/span_glyphicon glyphicon-user'))
WebUI.takeScreenshot()
WebUI.waitForJQueryLoad(10)

WebUI.click(findTestObject('Driver/Page_/button_Sign Out'))
WebUI.takeScreenshot()



