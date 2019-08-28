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

Mobile.waitForElementPresent(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Jiwa/page 7/AsuransiJiwa_CheckBoxTertanggungUtama'), 
    0)

switch (varTertanggungUtama.toString()) {
    case 'Y':
        Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Jiwa/page 7/AsuransiJiwa_CheckBoxTertanggungUtama'), 
            0)

        break
    case 'N':
        break
}

switch (varJenisKelamin.toString()) {
    case 'Pria':
        Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Jiwa/page 7/AsuransiJiwa_RadBtnPria'), 
            0)

        break
    case 'Wanita':
        Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Jiwa/page 7/AsuransiJiwa_RadBtnWanita'), 
            0)

        break
}

Mobile.setText(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Jiwa/page 7/AsuransiJiwa_InpNoKTP'), varNoKTP, 
    0)

CustomKeywords.'mobile.mobileSwipe.UpDown'(0.70, 0.20, 1000)

Mobile.setText(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Jiwa/page 7/AsuransiJiwa_TxtAlamat'), varAlamat, 
    0)

Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Jiwa/page 7/AsuransiJiwa_LOVProvinsi'), 0)

Mobile.tap(findTestObject('DynamicObject/CheckedTextView', [('text') : varProvinsi]), 0)

CustomKeywords.'mobile.mobileSwipe.UpDown'(0.70, 0.20, 1000)

Mobile.setText(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Jiwa/page 7/AsuransiJiwa_InpKodePos'), varKodePos, 
    0)

'ini buat ganti LOV bank'
Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'mobile.mobileSwipe.UpDown'(0.70, 0.20, 1000)

Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Jiwa/page 7/AsuransiJiwa_ChkPernyataan'), 0)

