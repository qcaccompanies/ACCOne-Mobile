import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/cari mobil/mobil baru/Mobil Baru - Belum Upload KTP')

suiteProperties.put('name', 'Mobil Baru - Belum Upload KTP')

suiteProperties.put('description', 'kalau belum upload KTP, saat submit, harus upload KTP terlebih dahulu')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\IT-Services\\git\\accupdate4april\\accupdate4april\\Reports\\cari mobil\\mobil baru\\Mobil Baru - Belum Upload KTP\\20190502_112953\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/cari mobil/mobil baru/Mobil Baru - Belum Upload KTP', suiteProperties, [new TestCaseBinding('Test Cases/Dashboard/Cari Mobil/Mobil Baru/validation/Mobil Baru - Belum Upload KTP', 'Test Cases/Dashboard/Cari Mobil/Mobil Baru/validation/Mobil Baru - Belum Upload KTP',  null)])