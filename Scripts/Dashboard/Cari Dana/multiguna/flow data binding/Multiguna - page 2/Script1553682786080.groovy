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

WebUI.callTestCase(findTestCase('Dashboard/Cari Dana/multiguna/flow data binding/Multiguna - page 1'), [('varBPKB') : 'Y'
        , ('varExistingNew') : 'Existing', ('varBrand') : 'DAIHATSU', ('varType') : 'AYLA', ('varModel') : 'T:1.0 D M/T'
        , ('varTahun') : '2018', ('varExpectedResult') : 'PASS'], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/cari dana/multiguna/page 2 - simulasikan dana kebutuhanmu/Multiguna_InpDanaYangDibutuhkan'), 
    0)

Mobile.setText(findTestObject('Dashboard/cari dana/multiguna/page 2 - simulasikan dana kebutuhanmu/Multiguna_InpDanaYangDibutuhkan'), 
    varDana, 0)

Mobile.tap(findTestObject('Dashboard/cari dana/multiguna/page 2 - simulasikan dana kebutuhanmu/Multiguna_InpTujuanPeminjamanDana'), 
    0)

Mobile.setText(findTestObject('Dashboard/cari dana/multiguna/page 2 - simulasikan dana kebutuhanmu/Multiguna_InpTujuanPeminjamanDana'), 
    varTujuanPeminjaman, 0)

'diberikan delay sementara, karena belum bisa tap pada list yang diinginkan'
Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/cari dana/multiguna/page 2 - simulasikan dana kebutuhanmu/Multiguna_InpAreaPengajuan'), 0)

Mobile.setText(findTestObject('Dashboard/cari dana/multiguna/page 2 - simulasikan dana kebutuhanmu/Multiguna_InpAreaPengajuan'), varAreaPengajuan, 
    0)

'diberikan delay sementara, karena belum bisa tap pada list yang diinginkan'
Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/cari dana/multiguna/page 2 - simulasikan dana kebutuhanmu/Multiguna_InpCabangACC'), 0)

Mobile.setText(findTestObject('Dashboard/cari dana/multiguna/page 2 - simulasikan dana kebutuhanmu/Multiguna_InpCabangACC'), varCabang, 
    0)

'diberikan delay sementara, karena belum bisa tap pada list yang diinginkan'
Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/cari dana/multiguna/page 2 - simulasikan dana kebutuhanmu/Multiguna_BtnBerikutnya'), 0)

switch (varExpectedResult.toString()) {
    case 'PASS':
        Mobile.waitForElementPresent(findTestObject('Dashboard/cari dana/multiguna/page 3 - silahkan upload foto mobilmu/Multiguna_BtnKananBelakang'), 
            0)

        Mobile.verifyElementVisible(findTestObject('Dashboard/cari dana/multiguna/page 3 - silahkan upload foto mobilmu/Multiguna_BtnKananBelakang'), 
            0)

        break
    case 'DISABLEDBUTTON':
        Mobile.verifyElementNotVisible(findTestObject('Dashboard/cari dana/multiguna/page 3 - silahkan upload foto mobilmu/Multiguna_BtnKananBelakang'), 
            0)

        break
}

