package uiauto;

import java.io.IOException;

import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class HelloUiauto extends UiAutomatorTestCase{
	/**
	 * Æô¶¯laucnehr
	 * @throws IOException 
	 */
	public void testOpenLauncherMenu() throws IOException {
		String cmdStr = "monkey -p com.cyanogenmod.trebuchet -v 1";
		Runtime.getRuntime().exec(cmdStr);
		UiSelector selector = new UiSelector();
	}
}
