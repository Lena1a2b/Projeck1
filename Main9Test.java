import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class Main9Test {
    @Test
    //Проверка кликабельности кнопки "Все курсы"
    void main() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\IdeaProjects\\Project1\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver( );
        driver.get("https://skillfactory.ru");
        WebElement menu = driver.findElement(By.xpath("/html/body/div[2]/div[6]/div/div/div[9]/div/a"));
        menu.click( );
        Thread.sleep(14500);
        driver.quit( );

    }
}
