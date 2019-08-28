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

inpBrand = Mobile.getText(findTestObject('Dashboard/cari dana/multiguna/page 1 - masukkan detail kendaraanmu/Multiguna_InpBrand'), 
    0)

inpType = Mobile.getText(findTestObject('Dashboard/cari dana/multiguna/page 1 - masukkan detail kendaraanmu/Multiguna_InpType'), 
    0)

inpModel = Mobile.getText(findTestObject('Dashboard/cari dana/multiguna/page 1 - masukkan detail kendaraanmu/Multiguna_InpModel'), 
    0)

inpTahun = Mobile.getText(findTestObject('Dashboard/cari dana/multiguna/page 1 - masukkan detail kendaraanmu/Multiguna_InpTahun'), 
    0)

Mobile.verifyEqual(inpBrand, varBrand, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(inpType, varType, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(inpModel, varModel, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(inpTahun, varTahun, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

