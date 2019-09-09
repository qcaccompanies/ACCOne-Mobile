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

//Mobile.waitForElementPresent(findTestObject('Dashboard/Dashboard_BtnCariMobil'), 5, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

try {
    Mobile.tap(findTestObject('Dashboard/Dashboard_BtnCariMobil'), 5)
}
catch (Exception e) {
    Mobile.tap(findTestObject('testing/android.view.View55 - Lihat Semua'), 5)

    Mobile.pressBack()

    Mobile.tap(findTestObject('Dashboard/Dashboard_BtnCariMobil'), 5)
} 

try {
    Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru - non paket/MobilBaru_BtnMobilBaru'), 5)
}
catch (Exception e) {
    Mobile.tap(findTestObject('testing/android.view.View55 - Lihat Semua'), 5)

    Mobile.pressBack()

    Mobile.tap(findTestObject('Dashboard/Dashboard_BtnCariMobil'), 5)

    //WebUI.callTestCase(findTestCase('Open application'), [:], FailureHandling.STOP_ON_FAILURE)
    //Mobile.tap(findTestObject('Dashboard/Dashboard_BtnCariMobil'), 5)
    Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru - non paket/MobilBaru_BtnMobilBaru'), 5)
} 

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Mobil Baru - Paket/CariMobil_BtnPaket'), 5)

