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

WebUI.callTestCase(findTestCase('Menu Bawah/Akun/Akun Bank/Master flow/Akun Bank - open menu - MASTER FLOW'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Menu Bawah/Akun/Akun Bank/Master flow/Akun Bank - MASTER FLOW'), [('varNamaBank') : varNamaBank
        , ('varCabang') : varCabang, ('varNamaPemilikRekening') : varNamaPemilikRekening, ('varNomorRekening') : varNomorRekening
        , ('varPassword') : varPassword], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('BottomMenu/Akun/akun bank/AkunBank_InpNamaBank'), 0)

CustomKeywords.'mobile.keypress.backspace'()

CustomKeywords.'mobile.keypress.backspace'()

Mobile.tap(findTestObject('BottomMenu/Akun/akun bank/AkunBank_BtnSubmit'), 0)

