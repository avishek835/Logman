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
import com.kms.katalon.core.testdata.InternalData
InternalData data = findTestData("FrontendDDF/MultipleSignUp")
for (def index : (0..data.getRowNumbers()-9 )) //0 means 1st row. getrownumbers is total row number(10). -7 is 1st 4 will print.-6 is 1st 5 will print
											   //if we increase 0 to 1(initialisation) then from 1st row will print and so on 
{
WebUI.openBrowser('')
println ("Opened the browser")

WebUI.navigateToUrl('http://172.16.20.5:94/Login.aspx')
println ("URL loaded into the browser")

WebUI.click(findTestObject('MultipleSignUp/Page_JobyCo/a_Sign Up'))
println ("Click on the sign up button")

WebUI.maximizeWindow()
println ("Maximize the window")

WebUI.setText(findTestObject('MultipleSignUp/Page_JobyCo/input_ctl00ContentPlaceHolder1'), data.internallyGetValue("demo_usn", index))
println ("Provide the Username")
WebUI.setText(findTestObject('MultipleSignUp/Page_JobyCo/input_ctl00ContentPlaceHolder1_1'), data.internallyGetValue("demo_email", index)) 
println ("Provide the User email id")
WebUI.setText(findTestObject('MultipleSignUp/Page_JobyCo/input_ctl00ContentPlaceHolder1_2'), data.internallyGetValue("demo_pass", index)) 
println ("Provide the User password")
WebUI.setText(findTestObject('MultipleSignUp/Page_JobyCo/input_phone'), data.internallyGetValue("demo_phone", index))
println ("Provide the User phone number")
WebUI.click(findTestObject('MultipleSignUp/Page_JobyCo/input_ctl00ContentPlaceHolder1_3'))

WebUI.mouseOver(findTestObject("MultipleSignUp/Page_JobyCo/button_OK"))
WebUI.waitForJQueryLoad(10)
WebUI.click(findTestObject('MultipleSignUp/Page_JobyCo/button_OK'))

WebUI.closeBrowser()
println ("Once signup close the browser")
}
