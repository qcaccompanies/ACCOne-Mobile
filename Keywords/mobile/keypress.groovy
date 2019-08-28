package mobile

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent
import internal.GlobalVariable

public class keypress {
	@Keyword
	def backspace() {
		try {

			Robot rb = new Robot()

			rb.keyPress(KeyEvent.VK_SHIFT)

			rb.keyPress(KeyEvent.VK_BACK_SPACE)

			rb.keyRelease(KeyEvent.VK_SHIFT)

			rb.keyRelease(KeyEvent.VK_BACK_SPACE)
		} catch (Exception e) {
			KeywordUtil.markFailed("Something wrong with the keyword" + e.message)
		}
	}
	@Keyword
	def back() {
		try {

			Robot rb = new Robot()

			rb.keyPress(KeyEvent.VK_BACK)

			rb.keyRelease(KeyEvent.VK_BACK)
		} catch (Exception e) {
			KeywordUtil.markFailed("Something wrong with the keyword" + e.message)
		}
	}
}
