import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.Keys.ENTER;

class Main13Test {
    @Test
        //Проверка ввода имени,почты и телефона для получения консультации
        //Позитивный тест
    void main() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\IdeaProjects\\Project1\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver( );
        driver.get("https://skillfactory.ru");
        WebElement menu = driver.findElement(By.xpath("/html/body/div[2]/div[9]/div/div/div[5]/div[1]/form/div[2]/div[1]/div/input"));
        menu.sendKeys("Елена", ENTER);
        Thread.sleep(14500);
        WebElement menu1 = driver.findElement(By.xpath("/html/body/div[2]/div[9]/div/div/div[5]/div[1]/form/div[2]/div[2]/div/input"));
        menu1.sendKeys("lenleb@rambler.ru", ENTER);
        Thread.sleep(14500);
        WebElement menu2 = driver.findElement(By.xpath("/html/body/div[2]/div[9]/div/div/div[5]/div[1]/form/div[2]/div[3]/div/div[1]/input[1]"));
        menu2.sendKeys("9119199152", ENTER);
        Thread.sleep(14500);
        driver.quit( );

    }
}
