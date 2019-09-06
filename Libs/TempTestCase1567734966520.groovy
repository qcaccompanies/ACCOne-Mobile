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


RunConfiguration.setExecutionSettingFile('C:\\Users\\15421\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Dashboard\\Cari Mobil\\Mobil Baru\\paket\\kredit\\flow data binding\\paket - kredit - flow data binding\\20190906_085606\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCase('Test Cases/Dashboard/Cari Mobil/Mobil Baru/paket/kredit/flow data binding/paket - kredit - flow data binding', new TestCaseBinding('Test Cases/Dashboard/Cari Mobil/Mobil Baru/paket/kredit/flow data binding/paket - kredit - flow data binding',[:]), FailureHandling.STOP_ON_FAILURE , false)
    