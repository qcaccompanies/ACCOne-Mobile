import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\ADMINI~1\\AppData\\Local\\Temp\\2\\Katalon\\Test Cases\\Dashboard\\Cari Mobil\\Mobil Baru\\paket\\kredit\\master flow\\mobil baru - paket - open menu - MASTER FLOW\\20190909_093631\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCase('Test Cases/Dashboard/Cari Mobil/Mobil Baru/paket/kredit/master flow/mobil baru - paket - open menu - MASTER FLOW', new TestCaseBinding('Test Cases/Dashboard/Cari Mobil/Mobil Baru/paket/kredit/master flow/mobil baru - paket - open menu - MASTER FLOW',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
