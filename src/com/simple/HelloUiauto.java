package com.simple;

import java.io.IOException;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import android.widget.TextView;

public class HelloUiauto extends UiAutomatorTestCase{

	/**
	 * 启动laucnehr中的时间小组件
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
	
	public void testOpenLauncher() throws IOException, UiObjectNotFoundException {
		String cmdStr = "monkey -p com.cyanogenmod.trebuchet -v 1";
		Runtime.getRuntime().exec(cmdStr);

		UiSelector  sel = new UiSelector().resourceId("com.android.launcher3:id/workspace");
		UiObject obj = new UiObject(sel);
		//obj.clickAndWaitForNewWindow();
		int count = obj.getChildCount();
		System.out.println("count = " + count);
		
		UiSelector  selchild = new UiSelector().className("android.widget.TextView").packageName("com.cyanogenmod.trebuchet").index(1);
		UiObject  objchild = obj.getChild(selchild);
		objchild.clickAndWaitForNewWindow();
	}

	public void testOpenLauncherAppCenter() throws IOException, UiObjectNotFoundException {
		String cmdStr = "monkey -p com.cyanogenmod.trebuchet -v 1";
		Runtime.getRuntime().exec(cmdStr);
		
		UiSelector  sel = new UiSelector().resourceId("com.android.launcher3:id/workspace");
		UiObject obj = new UiObject(sel);
		//obj.clickAndWaitForNewWindow();
		int count = obj.getChildCount();
		System.out.println("count = " + count);
		
		UiSelector  selchild = new UiSelector().className("android.widget.TextView").packageName("com.cyanogenmod.trebuchet").index(2);
		UiObject  objchild = obj.getChild(selchild);
		objchild.clickAndWaitForNewWindow();
	}
	public void testOpenLauncherPhone() throws IOException, UiObjectNotFoundException {
		String cmdStr = "monkey -p com.cyanogenmod.trebuchet -v 1";
		Runtime.getRuntime().exec(cmdStr);
		
		UiSelector  sel = new UiSelector().resourceId("com.android.launcher3:id/hotseat");
		UiObject obj = new UiObject(sel);
		int count = obj.getChildCount();
		System.out.println("count = " + count);
		
		UiSelector  selchild = new UiSelector().className("android.widget.TextView").packageName("com.cyanogenmod.trebuchet").index(0);
		UiObject  objchild = obj.getChild(selchild);
		objchild.clickAndWaitForNewWindow();
	}
	public void testOpenLauncherMessage() throws IOException, UiObjectNotFoundException {
		String cmdStr = "monkey -p com.cyanogenmod.trebuchet -v 1";
		Runtime.getRuntime().exec(cmdStr);
		
		UiSelector  sel = new UiSelector().resourceId("com.android.launcher3:id/hotseat");
		UiObject obj = new UiObject(sel);
		int count = obj.getChildCount();
		System.out.println("count = " + count);
		
		UiSelector  selchild = new UiSelector().className("android.widget.TextView").packageName("com.cyanogenmod.trebuchet").index(1);
		UiObject  objchild = obj.getChild(selchild);
		objchild.clickAndWaitForNewWindow();
	}

	public void testOpenLauncherMenu() throws IOException, UiObjectNotFoundException {
		String cmdStr = "monkey -p com.cyanogenmod.trebuchet -v 1";
		Runtime.getRuntime().exec(cmdStr);
		
		UiSelector  sel = new UiSelector().resourceId("com.android.launcher3:id/hotseat");
		UiObject obj = new UiObject(sel);
		int count = obj.getChildCount();
		System.out.println("count = " + count);
		
		UiSelector  selchild = new UiSelector().className("android.widget.TextView").packageName("com.cyanogenmod.trebuchet").index(2);
		UiObject  objchild = obj.getChild(selchild);
		objchild.clickAndWaitForNewWindow();
	}

	public void testOpenLauncherBrowser() throws IOException, UiObjectNotFoundException {
		String cmdStr = "monkey -p com.cyanogenmod.trebuchet -v 1";
		Runtime.getRuntime().exec(cmdStr);
		
		UiSelector  sel = new UiSelector().resourceId("com.android.launcher3:id/hotseat");
		UiObject obj = new UiObject(sel);
		int count = obj.getChildCount();
		System.out.println("count = " + count);
		
		UiSelector  selchild = new UiSelector().className("android.widget.TextView").packageName("com.cyanogenmod.trebuchet").index(3);
		UiObject  objchild = obj.getChild(selchild);
		objchild.clickAndWaitForNewWindow();
	}

	public void testOpenLauncherCamera () throws IOException, UiObjectNotFoundException {
		String cmdStr = "monkey -p com.cyanogenmod.trebuchet -v 1";
		Runtime.getRuntime().exec(cmdStr);
		
		UiSelector  sel = new UiSelector().resourceId("com.android.launcher3:id/hotseat");
		UiObject obj = new UiObject(sel);
		int count = obj.getChildCount();
		System.out.println("count = " + count);
		
		UiSelector  selchild = new UiSelector().className("android.widget.TextView").packageName("com.cyanogenmod.trebuchet").index(4);
		UiObject  objchild = obj.getChild(selchild);
		objchild.clickAndWaitForNewWindow();
	}

}
