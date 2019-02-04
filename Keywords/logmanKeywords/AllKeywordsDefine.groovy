package logmanKeywords

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
public class AllKeywordsDefine {

	@Keyword 
	def LoginandLogoutWithMultipledata() {

		InternalData data = findTestData("FrontendDDF/LoginandLogoutMultipleData")
		for (def index : (0..data.getRowNumbers() - 2)) //-1 means all the data will run. -2 means upto second last data will run and so on...
		{
			//
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

	@Keyword
	def AdminLogin() {

		WebUI.setText(findTestObject('Object Repository/adminlogin/Page_JobyCo/input_ctl00ContentPlaceHolder1'), 'support@switch2web.com')

		WebUI.setText(findTestObject('Object Repository/adminlogin/Page_JobyCo/input_ctl00ContentPlaceHolder1_1'), 'sup123')

		WebUI.click(findTestObject('Object Repository/adminlogin/Page_JobyCo/input_ctl00ContentPlaceHolder1_2'))
		//CustomKeywords.'urm.AdminLogin.AdminLogin'()

	}

	@Keyword
	def AddUserRoleManagement() {

		//Login into CRM
		WebUI.setText(findTestObject('Object Repository/AddBookingCRM/Page_JobyCo/input_ctl00ContentPlaceHolder1 (2)'), 'avishek101@mailinator.com')
		WebUI.setEncryptedText(findTestObject('Object Repository/AddBookingCRM/Page_JobyCo/input_ctl00ContentPlaceHolder1_1 (1)'),
				'aeHFOx8jV/A=')
		WebUI.click(findTestObject('Page_JobyCo/input_ctl00ContentPlaceHolder1_2'))


		WebUI.click(findTestObject('Object Repository/Page_/button_toggle navigation (2)'))
		WebUI.click(findTestObject('Object Repository/Page_/a_User'))
		WebUI.waitForJQueryLoad(10)
		WebUI.click(findTestObject('Object Repository/Page_/a_View All Users'))
		WebUI.waitForJQueryLoad(10)

		//Click the button Add user
		WebUI.click(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1 (2)'))

		WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_1 (2)'), 'avishek143@mailinator.com')
		WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_2 (2)'), 'avishek143@mailinator.com')
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_3 (1)'), 'aeHFOx8jV/A=')
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_4'), 'aeHFOx8jV/A=')
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_Select TitleMrMrsMissMs'), '1', true)
		WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_5'), 'AvishekSixteen')
		WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_6'), 'Mailinator')


		//DOB selection in the add user type form
		WebUI.click(findTestObject('Object Repository/RoleObjectCapture/Page_/input_ctl00ContentPlaceHolder1'))
		WebUI.click(findTestObject('Object Repository/RoleObjectCapture/Page_/Page_/th_July 2018'))
		WebUI.click(findTestObject('Object Repository/RoleObjectCapture/Page_/Page_/th_2018'))
		WebUI.click(findTestObject('Object Repository/Page_/th_'))
		WebUI.click(findTestObject('Object Repository/Page_/th_'))
		WebUI.click(findTestObject('Object Repository/Page_/th_'))
		WebUI.click(findTestObject('Object Repository/Page_/span_1985'))
		WebUI.click(findTestObject('Object Repository/Page_/span_Aug'))
		WebUI.click(findTestObject('Object Repository/Page_/td_23'))
		//DOB completed
		WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_7'), 'Kolkata')
		WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_8'), 'Kolkata')
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_Select CountryAfghanist'), '156', true)
		WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_9'), '1245789865')
		WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_10'), 'pet name')
		WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_11'), 'taffy')
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_Select RoleSuperAdminAd'), '7', true)
		WebUI.click(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_12'))

		WebUI.waitForPageLoad(40)
		WebUI.waitForJQueryLoad(30)

		WebUI.click(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1 (2)'))

		WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_1 (2)'), 'avishek144@mailinator.com')
		WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_2 (2)'), 'avishek144@mailinator.com')
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_3 (1)'), 'aeHFOx8jV/A=')
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_4'), 'aeHFOx8jV/A=')
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_Select TitleMrMrsMissMs'), '1', true)
		WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_5'), 'Avishekhundredeight')
		WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_6'), 'Mailinator')
		//DOB selection in the add user type form
		WebUI.click(findTestObject('Object Repository/RoleObjectCapture/Page_/input_ctl00ContentPlaceHolder1'))


		WebUI.click(findTestObject('Object Repository/RoleObjectCapture/Page_/Page_/th_July 2018'))

		WebUI.click(findTestObject('Object Repository/Page_/th_2018'))
		WebUI.click(findTestObject('Object Repository/Page_/th_'))
		WebUI.click(findTestObject('Object Repository/Page_/th_'))
		WebUI.click(findTestObject('Object Repository/Page_/th_'))
		WebUI.click(findTestObject('Object Repository/Page_/span_1985'))
		WebUI.click(findTestObject('Object Repository/Page_/span_Aug'))
		WebUI.click(findTestObject('Object Repository/Page_/td_23'))
		//DOB completed
		WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_7'), 'Kolkata')
		WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_8'), 'Kolkata')
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_Select CountryAfghanist'), '156', true)
		WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_9'), '9874563210')
		WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_10'), 'pet name')
		WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_11'), 'taffy')
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_Select RoleSuperAdminAd'), '8', true)
		WebUI.click(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_12'))


		WebUI.waitForPageLoad(40)
		WebUI.waitForJQueryLoad(30)
		WebUI.click(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1 (2)'))

		WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_1 (2)'), 'avishek145@mailinator.com')
		WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_2 (2)'), 'avishek145@mailinator.com')
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_3 (1)'), 'aeHFOx8jV/A=')
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_4'), 'aeHFOx8jV/A=')
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_Select TitleMrMrsMissMs'), '5', true)
		WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_5'), 'Avishekhundrednine')
		WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_6'), 'mailinatorcom')
		WebUI.click(findTestObject('Object Repository/RoleObjectCapture/Page_/input_ctl00ContentPlaceHolder1'))

		WebUI.click(findTestObject('Object Repository/RoleObjectCapture/Page_/Page_/th_July 2018'))
		WebUI.click(findTestObject('Object Repository/Page_/th_2018'))
		WebUI.click(findTestObject('Object Repository/Page_/th_'))
		WebUI.click(findTestObject('Object Repository/Page_/th_'))
		WebUI.click(findTestObject('Object Repository/Page_/th_'))
		WebUI.click(findTestObject('Object Repository/Page_/span_1985'))
		WebUI.click(findTestObject('Object Repository/Page_/span_Jul'))
		WebUI.click(findTestObject('Object Repository/Page_/td_16'))
		WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_7'), 'Kolkata')
		WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_8'), 'Kolkata')
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_Select CountryAfghanist'), '156', true)
		WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_9'), '9515945635')
		WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_10'), 'pet name')
		WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_11'), 'taffy')
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_Select RoleSuperAdminAd'), '9', true)
		WebUI.click(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_12'))
		WebUI.waitForPageLoad(40)
		WebUI.waitForJQueryLoad(30)
		WebUI.click(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1 (2)'))

		WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_1 (2)'), 'avishek146@mailinator.com')
		WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_2 (2)'), 'avishek146@mailinator.com')
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_3 (1)'), 'aeHFOx8jV/A=')
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_4'), 'aeHFOx8jV/A=')
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_Select TitleMrMrsMissMs'), '1', true)
		WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_5'), 'Avishekhundredten')
		WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_6'), 'mailinator')
		WebUI.click(findTestObject('Object Repository/RoleObjectCapture/Page_/input_ctl00ContentPlaceHolder1'))

		WebUI.click(findTestObject('Object Repository/RoleObjectCapture/Page_/Page_/th_July 2018'))
		WebUI.click(findTestObject('Object Repository/Page_/th_2018'))
		WebUI.click(findTestObject('Object Repository/Page_/th_'))
		WebUI.click(findTestObject('Object Repository/Page_/th_'))
		WebUI.click(findTestObject('Object Repository/Page_/th_'))
		WebUI.click(findTestObject('Object Repository/Page_/span_1985'))
		WebUI.click(findTestObject('Object Repository/Page_/span_Aug'))
		WebUI.click(findTestObject('Object Repository/Page_/td_6'))
		WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_7'), 'Kolkata')
		WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_8'), 'kolkata')
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_Select CountryAfghanist'), '156', true)
		WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_9'), '5698745635')
		WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_10'), 'pet name')
		WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_11'), 'Taffy')
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_Select RoleSuperAdminAd'), '10', true)

		WebUI.click(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_12'))
		WebUI.waitForPageLoad(40)
		WebUI.waitForJQueryLoad(30)

		WebUI.click(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1 (2)'))

		WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_1 (2)'), 'avishek147@mailinator.com')
		WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_2 (2)'), 'avishek147@mailinator.com')
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_3 (1)'), 'aeHFOx8jV/A=')
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_4'), 'aeHFOx8jV/A=')
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_Select TitleMrMrsMissMs'), '5', true)
		WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_5'), 'Avishekhundredeleven')
		WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_6'), 'Mailinator')
		WebUI.click(findTestObject('Object Repository/RoleObjectCapture/Page_/input_ctl00ContentPlaceHolder1'))

		WebUI.click(findTestObject('Object Repository/RoleObjectCapture/Page_/Page_/th_July 2018'))
		WebUI.click(findTestObject('Object Repository/Page_/th_2018'))
		WebUI.click(findTestObject('Object Repository/Page_/th_'))
		WebUI.click(findTestObject('Object Repository/Page_/th_'))
		WebUI.click(findTestObject('Object Repository/Page_/th_'))
		WebUI.click(findTestObject('Object Repository/Page_/span_1985'))
		WebUI.click(findTestObject('Object Repository/Page_/span_Aug'))
		WebUI.click(findTestObject('Object Repository/Page_/td_6'))
		WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_7'), 'Kolkata')
		WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_8'), 'kolkata')
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_Select CountryAfghanist'), '156', true)
		WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_9'), '6598784522')
		WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_10'), 'Pet name')
		WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_11'), 'taffy')
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_Select RoleSuperAdminAd'), '11', true)

		WebUI.click(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_12'))


		WebUI.waitForPageLoad(40)
		WebUI.waitForJQueryLoad(30)
		WebUI.click(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1 (2)'))

		WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_1 (2)'), 'avishek148@mailinator.com')
		WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_2 (2)'), 'avishek148@mailinator.com')
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_3 (1)'), 'aeHFOx8jV/A=')
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_4'), 'aeHFOx8jV/A=')
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_Select TitleMrMrsMissMs'), '1', true)
		WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_5'), 'Avishekhundredtweleve')
		WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_6'), 'Chakraborty')

		WebUI.click(findTestObject('Object Repository/RoleObjectCapture/Page_/input_ctl00ContentPlaceHolder1'))

		WebUI.click(findTestObject('Object Repository/RoleObjectCapture/Page_/Page_/th_July 2018'))
		WebUI.click(findTestObject('Object Repository/Page_/th_2018'))
		WebUI.click(findTestObject('Object Repository/Page_/th_'))
		WebUI.click(findTestObject('Object Repository/Page_/th_'))
		WebUI.click(findTestObject('Object Repository/Page_/th_'))
		WebUI.click(findTestObject('Object Repository/Page_/span_1985'))
		WebUI.click(findTestObject('Object Repository/Page_/span_Aug'))
		WebUI.click(findTestObject('Object Repository/Page_/td_16'))
		WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_7'), 'Kolkata')
		WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_8'), 'Kolkata')
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_Select CountryAfghanist'), '156', true)
		WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_9'), '9874589630')
		WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_10'), 'Pet name')
		WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_11'), 'taffy')
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_Select RoleSuperAdminAd'), '11', true)
		WebUI.click(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_12'))

		WebUI.waitForPageLoad(40)
		WebUI.waitForJQueryLoad(30)
		WebUI.click(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1 (2)'))

		WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_1 (2)'), 'avishek149@mailinator.com')
		WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_2 (2)'), 'avishek149@mailinator.com')
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_3 (1)'), 'aeHFOx8jV/A=')
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_4'), 'aeHFOx8jV/A=')
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_Select TitleMrMrsMissMs'), '5', true)
		WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_5'), 'Avishekhundredthrteen')
		WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_6'), 'chak')

		WebUI.click(findTestObject('Object Repository/RoleObjectCapture/Page_/input_ctl00ContentPlaceHolder1'))

		WebUI.click(findTestObject('Object Repository/RoleObjectCapture/Page_/Page_/th_July 2018'))
		WebUI.click(findTestObject('Object Repository/Page_/th_2018'))
		WebUI.click(findTestObject('Object Repository/Page_/th_'))
		WebUI.click(findTestObject('Object Repository/Page_/th_'))
		WebUI.click(findTestObject('Object Repository/Page_/th_'))
		WebUI.click(findTestObject('Object Repository/Page_/span_1985'))
		WebUI.click(findTestObject('Object Repository/Page_/span_Aug'))
		WebUI.click(findTestObject('Object Repository/Page_/td_16'))
		WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_7'), 'Kolkata')
		WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_8'), 'Kolkata')
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_Select CountryAfghanist'), '156', true)
		WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_9'), '5648974545')
		WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_10'), 'pet name')
		WebUI.setText(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_11'), 'taffy')
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_Select RoleSuperAdminAd'), '12', true)

		WebUI.click(findTestObject('Object Repository/Page_/input_ctl00ContentPlaceHolder1_12'))


		WebUI.waitForPageLoad(40)
		WebUI.waitForJQueryLoad(30)

		WebUI.click(findTestObject('Object Repository/Page_/span_glyphicon glyphicon-user (2)'))

		WebUI.click(findTestObject('Object Repository/Page_/button_Sign Out (2)'))

	}
}
