import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class Main17Test {
    @Test
        //Проверка кликабельности ссылки "Посмотреть все направления"
    void main() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\IdeaProjects\\Project1\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver( );
        driver.get("https://skillfactory.ru");
        WebElement menu = driver.findElement(By.xpath("/html/body/div[2]/div[8]/div/div/div[32]/h2/a/u"));
        menu.click( );
        Thread.sleep(9500);
        driver.quit( );

    }
}

