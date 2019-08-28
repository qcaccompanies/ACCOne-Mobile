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

WebUI.callTestCase(findTestCase('Open application'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Menu Bawah/Akun/Akun Kritik dan Saran/laporkan bug/master flow/Laporkan Bug - open menu - MASTER FLOW'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Menu Bawah/Akun/Akun Kritik dan Saran/laporkan bug/master flow/Laporkan Bug - MASTER FLOW'), 
    [('varBug') : varBug], FailureHandling.STOP_ON_FAILURE)

switch (varExpectedResult.toString()) {
    case 'PASS':
        Mobile.tap(findTestObject('BottomMenu/Akun/Akun_KritikSaran/laporkan bug/Akun_KritikSaranProduk_BtnSubmit'), 0)

        Mobile.waitForElementPresent(findTestObject('BottomMenu/Akun/Akun_KritikSaran/laporkan bug/Akun_KritikSaranProduk_BtnYeay'), 
            0)

        Mobile.verifyElementVisible(findTestObject('BottomMenu/Akun/Akun_KritikSaran/laporkan bug/Akun_KritikSaranProduk_BtnYeay'), 
            0)

        Mobile.tap(findTestObject('BottomMenu/Akun/Akun_KritikSaran/laporkan bug/Akun_KritikSaranProduk_BtnYeay'), 0)

        break
    case 'DISABLEDBUTTON':
        Mobile.verifyElementNotVisible(findTestObject('BottomMenu/Akun/Akun_KritikSaran/laporkan bug/Akun_KritikSaranProduk_BtnYeay'), 
            0)

        break
}

