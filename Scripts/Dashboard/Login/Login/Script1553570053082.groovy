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

Mobile.waitForElementPresent(findTestObject('Dashboard/Dashboard_MenuLogin'), 0)

//if (Mobile.verifyElementVisible(findTestObject('Login/button - Masuk atau Daftar'), 0, FailureHandling.CONTINUE_ON_FAILURE) ==
//true) {
//	WebUI.callTestCase(findTestCase('Login/Quick Login'), [('password') : 'P@ssw0rd'], FailureHandling.STOP_ON_FAILURE)
//}
//
//Mobile.waitForElementPresent(findTestObject('Login/Button - Userprofile', [('userEmail') : GlobalVariable.username]), 30)
//
//Mobile.tap(findTestObject('Login/Button - Userprofile', [('userEmail') : GlobalVariable.username]), 0)
//Mobile.startApplication('C:\\Users\\IT-Services\\Katalon Studio\\ACCONE Mobile\\accone tst env 24 maret 2019.apk', false)
Mobile.tap(findTestObject('Dashboard/Dashboard_MenuLogin'), 0)

Mobile.setText(findTestObject('Dashboard/Login/Login_InpEmail'), varUsername, 0)

Mobile.setText(findTestObject('Dashboard/Login/Login_InpPassword'), varPassword, 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/Login/Login_BtnMasuk'), 0)

switch (varExpectedResult.toString()) {
    case 'PASS':
        Mobile.waitForElementPresent(findTestObject('Dashboard/Dashboard_BtnUserEmail', [('UserEmail') : varUsername]), 
            0)

        Mobile.verifyElementVisible(findTestObject('Dashboard/Dashboard_BtnUserEmail', [('UserEmail') : varUsername]), 0)

        Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

        WebUI.callTestCase(findTestCase('Dashboard/Login/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

        break
    case 'FAIL':
        Mobile.verifyElementNotVisible(findTestObject('Dashboard/Dashboard_BtnUserEmail', [('UserName') : varUsername]), 
            5)

        break
    case 'DISABLEDBUTTON':
        Mobile.verifyElementAttributeValue(findTestObject('Dashboard/Login/Login_BtnMasuk'), 'enabled', 'false', 0)

        break
}

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.closeApplication()

