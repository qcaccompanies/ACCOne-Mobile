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


suiteProperties.put('id', 'Test Suites/TestSuite - Multiguna - validation')

suiteProperties.put('name', 'TestSuite - Multiguna - validation')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\15421\\Katalon Studio\\accupdate4april\\accupdate4april\\Reports\\TestSuite - Multiguna - validation\\20190610_084844\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/TestSuite - Multiguna - validation', suiteProperties, [new TestCaseBinding('Test Cases/Dashboard/Cari Dana/multiguna/validation/Multiguna - Belum Login', 'Test Cases/Dashboard/Cari Dana/multiguna/validation/Multiguna - Belum Login',  null), new TestCaseBinding('Test Cases/Dashboard/Cari Dana/multiguna/validation/Multiguna - Belum Upload KTP', 'Test Cases/Dashboard/Cari Dana/multiguna/validation/Multiguna - Belum Upload KTP',  null), new TestCaseBinding('Test Cases/Dashboard/Cari Dana/multiguna/validation/Multiguna - page 1 - cek field input output', 'Test Cases/Dashboard/Cari Dana/multiguna/validation/Multiguna - page 1 - cek field input output',  null), new TestCaseBinding('Test Cases/Dashboard/Cari Dana/multiguna/validation/Multiguna - slider menu - belum login', 'Test Cases/Dashboard/Cari Dana/multiguna/validation/Multiguna - slider menu - belum login',  null)])