package uiauto;

import java.io.IOException;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import android.widget.TextView;

public class HelloUiauto extends UiAutomatorTestCase{

	/**
	 * Æô¶¯laucnehr
	 * @throws IOException 
	 * @throws UiObjectNotFoundException 
	 */
	public void testOpenLauncherMenu() throws IOException, UiObjectNotFoundException {
		String cmdStr = "monkey -p com.cyanogenmod.trebuchet -v 1";
		Runtime.getRuntime().exec(cmdStr);
		UiSelector selector = new UiSelector();
		selector.className("android.widget.TextView");
		selector.packageName("com.cyanogenmod.trebuchet");
		selector.index(2);
		UiObject obj = new UiObject(selector);
		obj.click();
	}
}
