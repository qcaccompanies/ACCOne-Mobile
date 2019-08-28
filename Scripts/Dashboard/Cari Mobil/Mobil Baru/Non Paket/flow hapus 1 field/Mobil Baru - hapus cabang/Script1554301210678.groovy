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

WebUI.callTestCase(findTestCase('Dashboard/Cari Mobil/Mobil Baru/Non Paket/master flow/Mobil baru - open menu - MASTER FLOW'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Dashboard/Cari Mobil/Mobil Baru/Non Paket/master flow/Mobil Baru - MASTER FLOW'), [('varAreaPengajuan') : varAreaPengajuan
        , ('varCabang') : varCabang, ('varBrand') : varBrand, ('varType') : varType, ('varModel') : varModel, ('varTahun') : varTahun
        , ('varOTR') : varOTR, ('varPeriode') : varPeriode, ('varUangMuka') : varUangMuka, ('varAsuransi') : varAsuransi
        , ('varACP') : varACP, ('varExpectedResult') : varExpectedResult], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'mobile.mobileSwipe.UpDown'(0.40, 0.70, 1000)

Mobile.clearText(findTestObject('Dashboard/Cari Mobil/Mobil Baru - non paket/MobilBaru_InpCabangACC'), 0)

WebUI.callTestCase(findTestCase('Dashboard/Cari Mobil/Mobil Baru/Non Paket/master flow/Mobil Baru - verify element - MASTER FLOW'), 
    [('varAreaPengajuan') : varAreaPengajuan, ('varCabang') : '', ('varBrand') : '', ('varType') : '', ('varModel') : ''
        , ('varTahun') : '', ('varOTR') : '', ('varUangMuka') : '', ('varAngsuran') : 'Rp. ', ('varTDP') : 'Rp. '], FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'mobile.mobileSwipe.UpDown'(0.70, 0.40, 100)

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru - non paket/MobilBaru_BtnAjukanPembiayaan'), 0, FailureHandling.STOP_ON_FAILURE)

switch (varExpectedResult.toString()) {
    case 'PASS':
        Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru - non paket/MobilBaru_BtnOKSuksesDaftar'), 0)

        Mobile.waitForElementPresent(findTestObject('Dashboard/Dashboard_BtnCariDana'), 0)

        Mobile.verifyElementVisible(findTestObject('Dashboard/Dashboard_BtnCariDana'), 0)

        break
    case 'DISABLEDBUTTON':
        Mobile.verifyElementNotVisible(findTestObject('Dashboard/Cari Mobil/Mobil Baru - non paket/MobilBaru_BtnOKSuksesDaftar'), 7)

        break
}

