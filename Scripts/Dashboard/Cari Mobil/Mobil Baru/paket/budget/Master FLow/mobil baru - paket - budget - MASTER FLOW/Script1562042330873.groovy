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

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru - Paket/budget/page 1/CariMobil_Budget_InpAreaPengajuan'), 0)

Mobile.setText(findTestObject('Dashboard/Cari Mobil/Mobil Baru - Paket/budget/page 1/CariMobil_Budget_InpAreaPengajuan'), 
    varAreaPengajuan, 0)

Mobile.hideKeyboard(FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru - Paket/budget/page 1/CariMobil_Budget_LOVAreaPengajuan'), 0)

Mobile.setText(findTestObject('Dashboard/Cari Mobil/Mobil Baru - Paket/budget/page 1/CariMobil_Budget_InpCabangACC'), varCabangAcc, 
    0)

Mobile.hideKeyboard(FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru - Paket/budget/page 1/CariMobil_Budget_LOVCabangACC'), 0)

Mobile.setText(findTestObject('Dashboard/Cari Mobil/Mobil Baru - Paket/budget/page 1/CariMobil_Budget_InpUangMuka'), varUangMuka, 
    0)

Mobile.hideKeyboard(FailureHandling.OPTIONAL)

Mobile.setText(findTestObject('Dashboard/Cari Mobil/Mobil Baru - Paket/budget/page 1/CariMobil_Budget_InpAngsuran'), varAngsuran, 
    0)

Mobile.hideKeyboard(FailureHandling.OPTIONAL)

