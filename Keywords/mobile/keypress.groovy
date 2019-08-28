package mobile

import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.util.KeywordUtil

public class keypress {
	@Keyword
	def backspace() {
		try {

			Robot rb = new Robot()
			rb.keyPress(KeyEvent.VK_BACK_SPACE)

			
		} catch (Exception e) {
			KeywordUtil.markFailed("Something wrong with the keyword" + e.message)
		}
	}
}
