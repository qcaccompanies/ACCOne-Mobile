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

switch (varFrekuensi.toString()) {
    case '1':
        Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Jiwa/page 9/asuransi proteksi pratama/AsuransiJiwa_BtnFrekuensi1Bulan'), 
            0)

        break
    case '3':
        Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Jiwa/page 9/asuransi proteksi pratama/AsuransiJiwa_BtnFrekuensi3Bulan'), 
            0)

        break
    case '6':
        Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Jiwa/page 9/asuransi proteksi pratama/AsuransiJiwa_BtnFrekuensi6Bulan'), 
            0)

        break
    case '12':
        Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Jiwa/page 9/asuransi proteksi pratama/AsuransiJiwa_BtnFrekuensi12Bulan'), 
            0)

        break
}

switch (varPremi.toString()) {
    case 'DIAMOND':
        Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Jiwa/page 9/asuransi proteksi pratama/AsuransiJiwa_BtnPremiDiamond'), 
            0)

        break
    case 'PLATINUM':
        Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Jiwa/page 9/asuransi proteksi pratama/AsuransiJiwa_BtnPremiPlatinum'), 
            0)

        break
    case 'GOLD':
        Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Jiwa/page 9/asuransi proteksi pratama/AsuransiJiwa_BtnPremiGold'), 
            0)

        break
    case 'SILVER':
        Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Jiwa/page 9/asuransi proteksi pratama/AsuransiJiwa_BtnPremiSilver'), 
            0)

        break
}
Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Jiwa/page 9/AsuransiJiwa_BtnLanjut'), 0)


switch (varAsuransiTambahan.toString()) {
    case 'TERTANGGUNG':
        Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Jiwa/page 9/asuransi proteksi pratama/AsuransiJiwa_AsuransiTambahan_BtnTertanggungUtama'), 
            0)

        break
    case 'TIDAK':
        Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Jiwa/page 9/asuransi proteksi pratama/AsuransiJiwa_AsuransiTambahan_BtnTidakPerlu'), 
            0)

        break
}



