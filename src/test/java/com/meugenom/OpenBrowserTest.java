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
	public String url = "https://demoqa.com/automation-practice-form";

    private WebDriver driver;

    @BeforeEach
	public void setup() {
        driver = new ChromeDriver();
    }

	@AfterEach
    public void teardown() {
        driver.quit();
    }

	@Test
	@Severity(SeverityLevel.NORMAL)
    @Description("Test Case Declaration : Checking the title of the loaded page.")
	@Story("Story Name : Open page")
	@Feature("Feature : Doing website search")
	@Link("https://demoqa.com")
	public void testOpenBrowser() throws InterruptedException {
        
		getUrl();
		logger.info("The title of {} is {}", url, getTitle());

        // Verify
        assertThat(getTitle()).isEqualTo("ToolsQA");
    }

	@Step("get url")
	public void getUrl(){
		driver.get(url);
	}

	@Step("get Title")
	public String getTitle(){
		return driver.getTitle();
	}

}
