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

WebUI.callTestCase(findTestCase('Dashboard/Login/daftar/master flow/Login Daftar Akun - open menu - MASTER FLOW'), [('varExistingNew') : varExistingNew], 
    FailureHandling.STOP_ON_FAILURE)

if (varExistingNew.toString() == 'Existing') {
    WebUI.callTestCase(findTestCase('Dashboard/Login/daftar/master flow/Login Daftar Akun - nomor polisi - MASTER FLOW'), 
        [('varNoPol') : varNoPol], FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('Dashboard/ganti no hp/master flow/ganti nomer HP'), [('varNoHPLama') : varNoHPLama, ('varNoHPBaru') : varNoHPBaru], 
        FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Dashboard/Ganti NO HP/GantiNoHP_BtnKonfirm'), 0)

    WebUI.callTestCase(findTestCase('Dashboard/kode OTP'), [('varOTP') : '261294'], FailureHandling.STOP_ON_FAILURE)
}

WebUI.callTestCase(findTestCase('Dashboard/Login/daftar/master flow/Login DaftarAkun - MASTER FLOW'), [('varName') : varName
        , ('varEmail') : varEmail, ('varHandphone') : varHandphone, ('varPassword') : varPassword, ('varConfirmPassword') : varConfirmPassword
        , ('varExpectedResult') : varExpectedResult], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/Login/Daftar/Daftar_BtnSubmitDaftar'), 0)

switch (varExpectedResult.toString()) {
    case 'PASS':
        Mobile.verifyElementExist(findTestObject('Dashboard/Login/Daftar/Daftar_InpKodeOTP'), 0, FailureHandling.STOP_ON_FAILURE)

        WebUI.callTestCase(findTestCase('Dashboard/kode OTP'), [('varOTP') : '261294'], FailureHandling.STOP_ON_FAILURE)

        if (varExistingNew.toString() == 'New') {
            WebUI.callTestCase(findTestCase('Dashboard/kode OTP'), [('varOTP') : '261294'], FailureHandling.STOP_ON_FAILURE)
        }
        
        break
    case 'FAIL':
        Mobile.verifyElementNotExist(findTestObject('Dashboard/Login/Daftar/Daftar_InpKodeOTP'), 5, FailureHandling.STOP_ON_FAILURE)

        break
    case 'DISABLEDBUTTON':
        Mobile.verifyElementAttributeValue(findTestObject('Dashboard/Login/Daftar/Daftar_BtnSubmitDaftar'), 'enabled', 'false', 
            0, FailureHandling.STOP_ON_FAILURE)

        break
}

