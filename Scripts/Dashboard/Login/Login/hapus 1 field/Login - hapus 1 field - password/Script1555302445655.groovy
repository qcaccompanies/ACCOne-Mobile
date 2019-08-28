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

WebUI.callTestCase(findTestCase('Open application'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('BottomMenu/MenuBawah_BtnAkun'), 0)

Mobile.tap(findTestObject('BottomMenu/MenuBawah_BtnAkun'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

if (Mobile.verifyElementVisible(findTestObject('Dashboard/Login/Logout/Logout_BtnKeluar'), 0, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('Dashboard/Login/Logout/Logout_BtnKeluar'), 0)

    Mobile.tap(findTestObject('Dashboard/Login/Logout/Logout_BtnYa'), 0)

    Mobile.tap(findTestObject('Dashboard/Login/Logout/Logout_BtnClose'), 0)

    Mobile.waitForElementPresent(findTestObject('BottomMenu/MenuBawah_BtnAkun'), 0)

    Mobile.tap(findTestObject('BottomMenu/MenuBawah_BtnAkun'), 0)
}

WebUI.callTestCase(findTestCase('Dashboard/Login/Login/master flow/Login - MASTER FLOW'), [('varUsername') : varUsername
        , ('varPassword') : varPassword, ('varExpectedResult') : varExpectedResult], FailureHandling.STOP_ON_FAILURE)

Mobile.clearText(findTestObject('Dashboard/Login/Login_InpPassword'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/Login/Login_BtnMasuk'), 0)

switch (varExpectedResult.toString()) {
    case 'PASS':
        Mobile.waitForElementPresent(findTestObject('DynamicObject/PickListItem', [('text') : varUsername]), 0)

        Mobile.verifyElementVisible(findTestObject('DynamicObject/PickListItem', [('text') : varUsername]), 0)

        WebUI.callTestCase(findTestCase('Dashboard/Login/log out/master flow/Logout - MASTER FLOW'), [('varUsername') : varUsername], 
            FailureHandling.STOP_ON_FAILURE)

        Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

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

