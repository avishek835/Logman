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


WebUI.navigateToUrl(GlobalVariable.URL1)
WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/AddQuote/Page_JobyCo/input_ctl00ContentPlaceHolder1'), 'avishek101@mailinator.com')

WebUI.setEncryptedText(findTestObject('Object Repository/AddQuote/Page_JobyCo/input_ctl00ContentPlaceHolder1_1'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/AddQuote/Page_JobyCo/input_ctl00ContentPlaceHolder1_2'))

WebUI.click(findTestObject('Object Repository/AddQuote/Page_/button_toggle navigation'))

WebUI.click(findTestObject('Object Repository/AddQuote/Page_/a_Booking'))

WebUI.click(findTestObject('Object Repository/AddQuote/Page_/a_Request A Quote'))

WebUI.click(findTestObject('Object Repository/AddQuote/Page_/span_Select Customer'))

WebUI.setText(findTestObject('Object Repository/AddQuote/Page_/input'), 'Avi')

WebUI.sendKeys(findTestObject('Object Repository/AddQuote/Page_/input'), Keys.chord(Keys.ENTER))

WebUI.selectOptionByValue(findTestObject('Object Repository/AddQuote/Page_/select_Please SelectYesNo'), '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddQuote/Page_/select_Please SelectYesNoI am'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddQuote/Page_/select_Pickup Category'), '52', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddQuote/Page_/select_Pickup ItemSuitCaseGhan'), '1', true)

WebUI.setText(findTestObject('Object Repository/AddQuote/Page_/input_estimatedValue'), '45')

WebUI.click(findTestObject('Object Repository/ObjectAddQuote/Page_/input_ctl00ContentPlaceHolder1'))

WebUI.click(findTestObject('Object Repository/AddQuote/Page_/td_31'))


WebUI.click(findTestObject('Object Repository/AddQuote/Page_/input_ctl00ContentPlaceHolder1'))
WebUI.click(findTestObject('Object Repository/AddQuote/Page_/input_next'))

WebUI.setText(findTestObject('Object Repository/AddQuote/Page_/input_ctl00ContentPlaceHolder1_1'), 'Tom')

WebUI.setText(findTestObject('Object Repository/AddQuote/Page_/input_ctl00ContentPlaceHolder1_2'), 'London')
WebUI.waitForJQueryLoad(20)
WebUI.sendKeys(findTestObject('Object Repository/AddQuote/Page_/input_ctl00ContentPlaceHolder1_2'), Keys.chord(Keys.ENTER))
WebUI.waitForJQueryLoad(20)
WebUI.mouseOver(findTestObject('Object Repository/AddQuote/Page_/button_OK'))
WebUI.click(findTestObject('Object Repository/AddQuote/Page_/button_OK'))

WebUI.setText(findTestObject('Object Repository/AddQuote/Page_/input_ctl00ContentPlaceHolder1_3'), '1234')

WebUI.setText(findTestObject('Object Repository/AddQuote/Page_/input_ctl00ContentPlaceHolder1_4'), '1234567890')

WebUI.setText(findTestObject('Object Repository/AddQuote/Page_/input_ctl00ContentPlaceHolder1_5'), 'tom@mailinator.com')

WebUI.setText(findTestObject('Object Repository/AddQuote/Page_/input_ctl00ContentPlaceHolder1_6'), 'Tom')

WebUI.setText(findTestObject('Object Repository/AddQuote/Page_/input_ctl00ContentPlaceHolder1_7'), 'London')

WebUI.click(findTestObject('Object Repository/AddQuote/Page_/div'))

WebUI.setText(findTestObject('Object Repository/AddQuote/Page_/input_ctl00ContentPlaceHolder1_8'), '3210')

WebUI.setText(findTestObject('Object Repository/AddQuote/Page_/input_ctl00ContentPlaceHolder1_9'), '9876543210')

WebUI.setText(findTestObject('Object Repository/AddQuote/Page_/input_ctl00ContentPlaceHolder1_10'), 'tom1@mailinator.com')

WebUI.click(findTestObject('Object Repository/AddQuote/Page_/input_next_1'))

WebUI.click(findTestObject('Object Repository/AddQuote/Page_/input_ctl00ContentPlaceHolder1_11'))

WebUI.click(findTestObject('Object Repository/AddQuote/Page_/input_ctl00ContentPlaceHolder1_12'))
WebUI.waitForJQueryLoad(20)
WebUI.mouseOver(findTestObject('Object Repository/AddQuote/Page_/a_Back to Dashboard'))
WebUI.click(findTestObject('Object Repository/AddQuote/Page_/a_Back to Dashboard'))

WebUI.click(findTestObject('Object Repository/AddQuote/Page_/button_toggle navigation'))
WebUI.click(findTestObject('Object Repository/AddQuote/Page_/a_Booking'))

WebUI.click(findTestObject('Object Repository/AddQuote/Page_/a_Request A Quote'))

WebUI.click(findTestObject('Object Repository/AddQuote/Page_/span_Select Customer'))

WebUI.setText(findTestObject('Object Repository/AddQuote/Page_/input'), 'tom')
WebUI.waitForJQueryLoad(10)
WebUI.sendKeys(findTestObject('Object Repository/AddQuote/Page_/input'), Keys.chord(Keys.ENTER))

WebUI.selectOptionByValue(findTestObject('Object Repository/AddQuote/Page_/select_Please SelectYesNo'), '1', true)
WebUI.setText(findTestObject('Object Repository/ObjectAddQuote/Page_/Page_/input_ctl00ContentPlaceHolder1'),'tree Ltd')


WebUI.selectOptionByValue(findTestObject('Object Repository/ObjectAddQuote/Page_/Page_/Page_/select_Please SelectYesNo'),'1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddQuote/Page_/select_Please SelectYesNoI am'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddQuote/Page_/select_Pickup Category'), '52', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddQuote/Page_/select_Pickup ItemSuitCaseGhan'), '1', true)

WebUI.setText(findTestObject('Object Repository/AddQuote/Page_/input_estimatedValue'), '12')

WebUI.click(findTestObject('Object Repository/AddQuote/Page_/button_Add Row'))

WebUI.selectOptionByValue(findTestObject('Object Repository/AddQuote/Page_/select_Pickup CategoryAir Cond'), '51', true)

WebUI.click(findTestObject('Object Repository/AddQuote/Page_/label_FRAGILE'))

WebUI.setText(findTestObject('Object Repository/AddQuote/Page_/input_estimatedValue_1'), '78')

WebUI.click(findTestObject('Object Repository/ObjectAddQuote/Page_/input_ctl00ContentPlaceHolder1'))
WebUI.click(findTestObject('Object Repository/AddQuote/Page_/td_31'))

WebUI.click(findTestObject('Object Repository/AddQuote/Page_/input_ctl00ContentPlaceHolder1'))

WebUI.click(findTestObject('Object Repository/AddQuote/Page_/input_next'))

WebUI.setText(findTestObject('Object Repository/AddQuote/Page_/input_ctl00ContentPlaceHolder1_1'), 'Tom Alter')

WebUI.setText(findTestObject('Object Repository/AddQuote/Page_/input_ctl00ContentPlaceHolder1_2'), 'London')

WebUI.click(findTestObject('Object Repository/AddQuote/Page_/div_1'))

WebUI.setText(findTestObject('Object Repository/AddQuote/Page_/input_ctl00ContentPlaceHolder1_3'), '1230')

WebUI.setText(findTestObject('Object Repository/AddQuote/Page_/input_ctl00ContentPlaceHolder1_4'), '568974250')

WebUI.click(findTestObject('Object Repository/AddQuote/Page_/div_col-md-9 col-xs-12'))

WebUI.setText(findTestObject('Object Repository/AddQuote/Page_/input_ctl00ContentPlaceHolder1_5'), 'tom2@mailinator.com')

WebUI.setText(findTestObject('Object Repository/AddQuote/Page_/input_ctl00ContentPlaceHolder1_6'), 'Darek Nation')

WebUI.setText(findTestObject('Object Repository/AddQuote/Page_/input_ctl00ContentPlaceHolder1_7'), 'London')
WebUI.waitForJQueryLoad(20)



WebUI.setText(findTestObject('Object Repository/AddQuote/Page_/input_ctl00ContentPlaceHolder1_8'), '5980')

WebUI.setText(findTestObject('Object Repository/AddQuote/Page_/input_ctl00ContentPlaceHolder1_9'), '7898654512')

WebUI.setText(findTestObject('Object Repository/AddQuote/Page_/input_ctl00ContentPlaceHolder1_10'), 'tom3@mailinator.com')

WebUI.click(findTestObject('Object Repository/AddQuote/Page_/input_next_1'))

WebUI.setText(findTestObject('Object Repository/AddQuote/Page_/input_ctl00ContentPlaceHolder1_4'), '5689742501')

WebUI.click(findTestObject('Object Repository/AddQuote/Page_/input_next_1'))

WebUI.click(findTestObject('Object Repository/AddQuote/Page_/input_ctl00ContentPlaceHolder1_11'))

WebUI.click(findTestObject('Object Repository/AddQuote/Page_/input_ctl00ContentPlaceHolder1_12'))

WebUI.waitForJQueryLoad(20)
WebUI.mouseOver(findTestObject('Object Repository/AddQuote/Page_/a_Back to Dashboard'))
WebUI.click(findTestObject('Object Repository/AddQuote/Page_/a_Back to Dashboard'))

WebUI.click(findTestObject('Object Repository/AddQuote/Page_/span_glyphicon glyphicon-user'))

WebUI.click(findTestObject('Object Repository/AddQuote/Page_/button_Sign Out'))



