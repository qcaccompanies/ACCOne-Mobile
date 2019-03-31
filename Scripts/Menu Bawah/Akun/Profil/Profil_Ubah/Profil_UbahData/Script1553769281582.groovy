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

Mobile.startApplication('/Users/tomyhidayat/Downloads/Project in ACC - ACCOne MOBILE 2932019/Project in ACC - ACCOne MOBILE 2932019/AccWorld.apk', 
    false)

Mobile.tap(findTestObject('BottomMenu/MenuBawah_BtnAkun'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('BottomMenu/Akun/Akun_Profil/Akun_BtnProfil'), 0)

Mobile.tap(findTestObject('BottomMenu/Akun/Akun_Profil/Akun_BtnUbah'), 0)

Mobile.tap(findTestObject('BottomMenu/Akun/Akun_Profil/Profile/Profil_BtnCal'), 0)

Mobile.tap(findTestObject('BottomMenu/Akun/Akun_Profil/Profile/Profil_BtnCalBack'), 0)

Mobile.tap(findTestObject('BottomMenu/Akun/Akun_Profil/Profile/Profile_BtnCalDate', [('date') : date]), 0)

Mobile.tap(findTestObject('BottomMenu/Akun/Akun_Profil/Profile/Profil_BtnCalSet'), 0)

not_run: Mobile.pressBack()

Mobile.setText(findTestObject('BottomMenu/Akun/Akun_Profil/Profile/Profil_InpAlamatSesuaiKTP'), alamat, 0)

Mobile.setText(findTestObject('BottomMenu/Akun/Akun_Profil/Profile/Profil_InpPekerjaan'), pekerjaan, 0)

Mobile.tap(findTestObject('BottomMenu/Akun/Akun_Profil/Profile/Profil_BtnSimpan'), 0)

