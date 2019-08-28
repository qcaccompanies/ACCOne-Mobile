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

WebUI.callTestCase(findTestCase('Dashboard/Cari Mobil/Mobil Baru/paket/budget/Master FLow/mobil baru - paket - budget open menu - MASTER FLOW'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Dashboard/Cari Mobil/Mobil Baru/paket/budget/Master FLow/mobil baru - paket - budget - MASTER FLOW'), 
    [('varAreaPengajuan') : varAreaPengajuan, ('varCabangAcc') : varCabangAcc, ('varUangMuka') : varUangMuka, ('varAngsuran') : varAngsuran], 
    FailureHandling.STOP_ON_FAILURE)

Mobile.clearText(findTestObject('Dashboard/Cari Mobil/Mobil Baru - Paket/budget/page 1/CariMobil_Budget_InpAreaPengajuan'), 
    0)

Mobile.hideKeyboard(FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('Dashboard/Cari Mobil/Mobil Baru/paket/budget/Master FLow/mobil baru - paket - budget - verify element'), 
    [('varAreaPengajuan') : '', ('varCabangAcc') : '', ('varUangMuka') : '', ('varAngsuran') : ''], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru - Paket/budget/page 1/CariMobil_Budget_BtnCariPaket'), 0)

switch (varExpectedResult.toString()) {
    case 'PASS':
        Mobile.verifyElementVisible(findTestObject('Dashboard/Cari Mobil/Mobil Baru - Paket/budget/page 2/CariMobil_Budget_InpSearch'), 
            0)

        break
    case 'DISABLEDBUTTON':
        Mobile.verifyElementNotVisible(findTestObject('Dashboard/Cari Mobil/Mobil Baru - Paket/budget/page 2/CariMobil_Budget_InpSearch'), 
            7, FailureHandling.OPTIONAL)

        break
}

