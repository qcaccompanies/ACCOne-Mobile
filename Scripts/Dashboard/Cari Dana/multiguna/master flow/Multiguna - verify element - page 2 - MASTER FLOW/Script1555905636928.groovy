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

inpDanaYangDibutuhkan = Mobile.getText(findTestObject('Dashboard/cari dana/multiguna/page 2 - simulasikan dana kebutuhanmu/Multiguna_InpDanaYangDibutuhkan'), 
    0)

inpTujuanPeminjamanDana = Mobile.getText(findTestObject('Dashboard/cari dana/multiguna/page 2 - simulasikan dana kebutuhanmu/Multiguna_InpTujuanPeminjamanDana'), 
    0)

inpAreaPengajuan = Mobile.getText(findTestObject('Dashboard/cari dana/multiguna/page 2 - simulasikan dana kebutuhanmu/Multiguna_InpAreaPengajuan'), 
    0)

inpCabangACC = Mobile.getText(findTestObject('Dashboard/cari dana/multiguna/page 2 - simulasikan dana kebutuhanmu/Multiguna_InpCabangACC'), 
    0)

Mobile.verifyEqual(inpDanaYangDibutuhkan, varDana, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(inpTujuanPeminjamanDana, varTujuanPeminjaman, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(inpAreaPengajuan, varAreaPengajuan, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(inpCabangACC, varCabang, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(1, FailureHandling.OPTIONAL)

