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

WebUI.callTestCase(findTestCase('Dashboard/Login/Login/master flow/Login - MASTER FLOW'), [('varUsername') : 'lelah@directmail.top'
        , ('varPassword') : 'Password1', ('varExpectedResult') : 'NO'], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/Login/Login_BtnMasuk'), 0)

WebUI.callTestCase(findTestCase('Dashboard/Cari Mobil/Mobil Baru/Non Paket/master flow/Mobil baru - open menu - MASTER FLOW'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Dashboard/Cari Mobil/Mobil Baru/Non Paket/master flow/Mobil Baru - MASTER FLOW'), [('varAreaPengajuan') : varAreaPengajuan
        , ('varCabang') : varCabang, ('varBrand') : varBrand, ('varType') : varType, ('varModel') : varModel, ('varTahun') : varTahun
        , ('varOTR') : varOTR, ('varPeriode') : varPeriode, ('varUangMuka') : varUangMuka, ('varAsuransi') : varAsuransi
        , ('varACP') : varACP, ('varExpectedResult') : varExpectedResult], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru - non paket/MobilBaru_BtnAjukanPembiayaan'), 0, FailureHandling.STOP_ON_FAILURE)

switch (varExpectedResult.toString()) {
    case 'PASS':
        Mobile.waitForElementPresent(findTestObject('Dashboard/Dashboard_BtnCariDana'), 0)

        Mobile.verifyElementVisible(findTestObject('Dashboard/Dashboard_BtnCariDana'), 0)

        break
    case 'UPLOAD':
        Mobile.verifyElementNotVisible(findTestObject('Dashboard/Cari Mobil/Mobil Baru - non paket/MobilBaru_BtnOKSuksesDaftar'), 7)

        Mobile.verifyElementVisible(findTestObject('BottomMenu/Akun/Unggah Dokumen/UnggahDokumen_BtnKTP'), 0)

        break
}

Mobile.closeApplication()

