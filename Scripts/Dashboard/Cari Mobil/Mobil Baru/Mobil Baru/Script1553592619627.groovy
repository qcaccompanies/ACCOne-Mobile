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

'required for PathUtil to get the current app path'
def appPath = PathUtil.relativeToAbsolutePath(GlobalVariable.apkname, RunConfiguration.getProjectDir())

Mobile.startApplication(appPath, false)

Mobile.waitForElementPresent(findTestObject('Dashboard/Dashboard_BtnCariMobil'), 0)

Mobile.tap(findTestObject('dashboard/Dashboard_BtnCariMobil'), 0)

Mobile.waitForElementPresent(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_BtnMobilBaru'), 0)

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_BtnMobilBaru'), 0)

Mobile.setText(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_InpAreaPengajuan'), InpAreaPengajuan, 0)

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_InpAreaPengajuan'), 0)

Mobile.hideKeyboard()

CustomKeywords.'mobile.pick.List'(findTestObject('DynamicObject/PickListItem', [('text') : InpAreaPengajuan]))

Mobile.setText(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_InpCabangACC'), InpCabangACC, 0)

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_InpCabangACC'), 0)

Mobile.hideKeyboard()

CustomKeywords.'mobile.pick.List'(findTestObject('DynamicObject/PickListItem', [('text') : InpCabangACC]))

Mobile.setText(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_InpBrand'), InpBrand, 0)

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_InpBrand'), 0)

Mobile.hideKeyboard()

CustomKeywords.'mobile.pick.List'(findTestObject('DynamicObject/PickListItem', [('text') : InpBrand]))

Mobile.setText(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_InpType'), InpType, 0)

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_InpType'), 0)

Mobile.hideKeyboard()

CustomKeywords.'mobile.pick.List'(findTestObject('DynamicObject/PickListItem', [('text') : InpType]))

Mobile.setText(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_InpModel'), InpModel, 0)

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_InpModel'), 0)

Mobile.hideKeyboard()

CustomKeywords.'mobile.pick.List'(findTestObject('DynamicObject/PickListItem', [('text') : InpModel]))

CustomKeywords.'mobile.mobileSwipe.UpDown'(0.70, 0.40, 5)

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_InpTahun'), 0)

Mobile.setText(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_InpTahun'), '2019', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_InpOTR'), 0)

Mobile.clearText(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_InpOTR'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_InpOTR'), '150000000', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_InpDPRp'), 0)

Mobile.setText(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_InpDPRp'), '50000000', 0)

Mobile.hideKeyboard()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'mobile.mobileSlide.Slide'(findTestObject('DynamicObject/Slider'), slide)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'mobile.mobileSwipe.UpDown'(0.70, 0.30, 5)

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_ChkKredit'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_ChkACP'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_BtnAjukanPembiayaan'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru/MobilBaru_BtnOKSuksesDaftar'), 0)

