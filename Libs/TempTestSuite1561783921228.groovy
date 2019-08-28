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


suiteProperties.put('id', 'Test Suites/MOBILE_TS_Mobil Baru - non paket - data binding (6-10)')

suiteProperties.put('name', 'MOBILE_TS_Mobil Baru - non paket - data binding (6-10)')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\15421\\Katalon Studio\\accupdate4april\\accupdate4april\\Reports\\MOBILE_TS_Mobil Baru - non paket - data binding (6-10)\\20190629_115201\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/MOBILE_TS_Mobil Baru - non paket - data binding (6-10)', suiteProperties, [new TestCaseBinding('Test Cases/Dashboard/Cari Mobil/Mobil Baru/Non Paket/flow data binding/Mobil Baru - Iteration 1', 'Test Cases/Dashboard/Cari Mobil/Mobil Baru/Non Paket/flow data binding/Mobil Baru',  [ 'varTahun' : '2019' , 'varACP' : 'Y' , 'varAsuransi' : 'TUNAI' , 'varOTR' : '150000000' , 'varAreaPengajuan' : 'DKI Jakarta, Banten, Jawa Barat' , 'varBrand' : 'TOYOTA' , 'varUangMuka' : '50' , 'varType' : ' ' , 'varModel' : ' ' , 'varExpectedResult' : 'DISABLEDBUTTON' , 'varPeriode' : '60' , 'varCabang' : 'FATMAWATI' ,  ]), new TestCaseBinding('Test Cases/Dashboard/Cari Mobil/Mobil Baru/Non Paket/flow data binding/Mobil Baru - Iteration 2', 'Test Cases/Dashboard/Cari Mobil/Mobil Baru/Non Paket/flow data binding/Mobil Baru',  [ 'varTahun' : ' ' , 'varACP' : 'N' , 'varAsuransi' : 'KREDIT' , 'varOTR' : '150000000' , 'varAreaPengajuan' : 'DKI Jakarta, Banten, Jawa Barat' , 'varBrand' : 'TOYOTA' , 'varUangMuka' : '50' , 'varType' : 'AGYA' , 'varModel' : '1.0 G A/T NEW' , 'varExpectedResult' : 'DISABLEDBUTTON' , 'varPeriode' : '12' , 'varCabang' : 'FATMAWATI' ,  ]), new TestCaseBinding('Test Cases/Dashboard/Cari Mobil/Mobil Baru/Non Paket/flow data binding/Mobil Baru - Iteration 3', 'Test Cases/Dashboard/Cari Mobil/Mobil Baru/Non Paket/flow data binding/Mobil Baru',  [ 'varTahun' : '2019' , 'varACP' : 'Y' , 'varAsuransi' : 'TUNAI' , 'varOTR' : ' ' , 'varAreaPengajuan' : 'DKI Jakarta, Banten, Jawa Barat' , 'varBrand' : 'TOYOTA' , 'varUangMuka' : '50' , 'varType' : 'AGYA' , 'varModel' : '1.0 G A/T NEW' , 'varExpectedResult' : 'DISABLEDBUTTON' , 'varPeriode' : '24' , 'varCabang' : 'FATMAWATI' ,  ]), new TestCaseBinding('Test Cases/Dashboard/Cari Mobil/Mobil Baru/Non Paket/flow data binding/Mobil Baru - Iteration 4', 'Test Cases/Dashboard/Cari Mobil/Mobil Baru/Non Paket/flow data binding/Mobil Baru',  [ 'varTahun' : '2019' , 'varACP' : 'Y' , 'varAsuransi' : 'TUNAI' , 'varOTR' : '150000000' , 'varAreaPengajuan' : 'DKI Jakarta, Banten, Jawa Barat' , 'varBrand' : 'TOYOTA' , 'varUangMuka' : '' , 'varType' : 'AGYA' , 'varModel' : '1.0 G A/T NEW' , 'varExpectedResult' : 'DISABLEDBUTTON' , 'varPeriode' : '12' , 'varCabang' : 'FATMAWATI' ,  ]), new TestCaseBinding('Test Cases/Dashboard/Cari Mobil/Mobil Baru/Non Paket/flow data binding/Mobil Baru - Iteration 5', 'Test Cases/Dashboard/Cari Mobil/Mobil Baru/Non Paket/flow data binding/Mobil Baru',  [ 'varTahun' : '2019' , 'varACP' : 'Y' , 'varAsuransi' : 'TUNAI' , 'varOTR' : '150000000' , 'varAreaPengajuan' : '' , 'varBrand' : 'TOYOTA' , 'varUangMuka' : '50' , 'varType' : 'AGYA' , 'varModel' : '1.0 G A/T NEW' , 'varExpectedResult' : 'DISABLEDBUTTON' , 'varPeriode' : '36' , 'varCabang' : 'FATMAWATI' ,  ])])
