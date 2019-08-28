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

WebUI.callTestCase(findTestCase('Open application'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Dashboard/Cari Dana/trade in/master flow/trade in - open menu - MASTER FLOW'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Dashboard/Cari Dana/trade in/master flow/trade in - page 1 - MASTER FLOW'), [('varBrand') : varBrand
        , ('varType') : varType, ('varModel') : varModel, ('varTahun') : varTahun, ('varExpectedResult') : varExpectedResult
        , ('varLokasi') : varLokasi], FailureHandling.STOP_ON_FAILURE)

Mobile.clearText(findTestObject('Dashboard/cari dana/trade in/page 1 - masukkan detail kendaraanmu/TradeIn_InpLokasi'), 
    0)

WebUI.callTestCase(findTestCase('Dashboard/Cari Dana/trade in/master flow/trade in - verify element - page 1 - MASTER FLOW'), 
    [('varBrand') : varBrand, ('varType') : varType, ('varModel') : varModel, ('varTahun') : varTahun, ('varLokasi') : ''], 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/cari dana/trade in/page 1 - masukkan detail kendaraanmu/TradeIn_BtnBerikutnya'), 0)

switch (varExpectedResult.toString()) {
    case 'PASS':
        Mobile.waitForElementPresent(findTestObject('Dashboard/cari dana/trade in/page 2 - masukkan detail kendaraan masa depanmu/TradeIn_BtnNewCar'), 
            0)

        Mobile.verifyElementVisible(findTestObject('Dashboard/cari dana/trade in/page 2 - masukkan detail kendaraan masa depanmu/TradeIn_BtnNewCar'), 
            0)

        break
    case 'DISABLEDBUTTON':
        Mobile.verifyElementNotVisible(findTestObject('Dashboard/cari dana/trade in/page 2 - masukkan detail kendaraan masa depanmu/TradeIn_BtnNewCar'), 
            7)

        break
}

