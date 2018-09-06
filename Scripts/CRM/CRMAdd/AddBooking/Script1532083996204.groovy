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
import org.openqa.selenium.Keys


WebUI.navigateToUrl('http://172.16.20.5:93/')
WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/AddBookingCRM/Page_JobyCo/input_ctl00ContentPlaceHolder1 (2)'), 'avishek101@mailinator.com')
WebUI.setEncryptedText(findTestObject('Object Repository/AddBookingCRM/Page_JobyCo/input_ctl00ContentPlaceHolder1_1 (1)'), 'aeHFOx8jV/A=')
WebUI.click(findTestObject('Object Repository/AddBookingCRM/Page_JobyCo/input_ctl00ContentPlaceHolder1_2 (1)'))


WebUI.click(findTestObject('Object Repository/AddBookingCRM/Page_/button_toggle navigation (3)'))
WebUI.click(findTestObject('Object Repository/AddBookingCRM/Page_/a_Booking'))
WebUI.click(findTestObject('Object Repository/AddBookingCRM/Page_/a_Make a Booking'))
WebUI.click(findTestObject('Object Repository/AddBookingCRM/Page_/span_Select Customer'))
WebUI.waitForJQueryLoad(10)
WebUI.setText(findTestObject('Object Repository/AddQuote/Page_/input'), 'Avishek')
WebUI.sendKeys(findTestObject('Object Repository/AddQuote/Page_/input'), Keys.chord(Keys.ENTER))
WebUI.selectOptionByValue(findTestObject('Object Repository/AddBookingCRM/Page_/select_Please SelectYesNo'), '1', true)
WebUI.setText(findTestObject('Object Repository/ObjectAddQuote/Page_/Page_/input_ctl00ContentPlaceHolder1'),'team llc')
WebUI.selectOptionByValue(findTestObject('Object Repository/ObjectAddQuote/Page_/Page_/Page_/select_Please SelectYesNo'),'1', true)
WebUI.selectOptionByValue(findTestObject('Object Repository/AddQuote/Page_/select_Please SelectYesNoI am'), '1', true)
WebUI.selectOptionByValue(findTestObject('Object Repository/AddQuote/Page_/select_Pickup Category'), '52', true)
WebUI.selectOptionByValue(findTestObject('Object Repository/AddBookingCRM/Page_/select_Pickup ItemSuitCaseGhan'), '1', true)
WebUI.setText(findTestObject('Object Repository/AddBookingCRM/Page_/input_estimatedValue'), '48')
WebUI.click(findTestObject('Object Repository/ObjectAddQuote/Page_/input_ctl00ContentPlaceHolder1'))
WebUI.click(findTestObject('Object Repository/AddBookingCRM/Page_/td_31 (1)'))
WebUI.click(findTestObject('Object Repository/AddBookingCRM/Page_/input_ctl00ContentPlaceHolder1_1 (3)'))

WebUI.click(findTestObject('Object Repository/AddBookingCRM/Page_/input_next'))
WebUI.setText(findTestObject('Object Repository/AddBookingCRM/Page_/input_ctl00ContentPlaceHolder1_2 (3)'), 'Tom')
WebUI.setText(findTestObject('Object Repository/AddBookingCRM/Page_/input_ctl00ContentPlaceHolder1_3 (2)'), 'London')
WebUI.click(findTestObject('Object Repository/AddBookingCRM/Page_/div'))
WebUI.setText(findTestObject('Object Repository/AddBookingCRM/Page_/input_ctl00ContentPlaceHolder1_4 (2)'), '2589')
WebUI.setText(findTestObject('Object Repository/AddBookingCRM/Page_/input_ctl00ContentPlaceHolder1_5 (1)'), '1234567890')
WebUI.setText(findTestObject('Object Repository/AddBookingCRM/Page_/input_ctl00ContentPlaceHolder1_6 (1)'), 'tom@mailinator.com')
WebUI.setText(findTestObject('Object Repository/AddBookingCRM/Page_/input_ctl00ContentPlaceHolder1_7 (1)'), 'Taffy')
WebUI.setText(findTestObject('Object Repository/AddBookingCRM/Page_/input_ctl00ContentPlaceHolder1_8 (1)'), 'London')
WebUI.click(findTestObject('Object Repository/AddBookingCRM/Page_/div_1'))
WebUI.setText(findTestObject('Object Repository/AddBookingCRM/Page_/input_ctl00ContentPlaceHolder1_9 (1)'), '6541')
WebUI.setText(findTestObject('Object Repository/AddBookingCRM/Page_/input_ctl00ContentPlaceHolder1_10 (1)'), '9874561230')
WebUI.setText(findTestObject('Object Repository/AddBookingCRM/Page_/input_ctl00ContentPlaceHolder1_11 (1)'), 'tammy@mailinator.com')
WebUI.click(findTestObject('Object Repository/AddBookingCRM/Page_/input_next_1'))

WebUI.click(findTestObject('Object Repository/AddBookingCRM/Page_/input_ctl00ContentPlaceHolder1_12 (1)'))
WebUI.click(findTestObject('Object Repository/AddBookingCRM/Page_/input_ctl00ContentPlaceHolder1_13'))

WebUI.waitForJQueryLoad(20)
WebUI.mouseOver(findTestObject('Object Repository/ObjectAddBookingCRM/Page_/Page_/button_Pay at  Lombard Street'))
WebUI.click(findTestObject('Object Repository/ObjectAddBookingCRM/Page_/Page_/button_Pay at  Lombard Street'))

WebUI.waitForJQueryLoad(20)
WebUI.mouseOver(findTestObject('Object Repository/AddBookingCRM/Page_/a_Back to Dashboard'))
WebUI.click(findTestObject('Object Repository/AddBookingCRM/Page_/a_Back to Dashboard'))

WebUI.click(findTestObject('Object Repository/AddBookingCRM/Page_/button_toggle navigation (3)'))
WebUI.click(findTestObject('Object Repository/AddBookingCRM/Page_/a_Booking'))
WebUI.click(findTestObject('Object Repository/AddBookingCRM/Page_/a_Make a Booking'))

WebUI.click(findTestObject('Object Repository/AddBookingCRM/Page_/span_Select Customer'))


WebUI.setText(findTestObject('Object Repository/AddQuote/Page_/input'), 'Avi')
WebUI.sendKeys(findTestObject('Object Repository/AddQuote/Page_/input'), Keys.chord(Keys.ENTER))
WebUI.selectOptionByValue(findTestObject('Object Repository/AddBookingCRM/Page_/select_Please SelectYesNo'), '0', true)


WebUI.selectOptionByValue(findTestObject('Object Repository/AddQuote/Page_/select_Please SelectYesNoI am'), '0', true)


WebUI.selectOptionByValue(findTestObject('Object Repository/AddQuote/Page_/select_Pickup Category'), '52', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddBookingCRM/Page_/select_Pickup ItemSuitCaseGhan'), '1', true)

WebUI.setText(findTestObject('Object Repository/AddBookingCRM/Page_/input_estimatedValue'), '50')

WebUI.click(findTestObject('Object Repository/AddBookingCRM/Page_/button_Add Row'))

WebUI.selectOptionByValue(findTestObject('Object Repository/AddBookingCRM/Page_/select_Pickup CategoryAir Cond'), '51', 
    true)

WebUI.click(findTestObject('Object Repository/AddBookingCRM/Page_/label_FRAGILE'))

WebUI.setText(findTestObject('Object Repository/AddBookingCRM/Page_/input_estimatedValue_1'), '75')
WebUI.click(findTestObject('Object Repository/ObjectAddQuote/Page_/input_ctl00ContentPlaceHolder1'))
WebUI.click(findTestObject('Object Repository/AddBookingCRM/Page_/td_31 (1)'))

WebUI.click(findTestObject('Object Repository/AddBookingCRM/Page_/input_ctl00ContentPlaceHolder1_1 (3)'))

WebUI.click(findTestObject('Object Repository/AddBookingCRM/Page_/input_next'))

WebUI.setText(findTestObject('Object Repository/AddBookingCRM/Page_/input_ctl00ContentPlaceHolder1_2 (3)'), 'john')

WebUI.setText(findTestObject('Object Repository/AddBookingCRM/Page_/input_ctl00ContentPlaceHolder1_3 (2)'), 'london')


WebUI.click(findTestObject('Object Repository/AddBookingCRM/Page_/div_1'))

WebUI.setText(findTestObject('Object Repository/AddBookingCRM/Page_/input_ctl00ContentPlaceHolder1_4 (2)'), '8745')

WebUI.setText(findTestObject('Object Repository/AddBookingCRM/Page_/input_ctl00ContentPlaceHolder1_5 (1)'), '4567891320')

WebUI.setText(findTestObject('Object Repository/AddBookingCRM/Page_/input_ctl00ContentPlaceHolder1_6 (1)'), 'john@mailinator.com')

WebUI.setText(findTestObject('Object Repository/AddBookingCRM/Page_/input_ctl00ContentPlaceHolder1_7 (1)'), 'Carlos')



WebUI.setText(findTestObject('Object Repository/AddBookingCRM/Page_/input_ctl00ContentPlaceHolder1_8 (1)'), 'London')

WebUI.click(findTestObject('Object Repository/AddBookingCRM/Page_/div_1'))

WebUI.setText(findTestObject('Object Repository/AddBookingCRM/Page_/input_ctl00ContentPlaceHolder1_9 (1)'), '1323')

WebUI.setText(findTestObject('Object Repository/AddBookingCRM/Page_/input_ctl00ContentPlaceHolder1_10 (1)'), '8956237845')

WebUI.setText(findTestObject('Object Repository/AddBookingCRM/Page_/input_ctl00ContentPlaceHolder1_11 (1)'), 'Carlos@mailinator.com')

WebUI.click(findTestObject('Object Repository/AddBookingCRM/Page_/input_next_1'))

WebUI.click(findTestObject('Object Repository/AddBookingCRM/Page_/input_ctl00ContentPlaceHolder1_12 (1)'))

WebUI.click(findTestObject('Object Repository/AddBookingCRM/Page_/input_ctl00ContentPlaceHolder1_13'))


WebUI.waitForJQueryLoad(20)
WebUI.mouseOver(findTestObject('Object Repository/ObjectAddBookingCRM/Page_/Page_/button_Pay at  Lombard Street'))
WebUI.click(findTestObject('Object Repository/ObjectAddBookingCRM/Page_/Page_/button_Pay at  Lombard Street'))



WebUI.waitForJQueryLoad(20)
WebUI.mouseOver(findTestObject('Object Repository/AddBookingCRM/Page_/a_Back to Dashboard'))
WebUI.click(findTestObject('Object Repository/AddBookingCRM/Page_/a_Back to Dashboard'))

WebUI.click(findTestObject('Object Repository/AddBookingCRM/Page_/button_toggle navigation (3)'))

WebUI.click(findTestObject('Object Repository/AddBookingCRM/Page_/a_Booking'))

WebUI.click(findTestObject('Object Repository/AddBookingCRM/Page_/a_View All Bookings'))

WebUI.waitForPageLoad(10)
WebUI.waitForJQueryLoad(10)


WebUI.click(findTestObject('Object Repository/AddBookingCRM/Page_/span_glyphicon glyphicon-user (3)'))

WebUI.click(findTestObject('Object Repository/AddBookingCRM/Page_/button_Sign Out (3)'))



