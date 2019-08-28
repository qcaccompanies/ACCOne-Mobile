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

WebUI.callTestCase(findTestCase('Open application'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Dashboard/Cari Dana/multiguna/master flow/Multiguna - open menu - MASTER FLOW'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Dashboard/Cari Dana/multiguna/master flow/Multiguna - page 1 - MASTER FLOW'), [('varBrand') : 'DAIHATSU'
        , ('varType') : 'AYLA', ('varModel') : 'T:1.0 M M/T NEW', ('varTahun') : '2018', ('varExpectedResult') : 'PASS'], 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/cari dana/multiguna/page 1 - masukkan detail kendaraanmu/Multiguna_BtnBerikutnya'), 
    0)

WebUI.callTestCase(findTestCase('Dashboard/Cari Dana/multiguna/master flow/Multiguna - page 2 - MASTER FLOW'), [('varDana') : '150000000'
        , ('varPeriode') : '24', ('varTujuanPeminjaman') : 'Pendidikan', ('varAreaPengajuan') : 'DKI Jakarta, Banten, Jawa Barat'
        , ('varCabang') : 'FATMAWATI', ('varExpectedResult') : 'PASS'], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/cari dana/multiguna/page 2 - simulasikan dana kebutuhanmu/Multiguna_BtnBerikutnya'), 
    0)

WebUI.callTestCase(findTestCase('Dashboard/Cari Dana/multiguna/master flow/Multiguna - page 3 - MASTER FLOW'), [('varKananDepan') : varKananDepan
        , ('varKiriDepan') : varKiriDepan, ('varKananBelakang') : varKananBelakang, ('varKiriBelakang') : varKiriBelakang
        , ('varDashboard') : varDashboard, ('varDepanMobil') : varDepanMobil, ('varKapMesin') : varKapMesin, ('varModifikasi') : varModifikasi
        , ('varExpectedResult') : varExpectedResult], FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.verifyElementExist(findTestObject('Dashboard/cari dana/multiguna/page 2 - simulasikan dana kebutuhanmu/Multiguna_TxtSimulasikanDanaKebutuhanmu'), 
    0)

Mobile.tap(findTestObject('Dashboard/cari dana/multiguna/page 2 - simulasikan dana kebutuhanmu/Multiguna_BtnBerikutnya'), 
    0)

Mobile.verifyElementExist(findTestObject('Dashboard/cari dana/multiguna/page 3 - silahkan upload foto mobilmu/Multiguna_TxtSilahkanuploadfotoMobilmu'), 
    0)

