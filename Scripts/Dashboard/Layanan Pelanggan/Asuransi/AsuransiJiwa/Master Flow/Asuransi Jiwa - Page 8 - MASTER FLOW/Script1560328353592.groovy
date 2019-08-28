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

Mobile.waitForElementPresent(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Jiwa/page 8/AsuransiJiwa_CheckBoxTertanggungUtama'), 
    0)

switch (varTertanggungUtama.toString()) {
    case 'Y':
        Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Jiwa/page 8/AsuransiJiwa_CheckBoxTertanggungUtama'), 
            0)

        break
    case 'N':
        break
}

Mobile.setText(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Jiwa/page 8/AsuransiJiwa_InpNamaLengkap'), 
    varNamaLengkap, 0)

WebUI.delay(2)

CustomKeywords.'mobile.mobileSwipe.UpDown'(0.70, 0.20, 1000)

Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Jiwa/page 8/AsuransiJiwa_InpTanggalLahir'), 0)

WebUI.callTestCase(findTestCase('calendar'), [('varTahun') : varTahun], FailureHandling.STOP_ON_FAILURE)

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

Mobile.setText(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Jiwa/page 8/AsuransiJiwa_InpNoPonsel'), varNoPonsel, 
    0)

Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Jiwa/page 8/AsuransiJiwa_LOVHubunganDgnPemilih'), 
    0)

Mobile.tap(findTestObject('DynamicObject/CheckedTextView', [('text') : varHubungan]), 0)

Mobile.setText(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Jiwa/page 8/AsuransiJiwa_InpNoKTP'), varNoKTP, 
    0)

Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Jiwa/page 8/AsuransiJiwa_BtnUploadKTP'), 0)

Mobile.tap(findTestObject('Dashboard/cari dana/multiguna/page 3 - silahkan upload foto mobilmu/Multiguna_BtnGallery'), 0)

Mobile.scrollToText(varFotoKTP, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/cari dana/multiguna/page 3 - silahkan upload foto mobilmu/Multiguna_NamaFileUpload', 
        [('imageName') : varFotoKTP]), 0)

CustomKeywords.'mobile.mobileSwipe.UpDown'(0.70, 0.20, 1000)



