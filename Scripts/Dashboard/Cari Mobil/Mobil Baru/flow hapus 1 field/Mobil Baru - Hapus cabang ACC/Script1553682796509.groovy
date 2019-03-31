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

Mobile.startApplication('C:\\Users\\IT-Services\\Katalon Studio\\ACCONE Mobile\\accone tst env 24 maret 2019.apk', false)

Mobile.tap(findTestObject('dashboard/Dashboard_BtnCariMobil'), 0)

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_BtnMobilBaru'), 0)

Mobile.waitForElementPresent(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_InpAreaPengajuan'), 0)

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_InpAreaPengajuan'), 0)

Mobile.setText(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_InpAreaPengajuan'), 'DKI Jakarta, Banten, Jawa Barat', 0)

'diberikan delay sementara, karena belum bisa tap pada list yang diinginkan'
Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_InpCabangACC'), 0)

Mobile.setText(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_InpCabangACC'), 'FATMAWATI', 0)

'diberikan delay sementara, karena belum bisa tap pada list yang diinginkan'
Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_InpBrand'), 0)

Mobile.setText(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_InpBrand'), 'TOYOTA', 0)

'diberikan delay sementara, karena belum bisa tap pada list yang diinginkan'
Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_InpType'), 0)

Mobile.setText(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_InpType'), 'AGYA', 0)

'diberikan delay sementara, karena belum bisa tap pada list yang diinginkan'
Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_InpModel'), 0)

Mobile.setText(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_InpModel'), '1.0 G A/T NEW', 0)

'diberikan delay sementara, karena belum bisa tap pada list yang diinginkan'
Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_InpTahun'), 0)

Mobile.setText(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_InpTahun'), '2019', 0)

'diberikan delay sementara, karena belum bisa tap pada list yang diinginkan'
Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_InpOTR'), 0)

Mobile.clearText(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_InpOTR'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_InpOTR'), '150000000', 0)

'diberikan delay sementara, karena belum bisa tap pada list yang diinginkan'
Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_InpDPRp'), 0)

Mobile.setText(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_InpDPRp'), '50000000', 0)

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_ChkKredit'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_ChkACP'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.clearText(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_InpCabangACC'), 0)

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_BtnAjukanPembiayaan'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementNotVisible(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_BtnOKSuksesDaftar'), 0)

