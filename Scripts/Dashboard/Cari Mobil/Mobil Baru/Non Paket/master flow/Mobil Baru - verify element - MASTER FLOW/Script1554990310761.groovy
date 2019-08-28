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

InpAreaPengajuan = Mobile.getText(findTestObject('Dashboard/Cari Mobil/Mobil Baru - non paket/MobilBaru_InpAreaPengajuan'), 
    0)

InpCabangACC = Mobile.getText(findTestObject('Dashboard/Cari Mobil/Mobil Baru - non paket/MobilBaru_InpCabangACC'), 0)

InpBrand = Mobile.getText(findTestObject('Dashboard/Cari Mobil/Mobil Baru - non paket/MobilBaru_InpBrand'), 0)

InpType = Mobile.getText(findTestObject('Dashboard/Cari Mobil/Mobil Baru - non paket/MobilBaru_InpType'), 0)

InpModel = Mobile.getText(findTestObject('Dashboard/Cari Mobil/Mobil Baru - non paket/MobilBaru_InpModel'), 0)

InpTahun = Mobile.getText(findTestObject('Dashboard/Cari Mobil/Mobil Baru - non paket/MobilBaru_InpTahun'), 0)

InpOTR = Mobile.getText(findTestObject('Dashboard/Cari Mobil/Mobil Baru - non paket/MobilBaru_InpOTR'), 0)

InpDP = Mobile.getText(findTestObject('Dashboard/Cari Mobil/Mobil Baru - non paket/MobilBaru_InpDP'), 0)

CustomKeywords.'mobile.mobileSwipe.UpDown'(0.7, 0.2, 1000)

def tdpMobile = Mobile.getText(findTestObject('Dashboard/Cari Mobil/Mobil Baru - non paket/MobilBaru_TxtTDP'), 0)

def angsuranMobile = Mobile.getText(findTestObject('Dashboard/Cari Mobil/Mobil Baru - non paket/MobilBaru_TxtAngsuran'), 
    0)

Mobile.verifyEqual(InpAreaPengajuan, varAreaPengajuan, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(InpCabangACC, varCabang, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(InpBrand, varBrand, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(InpType, varType, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(InpModel, varModel, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(InpTahun, varTahun, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(InpOTR, varOTR, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(InpDP, varUangMuka, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyMatch(tdpMobile, varTDP, false, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyMatch(angsuranMobile, varAngsuran, false, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

