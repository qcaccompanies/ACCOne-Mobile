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

WebUI.callTestCase(findTestCase('Dashboard/Layanan Pelanggan/Asuransi/AsuransiJiwa/Master Flow/Asuransi Jiwa - Open Menu - MASTER FLOW'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Dashboard/Layanan Pelanggan/Asuransi/AsuransiJiwa/Master Flow/Asuransi Jiwa - Page 1 - MASTER FLOW'), 
    [('varPerlindungan') : varPerlindungan], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Jiwa/page 1/AsuransiJiwa_BtnLanjut'), 0)

WebUI.callTestCase(findTestCase('Dashboard/Layanan Pelanggan/Asuransi/AsuransiJiwa/Master Flow/Asuransi Jiwa - Page 2 - MASTER FLOW'), 
    [('varProteksiKesehatan') : varProteksiKesehatan, ('varProteksiJiwa') : varProteksiJiwa], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Jiwa/page 2/AsuransiJiwa_BtnLanjut'), 0)

WebUI.callTestCase(findTestCase('Dashboard/Layanan Pelanggan/Asuransi/AsuransiJiwa/Master Flow/Asuransi Jiwa - Page 3 - MASTER FLOW'), 
    [('varTahun') : varTahun], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Jiwa/page 3/AsuransiJiwa_BtnLanjut'), 0)

WebUI.callTestCase(findTestCase('Dashboard/Layanan Pelanggan/Asuransi/AsuransiJiwa/Master Flow/Asuransi Jiwa - Page 4 - MASTER FLOW'), 
    [('varKepemilikanAsuransi') : varKepemilikanAsuransi], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Jiwa/page 4/AsuransiJiwa_BtnLanjut'), 0)

WebUI.callTestCase(findTestCase('Dashboard/Layanan Pelanggan/Asuransi/AsuransiJiwa/Master Flow/Asuransi Jiwa - Page 5 - MASTER FLOW'), 
    [('varRekomendasiProduk') : varRekomendasiProduk, ('varCashback') : varCashback], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Dashboard/Layanan Pelanggan/Asuransi/AsuransiJiwa/Master Flow/Asuransi Jiwa - Page 6 - MASTER FLOW'), 
    [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Jiwa/page 6/AsuransiJiwa_BtnYa'), 0)

WebUI.callTestCase(findTestCase('Dashboard/Layanan Pelanggan/Asuransi/AsuransiJiwa/Master Flow/Asuransi Jiwa - Page 7 - MASTER FLOW'), 
    [('varTertanggungUtama') : varTertanggungUtama, ('varJenisKelamin') : varJenisKelamin, ('varNoKTP') : varNoKTP, ('varAlamat') : varAlamat
        , ('varProvinsi') : varProvinsi], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Jiwa/page 7/AsuransiJiwa_BtnLanjut'), 0)

switch (varRekomendasiProduk.toString()) {
    case 'ASLI PELITA PROTEKSI RENCANA':
        WebUI.callTestCase(findTestCase('Dashboard/Layanan Pelanggan/Asuransi/AsuransiJiwa/Master Flow/Asuransi Jiwa - Page 9 - Asuransi Proteksi Rencana - MASTER FLOW'), 
            [('varPremi') : varPremi, ('varFrekuensi') : varFrekuensi], FailureHandling.STOP_ON_FAILURE)

        break
    case 'ASLI PELITA PROTEKSI PRATAMA':
        WebUI.callTestCase(findTestCase('Dashboard/Layanan Pelanggan/Asuransi/AsuransiJiwa/Master Flow/Asuransi Jiwa - Page 9 - Asuransi Proteksi Pratama - MASTER FLOW'), 
            [('varPremi') : varPremi, ('varFrekuensi') : varFrekuensi, ('varAsuransiTambahan') : varAsuransiTambahan], FailureHandling.STOP_ON_FAILURE)

        break
}

Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Jiwa/page 9/AsuransiJiwa_BtnLanjut'), 0)

WebUI.callTestCase(findTestCase('Dashboard/Layanan Pelanggan/Asuransi/AsuransiJiwa/Master Flow/Asuransi Jiwa - Page 10 - Beli Paket - MASTER FLOW'), 
    [:], FailureHandling.STOP_ON_FAILURE)

