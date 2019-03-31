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

WebUI.callTestCase(findTestCase('Dashboard/Cari Dana/multiguna/flow data binding/Multiguna - page 2'), [('varBPKB') : 'Y'
        , ('varExistingNew') : 'Existing', ('varBrand') : 'DAIHATSU', ('varType') : 'AYLA', ('varModel') : 'T:1.0 D M/T'
        , ('varTahun') : '2018', ('varExpectedResult') : 'PASS', ('varCabang') : 'FATMAWATI', ('varAreaPengajuan') : 'DKI Jakarta, Banten, Jawa Barat'
        , ('varTujuanPeminjaman') : 'PENDIDIKAN', ('varPeriode') : '12', ('varDana') : '150000000'], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/cari dana/multiguna/page 3 - silahkan upload foto mobilmu/Multiguna_BtnKananDepan'), 0)

Mobile.tap(findTestObject('Dashboard/cari dana/multiguna/page 3 - silahkan upload foto mobilmu/Multiguna_BtnGallery'), 0)

Mobile.waitForElementPresent(findTestObject('Dashboard/cari dana/multiguna/page 3 - silahkan upload foto mobilmu/Multiguna_NamaFileUpload'), 
    0)

Mobile.tap(findTestObject('Dashboard/cari dana/multiguna/page 3 - silahkan upload foto mobilmu/Multiguna_NamaFileUpload'), 0)

Mobile.tap(findTestObject('Dashboard/cari dana/multiguna/page 3 - silahkan upload foto mobilmu/Multiguna_BtnKiriDepan'), 0)

Mobile.tap(findTestObject('Dashboard/cari dana/multiguna/page 3 - silahkan upload foto mobilmu/Multiguna_BtnGallery'), 0)

Mobile.waitForElementPresent(findTestObject('Dashboard/cari dana/multiguna/page 3 - silahkan upload foto mobilmu/Multiguna_NamaFileUpload'), 
    0)

Mobile.tap(findTestObject('Dashboard/cari dana/multiguna/page 3 - silahkan upload foto mobilmu/Multiguna_NamaFileUpload'), 0)

Mobile.tap(findTestObject('Dashboard/cari dana/multiguna/page 3 - silahkan upload foto mobilmu/Multiguna_BtnKananBelakang'), 0)

Mobile.tap(findTestObject('Dashboard/cari dana/multiguna/page 3 - silahkan upload foto mobilmu/Multiguna_BtnGallery'), 0)

Mobile.waitForElementPresent(findTestObject('Dashboard/cari dana/multiguna/page 3 - silahkan upload foto mobilmu/Multiguna_NamaFileUpload'), 
    0)

Mobile.tap(findTestObject('Dashboard/cari dana/multiguna/page 3 - silahkan upload foto mobilmu/Multiguna_NamaFileUpload'), 0)

Mobile.tap(findTestObject('Dashboard/cari dana/multiguna/page 3 - silahkan upload foto mobilmu/Multiguna_BtnKiriBelakang'), 0)

Mobile.tap(findTestObject('Dashboard/cari dana/multiguna/page 3 - silahkan upload foto mobilmu/Multiguna_BtnGallery'), 0)

Mobile.waitForElementPresent(findTestObject('Dashboard/cari dana/multiguna/page 3 - silahkan upload foto mobilmu/Multiguna_NamaFileUpload'), 
    0)

Mobile.tap(findTestObject('Dashboard/cari dana/multiguna/page 3 - silahkan upload foto mobilmu/Multiguna_NamaFileUpload'), 0)

Mobile.tap(findTestObject('Dashboard/cari dana/multiguna/page 3 - silahkan upload foto mobilmu/Multiguna_BtnSubmit'), 0)

Mobile.tap(findTestObject('Dashboard/cari dana/multiguna/page 3 - silahkan upload foto mobilmu/Multiguna_BtnOK'), 0)

