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
	public void testOpenLauncherTimeMenu() throws IOException, UiObjectNotFoundException {
		String cmdStr = "monkey -p com.cyanogenmod.trebuchet -v 1";
		Runtime.getRuntime().exec(cmdStr);
		

		UiSelector  sel = new UiSelector().className("android.widget.RelativeLayout").packageName("com.cyanogenmod.lockclock").index(0).resourceId("com.cyanogenmod.lockclock:id/digital_appwidget");
		UiObject obj = new UiObject(sel);
		obj.clickAndWaitForNewWindow();
	}

}
