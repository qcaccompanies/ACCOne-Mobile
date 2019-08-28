import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.apache.commons.lang3.StringUtils as StringUtils
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.AppiumDriver as AppiumDriver
import io.appium.java_client.TouchAction as TouchAction

Mobile.tap(findTestObject('calendar/Calendar_TxtTahun'), 0)

ArrayList listElement = MobileDriverFactory.getDriver().findElementsByClassName('android.widget.TextView')

i = (listElement.size() - 1)

String textItem = listElement[i].getText()

if (textItem < varTahun) {
    varScrollUpDown = 'UP'
} else {
    varScrollUpDown = 'DOWN'
}

switch (varScrollUpDown.toString()) {
    case 'UP':
        CustomKeywords.'mobile.swiping.scrollListToElementWithTextUp'(varTahun)

        break
    case 'DOWN':
        CustomKeywords.'mobile.swiping.scrollListToElementWithTextDown'(varTahun)

        break
}

Mobile.tap(findTestObject('New Test Object', [('varTahun') : varTahun]), 0)

Mobile.tap(findTestObject('calendar/Calendar_BtnSet'), 0)

