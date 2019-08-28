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

Mobile.waitForElementPresent(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Mobil/AsuransiMobil_TxtPlatNomer'), 
    0)

Mobile.setText(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Mobil/AsuransiMobil_TxtPlatNomer'), varNoPol, 
    0)

Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Mobil/AsuransiMobil_BtnCari'), 0)

Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Mobil/AsuransiMobil_BtnPerpanjangAsuransi'), 0)

CustomKeywords.'mobile.mobileSwipe.UpDown'(0.7, 0.2, 1000)

Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Mobil/AsuransiMobil_BtnPerpanjang'), 0)

Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Mobil/AsuransiMobil_BtnOkay'), 0)

