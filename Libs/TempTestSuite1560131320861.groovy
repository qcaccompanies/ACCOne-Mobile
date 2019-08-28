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


suiteProperties.put('id', 'Test Suites/TestSuite - Multiguna - flow hapus 2 karakter')

suiteProperties.put('name', 'TestSuite - Multiguna - flow hapus 2 karakter')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\15421\\Katalon Studio\\accupdate4april\\accupdate4april\\Reports\\TestSuite - Multiguna - flow hapus 2 karakter\\20190610_084840\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/TestSuite - Multiguna - flow hapus 2 karakter', suiteProperties, [new TestCaseBinding('Test Cases/Dashboard/Cari Dana/multiguna/flow hapus 2 karakter/page 1/Multiguna - page 1 - hapus brand', 'Test Cases/Dashboard/Cari Dana/multiguna/flow hapus 2 karakter/page 1/Multiguna - page 1 - hapus brand',  null), new TestCaseBinding('Test Cases/Dashboard/Cari Dana/multiguna/flow hapus 2 karakter/page 1/Multiguna - page 1 - hapus model', 'Test Cases/Dashboard/Cari Dana/multiguna/flow hapus 2 karakter/page 1/Multiguna - page 1 - hapus model',  null), new TestCaseBinding('Test Cases/Dashboard/Cari Dana/multiguna/flow hapus 2 karakter/page 1/Multiguna - page 1 - hapus tahun', 'Test Cases/Dashboard/Cari Dana/multiguna/flow hapus 2 karakter/page 1/Multiguna - page 1 - hapus tahun',  null), new TestCaseBinding('Test Cases/Dashboard/Cari Dana/multiguna/flow hapus 2 karakter/page 1/Multiguna - page 1 - hapus type', 'Test Cases/Dashboard/Cari Dana/multiguna/flow hapus 2 karakter/page 1/Multiguna - page 1 - hapus type',  null), new TestCaseBinding('Test Cases/Dashboard/Cari Dana/multiguna/flow hapus 2 karakter/page 2/Multiguna - page 2 - hapus area pengajuan', 'Test Cases/Dashboard/Cari Dana/multiguna/flow hapus 2 karakter/page 2/Multiguna - page 2 - hapus area pengajuan',  null), new TestCaseBinding('Test Cases/Dashboard/Cari Dana/multiguna/flow hapus 2 karakter/page 2/Multiguna - page 2 - hapus cabang acc', 'Test Cases/Dashboard/Cari Dana/multiguna/flow hapus 2 karakter/page 2/Multiguna - page 2 - hapus cabang acc',  null), new TestCaseBinding('Test Cases/Dashboard/Cari Dana/multiguna/flow hapus 2 karakter/page 2/Multiguna - page 2 - hapus dana yang dibutuhkan', 'Test Cases/Dashboard/Cari Dana/multiguna/flow hapus 2 karakter/page 2/Multiguna - page 2 - hapus dana yang dibutuhkan',  null), new TestCaseBinding('Test Cases/Dashboard/Cari Dana/multiguna/flow hapus 2 karakter/page 2/Multiguna - page 2 - hapus tujuan peminjaman dana', 'Test Cases/Dashboard/Cari Dana/multiguna/flow hapus 2 karakter/page 2/Multiguna - page 2 - hapus tujuan peminjaman dana',  null)])
