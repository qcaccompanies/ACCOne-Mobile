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

WebUI.callTestCase(findTestCase('Dashboard/Cari Dana/trade in/flow data binding/trade in - page 1'), [('varExpectedResult') : 'PASS'
        , ('varLokasi') : 'DKI', ('varTahun') : '2018', ('varModel') : 'T:1.0 D M/T', ('varType') : 'AYLA', ('varBrand') : 'DAIHATSU'
        , ('varBPKB') : 'Y'], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/cari dana/trade in/page 2 - masukkan detail kendaraan masa depanmu/TradeIn_BtnUsedCar'), 0)

Mobile.tap(findTestObject('Dashboard/cari dana/trade in/page 2 - masukkan detail kendaraan masa depanmu/TradeIn_InpBrand'), 0)

Mobile.setText(findTestObject('Dashboard/cari dana/trade in/page 2 - masukkan detail kendaraan masa depanmu/TradeIn_InpBrand'), 'DAIHATSU', 
    0)

'diberikan delay sementara, karena belum bisa tap pada list yang diinginkan'
Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/cari dana/trade in/page 2 - masukkan detail kendaraan masa depanmu/TradeIn_InpType'), 0)

Mobile.setText(findTestObject('Dashboard/cari dana/trade in/page 2 - masukkan detail kendaraan masa depanmu/TradeIn_InpType'), 'AYLA', 
    0)

'diberikan delay sementara, karena belum bisa tap pada list yang diinginkan'
Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/cari dana/trade in/page 2 - masukkan detail kendaraan masa depanmu/TradeIn_InpModel'), 0)

Mobile.setText(findTestObject('Dashboard/cari dana/trade in/page 2 - masukkan detail kendaraan masa depanmu/TradeIn_InpModel'), 'T:1.0 D M/T', 
    0)

'diberikan delay sementara, karena belum bisa tap pada list yang diinginkan'
Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/cari dana/trade in/page 2 - masukkan detail kendaraan masa depanmu/TradeIn_InpTahun'), 0)

Mobile.setText(findTestObject('Dashboard/cari dana/trade in/page 2 - masukkan detail kendaraan masa depanmu/TradeIn_InpTahun'), '2018', 
    0)

'diberikan delay sementara, karena belum bisa tap pada list yang diinginkan'
Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/cari dana/trade in/page 2 - masukkan detail kendaraan masa depanmu/TradeIn_InpLokasi'), 0)

Mobile.setText(findTestObject('Dashboard/cari dana/trade in/page 2 - masukkan detail kendaraan masa depanmu/TradeIn_InpLokasi'), 'DKI', 
    0)

'diberikan delay sementara, karena belum bisa tap pada list yang diinginkan'
Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.clearText(findTestObject('Dashboard/cari dana/trade in/page 2 - masukkan detail kendaraan masa depanmu/TradeIn_InpLokasi'), 
    0)

Mobile.tap(findTestObject('Dashboard/cari dana/trade in/page 2 - masukkan detail kendaraan masa depanmu/TradeIn_BtnBerikutnya'), 0)

Mobile.verifyElementNotVisible(findTestObject('Dashboard/cari dana/trade in/page 3 - pilih mobil masa depanmu/TradeIn_BtnMobilMasaDepan'), 
    0)

