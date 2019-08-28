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


suiteProperties.put('id', 'Test Suites/MOBILE_TS_Multiguna - data binding - page 1_1-10')

suiteProperties.put('name', 'MOBILE_TS_Multiguna - data binding - page 1_1-10')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\15421\\Katalon Studio\\accupdate4april\\accupdate4april\\Reports\\MOBILE_TS_Multiguna - data binding - page 1_1-10\\20190612_213707\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/MOBILE_TS_Multiguna - data binding - page 1_1-10', suiteProperties, [new TestCaseBinding('Test Cases/Dashboard/Cari Dana/multiguna/flow data binding/Multiguna - page 1 - Iteration 1', 'Test Cases/Dashboard/Cari Dana/multiguna/flow data binding/Multiguna - page 1',  [ 'varTahun' : '2018' , 'varBPKB' : 'Y' , 'varBrand' : 'DAIHATSU' , 'varType' : 'AYLA' , 'varModel' : 'T:1.0 D M/T' , 'varExpectedResult' : 'PASS' , 'varExistingNew' : 'Existing' ,  ]), new TestCaseBinding('Test Cases/Dashboard/Cari Dana/multiguna/flow data binding/Multiguna - page 1 - Iteration 2', 'Test Cases/Dashboard/Cari Dana/multiguna/flow data binding/Multiguna - page 1',  [ 'varTahun' : '2019' , 'varBPKB' : 'N' , 'varBrand' : 'DAIHATSU' , 'varType' : '' , 'varModel' : 'T:1.0 D M/T' , 'varExpectedResult' : 'DISABLEDBUTTON' , 'varExistingNew' : 'Existing' ,  ]), new TestCaseBinding('Test Cases/Dashboard/Cari Dana/multiguna/flow data binding/Multiguna - page 1 - Iteration 3', 'Test Cases/Dashboard/Cari Dana/multiguna/flow data binding/Multiguna - page 1',  [ 'varTahun' : '2019' , 'varBPKB' : 'N' , 'varBrand' : 'DAIHATSU' , 'varType' : 'AYLA' , 'varModel' : '' , 'varExpectedResult' : 'DISABLEDBUTTON' , 'varExistingNew' : 'New' ,  ]), new TestCaseBinding('Test Cases/Dashboard/Cari Dana/multiguna/flow data binding/Multiguna - page 1 - Iteration 4', 'Test Cases/Dashboard/Cari Dana/multiguna/flow data binding/Multiguna - page 1',  [ 'varTahun' : '' , 'varBPKB' : 'Y' , 'varBrand' : 'DAIHATSU' , 'varType' : 'AYLA' , 'varModel' : 'T:1.0 D M/T' , 'varExpectedResult' : 'DISABLEDBUTTON' , 'varExistingNew' : 'Existing' ,  ]), new TestCaseBinding('Test Cases/Dashboard/Cari Dana/multiguna/flow data binding/Multiguna - page 1 - Iteration 5', 'Test Cases/Dashboard/Cari Dana/multiguna/flow data binding/Multiguna - page 1',  [ 'varTahun' : '2019' , 'varBPKB' : 'Y' , 'varBrand' : 'DAIHATSU' , 'varType' : 'AYLA' , 'varModel' : 'T:1.0 D M/T' , 'varExpectedResult' : 'DISABLEDBUTTON' , 'varExistingNew' : 'New' ,  ])])