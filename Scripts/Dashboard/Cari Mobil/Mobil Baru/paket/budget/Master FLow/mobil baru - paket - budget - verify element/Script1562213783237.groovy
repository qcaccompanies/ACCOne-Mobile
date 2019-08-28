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

def inpAreaPengajuan = Mobile.getText(findTestObject('Dashboard/Cari Mobil/Mobil Baru - Paket/budget/page 1/CariMobil_Budget_InpAreaPengajuan'), 
    0)

def inpCabangACC = Mobile.getText(findTestObject('Dashboard/Cari Mobil/Mobil Baru - Paket/budget/page 1/CariMobil_Budget_InpCabangACC'), 
    0)

def inpUangMuka = Mobile.getText(findTestObject('Dashboard/Cari Mobil/Mobil Baru - Paket/budget/page 1/CariMobil_Budget_InpUangMuka'), 
    0)

def inpAngsuran = Mobile.getText(findTestObject('Dashboard/Cari Mobil/Mobil Baru - Paket/budget/page 1/CariMobil_Budget_InpAngsuran'), 
    0)

Mobile.verifyEqual(inpAreaPengajuan, varAreaPengajuan, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(inpCabangACC, varCabangAcc, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(inpUangMuka, varUangMuka, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(inpAngsuran, varAngsuran, FailureHandling.CONTINUE_ON_FAILURE)

