package com.simple;

import java.io.IOException;

import com.android.uiautomator.core.UiCollection;
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
		
		UiObject subObj = new UiCollection(new UiSelector().resourceId("com.can.appstore:id/id_indicator"))
		.getChildByInstance(new UiSelector().className("android.widget.RelativeLayout"), 0);
		assertTrue(subObj.isFocused());
	}

	/**
	 * 获取选项卡中所有对象
	 * @throws IOException
	 * @throws UiObjectNotFoundException
	 * @throws InterruptedException
	 */
	public void testGetAllChildObject() throws IOException, UiObjectNotFoundException, InterruptedException {
		String cmdStr = "monkey -p com.can.appstore -v 1";
		Process prop = Runtime.getRuntime().exec(cmdStr);
		
		UiObject obj = new UiCollection(new UiSelector().resourceId("com.can.appstore:id/id_indicator"));
		int count = obj.getChildCount();
		System.out.println("count  = "  + count);
	}
}
