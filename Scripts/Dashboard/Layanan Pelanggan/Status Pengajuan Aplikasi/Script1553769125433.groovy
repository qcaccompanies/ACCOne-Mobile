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

Mobile.startApplication('C:\\Users\\User\\AppData\\Local\\Microsoft\\Windows\\INetCache\\IE\\06XV6WTM\\AccWorld[1].apk', 
    false)

Mobile.tap(findTestObject('Dashboard/Dashboard_LayananPelanggan'), 0)

WebUI.delay(15)

Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/LayananPelanggan_BtnStatusPengajuanAplikasiNew'), 0)

Mobile.setText(findTestObject('Dashboard/Layanan Pelanggan/Status Pengajuan Aplikasi/StatusPengajuanAplikasi_InpNomorPendaftaran'), 
    '400404001902590', 0)

Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/Status Pengajuan Aplikasi/StatusPengajuanAplikasi_BtnSubmit'), 0)

WebUI.delay(15)

Mobile.closeApplication()
