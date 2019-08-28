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


RunConfiguration.setExecutionSettingFile('C:\\Users\\IT-SER~1\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Menu Bawah\\Akun\\Akun Bank\\Master flow\\Akun Bank - open menu - MASTER FLOW\\20190524_090322\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCase('Test Cases/Menu Bawah/Akun/Akun Bank/Master flow/Akun Bank - open menu - MASTER FLOW', new TestCaseBinding('Test Cases/Menu Bawah/Akun/Akun Bank/Master flow/Akun Bank - open menu - MASTER FLOW',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
