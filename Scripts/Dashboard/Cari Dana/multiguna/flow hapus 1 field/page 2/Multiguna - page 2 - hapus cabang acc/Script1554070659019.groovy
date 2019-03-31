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

WebUI.callTestCase(findTestCase('Dashboard/Cari Dana/multiguna/flow data binding/Multiguna - page 1'), [('varBPKB') : ''
        , ('varExistingNew') : '', ('varBrand') : 'DAIHATSU', ('varType') : 'AYLA', ('varModel') : 'T:1.0 M M/T NEW', ('varTahun') : '2018'
        , ('varExpectedResult') : '', ('varBrandList') : '43', ('varTypeList') : '52', ('varModelList') : '60'], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/cari dana/multiguna/page 2 - simulasikan dana kebutuhanmu/Multiguna_InpDanaYangDibutuhkan'), 
    0)

Mobile.setText(findTestObject('Dashboard/cari dana/multiguna/page 2 - simulasikan dana kebutuhanmu/Multiguna_InpDanaYangDibutuhkan'), 
    varDana, 0)

CustomKeywords.'mobile.mobileSlide.Slide'(findTestObject('Dashboard/cari dana/multiguna/page 2 - simulasikan dana kebutuhanmu/Multiguna_SliderPinjamDana'), 
    varPeriode)

Mobile.setText(findTestObject('Dashboard/cari dana/multiguna/page 2 - simulasikan dana kebutuhanmu/Multiguna_InpTujuanPeminjamanDana'), 
    varTujuanPeminjaman, 0)

Mobile.tap(findTestObject('Dashboard/cari dana/multiguna/page 2 - simulasikan dana kebutuhanmu/Multiguna_InpTujuanPeminjamanDana'), 
    0)

Mobile.hideKeyboard()

CustomKeywords.'mobile.pick.List'(findTestObject('DynamicObject/PickListItem', [('text') : varTujuanPeminjaman]))

Mobile.setText(findTestObject('Dashboard/cari dana/multiguna/page 2 - simulasikan dana kebutuhanmu/Multiguna_InpAreaPengajuan'), 
    varAreaPengajuan, 0)

Mobile.tap(findTestObject('Dashboard/cari dana/multiguna/page 2 - simulasikan dana kebutuhanmu/Multiguna_InpAreaPengajuan'), 
    0)

Mobile.hideKeyboard()

CustomKeywords.'mobile.pick.List'(findTestObject('DynamicObject/PickListItem', [('text') : varAreaPengajuan]))

Mobile.setText(findTestObject('Dashboard/cari dana/multiguna/page 2 - simulasikan dana kebutuhanmu/Multiguna_InpCabangACC'), 
    varCabang, 0)

Mobile.tap(findTestObject('Dashboard/cari dana/multiguna/page 2 - simulasikan dana kebutuhanmu/Multiguna_InpCabangACC'), 
    0)

Mobile.hideKeyboard()

CustomKeywords.'mobile.pick.List'(findTestObject('DynamicObject/PickListItem', [('text') : varCabang]))

Mobile.clearText(findTestObject('Dashboard/cari dana/multiguna/page 2 - simulasikan dana kebutuhanmu/Multiguna_InpCabangACC'), 
    0)

'diberikan delay sementara, karena belum bisa tap pada list yang diinginkan'
Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/cari dana/multiguna/page 2 - simulasikan dana kebutuhanmu/Multiguna_BtnBerikutnya'), 
    0)

Mobile.verifyElementNotVisible(findTestObject('Dashboard/cari dana/multiguna/page 3 - silahkan upload foto mobilmu/Multiguna_BtnKananBelakang'), 
    7)

