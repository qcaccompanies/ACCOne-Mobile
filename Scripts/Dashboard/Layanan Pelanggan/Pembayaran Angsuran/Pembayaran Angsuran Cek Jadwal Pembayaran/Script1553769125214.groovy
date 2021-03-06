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

Mobile.startApplication('/Users/tomyhidayat/Downloads/Project in ACC - ACCOne MOBILE 2932019/Project in ACC - ACCOne MOBILE 2932019/AccWorld.apk', 
    false)

Mobile.tap(findTestObject('Dashboard/Dashboard_LayananPelanggan'), 0)

Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/PembayaranAngsuran/LayananPelanggan_BtnPembayaranAngsuran'), 0)

Mobile.setText(findTestObject('Dashboard/Layanan Pelanggan/PembayaranAngsuran/PembayaranAngsuran_SearchBarKontrak'), 'imran', 
    0)

Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/PembayaranAngsuran/PembayaranAngsuran_BoxKontrak'), 0)

Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/PembayaranAngsuran/PembayaranAngsuran_TxtLihatDetailKontrak'), 0)

Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/PembayaranAngsuran/PembayaranAngsuran_TxtJadwalPembayaran'), 0)

Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/PembayaranAngsuran/PembayaranAngsuran_SearchBarCalenderKontrak'), 
    0)

Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/PembayaranAngsuran/PembayaranAngsuran_BtnSetCalender'), 0)

Mobile.pressBack()

Mobile.pressBack()

Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/PembayaranAngsuran/PembayaranAngsuran_TxtLihatDetailPembayaranAngsuran'), 
    0)

Mobile.pressBack()

Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/PembayaranAngsuran/PembayaranAngsuran_BtnBayarSekarang'), 0)

Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/PembayaranAngsuran/PembayaranAngsuran_MenuBankPermata'), 0)

Mobile.closeApplication()

