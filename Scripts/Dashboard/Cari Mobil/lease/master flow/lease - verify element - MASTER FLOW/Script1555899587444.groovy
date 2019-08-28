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

inpBrand = Mobile.getText(findTestObject('Dashboard/Cari Mobil/Lease/Lease_InpBrand'), 0)

inpType = Mobile.getText(findTestObject('Dashboard/Cari Mobil/Lease/Lease_InpType'), 0)

inpModel = Mobile.getText(findTestObject('Dashboard/Cari Mobil/Lease/Lease_InpModel'), 0)

inpTahun = Mobile.getText(findTestObject('Dashboard/Cari Mobil/Lease/Lease_InpTahun'), 0, FailureHandling.STOP_ON_FAILURE)

inpAreaPengajuan = Mobile.getText(findTestObject('Dashboard/Cari Mobil/Lease/Lease_InpAreaPengajuan'), 0)

inpCabang = Mobile.getText(findTestObject('Dashboard/Cari Mobil/Lease/Lease_InpCabang'), 0)

inpBidangUsaha = Mobile.getText(findTestObject('Dashboard/Cari Mobil/Lease/Lease_InpBidangUsaha'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyEqual(inpBrand, varBrand, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(inpType, varType, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(inpModel, varModel, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(inpTahun, varTahun, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(inpAreaPengajuan, varAreaPengajuan, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(inpCabang, varCabang, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(inpBidangUsaha, varBidangUsaha, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

