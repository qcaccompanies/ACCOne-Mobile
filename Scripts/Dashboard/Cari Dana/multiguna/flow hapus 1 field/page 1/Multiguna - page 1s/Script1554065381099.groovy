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

Mobile.waitForElementPresent(findTestObject('dashboard/Dashboard_BtnCariDana'), 0)

Mobile.tap(findTestObject('dashboard/Dashboard_BtnCariDana'), 0)

Mobile.tap(findTestObject('Dashboard/cari dana/CariDana_BtnBPKBdiACC_YA'), 0)

Mobile.tap(findTestObject('Dashboard/cari dana/CariDana_BtnPembiayaanMultiguna'), 0)

Mobile.tap(findTestObject('Dashboard/cari dana/multiguna/page 1 - masukkan detail kendaraanmu/Multiguna_BtnNewCustomer'), 0)

Mobile.tap(findTestObject('Dashboard/cari dana/multiguna/page 1 - masukkan detail kendaraanmu/Multiguna_InpBrand'), 0)

Mobile.setText(findTestObject('Dashboard/cari dana/multiguna/page 1 - masukkan detail kendaraanmu/Multiguna_InpBrand'), 'DAIHATSU', 
    0)

'diberikan delay sementara, karena belum bisa tap pada list yang diinginkan'
Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/cari dana/multiguna/page 1 - masukkan detail kendaraanmu/Multiguna_InpType'), 0)

Mobile.setText(findTestObject('Dashboard/cari dana/multiguna/page 1 - masukkan detail kendaraanmu/Multiguna_InpType'), 'AYLA', 0)

'diberikan delay sementara, karena belum bisa tap pada list yang diinginkan'
Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/cari dana/multiguna/page 1 - masukkan detail kendaraanmu/Multiguna_InpModel'), 0)

Mobile.setText(findTestObject('Dashboard/cari dana/multiguna/page 1 - masukkan detail kendaraanmu/Multiguna_InpModel'), 'T:1.0 M M/T NEW', 
    0)

'diberikan delay sementara, karena belum bisa tap pada list yang diinginkan'
Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/cari dana/multiguna/page 1 - masukkan detail kendaraanmu/Multiguna_InpTahun'), 0)

Mobile.setText(findTestObject('Dashboard/cari dana/multiguna/page 1 - masukkan detail kendaraanmu/Multiguna_InpTahun'), '2018', 0)

'diberikan delay sementara, karena belum bisa tap pada list yang diinginkan'
Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/cari dana/multiguna/page 1 - masukkan detail kendaraanmu/Multiguna_BtnBerikutnya'), 0)

