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

Mobile.waitForElementPresent(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Jiwa/page 2/AsuransiJiwa_TxtSayaMembutuhkanProteksi'), 
    0)

def jiwaIsChecked = Mobile.getAttribute(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Jiwa/page 2/AsuransiJiwa_RadBtnProteksiJiwa'), 
    'checked', 0)

def kesehatanIsChecked = Mobile.getAttribute(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Jiwa/page 2/AsuransiJiwa_RadBtnProteksiKesehatan'), 
    'checked', 0)

switch (varProteksiKesehatan.toString()) {
    case 'Y':
        if (kesehatanIsChecked == 'false') {
            Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Jiwa/page 2/AsuransiJiwa_RadBtnProteksiKesehatan'), 
                0)
        }
        
        break
    case 'N':
        if (kesehatanIsChecked == 'true') {
            Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Jiwa/page 2/AsuransiJiwa_RadBtnProteksiKesehatan'), 
                0)
        }
        
        break
}

switch (varProteksiJiwa.toString()) {
    case 'Y':
        if (jiwaIsChecked == 'false') {
            Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Jiwa/page 2/AsuransiJiwa_RadBtnProteksiJiwa'), 
                0)
        }
        
        break
    case 'N':
        if (jiwaIsChecked == 'true') {
            Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Jiwa/page 2/AsuransiJiwa_RadBtnProteksiJiwa'), 
                0)
        }
        
        break
}

