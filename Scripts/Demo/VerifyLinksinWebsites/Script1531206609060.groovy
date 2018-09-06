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

import static org.junit.Assert.*

import org.junit.Test
import org.openqa.selenium.Keys as Keys
import org.testng.annotations.BeforeSuite


WebUI.navigateToUrl(GlobalVariable.URL)
WebUI.maximizeWindow()
WebUI.takeScreenshot()
	WebUI.click(findTestObject('VerifyLinksinWebsites/Page_Jobyco (1)/a_Home'))
	WebUI.takeScreenshot()
	WebUI.click(findTestObject('VerifyLinksinWebsites/Page_JobyCo/a_About'))
	WebUI.takeScreenshot()
	WebUI.click(findTestObject('VerifyLinksinWebsites/Page_Jobyco (1)/a_Quote'))
	WebUI.takeScreenshot()
	
	WebUI.click(findTestObject('VerifyLinksinWebsites/Page_JobyCo/a_Contact'))
	WebUI.takeScreenshot()
	
	WebUI.click(findTestObject('VerifyLinksinWebsites/Page_Jobyco (1)/a_Careers'))
	WebUI.takeScreenshot()
	
	WebUI.click(findTestObject('VerifyLinksinWebsites/Page_Jobyco (1)/a_Help'))
	WebUI.takeScreenshot()
	
	WebUI.click(findTestObject('VerifyLinksinWebsites/Page_Jobyco (1)/a_How do I book a collection D'))
	
	WebUI.click(findTestObject('VerifyLinksinWebsites/Page_Jobyco (1)/a_What types of services does'))
	
	WebUI.click(findTestObject('VerifyLinksinWebsites/Page_Jobyco (1)/a_Where can I find your prices'))
	
	WebUI.click(findTestObject('VerifyLinksinWebsites/Page_Jobyco (1)/a_Do you provide packaging'))
	
	WebUI.click(findTestObject('VerifyLinksinWebsites/Page_Jobyco (1)/a_Can I use my own packaging'))
	
	WebUI.click(findTestObject('VerifyLinksinWebsites/Page_Jobyco (1)/a_How do I change or cancel a'))
	
	WebUI.click(findTestObject('VerifyLinksinWebsites/Page_Jobyco (1)/a_Are there maximum weight and'))
	
	WebUI.click(findTestObject('VerifyLinksinWebsites/Page_Jobyco (1)/a_Are there any prohibited ite'))
	
	WebUI.click(findTestObject('VerifyLinksinWebsites/Page_Jobyco (1)/a_Does my recipient need to pa'))
	
	WebUI.click(findTestObject('VerifyLinksinWebsites/Page_Jobyco (1)/a_Does my recipient need to pa_1'))
	
	WebUI.click(findTestObject('VerifyLinksinWebsites/Page_Jobyco (1)/a_Will my parcel be opened for'))
	
	WebUI.click(findTestObject('VerifyLinksinWebsites/Page_Jobyco (1)/a_Is my consignment covered by'))
	
	WebUI.click(findTestObject('VerifyLinksinWebsites/Page_Jobyco (1)/a_Can I track the status and l'))
	
	WebUI.click(findTestObject('VerifyLinksinWebsites/Page_Jobyco (1)/a_What should I do if my consi'))
	
	WebUI.click(findTestObject('VerifyLinksinWebsites/Page_Jobyco (1)/a_Within what time frame do I'))
	
	WebUI.click(findTestObject('VerifyLinksinWebsites/Page_Jobyco (1)/a_How long does it take for my'))
	
	WebUI.click(findTestObject('VerifyLinksinWebsites/Page_Jobyco (1)/a_How do we pack our things so'))
	
	WebUI.click(findTestObject('VerifyLinksinWebsites/Page_Jobyco (1)/a_Home'))
	WebUI.takeScreenshot()
	
	WebUI.click(findTestObject('VerifyLinksinWebsites/Page_JobyCo/a_About'))
	WebUI.takeScreenshot()
	
	WebUI.click(findTestObject('VerifyLinksinWebsites/Page_Jobyco (1)/img_img-responsive'))
	WebUI.takeScreenshot()
	



