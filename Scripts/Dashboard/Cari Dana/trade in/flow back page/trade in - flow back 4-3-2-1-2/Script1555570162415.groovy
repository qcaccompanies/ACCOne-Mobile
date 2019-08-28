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

WebUI.callTestCase(findTestCase('Dashboard/Cari Dana/trade in/master flow/trade in - open menu - MASTER FLOW'), [('varBPKB') : 'Y'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Dashboard/Cari Dana/trade in/master flow/trade in - page 1 - MASTER FLOW'), [('varBrand') : 'DAIHATSU'
        , ('varType') : 'AYLA', ('varModel') : 'T:1.0 D M/T', ('varTahun') : '2018', ('varExpectedResult') : 'PASS', ('varLokasi') : 'DKI'], 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/cari dana/trade in/page 1 - masukkan detail kendaraanmu/TradeIn_BtnBerikutnya'), 0)

WebUI.callTestCase(findTestCase('Dashboard/Cari Dana/trade in/master flow/trade in - page 2 - MASTER FLOW'), [('varBrand') : 'DAIHATSU'
        , ('varType') : 'AYLA', ('varModel') : 'T:1.0 D M/T', ('varTahun') : '2018', ('varLokasi') : 'DKI', ('varExpectedResult') : 'PASS'
        , ('varNewUsed') : 'U'], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/cari dana/trade in/page 2 - masukkan detail kendaraan masa depanmu/TradeIn_BtnBerikutnya'), 
    0)

WebUI.callTestCase(findTestCase('Dashboard/Cari Dana/trade in/master flow/trade in - page 3 - MASTER FLOW'), [('varOTR') : 'Rp. 120.000.005'], 
    FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.verifyElementExist(findTestObject('Dashboard/cari dana/trade in/page 3 - pilih mobil masa depanmu/TradeIn_TxtPilihMobilMasaDepanmu'), 
    0)

Mobile.pressBack()

Mobile.verifyElementExist(findTestObject('Dashboard/cari dana/trade in/page 2 - masukkan detail kendaraan masa depanmu/TradeIn_TxtMasukkanDetailKendaraanMasaDepanmu'), 
    0)

Mobile.pressBack()

Mobile.verifyElementExist(findTestObject('Dashboard/cari dana/trade in/page 1 - masukkan detail kendaraanmu/TradeIn_TxtMasukkanDetailKendaraanmu'), 
    0)

Mobile.tap(findTestObject('Dashboard/cari dana/trade in/page 1 - masukkan detail kendaraanmu/TradeIn_BtnBerikutnya'), 0)

Mobile.verifyElementExist(findTestObject('Dashboard/cari dana/trade in/page 2 - masukkan detail kendaraan masa depanmu/TradeIn_TxtMasukkanDetailKendaraanMasaDepanmu'), 
    0)

