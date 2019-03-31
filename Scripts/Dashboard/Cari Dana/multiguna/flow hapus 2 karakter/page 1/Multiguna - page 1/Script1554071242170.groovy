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

Mobile.startApplication('/Users/tomyhidayat/Downloads/Project in ACC - ACCOne MOBILE 2932019/Project in ACC - ACCOne MOBILE 2932019/AccWorld.apk', 
    false)

Mobile.waitForElementPresent(findTestObject('dashboard/Dashboard_BtnCariDana'), 0)

Mobile.tap(findTestObject('dashboard/Dashboard_BtnCariDana'), 0)

Mobile.tap(findTestObject('Dashboard/cari dana/CariDana_BtnBPKBdiACC_YA'), 0)

Mobile.tap(findTestObject('Dashboard/cari dana/CariDana_BtnPembiayaanMultiguna'), 0)

Mobile.tap(findTestObject('Dashboard/cari dana/multiguna/page 1 - masukkan detail kendaraanmu/Multiguna_BtnNewCustomer'), 
    0)

Mobile.setText(findTestObject('Dashboard/cari dana/multiguna/page 1 - masukkan detail kendaraanmu/Multiguna_InpBrand'), 
    varBrand, 0)

Mobile.tap(findTestObject('Dashboard/cari dana/multiguna/page 1 - masukkan detail kendaraanmu/Multiguna_InpBrand'), 0)

Mobile.hideKeyboard()

CustomKeywords.'mobile.pick.List'(findTestObject('DynamicObject/PickListItem', [('text') : varBrand]))

not_run: Mobile.tap(findTestObject('Dashboard/cari dana/multiguna/page 1 - masukkan detail kendaraanmu/Multiguna_InpList', 
        [('instance') : varBrandList]), 0)

Mobile.setText(findTestObject('Dashboard/cari dana/multiguna/page 1 - masukkan detail kendaraanmu/Multiguna_InpType'), varType, 
    0)

Mobile.tap(findTestObject('Dashboard/cari dana/multiguna/page 1 - masukkan detail kendaraanmu/Multiguna_InpType'), 0)

Mobile.hideKeyboard()

CustomKeywords.'mobile.pick.List'(findTestObject('DynamicObject/PickListItem', [('text') : varType]))

not_run: Mobile.tap(findTestObject('Dashboard/cari dana/multiguna/page 1 - masukkan detail kendaraanmu/Multiguna_InpList', 
        [('instance') : varTypeList]), 0)

Mobile.setText(findTestObject('Dashboard/cari dana/multiguna/page 1 - masukkan detail kendaraanmu/Multiguna_InpModel'), 
    varModel, 0)

Mobile.tap(findTestObject('Dashboard/cari dana/multiguna/page 1 - masukkan detail kendaraanmu/Multiguna_InpModel'), 0)

Mobile.hideKeyboard()

CustomKeywords.'mobile.pick.List'(findTestObject('DynamicObject/PickListItem', [('text') : varModel]))

not_run: Mobile.tap(findTestObject('Dashboard/cari dana/multiguna/page 1 - masukkan detail kendaraanmu/Multiguna_InpList', 
        [('instance') : varModelList]), 0)

Mobile.tap(findTestObject('Dashboard/cari dana/multiguna/page 1 - masukkan detail kendaraanmu/Multiguna_InpTahun'), 0)

Mobile.setText(findTestObject('Dashboard/cari dana/multiguna/page 1 - masukkan detail kendaraanmu/Multiguna_InpTahun'), 
    varTahun, 0)

'diberikan delay sementara, karena belum bisa tap pada list yang diinginkan'
Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/cari dana/multiguna/page 1 - masukkan detail kendaraanmu/Multiguna_BtnBerikutnya'), 
    0)

switch (varExpectedResult.toString()) {
    case 'PASS':
        Mobile.waitForElementPresent(findTestObject('Dashboard/cari dana/multiguna/page 2 - simulasikan dana kebutuhanmu/Multiguna_InpAreaPengajuan'), 
            0)

        Mobile.verifyElementVisible(findTestObject('Dashboard/cari dana/multiguna/page 2 - simulasikan dana kebutuhanmu/Multiguna_InpAreaPengajuan'), 
            0)

        break
    case 'DISABLEDBUTTON':
        Mobile.verifyElementNotVisible(findTestObject('Dashboard/cari dana/multiguna/page 2 - simulasikan dana kebutuhanmu/Multiguna_InpAreaPengajuan'), 
            0)

        break
}

