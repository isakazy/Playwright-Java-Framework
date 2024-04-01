package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.SauceDemoLogin;
import utilities.Config;
import utilities.FrameworkConfig;
import utilities.FrameworkInitialize;

public class TestOne {


    @Before
    public void setUp(){
        FrameworkConfig.LocalPage = new FrameworkInitialize().initializePlaywright();
    }

    @After
    public void cleanUp(){
        FrameworkConfig.LocalPage.close();
    }

    @Test
    public void navigate(){
        FrameworkConfig.LocalPage.navigate("https://saucedemo.com");
        String expectedUrl = "https://www.saucedemo.com/";
        Assert.assertEquals(expectedUrl, FrameworkConfig.LocalPage.url());
    }

    @Test
    public void login() {
        SauceDemoLogin sauceDemoLogin = new SauceDemoLogin();
        FrameworkConfig.LocalPage.navigate("https://saucedemo.com");
        String expectedUrl = "https://www.saucedemo.com/";
        Assert.assertEquals(expectedUrl, FrameworkConfig.LocalPage.url());
        sauceDemoLogin.login("standard_user", "secret_sauce");
        String newUrl = "https://www.saucedemo.com/inventory.html";
        Assert.assertEquals(newUrl, FrameworkConfig.LocalPage.url());

    }


    @Test
    public void propertiesTest(){
        FrameworkConfig.LocalPage.navigate(Config.getValue("sauceDemo"));
        String url = FrameworkConfig.LocalPage.url();
        System.out.println(url);

    }

    @Test
    public void logInPropertiesTest(){
        FrameworkConfig.LocalPage.navigate(Config.getValue("sauceDemo"));
        SauceDemoLogin sauceDemoLogin = new SauceDemoLogin();
        sauceDemoLogin.login(Config.getValue("sauceDemoUsername"), Config.getValue("sauceDemoPassword"));
    }


}
