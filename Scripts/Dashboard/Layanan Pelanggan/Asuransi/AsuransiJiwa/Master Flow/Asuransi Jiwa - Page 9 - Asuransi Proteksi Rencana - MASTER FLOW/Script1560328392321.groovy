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

switch (varFrekuensi.toString()) {
    case '1':
        Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Jiwa/page 9/asuransi proteksi rencana/AsuransiJiwa_BtnFrekuensi1Bulan'), 
            0)

        break
    case '3':
        Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Jiwa/page 9/asuransi proteksi rencana/AsuransiJiwa_BtnFrekuensi3Bulan'), 
            0)

        break
    case '6':
        Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Jiwa/page 9/asuransi proteksi rencana/AsuransiJiwa_BtnFrekuensi6Bulan'), 
            0)

        break
    case '12':
        Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Jiwa/page 9/asuransi proteksi rencana/AsuransiJiwa_BtnFrekuensi12Bulan'), 
            0)

        break
}

switch (varPremi.toString()) {
    case '1000':
        Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Jiwa/page 9/asuransi proteksi rencana/AsuransiJiwa_BtnPremiRencana1000'), 
            0)

        break
    case '750':
        Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Jiwa/page 9/asuransi proteksi rencana/AsuransiJiwa_BtnPremiRencana750'), 
            0)

        break
    case '500':
        Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Jiwa/page 9/asuransi proteksi rencana/AsuransiJiwa_BtnPremiRencana500'), 
            0)

        break
    case '250':
        Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Jiwa/page 9/asuransi proteksi rencana/AsuransiJiwa_BtnPremiRencana250'), 
            0)

        break
    case '100':
        Mobile.tap(findTestObject('Dashboard/Layanan Pelanggan/Asuransi/Asuransi Jiwa/page 9/asuransi proteksi rencana/AsuransiJiwa_BtnPremiRencana100'), 
            0)

        break
}

