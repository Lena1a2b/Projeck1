import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class Main16Test {
    @Test
        //Проверка кликабельности ссылки "Маркетинг" в меню " Онлайн-курсы"
    void main() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\IdeaProjects\\Project1\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver( );
        driver.get("https://skillfactory.ru");
        WebElement menu = driver.findElement(By.xpath("/html/body/div[2]/div[6]/div/div/div[45]/a"));
        menu.click( );
        Thread.sleep(9500);
        WebElement menu1 = driver.findElement(By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[3]/ul/li[14]/div/a/span"));
        menu1.click( );
        Thread.sleep(9500);
        driver.quit( );

    }
}
