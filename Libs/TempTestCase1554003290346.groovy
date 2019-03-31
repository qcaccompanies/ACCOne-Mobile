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


RunConfiguration.setExecutionSettingFile('/var/folders/h0/xn8z3rfx66dgk204s642g52h0000gn/T/Katalon/Test Cases/Dashboard/Cari Mobil/Mobil Baru/Mobil Baru/20190331_103450/execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCase('Test Cases/Dashboard/Cari Mobil/Mobil Baru/Mobil Baru', new TestCaseBinding('Test Cases/Dashboard/Cari Mobil/Mobil Baru/Mobil Baru',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
