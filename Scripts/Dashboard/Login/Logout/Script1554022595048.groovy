import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.util.internal.PathUtil as PathUtil
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

'required for PathUtil to get the current app path'
def appPath = PathUtil.relativeToAbsolutePath(GlobalVariable.apkname, RunConfiguration.getProjectDir())

Mobile.startApplication(appPath, false)

Mobile.waitForElementPresent(findTestObject('Dashboard/Dashboard_BtnUserEmail', [('UserEmail') : varUsername]), 0)

Mobile.tap(findTestObject('Dashboard/Dashboard_BtnUserEmail', [('UserEmail') : varUsername]), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Dashboard/Login/Logout/Logout_BtnKeluar'), 0)

Mobile.tap(findTestObject('Dashboard/Login/Logout/Logout_BtnYa'), 0)

Mobile.tap(findTestObject('Dashboard/Login/Logout/Logout_BtnClose'), 0)

Mobile.verifyElementVisible(findTestObject('Dashboard/Dashboard_MenuLogin'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

