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

WebUI.callTestCase(findTestCase('Open application'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Dashboard/Login/daftar/master flow/Login Daftar Akun - open menu - MASTER FLOW'), [('varExistingNew') : varNewExisting], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Dashboard/Login/daftar/master flow/Login Daftar Akun - nomor polisi - MASTER FLOW'), [('varNoPol') : varNoPol], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Dashboard/ganti no hp/master flow/ganti nomer HP'), [('varNoHPLama') : varNoHPLama, ('varNoHPBaru') : varNoHPBaru], 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/Ganti NO HP/GantiNoHP_BtnKonfirm'), 0)

switch (varExpectedResult.toString()) {
    case 'PASS':
        Mobile.waitForElementPresent(findTestObject('Dashboard/Login/Daftar/Daftar_InpKodeOTP'), 0)

        Mobile.verifyElementVisible(findTestObject('Dashboard/Login/Daftar/Daftar_InpKodeOTP'), 0)

        break
    case 'DISABLEDBUTTON':
        Mobile.verifyElementNotVisible(findTestObject('Dashboard/Login/Daftar/Daftar_InpKodeOTP'), 0)

        break
}

