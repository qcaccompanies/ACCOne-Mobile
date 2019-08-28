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


suiteProperties.put('id', 'Test Suites/cari dana/multiguna/flow hapus 2 karakter/TestSuites multiguna - flow hapus 2 karakter')

suiteProperties.put('name', 'TestSuites multiguna - flow hapus 2 karakter')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\IT-Services\\git\\accupdate4april\\accupdate4april\\Reports\\cari dana\\multiguna\\flow hapus 2 karakter\\TestSuites multiguna - flow hapus 2 karakter\\20190424_145957\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/cari dana/multiguna/flow hapus 2 karakter/TestSuites multiguna - flow hapus 2 karakter', suiteProperties, [new TestCaseBinding('Test Cases/Dashboard/Cari Dana/multiguna/flow hapus 2 karakter/page 1/Multiguna - page 1 - hapus tahun', 'Test Cases/Dashboard/Cari Dana/multiguna/flow hapus 2 karakter/page 1/Multiguna - page 1 - hapus tahun',  null), new TestCaseBinding('Test Cases/Dashboard/Cari Dana/multiguna/flow hapus 2 karakter/page 1/Multiguna - page 1 - hapus type', 'Test Cases/Dashboard/Cari Dana/multiguna/flow hapus 2 karakter/page 1/Multiguna - page 1 - hapus type',  null)])
