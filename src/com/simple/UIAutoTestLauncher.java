package com.simple;

import java.io.IOException;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class UIAutoTestLauncher extends UiAutomatorTestCase{
	/**
	 * 用于测试Launcher中的选项卡
	 * @throws IOException 
	 * @throws UiObjectNotFoundException 
	 */
	public void testOptionTitle () throws IOException, UiObjectNotFoundException {
		String cmdStr = "monkey -p com.cantv.launcher -v 1";
		Runtime.getRuntime().exec(cmdStr);

		//UiSelector  sel = new UiSelector().className("android.widget.RelativeLayout").packageName("com.cyanogenmod.lockclock").index(0).resourceId("com.cyanogenmod.lockclock:id/digital_appwidget");
//		UiObject obj = new UiObject(sel);
//		obj.clickAndWaitForNewWindow();
	}
}
