package com.clusters.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Handlemouseoperation {
public static void mousehover(WebDriver driver, WebElement element)
{
	Actions act=new Actions(driver);
	act.moveToElement(element).perform();
}
public static void rightclick(WebDriver driver, WebElement element)
{
	Actions act=new Actions(driver);
	act.contextClick(element).sendKeys("w").build().perform();
}
public static void doubleclick(WebDriver driver, WebElement element)
{
	Actions act=new Actions(driver);
	act.doubleClick(element).perform();
}
public static void dragAndDrop(WebDriver driver,WebElement src, WebElement target)
{
	Actions act=new Actions(driver);
	act.dragAndDrop(src, target).perform();
}
 
}
