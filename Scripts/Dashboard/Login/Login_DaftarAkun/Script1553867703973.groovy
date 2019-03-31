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

Mobile.startApplication('C:\\Users\\User\\AppData\\Local\\Microsoft\\Windows\\INetCache\\IE\\TODF7KDB\\AccWorld[1].apk', 
    false)

Mobile.tap(findTestObject('DIVA/Dashboard/Dashboard_MenuLogin'), 0)

Mobile.tap(findTestObject('DIVA/Dashboard/Login/Daftar/Login_MenuDaftar'), 0)

Mobile.setText(findTestObject('DIVA/Dashboard/Login/Daftar/Daftar_InpNamaSesuaiKTP'), varName, 0)

Mobile.setText(findTestObject('DIVA/Dashboard/Login/Daftar/Daftar_InpEmail'), varEmail, 0)

Mobile.setText(findTestObject('DIVA/Dashboard/Login/Daftar/Daftar_InpNomorHandphone'), varHandphone, 0)

Mobile.setText(findTestObject('DIVA/Dashboard/Login/Daftar/Daftar_InpPassword'), varPassword, 0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('DIVA/Dashboard/Login/Daftar/Daftar_InpKonfirmasiPassword'), varConfirmPassword, 0)

Mobile.tap(findTestObject('DIVA/Dashboard/Login/Daftar/Daftar_BtnSubmitDaftar'), 0)

Mobile.closeApplication()

