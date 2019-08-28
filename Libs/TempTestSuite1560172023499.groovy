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


suiteProperties.put('id', 'Test Suites/MOBILE_TS_Multiguna - flow hapus 1 field - page 2')

suiteProperties.put('name', 'MOBILE_TS_Multiguna - flow hapus 1 field - page 2')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\15421\\Katalon Studio\\accupdate4april\\accupdate4april\\Reports\\MOBILE_TS_Multiguna - flow hapus 1 field - page 2\\20190610_200703\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/MOBILE_TS_Multiguna - flow hapus 1 field - page 2', suiteProperties, [new TestCaseBinding('Test Cases/Dashboard/Cari Dana/multiguna/flow hapus 1 field/page 2/Multiguna - page 2 - hapus area pengajuan', 'Test Cases/Dashboard/Cari Dana/multiguna/flow hapus 1 field/page 2/Multiguna - page 2 - hapus area pengajuan',  null), new TestCaseBinding('Test Cases/Dashboard/Cari Dana/multiguna/flow hapus 1 field/page 2/Multiguna - page 2 - hapus dana yang dibutuhkan', 'Test Cases/Dashboard/Cari Dana/multiguna/flow hapus 1 field/page 2/Multiguna - page 2 - hapus dana yang dibutuhkan',  null), new TestCaseBinding('Test Cases/Dashboard/Cari Dana/multiguna/flow hapus 1 field/page 2/Multiguna - page 2 - hapus tujuan peminjaman dana', 'Test Cases/Dashboard/Cari Dana/multiguna/flow hapus 1 field/page 2/Multiguna - page 2 - hapus tujuan peminjaman dana',  null)])
