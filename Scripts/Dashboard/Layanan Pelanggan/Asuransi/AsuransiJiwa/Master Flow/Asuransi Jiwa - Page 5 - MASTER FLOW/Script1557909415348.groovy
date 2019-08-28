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

Mobile.waitForElementPresent(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Jiwa/page 5/AsuransiJiwa_TxtRekomendasiAsuransi'), 
    0)

switch (varRekomendasiProduk.toString()) {
    case 'ASLI PELITA PROTEKSI PRATAMA':
        Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Jiwa/page 5/AsuransiJiwa_BtnPilihProdukPratama'), 
            0)

        if (varCashback == 'Y') {
            Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Jiwa/page 5/AsuransiJiwa_BtnAmbilCashback'), 
                0)
        } else {
            Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Jiwa/page 5/AsuransiJiwa_BtnTidakCashback'), 
                0)
        }
        
        break
    case 'ASLI PELITA PROTEKSI RENCANA':
        Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Jiwa/page 5/AsuransiJiwa_BtnPilihProdukRencana'), 
            0)

        break
}

