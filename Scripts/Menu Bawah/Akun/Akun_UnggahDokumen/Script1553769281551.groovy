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

WebUI.callTestCase(findTestCase('Open application'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('BottomMenu/MenuBawah_BtnAkun'), 0)

Mobile.tap(findTestObject('BottomMenu/Akun/Akun_BtnUnggahDokumen'), 0)

Mobile.tap(findTestObject('BottomMenu/Akun/Unggah Dokumen/UnggahDokumen_BtnKTP'), 0)

Mobile.tap(findTestObject('BottomMenu/Akun/Unggah Dokumen/Upload Dokumen_GaleryKTP'), 0)

Mobile.scrollToText(image, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/cari dana/multiguna/page 3 - silahkan upload foto mobilmu/Multiguna_NamaFileUpload', 
        [('imageName') : image]), 0)

Mobile.tap(findTestObject('BottomMenu/Akun/Unggah Dokumen/UnggahDokumen_BTNNPWP'), 0)

Mobile.tap(findTestObject('BottomMenu/Akun/Unggah Dokumen/UploadDokumen_GaleryNPWP'), 0)

Mobile.scrollToText(image, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/cari dana/multiguna/page 3 - silahkan upload foto mobilmu/Multiguna_NamaFileUpload', 
        [('imageName') : image]), 0)

Mobile.tap(findTestObject('BottomMenu/Akun/Unggah Dokumen/UnggahDokumen_BtnKK'), 0)

Mobile.tap(findTestObject('BottomMenu/Akun/Unggah Dokumen/UploadDokumen_GaleryKK'), 0)

Mobile.scrollToText(image, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/cari dana/multiguna/page 3 - silahkan upload foto mobilmu/Multiguna_NamaFileUpload', 
        [('imageName') : image]), 0)

Mobile.tap(findTestObject('BottomMenu/Akun/Unggah Dokumen/UnggahDokumen_BtnSubmit'), 0)

Mobile.closeApplication()

