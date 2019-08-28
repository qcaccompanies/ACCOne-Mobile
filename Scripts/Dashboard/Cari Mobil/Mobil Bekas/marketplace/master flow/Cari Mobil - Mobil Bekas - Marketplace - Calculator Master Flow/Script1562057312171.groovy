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

not_run: Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Bekas/accbid/kalkulator/CariMobil_MobilBekas_Marketplace_BtnKalkulator'), 
    0)

Mobile.setText(findTestObject('Dashboard/Cari Mobil/Mobil Bekas/accmart/kalkulator/CariMobil_MobilBekas_Marketplace_InpHargaMobil'), 
    varHarga, 0)

Mobile.setText(findTestObject('Dashboard/Cari Mobil/Mobil Bekas/accmart/kalkulator/CariMobil_MobilBekas_Marketplace_InpUangMuka'), 
    varUangMuka, 0)

switch (varPeriode.toString()) {
    case '24':
        CustomKeywords.'mobile.mobileSlide.Slide'(findTestObject('DynamicObject/slider kalkulator accmart'), 0.33)

        break
    case '36':
        CustomKeywords.'mobile.mobileSlide.Slide'(findTestObject('DynamicObject/slider kalkulator accmart'), 0.66)

        break
    case '48':
        CustomKeywords.'mobile.mobileSlide.Slide'(findTestObject('DynamicObject/slider kalkulator accmart'), 1)

        break
}

switch (varAsuransi.toString()) {
    case 'TUNAI':
        Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Bekas/accmart/kalkulator/CariMobil_MobilBekas_Marketplace_RadioAsuransiTunai'), 
            0)

        break
    case 'KREDIT':
        Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Bekas/accmart/kalkulator/CariMobil_MobilBekas_Marketplace_RadioKredit'), 
            0, FailureHandling.STOP_ON_FAILURE)

        break
}

switch (varACP.toString()) {
    case 'N':
        Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Bekas/accmart/kalkulator/CariMobil_MobilBekas_Marketplace_ChkACP'), 
            0)

        break
}

