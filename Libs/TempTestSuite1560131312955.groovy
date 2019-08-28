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


suiteProperties.put('id', 'Test Suites/TestSuite - Multiguna - flow back page')

suiteProperties.put('name', 'TestSuite - Multiguna - flow back page')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\15421\\Katalon Studio\\accupdate4april\\accupdate4april\\Reports\\TestSuite - Multiguna - flow back page\\20190610_084832\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/TestSuite - Multiguna - flow back page', suiteProperties, [new TestCaseBinding('Test Cases/Dashboard/Cari Dana/multiguna/flow back page/Multiguna - flow back 2 - 1 - 2', 'Test Cases/Dashboard/Cari Dana/multiguna/flow back page/Multiguna - flow back 2 - 1 - 2',  null), new TestCaseBinding('Test Cases/Dashboard/Cari Dana/multiguna/flow back page/Multiguna - flow back 3-2-1-2', 'Test Cases/Dashboard/Cari Dana/multiguna/flow back page/Multiguna - flow back 3-2-1-2',  null), new TestCaseBinding('Test Cases/Dashboard/Cari Dana/multiguna/flow back page/Multiguna - flow back 3-2-3', 'Test Cases/Dashboard/Cari Dana/multiguna/flow back page/Multiguna - flow back 3-2-3',  null)])
