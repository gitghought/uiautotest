package com.simple;

import java.io.IOException;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class UIAutoTestCanApp extends UiAutomatorTestCase{

	public void testOptionSuggest () throws IOException, UiObjectNotFoundException, InterruptedException {
		String cmdStr = "monkey -p com.can.appstore -v 1";
		Process prop = Runtime.getRuntime().exec(cmdStr);
		
		UiDevice dev = UiDevice.getInstance();

		UiSelector  sel = new UiSelector().className("android.widget.LinearLayout").packageName("com.can.appstore").resourceId("com.can.appstore:id/id_indicator");
		UiObject obj = new UiObject(sel);
		obj.waitForExists(3);
		int num = obj.getChildCount();
		System.out.println("num = " + num);
		UiSelector subSel = new UiSelector().className("android.widget.RelativeLayout").packageName("com.can.appstore").text("еепп");

		UiSelector rSel = sel.childSelector(subSel);

		UiObject subObj = obj.getChild(rSel);

		subObj.click();
	}
}
