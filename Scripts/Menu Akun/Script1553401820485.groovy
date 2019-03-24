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

Mobile.startApplication('C:\\Users\\User\\AppData\\Local\\Microsoft\\Windows\\INetCache\\IE\\06XV6WTM\\AccWorld[2].apk', 
    true)

Mobile.tap(findTestObject('android.view.View88 - Akun'), 0)

Mobile.tap(findTestObject('android.view.View33'), 0)

Mobile.tap(findTestObject('android.view.View34 (1)'), 0)

Mobile.tap(findTestObject('android.view.View79 -  Camera'), 0)

Mobile.tap(findTestObject('GLButton6 - Shutter'), 0)

Mobile.tap(findTestObject('android.widget.TextView1 - OK'), 0)

Mobile.tap(findTestObject('android.widget.Button0 - Submit'), 0)

Mobile.tap(findTestObject('android.view.View40'), 0)

Mobile.tap(findTestObject('android.widget.EditText0'), 0)

Mobile.setText(findTestObject('android.widget.EditText0 (1)'), 'a', 0)

Mobile.tap(findTestObject('android.view.View24 - AccWorldTheme.icon_back_arrow'), 0)

Mobile.tap(findTestObject('android.view.View46'), 0)

Mobile.tap(findTestObject('android.view.View24 - AccWorldTheme.icon_back_arrow'), 0)

Mobile.tap(findTestObject('android.view.View52'), 0)

Mobile.tap(findTestObject('android.view.View24 - AccWorldTheme.icon_back_arrow'), 0)

Mobile.tap(findTestObject('android.view.View58'), 0)

Mobile.tap(findTestObject('android.view.View31'), 0)

Mobile.setText(findTestObject('android.widget.EditText0 (2)'), 'aa', 0)

Mobile.tap(findTestObject('android.widget.Button0 - Submit (1)'), 0)

Mobile.tap(findTestObject('android.widget.Button0 - '), 0)

Mobile.tap(findTestObject('android.view.View64'), 0)

Mobile.tap(findTestObject('android.widget.Button0 - Ya'), 0)

Mobile.closeApplication()

