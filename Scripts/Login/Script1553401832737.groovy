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

Mobile.tap(findTestObject('android.view.View26 - Masuk atau Daftar untuk gunakan fitur acc.one'), 0)

Mobile.setText(findTestObject('android.widget.EditText0 (3)'), 'divanabilaarumsari@gmail.com', 0)

Mobile.setText(findTestObject('android.widget.EditText1'), 'SmpLabschool8%', 0)

Mobile.tap(findTestObject('android.widget.Button0 - Masuk'), 0)

Mobile.closeApplication()

