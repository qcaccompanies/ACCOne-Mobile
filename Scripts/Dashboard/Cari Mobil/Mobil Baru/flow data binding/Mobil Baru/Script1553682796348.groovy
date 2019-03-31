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

Mobile.startApplication('C:\\Users\\IT-Services\\Katalon Studio\\ACCONE Mobile\\accone tst env 24 maret 2019.apk', false)

Mobile.tap(findTestObject('dashboard/Dashboard_BtnCariMobil'), 0)

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_BtnMobilBaru'), 0)

Mobile.waitForElementPresent(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_InpAreaPengajuan'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_InpAreaPengajuan'), 0)

Mobile.setText(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_InpAreaPengajuan'), varAreaPengajuan, 0)

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_InpCabangACC'), 0)

Mobile.setText(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_InpCabangACC'), varCabang, 0)

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_InpBrand'), 0)

Mobile.setText(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_InpBrand'), varBrand, 0)

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_InpType'), 0)

Mobile.setText(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_InpType'), varType, 0)

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_InpModel'), 0)

Mobile.setText(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_InpModel'), varModel, 0)

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_InpTahun'), 0)

Mobile.setText(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_InpTahun'), varTahun, 0)

'diberikan delay sementara, karena belum bisa tap pada list yang diinginkan'
Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_InpOTR'), 0)

Mobile.clearText(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_InpOTR'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_InpOTR'), varOTR, 0)

'diberikan delay sementara, karena belum bisa tap pada list yang diinginkan'
Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_InpDP'), 0)

Mobile.setText(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_InpDP'), varUangMuka, 0)

if (varAsuransi == 'TUNAI') {
    Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_ChkTunai'), 0)
}

if (varAsuransi == 'KREDIT') {
    Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_ChkKredit'), 0, FailureHandling.STOP_ON_FAILURE)
}

if (varACP == 'N') {
    Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_ChkACP'), 0, FailureHandling.STOP_ON_FAILURE)
}

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_BtnAjukanPembiayaan'), 0, FailureHandling.STOP_ON_FAILURE)

switch (varExpectedResult.toString()) {
    case 'PASS':
        Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_BtnOKSuksesDaftar'), 0)

        Mobile.waitForElementPresent(findTestObject('Dashboard/Dashboard_BtnCariDana'), 0)

        Mobile.verifyElementVisible(findTestObject('Dashboard/Dashboard_BtnCariDana'), 0)

        break
    case 'DISABLEDBUTTON':
        Mobile.verifyElementNotVisible(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_BtnOKSuksesDaftar'), 0)

        break
}

