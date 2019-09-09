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

Mobile.waitForElementPresent(findTestObject('Dashboard/Cari Mobil/Mobil Baru - Paket/kredit/MobilBaru_Kredit_InpAreaPengajuan'), 
    0)

Mobile.setText(findTestObject('Dashboard/Cari Mobil/Mobil Baru - Paket/kredit/MobilBaru_Kredit_InpAreaPengajuan'), varAreaPengajuan, 
    0)

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru - Paket/kredit/MobilBaru_Kredit_InpAreaPengajuan'), 0)

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru - Paket/kredit/MobilBaru_Kredit_LOVAreaPengajuan'), 0)

Mobile.setText(findTestObject('Dashboard/Cari Mobil/Mobil Baru - Paket/kredit/MobilBaru_Kredit_InpCabang'), varCabang, 0)

not_run: Mobile.hideKeyboard()

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru - Paket/kredit/MobilBaru_Kredit_LOVCabang'), 0)

CustomKeywords.'mobile.mobileSwipe.UpDown'(0.5, 0.4, 1000)

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru - Paket/kredit/CariMobil_Kredit_InpBrand'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Dashboard/Cari Mobil/Mobil Baru - Paket/kredit/CariMobil_Kredit_InpBrand'), varBrand, 0)

not_run: Mobile.hideKeyboard()

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru - Paket/kredit/MobilBaru_Kredit_LOVBrand'), 0)

Mobile.setText(findTestObject('Dashboard/Cari Mobil/Mobil Baru - Paket/kredit/MobilBaru_Kredit_InpType'), varType, 0)

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru - Paket/kredit/MobilBaru_Kredit_InpType'), 0, FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.hideKeyboard()

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru - Paket/kredit/MobilBaru_Kredit_LOVType'), 0)

