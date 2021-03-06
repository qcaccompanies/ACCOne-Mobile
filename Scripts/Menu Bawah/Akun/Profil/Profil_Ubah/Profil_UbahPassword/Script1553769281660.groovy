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


def appPath = PathUtil.relativeToAbsolutePath(GlobalVariable.apkname, RunConfiguration.getProjectDir())

Mobile.startApplication(appPath, false)

Mobile.tap(findTestObject('BottomMenu/MenuBawah_BtnAkun'), 0)

Mobile.tap(findTestObject('BottomMenu/Akun/Akun_Profil/Akun_BtnProfil'), 0)

Mobile.tap(findTestObject('BottomMenu/Akun/Akun_Profil/Akun_BtnUbahKataSandi'), 0)

Mobile.setText(findTestObject('BottomMenu/Akun/Akun_Profil/Akun_InpPasswordLama'), 'SmpLabschool8%', 0)

Mobile.setText(findTestObject('BottomMenu/Akun/Akun_Profil/Akun_InpPasswordBaru'), 'divanabila', 0)

Mobile.setText(findTestObject('BottomMenu/Akun/Akun_Profil/Akun_InpKonfirmasiPasswordBaru'), 'divanabila', 0)

Mobile.tap(findTestObject('BottomMenu/Akun/Akun_Profil/Akun_BtnKonfirmasiUbahPassword'), 0)

Mobile.closeApplication()

