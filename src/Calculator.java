package src;

import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Calculator {
    public static void main(String[] args) {
        DesiredCapabilities dc =new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.AUTOMATE_NAME,"Appium");
        dc.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator 5554");
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"12.0");
        dc.setCapability("appPackage","com.google.android.calculator");
        dc.setCapability("appActivity","com.android.calculator2.Calculator");
        URL url=new URL("http://0.0.0.0:4723/wd/hub");
        AndroidDriver<webElement> driver=new AndroidDriver<webElement>(url,dc);
       Thread.sleep(5000);

       Webelement seven=driver.findElementById("com.google.android.calculator:id/digit_7");
       seven.click();
       driver.findElementById("com.google.android.calculator:id/op_mul").click();
       Webelement five = driver.findElementById("com.google.android.calculator:id/digit_5");
      five.click();
       driver.findElementById("com.google.android.calculator:id/eq").click();
      Thread.sleep(2000);
       Webelement result =driver.findElementById("com.google.android.calculator:id/result_final");
     System.out.println(result);

    }

