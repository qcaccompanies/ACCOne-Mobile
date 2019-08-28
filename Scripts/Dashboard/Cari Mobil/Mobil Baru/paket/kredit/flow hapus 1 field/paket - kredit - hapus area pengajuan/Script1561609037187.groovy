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

WebUI.callTestCase(findTestCase('Dashboard/Cari Mobil/Mobil Baru/paket/kredit/master flow/mobil baru - paket - open menu - MASTER FLOW'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Dashboard/Cari Mobil/Mobil Baru/paket/kredit/master flow/mobil baru - paket - page 1 -MASTER FLOW'), 
    [('varAreaPengajuan') : varAreaPengajuan, ('varCabang') : varCabang, ('varBrand') : varBrand, ('varType') : varType], 
    FailureHandling.STOP_ON_FAILURE)

Mobile.clearText(findTestObject('Dashboard/Cari Mobil/Mobil Baru - Paket/kredit/MobilBaru_Kredit_InpAreaPengajuan'), 0)

CustomKeywords.'mobile.mobileSwipe.UpDown'(0.2, 0.7, 1000)

WebUI.callTestCase(findTestCase('Dashboard/Cari Mobil/Mobil Baru/paket/kredit/master flow/mobil baru - paket - verify element - MASTER FLOW'), 
    [('varAreaPengajuan') : '', ('varCabang') : '', ('varBrand') : '', ('varType') : ''], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru - Paket/kredit/CariMobil_Paket_Kredit_BtnPilihPaketKredit'), 
    0)

switch (varExpectedResult.toString()) {
    case 'PASS':
        Mobile.verifyElementExist(findTestObject('Dashboard/Cari Mobil/Mobil Baru - Paket/kredit/CariMobil_Paket_Kredit_TxtNamaPaket'), 
            0)

        WebUI.callTestCase(findTestCase('Dashboard/Cari Mobil/Mobil Baru/paket/kredit/master flow/mobil baru - paket - page 2 -MASTER FLOW'), 
            [:], FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru - Paket/kredit/CariMobil_Paket_Kredit_BtnAjukanPembiayaan'), 
            0)

        break
    case 'DISABLEDBUTTON':
        Mobile.verifyElementNotVisible(findTestObject('Dashboard/Cari Mobil/Mobil Baru - Paket/kredit/CariMobil_Paket_Kredit_TxtNamaPaket'), 
            7)

        break
}

