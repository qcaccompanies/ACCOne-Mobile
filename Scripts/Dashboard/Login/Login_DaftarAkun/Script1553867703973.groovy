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

Mobile.tap(findTestObject('Dashboard/Dashboard_MenuLogin'), 0)

Mobile.tap(findTestObject('Dashboard/Login/Daftar/Login_MenuDaftar'), 0)

Mobile.setText(findTestObject('Dashboard/Login/Daftar/Daftar_InpNamaSesuaiKTP'), varName, 0)

Mobile.setText(findTestObject('Dashboard/Login/Daftar/Daftar_InpEmail'), varEmail, 0)

Mobile.setText(findTestObject('Dashboard/Login/Daftar/Daftar_InpNomorHandphone'), varHandphone, 0)

Mobile.setText(findTestObject('Dashboard/Login/Daftar/Daftar_InpPassword'), varPassword, 0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Dashboard/Login/Daftar/Daftar_InpKonfirmasiPassword'), varConfirmPassword, 0)

Mobile.tap(findTestObject('Dashboard/Login/Daftar/Daftar_BtnSubmitDaftar'), 0)

switch (varExpectedResult.toString()) {
    case 'PASS':
        Mobile.verifyElementExist(findTestObject('Dashboard/Login/Daftar/Daftar_InpKodeOTP'), 0, FailureHandling.STOP_ON_FAILURE)

        break
    case 'FAIL':
        Mobile.verifyElementNotExist(findTestObject('Dashboard/Login/Daftar/Daftar_InpKodeOTP'), 5, FailureHandling.STOP_ON_FAILURE)

        break
    case 'DISABLEDBUTTON':
        Mobile.verifyElementAttributeValue(findTestObject('Dashboard/Login/Daftar/Daftar_BtnSubmitDaftar'), 'enabled', 'false', 
            0, FailureHandling.STOP_ON_FAILURE)

        break
}

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.closeApplication()

