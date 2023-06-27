import org.openqa.selenium.chrome.ChromeDriver;

public class Launch2 {
public static void main(String[] args) {
	ChromeDriver cd=new ChromeDriver();
	cd.manage().window().maximize();
	cd.get("https://www.Google.com/");
	String title=cd.getTitle();
	String expected="Google";
	if(title.equals(expected)) {
		System.out.println("you are right way");
	}
	else {
		System.out.println("you are wrong");
	}
	cd.close();
	}
}

