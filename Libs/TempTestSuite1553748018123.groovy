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


suiteProperties.put('id', 'Test Suites/Login')

suiteProperties.put('name', 'Login')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\IT-Services\\git\\Project in ACC - ACCOne Mobile\\Reports\\Login\\20190328_114016\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Login', suiteProperties, [new TestCaseBinding('Test Cases/Dashboard/Login/Login - Iteration 1', 'Test Cases/Dashboard/Login/Login',  [ 'varPassword' : 'Password1!' , 'varExpectedResult' : 'PASS' , 'varUsername' : 'aya@4mail.top' ,  ]), new TestCaseBinding('Test Cases/Dashboard/Login/Login - Iteration 2', 'Test Cases/Dashboard/Login/Login',  [ 'varPassword' : '' , 'varExpectedResult' : 'DISABLEDBUTTON' , 'varUsername' : '' ,  ]), new TestCaseBinding('Test Cases/Dashboard/Login/Login - Iteration 3', 'Test Cases/Dashboard/Login/Login',  [ 'varPassword' : '' , 'varExpectedResult' : 'DISABLEDBUTTON' , 'varUsername' : 'aya@4mail.top' ,  ]), new TestCaseBinding('Test Cases/Dashboard/Login/Login - Iteration 4', 'Test Cases/Dashboard/Login/Login',  [ 'varPassword' : 'Password1!' , 'varExpectedResult' : 'DISABLEDBUTTON' , 'varUsername' : '' ,  ]), new TestCaseBinding('Test Cases/Dashboard/Login/Login - Iteration 5', 'Test Cases/Dashboard/Login/Login',  [ 'varPassword' : 'Passwordsalah' , 'varExpectedResult' : 'FAIL' , 'varUsername' : 'emailsalah@a.c' ,  ]), new TestCaseBinding('Test Cases/Dashboard/Login/Login - Iteration 6', 'Test Cases/Dashboard/Login/Login',  [ 'varPassword' : 'Passwordsalah' , 'varExpectedResult' : 'FAIL' , 'varUsername' : 'aya@4mail.top' ,  ]), new TestCaseBinding('Test Cases/Dashboard/Login/Login - Iteration 7', 'Test Cases/Dashboard/Login/Login',  [ 'varPassword' : 'Password1!' , 'varExpectedResult' : 'FAIL' , 'varUsername' : 'emailsalah@a.c' ,  ]), new TestCaseBinding('Test Cases/Dashboard/Login/Login - Iteration 8', 'Test Cases/Dashboard/Login/Login',  [ 'varPassword' : 'Password1!' , 'varExpectedResult' : 'PASS' , 'varUsername' : '81904067865' ,  ]), new TestCaseBinding('Test Cases/Dashboard/Login/Login - Iteration 9', 'Test Cases/Dashboard/Login/Login',  [ 'varPassword' : '' , 'varExpectedResult' : 'DISABLEDBUTTON' , 'varUsername' : '' ,  ]), new TestCaseBinding('Test Cases/Dashboard/Login/Login - Iteration 10', 'Test Cases/Dashboard/Login/Login',  [ 'varPassword' : '' , 'varExpectedResult' : 'DISABLEDBUTTON' , 'varUsername' : '81904067865' ,  ]), new TestCaseBinding('Test Cases/Dashboard/Login/Login - Iteration 11', 'Test Cases/Dashboard/Login/Login',  [ 'varPassword' : 'Password1!' , 'varExpectedResult' : 'DISABLEDBUTTON' , 'varUsername' : '' ,  ]), new TestCaseBinding('Test Cases/Dashboard/Login/Login - Iteration 12', 'Test Cases/Dashboard/Login/Login',  [ 'varPassword' : 'Passwordsalah' , 'varExpectedResult' : 'FAIL' , 'varUsername' : '81166' ,  ]), new TestCaseBinding('Test Cases/Dashboard/Login/Login - Iteration 13', 'Test Cases/Dashboard/Login/Login',  [ 'varPassword' : 'Passwordsalah' , 'varExpectedResult' : 'FAIL' , 'varUsername' : '81904067865' ,  ]), new TestCaseBinding('Test Cases/Dashboard/Login/Login - Iteration 14', 'Test Cases/Dashboard/Login/Login',  [ 'varPassword' : 'Password1!' , 'varExpectedResult' : 'FAIL' , 'varUsername' : '81166' ,  ])])
