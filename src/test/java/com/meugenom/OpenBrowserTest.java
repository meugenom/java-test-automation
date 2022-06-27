package com.meugenom;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.assertj.core.api.Assertions.assertThat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class OpenBrowserTest {
	
	final Logger logger = LoggerFactory.getLogger(OpenBrowserTest.class);

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
	@DisplayName("Open Browser Test")
	public void testOpenBrowser() throws InterruptedException {

    
		// Exercise
        String sutUrl = "https://demoqa.com/automation-practice-form";
        driver.get(sutUrl);
        String title = driver.getTitle();
        logger.info("The title of {} is {}", sutUrl, title);

        // Verify
        assertThat(title).isEqualTo("ToolsQA");
		driver.quit();
    }

}
