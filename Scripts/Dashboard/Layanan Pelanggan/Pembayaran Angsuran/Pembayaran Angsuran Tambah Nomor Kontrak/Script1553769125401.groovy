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

Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/LayananPelanggan_BtnPembayaranAngsuranNew'), 0)

Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/PembayaranAngsuran/JadwalPembayaran_BtnTambahKontrak'), 0)

Mobile.setText(findTestObject('Dashboard/Layanan Pelanggan/Pembayaran Angsuran/PembayaranAngsuran_InpTambahKontrak'), '01600872001812506', 
    0)

Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/Pembayaran Angsuran/PembayaranAngsuran_BtnTambahKontrak'), 0)

Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/Pembayaran Angsuran/PembayaranAngsuran_GantiNomor'), 0)

Mobile.setText(findTestObject('Dashboard/Layanan Pelanggan/Pembayaran Angsuran/PembayaranAngsuran_InpNomorHPLama'), '081904067865', 
    0)

Mobile.setText(findTestObject('Dashboard/Layanan Pelanggan/Pembayaran Angsuran/PembayaranAngsuran_InpNomorHPBaru'), '087824121996', 
    0)

Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/Pembayaran Angsuran/android.widget.Button0 - Konfirmasi'), 0)

Mobile.setText(findTestObject('Dashboard/Layanan Pelanggan/Pembayaran Angsuran/PembayaranAngsuran_InputOTP'), '845587', 
    0)

Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/Pembayaran Angsuran/PembayaranAngsuran_BtnVerifikasi'), 0)

Mobile.closeApplication()

