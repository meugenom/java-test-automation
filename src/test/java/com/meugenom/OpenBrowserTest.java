package com.meugenom;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.assertj.core.api.Assertions.assertThat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.qameta.allure.Step;

@Epic("Allure examples")
@Feature("Junit 5 support")
public class OpenBrowserTest {
	
	final Logger logger = LoggerFactory.getLogger(OpenBrowserTest.class);

    private WebDriver driver;

    @BeforeEach
	@Description("Initiate New Chrome Driver")
	@Feature("Feature - New Chrome Driver")
	public void setup() {
        driver = new ChromeDriver();
    }

	@AfterEach
	@Description("Quit Chrome Driver")
	@Feature("Feature - Quit Chrome Driver")
    public void teardown() {
        driver.quit();
    }

	@Test
    @Description("Checking the title of the loaded page.")
	@Feature("Feature - Daoing website search")
	@Link("https://demoqa.com")
	@Severity(SeverityLevel.NORMAL)
	@Story("Base support for bdd annotations")
    @Story("Advanced support for bdd annotations")
	@Step("Step - Launch Browser")
	public void testOpenBrowser() throws InterruptedException {

		// Exercise
        String sutUrl = "https://demoqa.com/automation-practice-form";
        driver.get(sutUrl);
        String title = driver.getTitle();
        logger.info("The title of {} is {}", sutUrl, title);
        System.out.println("Page Loaded");

        // Verify
        assertThat(title).isEqualTo("ToolsQA");
		driver.quit();
    }

}
