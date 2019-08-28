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

Mobile.tap(findTestObject('Dashboard/Login/Login_BtnSilang'), 0, FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('Dashboard/Cari Dana/multiguna/master flow/Multiguna - open menu - MASTER FLOW'), [('varBPKB') : 'Y'
        , ('varExistingNew') : 'New'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Dashboard/Cari Dana/multiguna/master flow/Multiguna - page 1 - MASTER FLOW'), [('varBrand') : 'DAIHATSU'
        , ('varType') : 'AYLA', ('varModel') : 'T:1.0 M M/T NEW', ('varTahun') : '2018', ('varExpectedResult') : 'PASS'], 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/cari dana/multiguna/page 1 - masukkan detail kendaraanmu/Multiguna_BtnBerikutnya'), 
    0)

WebUI.callTestCase(findTestCase('Dashboard/Cari Dana/multiguna/master flow/Multiguna - page 2 - MASTER FLOW'), [('varDana') : varDana
        , ('varPeriode') : varPeriode, ('varTujuanPeminjaman') : varTujuanPeminjaman, ('varAreaPengajuan') : varAreaPengajuan
        , ('varCabang') : varCabang, ('varExpectedResult') : varExpectedResult], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/cari dana/multiguna/page 2 - simulasikan dana kebutuhanmu/Multiguna_BtnBerikutnya'), 
    0)

switch (varExpectedResult.toString()) {
    case 'PASS':
        Mobile.waitForElementPresent(findTestObject('Dashboard/cari dana/multiguna/page 3 - silahkan upload foto mobilmu/Multiguna_BtnKananBelakang'), 
            0)

        Mobile.verifyElementVisible(findTestObject('Dashboard/cari dana/multiguna/page 3 - silahkan upload foto mobilmu/Multiguna_BtnKananBelakang'), 
            0)

        break
    case 'LOGIN':
        Mobile.waitForElementPresent(findTestObject('Dashboard/Login/Login_BtnMasuk'), 0)

        Mobile.verifyElementVisible(findTestObject('Dashboard/Login/Login_BtnMasuk'), 7)

        Mobile.verifyElementVisible(findTestObject('Dashboard/Login/Login_InpEmail'), 0, FailureHandling.STOP_ON_FAILURE)

        break
}

Mobile.pressBack()

Mobile.pressBack()

