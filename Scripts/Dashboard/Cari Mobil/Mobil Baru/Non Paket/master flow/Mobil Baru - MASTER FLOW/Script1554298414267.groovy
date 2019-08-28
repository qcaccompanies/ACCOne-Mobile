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
import com.kms.katalon.core.util.internal.PathUtil as PathUtil
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

Mobile.waitForElementPresent(findTestObject('Dashboard/Cari Mobil/Mobil Baru - non paket/MobilBaru_InpAreaPengajuan'), 0)

Mobile.setText(findTestObject('Dashboard/Cari Mobil/Mobil Baru - non paket/MobilBaru_InpAreaPengajuan'), varAreaPengajuan, 
    7, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru - non paket/MobilBaru_InpAreaPengajuan'), 7, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru - non paket/MobilBaru_LOVAreaPengajuan'), 7, FailureHandling.OPTIONAL)

Mobile.setText(findTestObject('Dashboard/Cari Mobil/Mobil Baru - non paket/MobilBaru_InpCabangACC'), varCabang, 7, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru - non paket/MobilBaru_LOVCabang'), 7, FailureHandling.OPTIONAL)

Mobile.setText(findTestObject('Dashboard/Cari Mobil/Mobil Baru - non paket/MobilBaru_InpBrand'), varBrand, 7, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru - non paket/MobilBaru_InpBrand'), 7, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru - non paket/MobilBaru_LOVBrand'), 7, FailureHandling.OPTIONAL)

CustomKeywords.'mobile.mobileSwipe.UpDown'(0.40, 0.20, 1000)

Mobile.setText(findTestObject('Dashboard/Cari Mobil/Mobil Baru - non paket/MobilBaru_InpType'), varType, 7, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru - non paket/MobilBaru_InpType'), 7, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru - non paket/MobilBaru_LOVType'), 7, FailureHandling.OPTIONAL)

Mobile.setText(findTestObject('Dashboard/Cari Mobil/Mobil Baru - non paket/MobilBaru_InpModel'), varModel, 7, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru - non paket/MobilBaru_InpModel'), 7, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru - non paket/MobilBaru_LOVModel'), 7, FailureHandling.OPTIONAL)

Mobile.setText(findTestObject('Dashboard/Cari Mobil/Mobil Baru - non paket/MobilBaru_InpTahun'), varTahun, 7, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru - non paket/MobilBaru_LOVTahun'), 7, FailureHandling.OPTIONAL)

Mobile.clearText(findTestObject('Dashboard/Cari Mobil/Mobil Baru - non paket/MobilBaru_InpOTR'), 7, FailureHandling.OPTIONAL)

Mobile.setText(findTestObject('Dashboard/Cari Mobil/Mobil Baru - non paket/MobilBaru_InpOTR'), varOTR, 7, FailureHandling.OPTIONAL)

Mobile.setText(findTestObject('Dashboard/Cari Mobil/Mobil Baru - non paket/MobilBaru_InpDP'), varUangMuka, 7, FailureHandling.OPTIONAL)

Mobile.delay(5, FailureHandling.OPTIONAL)

switch (varPeriode.toString()) {
    case '24':
        CustomKeywords.'mobile.mobileSlide.Slide'(findTestObject('DynamicObject/Slider'), 0.25)

        break
    case '36':
        CustomKeywords.'mobile.mobileSlide.Slide'(findTestObject('DynamicObject/Slider'), 0.50)

        break
    case '48':
        CustomKeywords.'mobile.mobileSlide.Slide'(findTestObject('DynamicObject/Slider'), 0.75)

        break
    case '60':
        CustomKeywords.'mobile.mobileSlide.Slide'(findTestObject('DynamicObject/Slider'), 1)

        break
}

not_run: switch (varAsuransi.toString()) {
    case 'TUNAI':
        Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru - non paket/MobilBaru_ChkTunai'), 0)

        break
    case 'KREDIT':
        Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru - non paket/MobilBaru_ChkKredit'), 0, FailureHandling.STOP_ON_FAILURE)

        break
}

not_run: switch (varACP.toString()) {
    case 'N':
        Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru - non paket/MobilBaru_ChkTunai'), 0)

        break
}

