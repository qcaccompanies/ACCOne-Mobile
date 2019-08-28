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

Mobile.setText(findTestObject('Dashboard/cari dana/trade in/page 1 - masukkan detail kendaraanmu/TradeIn_InpBrand'), varBrand, 
    7, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/cari dana/trade in/page 1 - masukkan detail kendaraanmu/TradeIn_InpBrand'), 0)

CustomKeywords.'mobile.pick.ListNaik'(findTestObject('DynamicObject/PickListItem', [('text') : varBrand]), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Dashboard/cari dana/trade in/page 1 - masukkan detail kendaraanmu/TradeIn_InpType'), varType, 
    7, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'mobile.pick.ListNaik'(findTestObject('DynamicObject/PickListItem', [('text') : varBrand]), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Dashboard/cari dana/trade in/page 1 - masukkan detail kendaraanmu/TradeIn_InpModel'), varModel, 
    7, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'mobile.pick.ListNaik'(findTestObject('DynamicObject/PickListItem', [('text') : varBrand]), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/cari dana/trade in/page 1 - masukkan detail kendaraanmu/TradeIn_InpTahun'), 7, FailureHandling.OPTIONAL)

CustomKeywords.'mobile.pick.ListNaik'(findTestObject('DynamicObject/PickListItem', [('text') : varBrand]), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Dashboard/cari dana/trade in/page 1 - masukkan detail kendaraanmu/TradeIn_InpLokasi'), varLokasi, 
    7, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'mobile.pick.ListNaik'(findTestObject('DynamicObject/PickListItem', [('text') : varBrand]), 0, FailureHandling.STOP_ON_FAILURE)

