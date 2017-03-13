package com.simple;

import java.io.IOException;

import com.android.uiautomator.core.UiDevice;
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
		
		UiDevice dev = UiDevice.getInstance();
		dev.pressHome();

//		UiSelector  sel = new UiSelector().className("android.widget.RelativeLayout").packageName("com.cantv.launcher").resourceId("com.cantv.launcher:id/main_bar");
//		UiObject obj = new UiObject(sel);
//		int num = obj.getChildCount();
//		System.out.println("num = " + num);
	}
	
}
