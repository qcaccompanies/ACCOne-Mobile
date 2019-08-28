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

WebUI.callTestCase(findTestCase('Dashboard/Login/Login/master flow/Login - MASTER FLOW'), [('varUsername') : 'notverified@a.c'
        , ('varPassword') : 'Password1!', ('varExpectedResult') : 'NO'], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/Login/Login_BtnMasuk'), 0)

WebUI.callTestCase(findTestCase('Dashboard/Cari Dana/trade in/master flow/trade in - open menu - MASTER FLOW'), [('varBPKB') : 'Y'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Dashboard/Cari Dana/trade in/master flow/trade in - page 1 - MASTER FLOW'), [('varBrand') : 'DAIHATSU'
        , ('varType') : 'AYLA', ('varModel') : 'T:1.0 D M/T', ('varTahun') : '2018', ('varExpectedResult') : 'PASS', ('varLokasi') : 'DKI'], 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/cari dana/trade in/page 1 - masukkan detail kendaraanmu/TradeIn_BtnBerikutnya'), 0)

WebUI.callTestCase(findTestCase('Dashboard/Cari Dana/trade in/master flow/trade in - page 2 - MASTER FLOW'), [('varBrand') : varBrand
        , ('varType') : varType, ('varModel') : varModel, ('varTahun') : varTahun, ('varLokasi') : varLokasi, ('varExpectedResult') : varExpectedResult
        , ('varNewUsed') : varNewUsed], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/cari dana/trade in/page 2 - masukkan detail kendaraan masa depanmu/TradeIn_BtnBerikutnya'), 
    0)

WebUI.callTestCase(findTestCase('Dashboard/Cari Dana/trade in/master flow/trade in - page 3 - MASTER FLOW'), [('varOTR') : varOTR], 
    FailureHandling.STOP_ON_FAILURE)

switch (varExpectedResult.toString()) {
    case 'PASS':
        Mobile.verifyElementNotVisible(findTestObject('Dashboard/cari dana/trade in/page 2 - masukkan detail kendaraan masa depanmu/TradeIn_BtnUsedCar'), 
            0)

        break
    case 'UPLOAD':
        Mobile.verifyElementNotVisible(findTestObject('Dashboard/cari dana/trade in/page 3 - pilih mobil masa depanmu/TradeIn_BtnMobilMasaDepan'), 
            0)

        Mobile.verifyElementVisible(findTestObject('BottomMenu/Akun/Unggah Dokumen/UnggahDokumen_BtnKTP'), 0)

        break
}

