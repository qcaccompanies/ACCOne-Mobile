import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

Mobile.waitForElementPresent(findTestObject('Dashboard/cari dana/multiguna/page 2 - simulasikan dana kebutuhanmu/Multiguna_InpAreaPengajuan'), 
    0)

Mobile.setText(findTestObject('Dashboard/cari dana/multiguna/page 2 - simulasikan dana kebutuhanmu/Multiguna_InpDanaYangDibutuhkan'), 
    varDana, 0)

Mobile.tap(findTestObject('Dashboard/cari dana/multiguna/page 2 - simulasikan dana kebutuhanmu/Multiguna_InpDanaYangDibutuhkan'), 
    0)

Mobile.hideKeyboard(FailureHandling.OPTIONAL)

switch (varPeriode.toString()) {
    case '24':
        CustomKeywords.'mobile.mobileSlide.Slide'(findTestObject('DynamicObject/slidermultiguna'), 0.5, FailureHandling.OPTIONAL)

        break
    case '36':
        CustomKeywords.'mobile.mobileSlide.Slide'(findTestObject('DynamicObject/slidermultiguna'), 1, FailureHandling.OPTIONAL)

        break
}

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Dashboard/cari dana/multiguna/page 2 - simulasikan dana kebutuhanmu/Multiguna_InpTujuanPeminjamanDana'), 
    varTujuanPeminjaman, 0)

Mobile.tap(findTestObject('Dashboard/cari dana/multiguna/page 2 - simulasikan dana kebutuhanmu/Multiguna_InpTujuanPeminjamanDana'), 
    0)

Mobile.hideKeyboard(FailureHandling.OPTIONAL)

CustomKeywords.'mobile.pick.List'(findTestObject('DynamicObject/PickListItem', [('text') : varTujuanPeminjaman]), FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/cari dana/multiguna/page 2 - simulasikan dana kebutuhanmu/Multiguna_InpAreaPengajuan'), 
    0)

Mobile.setText(findTestObject('Dashboard/cari dana/multiguna/page 2 - simulasikan dana kebutuhanmu/Multiguna_InpAreaPengajuan'), 
    varAreaPengajuan, 0)

Mobile.hideKeyboard(FailureHandling.OPTIONAL)

CustomKeywords.'mobile.pick.List'(findTestObject('DynamicObject/PickListItem', [('text') : varAreaPengajuan]), FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(3)

Mobile.setText(findTestObject('Dashboard/cari dana/multiguna/page 2 - simulasikan dana kebutuhanmu/Multiguna_InpCabangACC'), 
    varCabang, 0)

Mobile.tap(findTestObject('Dashboard/cari dana/multiguna/page 2 - simulasikan dana kebutuhanmu/Multiguna_InpCabangACC'), 
    0)

Mobile.hideKeyboard(FailureHandling.OPTIONAL)

CustomKeywords.'mobile.pick.List'(findTestObject('DynamicObject/PickListItem', [('text') : varCabang]), FailureHandling.OPTIONAL)

