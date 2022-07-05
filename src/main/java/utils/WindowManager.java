package utils;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class WindowManager {
    private WebDriver driver;
    private WebDriver.Navigation navigate;



    public WindowManager(WebDriver driver){
        this.driver = driver;
                this.navigate = driver.navigate();
    }

    public void goBack(){
        navigate.back();
    }
    public void goFoward () {
        navigate.forward();
    }

    public void refreshPage(){
        navigate.refresh();

    }

    public void goToPage(String url){
        navigate.to(url);
    }

    public void switchToTab (String tabTitle){
        var windows = driver.getWindowHandles();
        System.out.println("number of tabs " + windows.size());
        System.out.println("Window Handles: ");
        windows.forEach(System.out::println);

        for (String window : windows){
            System.out.println("Switching to window" + window);
            driver.switchTo().window(window);
            System.out.println("Current window title " +  driver.getTitle());
            if (tabTitle.equals(driver.getTitle())){
                break;
            }

        }

    }

    /**
     *
     * @param tabNumber is 1 based. 1 is current window.
     */
    public void switchToTabNumber (int tabNumber){
        var windows = driver.getWindowHandles();
        int index =1;

        for (String window : windows){

            driver.switchTo().window(window);

            if (index == tabNumber){
                break;
            }
            index++;

        }




    }

}
