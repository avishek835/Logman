package frontendDDF

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.testdata.InternalData
public class LoginandLogoutwithMultipleData {

	@Keyword
	def LoginandLogoutWithMultipledata() {

		InternalData data = findTestData("FrontendDDF/LoginandLogoutMultipleData")
		for (def index : (0..data.getRowNumbers() - 2)) //-1 means all the data will run. -2 means upto second last data will run and so on...
		{

			WebUI.setText(findTestObject('Demo/Page_JobyCo/input_ctl00ContentPlaceHolder1'), data.internallyGetValue("demo_usn", index))

			WebUI.setText(findTestObject('Demo/Page_JobyCo/input_ctl00ContentPlaceHolder1_1'), data.internallyGetValue("demo_pass", index))

			WebUI.click(findTestObject('Demo/Page_JobyCo/input_ctl00ContentPlaceHolder1_2'))
			println ("Logged in ")
			WebUI.takeScreenshot()

			WebUI.click(findTestObject('Demo/Page_/span_glyphicon glyphicon-user'))

			WebUI.click(findTestObject('Demo/Page_/button_Sign Out'))
			println ("SignOut from the Logman site")
			WebUI.takeScreenshot()

		}
	}

}
