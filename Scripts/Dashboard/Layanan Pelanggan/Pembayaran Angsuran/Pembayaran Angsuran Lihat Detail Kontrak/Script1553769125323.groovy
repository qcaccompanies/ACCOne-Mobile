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

Mobile.tap(findTestObject('Dashboard/Dashboard_LayananPelanggan'), 0)

Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/PembayaranAngsuran/LayananPelanggan_BtnPembayaranAngsuran'), 0)

Mobile.setText(findTestObject('Dashboard/Layanan Pelanggan/PembayaranAngsuran/PembayaranAngsuran_SearchBarKontrak'), '01100102002934939', 
    0)

Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/PembayaranAngsuran/PembayaranAngsuran_BoxKontrak'), 0)

Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/PembayaranAngsuran/PembayaranAngsuran_TxtLihatDetailKontrak'), 0)

Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/PembayaranAngsuran/PembayaranAngsuran_TxtJadwalPembayaran'), 0)

Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/PembayaranAngsuran/PembayaranAngsuran_SearchBarCalenderKontrak'), 
    0)

Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/PembayaranAngsuran/PembayaranAngsuran_BtnSetCalender'), 0)

Mobile.pressBack()

