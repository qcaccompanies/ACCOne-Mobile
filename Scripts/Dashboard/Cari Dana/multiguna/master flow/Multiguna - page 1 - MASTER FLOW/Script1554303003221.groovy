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

Mobile.setText(findTestObject('Dashboard/cari dana/multiguna/page 1 - masukkan detail kendaraanmu/Multiguna_InpBrand'), 
    varBrand, 0)

Mobile.tap(findTestObject('Dashboard/cari dana/multiguna/page 1 - masukkan detail kendaraanmu/Multiguna_InpBrand'), 0)

Mobile.hideKeyboard(FailureHandling.OPTIONAL)

CustomKeywords.'mobile.pick.List'(findTestObject('DynamicObject/PickListItem', [('text') : varBrand]), FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Dashboard/cari dana/multiguna/page 1 - masukkan detail kendaraanmu/Multiguna_InpType'), varType, 
    0)

Mobile.tap(findTestObject('Dashboard/cari dana/multiguna/page 1 - masukkan detail kendaraanmu/Multiguna_InpType'), 0)

CustomKeywords.'mobile.pick.List'(findTestObject('DynamicObject/PickListItem', [('text') : varType]), FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Dashboard/cari dana/multiguna/page 1 - masukkan detail kendaraanmu/Multiguna_InpModel'), 
    varModel, 0)

Mobile.tap(findTestObject('Dashboard/cari dana/multiguna/page 1 - masukkan detail kendaraanmu/Multiguna_InpModel'), 0)

CustomKeywords.'mobile.pick.List'(findTestObject('DynamicObject/PickListItem', [('text') : varModel]), FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/cari dana/multiguna/page 1 - masukkan detail kendaraanmu/Multiguna_InpTahun'), 0)

Mobile.setText(findTestObject('Dashboard/cari dana/multiguna/page 1 - masukkan detail kendaraanmu/Multiguna_InpTahun'), 
    varTahun, 0)

'diberikan delay sementara, karena belum bisa tap pada list yang diinginkan'
Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

