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

Mobile.waitForElementPresent(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Jiwa/page 4/AsuransiJiwa_TxtAsuransiSebelumnya'), 
    0)

switch (varKepemilikanAsuransi.toString()) {
    case 'BelumAda':
        Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Jiwa/page 4/AsuransiJiwa_RadBtnBelumAda'), 
            0)

        break
    case 'Lainnya':
        Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Jiwa/page 4/AsuransiJiwa_RadBtnLainnya'), 
            0)

        break
    case 'NonBPJS':
        Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Jiwa/page 4/AsuransiJiwa_RadBtnNonBPJS'), 
            0)

        break
    case 'BPJS':
        Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Jiwa/page 4/AsuransiJiwa_RadBtnBPJS'), 
            0)

        break
}

