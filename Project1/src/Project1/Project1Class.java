package Project1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver.*;
//import org.openqa.selenium.firefox.*;
import org.openqa.selenium.chrome.*;
//import org.openqa.selenium.chrome.*;
//import java.text.DateFormat;  
//import java.text.ParseException;  
//import java.text.SimpleDateFormat;  
//import java.util.Date;  

public class Project1Class {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException
	{
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.firefox.marionette","D:\\Program Files\\firefox-sdk\\bin\\geckodriver.exe");
		/*System.setProperty("webdriver.gecko.driver","D:\\Program Files\\firefox-sdk\\bin\\geckodriver.exe");//此行可有可无
		System.setProperty("webdriver.firefox.bin", "D:\\Program Files\\firefox-sdk\\bin\\firefox.exe");
     	WebDriver driver = new FirefoxDriver(); */
		 //driver.get("https://www.baidu.com"); 
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
      	Navigation navigation = driver.navigate();
     	navigation.to("http://www.pceggs.com/nologin.aspx");
     	WebElement usernameTextBox = driver.findElement(By.id("txt_UserName"));
     	usernameTextBox.sendKeys("eagledream");
     	WebElement passwordTextBox = driver.findElement(By.id("txt_PWD"));
     	passwordTextBox.sendKeys("276797");//输入用户名密码
     	try
     	{
     		Thread.sleep(7000);
     	}
     	catch(InterruptedException e)
     	{
     		e.printStackTrace();
     	}//等待7秒，手工输入验证码
     	WebElement Login = driver.findElement(By.id("Login_Submit"));
     	Login.click();//登录
    	try
     	{
     		Thread.sleep(1000);
     	}
     	catch(InterruptedException e)
     	{
     		e.printStackTrace();
     	}
     	navigation.to("http://www.pceggs.com/play/pxya.aspx");//转到游戏大厅
     	//final double TIMES = 1.4 ;
    	while(1>0)
    	{
    		
    		
    		/*WebElement time8 = driver.findElement(By.xpath(".//*[@id='RemainS']/strong[1]"));
         	String t8= time8.getText() ;//取出剩余时间
         	float tt = Float.parseFloat(t8); //转换成数字
    		if(tt>300)
    		{
    			try
         	{
         		Thread.sleep(32700000);
         	}
         	catch(InterruptedException e)
         	{
         		e.printStackTrace();
         	}
    		}*/
    		
     	try
     	{
     		Thread.sleep(2000);
     	}
     	catch(InterruptedException e)
     	{
     		e.printStackTrace();
     	}
     	
     	//判断是否能进行投注
     	Project1Class a = new Project1Class();//实例化这个类，调用最下边的检查元素函数
     	if(a.doesWebElementExist(driver, By.xpath(".//*[@id='RemainS']/strong[2]"))==false)
     	{
     		System.out.println("进入系统时开奖中，暂不投注");
     		try
         	{
         		Thread.sleep(170000);
         	}
         	catch(InterruptedException e)
         	{
         		e.printStackTrace();
         	}	     		
     		navigation.refresh();
     	}
     	int num2=(int)(Math.random()*12);
     	System.out.println("本期是否投注随机数为：");
     	System.out.println(num2);
     	switch (num2) 
     	{
     	case 0 :
     		break;
     	case 1 :
     		break;
     	case 2 :
     		break;
     	case 3 :
     		break;
     	case 4 :
     		break;
     	case 5 :
     		break;
     	case 6 :
     		break;
     	case 7 :
     		break;
     	case 8 :
     		break;
     	case 9 :
     		break;
     	case 10 :
     		System.out.println("本期投注随机数为10，本期不投注");
     		try
         	{
         		Thread.sleep(300000);
         	}
         	catch(InterruptedException e)
         	{
         		e.printStackTrace();
         	}
     		navigation.refresh();
     		break;
     	case 11 :
     		System.out.println("本期投注随机数为11，连续2本期不投注");
     		try
         	{
         		Thread.sleep(600000);
         	}
         	catch(InterruptedException e)
         	{
         		e.printStackTrace();
         	}
     		
     		break;	
     	}
     	navigation.refresh();	
    	WebElement touzhu = driver.findElement(By.xpath("//*[@id=\"panel\"]/tbody/tr[7]/td[8]/a"));
    	int num6=(int)(Math.random()*3000);
    	try
     	{
     		Thread.sleep(num6);
     	}
     	catch(InterruptedException e)
     	{
     		e.printStackTrace();
     	}
    	
    	touzhu.click();//点击投注
     	try
     	{
     		Thread.sleep(2000);
     	}
     	catch(InterruptedException e)
     	{
     		e.printStackTrace();
     	}
     	
     	WebElement time = driver.findElement(By.xpath(".//*[@id='RemainTitle']/span/span[2]"));
     	String t= time.getText() ;//取出剩余时间
     	long time2 = Long.parseLong(t); //转换成数字
     	System.out.println("剩余投注时间：");
     	System.out.println(time2);
     	WebElement shuaxin = driver.findElement(By.xpath(".//*[@id='form1']/div[8]/div[2]/div[4]/div[4]/div[3]/div[1]"));     	
     	int num1=(int)(Math.random()*18);
     	System.out.println("时间随机数为：");
     	System.out.println(num1);
     	switch (num1) 
     	{
     	case 0 :
     		while(time2>30)
         	{
     			if(time2>30)
         	 	{
         	 		System.out.println("剩余投注时间大于30秒");
         	 		try
                 	{
                 		Thread.sleep(18000);
                 	}
                 	catch(InterruptedException e)
                 	{
                 		e.printStackTrace();
                 	}
             	 	navigation.refresh();	
             	 	try
                 	{
                 		Thread.sleep(2000);
                 	}
                 	catch(InterruptedException e)
                 	{
                 		e.printStackTrace();
                 	}
             	 	time = driver.findElement(By.xpath(".//*[@id='RemainTitle']/span/span[2]"));
             		t= time.getText() ;//取出剩余时间
                 	time2 = Long.parseLong(t); //转换成数字
                 	System.out.println(time2);
         	 	}
         	}
     		try
         	{
         		Thread.sleep(time2*1000-4000);
         	}
         	catch(InterruptedException e)
         	{
         		e.printStackTrace();
         	}
     		break;    

     	case 1 :
     		while(time2>40)
         	{
     			if(time2>40)
         	 	{
         	 		System.out.println("剩余投注时间大于30秒");
         	 		try
                 	{
                 		Thread.sleep(28000);
                 	}
                 	catch(InterruptedException e)
                 	{
                 		e.printStackTrace();
                 	}
             	 	navigation.refresh();	
             	 	try
                 	{
                 		Thread.sleep(2000);
                 	}
                 	catch(InterruptedException e)
                 	{
                 		e.printStackTrace();
                 	}
             	 	time = driver.findElement(By.xpath(".//*[@id='RemainTitle']/span/span[2]"));
             		t= time.getText() ;//取出剩余时间
                 	time2 = Long.parseLong(t); //转换成数字
                 	System.out.println(time2);
         	 	}
         	}
     		try
         	{
         		Thread.sleep(time2*1000-4000);
         	}
         	catch(InterruptedException e)
         	{
         		e.printStackTrace();
         	}
     		break;
     	case 2 :
     		while(time2>25)
         	{
     			if(time2>25)
         	 	{
         	 		System.out.println("大于30秒");
         	 		try
                 	{
                 		Thread.sleep(12000);
                 	}
                 	catch(InterruptedException e)
                 	{
                 		e.printStackTrace();
                 	}
             	 	navigation.refresh();	
             	 	try
                 	{
                 		Thread.sleep(2000);
                 	}
                 	catch(InterruptedException e)
                 	{
                 		e.printStackTrace();
                 	}
             	 	time = driver.findElement(By.xpath(".//*[@id='RemainTitle']/span/span[2]"));
             		t= time.getText() ;//取出剩余时间
                 	time2 = Long.parseLong(t); //转换成数字
                 	System.out.println(time2);
         	 	}
         	}
     		try
         	{
         		Thread.sleep(time2*1000-4000);
         	}
         	catch(InterruptedException e)
         	{
         		e.printStackTrace();
         	}
     		break;    
     	case 3 :
     		while(time2>30)
         	{
     			if(time2>30)
         	 	{
         	 		System.out.println("大于30秒");
         	 		try
                 	{
                 		Thread.sleep(18000);
                 	}
                 	catch(InterruptedException e)
                 	{
                 		e.printStackTrace();
                 	}
             	 	navigation.refresh();	
             	 	try
                 	{
                 		Thread.sleep(2000);
                 	}
                 	catch(InterruptedException e)
                 	{
                 		e.printStackTrace();
                 	}
             	 	time = driver.findElement(By.xpath(".//*[@id='RemainTitle']/span/span[2]"));
             		t= time.getText() ;//取出剩余时间
                 	time2 = Long.parseLong(t); //转换成数字
                 	System.out.println(time2);
         	 	}
         	}
     		try
         	{
         		Thread.sleep(time2*1000-4000);
         	}
         	catch(InterruptedException e)
         	{
         		e.printStackTrace();
         	}
     		break;
     		case 4 :
     			while(time2>30)
             	{
         			if(time2>30)
             	 	{
             	 		System.out.println("大于30秒");
             	 		try
                     	{
                     		Thread.sleep(18000);
                     	}
                     	catch(InterruptedException e)
                     	{
                     		e.printStackTrace();
                     	}
                 	 	navigation.refresh();	
                 	 	try
                     	{
                     		Thread.sleep(2000);
                     	}
                     	catch(InterruptedException e)
                     	{
                     		e.printStackTrace();
                     	}
                 	 	time = driver.findElement(By.xpath(".//*[@id='RemainTitle']/span/span[2]"));
                 		t= time.getText() ;//取出剩余时间
                     	time2 = Long.parseLong(t); //转换成数字
                     	System.out.println(time2);
             	 	}
             	}
         		try
             	{
             		Thread.sleep(time2*1000-4000);
             	}
             	catch(InterruptedException e)
             	{
             		e.printStackTrace();
             	}
         		break;
     		case 5 :
     			while(time2>30)
             	{
         			if(time2>30)
             	 	{
             	 		System.out.println("大于30秒");
             	 		try
                     	{
                     		Thread.sleep(18000);
                     	}
                     	catch(InterruptedException e)
                     	{
                     		e.printStackTrace();
                     	}
                 	 	navigation.refresh();	
                 	 	try
                     	{
                     		Thread.sleep(2000);
                     	}
                     	catch(InterruptedException e)
                     	{
                     		e.printStackTrace();
                     	}
                 	 	time = driver.findElement(By.xpath(".//*[@id='RemainTitle']/span/span[2]"));
                 		t= time.getText() ;//取出剩余时间
                     	time2 = Long.parseLong(t); //转换成数字
                     	System.out.println(time2);
             	 	}
             	}
         		try
             	{
             		Thread.sleep(time2*1000-5000);
             	}
             	catch(InterruptedException e)
             	{
             		e.printStackTrace();
             	}
         		break;
     		case 6 :
     			while(time2>30)
             	{
         			if(time2>30)
             	 	{
             	 		System.out.println("大于30秒");
             	 		try
                     	{
                     		Thread.sleep(18000);
                     	}
                     	catch(InterruptedException e)
                     	{
                     		e.printStackTrace();
                     	}
                 	 	navigation.refresh();	
                 	 	try
                     	{
                     		Thread.sleep(2000);
                     	}
                     	catch(InterruptedException e)
                     	{
                     		e.printStackTrace();
                     	}
                 	 	time = driver.findElement(By.xpath(".//*[@id='RemainTitle']/span/span[2]"));
                 		t= time.getText() ;//取出剩余时间
                     	time2 = Long.parseLong(t); //转换成数字
                     	System.out.println(time2);
             	 	}
             	}
         		try
             	{
             		Thread.sleep(time2*1000-6000);
             	}
             	catch(InterruptedException e)
             	{
             		e.printStackTrace();
             	}
         		break;	
     		case 7 :
     			while(time2>30)
             	{
         			if(time2>30)
             	 	{
             	 		System.out.println("大于30秒");
             	 		try
                     	{
                     		Thread.sleep(18000);
                     	}
                     	catch(InterruptedException e)
                     	{
                     		e.printStackTrace();
                     	}
                 	 	navigation.refresh();	
                 	 	try
                     	{
                     		Thread.sleep(2000);
                     	}
                     	catch(InterruptedException e)
                     	{
                     		e.printStackTrace();
                     	}
                 	 	time = driver.findElement(By.xpath(".//*[@id='RemainTitle']/span/span[2]"));
                 		t= time.getText() ;//取出剩余时间
                     	time2 = Long.parseLong(t); //转换成数字
                     	System.out.println(time2);
             	 	}
             	}
         		try
             	{
             		Thread.sleep(time2*1000-7000);
             	}
             	catch(InterruptedException e)
             	{
             		e.printStackTrace();
             	}
         		break;
     		case 8 :
         		while(time2>30)
             	{
         			if(time2>30)
             	 	{
             	 		System.out.println("剩余投注时间大于30秒");
             	 		try
                     	{
                     		Thread.sleep(18000);
                     	}
                     	catch(InterruptedException e)
                     	{
                     		e.printStackTrace();
                     	}
                 	 	navigation.refresh();	
                 	 	try
                     	{
                     		Thread.sleep(2000);
                     	}
                     	catch(InterruptedException e)
                     	{
                     		e.printStackTrace();
                     	}
                 	 	time = driver.findElement(By.xpath(".//*[@id='RemainTitle']/span/span[2]"));
                 		t= time.getText() ;//取出剩余时间
                     	time2 = Long.parseLong(t); //转换成数字
                     	System.out.println(time2);
             	 	}
             	}
         		try
             	{
             		Thread.sleep(time2*1000-4000);
             	}
             	catch(InterruptedException e)
             	{
             		e.printStackTrace();
             	}
         		break;    

         	case 9 :
         		while(time2>40)
             	{
         			if(time2>40)
             	 	{
             	 		System.out.println("剩余投注时间大于30秒");
             	 		try
                     	{
                     		Thread.sleep(28000);
                     	}
                     	catch(InterruptedException e)
                     	{
                     		e.printStackTrace();
                     	}
                 	 	navigation.refresh();	
                 	 	try
                     	{
                     		Thread.sleep(2000);
                     	}
                     	catch(InterruptedException e)
                     	{
                     		e.printStackTrace();
                     	}
                 	 	time = driver.findElement(By.xpath(".//*[@id='RemainTitle']/span/span[2]"));
                 		t= time.getText() ;//取出剩余时间
                     	time2 = Long.parseLong(t); //转换成数字
                     	System.out.println(time2);
             	 	}
             	}
         		try
             	{
             		Thread.sleep(time2*1000-4000);
             	}
             	catch(InterruptedException e)
             	{
             		e.printStackTrace();
             	}
         		break;
         	case 10 :
         		while(time2>25)
             	{
         			if(time2>25)
             	 	{
             	 		System.out.println("大于30秒");
             	 		try
                     	{
                     		Thread.sleep(12000);
                     	}
                     	catch(InterruptedException e)
                     	{
                     		e.printStackTrace();
                     	}
                 	 	navigation.refresh();	
                 	 	try
                     	{
                     		Thread.sleep(2000);
                     	}
                     	catch(InterruptedException e)
                     	{
                     		e.printStackTrace();
                     	}
                 	 	time = driver.findElement(By.xpath(".//*[@id='RemainTitle']/span/span[2]"));
                 		t= time.getText() ;//取出剩余时间
                     	time2 = Long.parseLong(t); //转换成数字
                     	System.out.println(time2);
             	 	}
             	}
         		try
             	{
             		Thread.sleep(time2*1000-4000);
             	}
             	catch(InterruptedException e)
             	{
             		e.printStackTrace();
             	}
         		break;    
         	case 11 :
         		while(time2>30)
             	{
         			if(time2>30)
             	 	{
             	 		System.out.println("大于30秒");
             	 		try
                     	{
                     		Thread.sleep(18000);
                     	}
                     	catch(InterruptedException e)
                     	{
                     		e.printStackTrace();
                     	}
                 	 	navigation.refresh();	
                 	 	try
                     	{
                     		Thread.sleep(2000);
                     	}
                     	catch(InterruptedException e)
                     	{
                     		e.printStackTrace();
                     	}
                 	 	time = driver.findElement(By.xpath(".//*[@id='RemainTitle']/span/span[2]"));
                 		t= time.getText() ;//取出剩余时间
                     	time2 = Long.parseLong(t); //转换成数字
                     	System.out.println(time2);
             	 	}
             	}
         		try
             	{
             		Thread.sleep(time2*1000-4000);
             	}
             	catch(InterruptedException e)
             	{
             		e.printStackTrace();
             	}
         		break;
         		case 12 :
         			while(time2>30)
                 	{
             			if(time2>30)
                 	 	{
                 	 		System.out.println("大于30秒");
                 	 		try
                         	{
                         		Thread.sleep(18000);
                         	}
                         	catch(InterruptedException e)
                         	{
                         		e.printStackTrace();
                         	}
                     	 	navigation.refresh();	
                     	 	try
                         	{
                         		Thread.sleep(2000);
                         	}
                         	catch(InterruptedException e)
                         	{
                         		e.printStackTrace();
                         	}
                     	 	time = driver.findElement(By.xpath(".//*[@id='RemainTitle']/span/span[2]"));
                     		t= time.getText() ;//取出剩余时间
                         	time2 = Long.parseLong(t); //转换成数字
                         	System.out.println(time2);
                 	 	}
                 	}
             		try
                 	{
                 		Thread.sleep(time2*1000-4000);
                 	}
                 	catch(InterruptedException e)
                 	{
                 		e.printStackTrace();
                 	}
             		break;
         		case 13 :
         			while(time2>30)
                 	{
             			if(time2>30)
                 	 	{
                 	 		System.out.println("大于30秒");
                 	 		try
                         	{
                         		Thread.sleep(18000);
                         	}
                         	catch(InterruptedException e)
                         	{
                         		e.printStackTrace();
                         	}
                     	 	navigation.refresh();	
                     	 	try
                         	{
                         		Thread.sleep(2000);
                         	}
                         	catch(InterruptedException e)
                         	{
                         		e.printStackTrace();
                         	}
                     	 	time = driver.findElement(By.xpath(".//*[@id='RemainTitle']/span/span[2]"));
                     		t= time.getText() ;//取出剩余时间
                         	time2 = Long.parseLong(t); //转换成数字
                         	System.out.println(time2);
                 	 	}
                 	}
             		try
                 	{
                 		Thread.sleep(time2*1000-5000);
                 	}
                 	catch(InterruptedException e)
                 	{
                 		e.printStackTrace();
                 	}
             		break;
         		case 14 :
         			while(time2>30)
                 	{
             			if(time2>30)
                 	 	{
                 	 		System.out.println("大于30秒");
                 	 		try
                         	{
                         		Thread.sleep(18000);
                         	}
                         	catch(InterruptedException e)
                         	{
                         		e.printStackTrace();
                         	}
                     	 	navigation.refresh();	
                     	 	try
                         	{
                         		Thread.sleep(2000);
                         	}
                         	catch(InterruptedException e)
                         	{
                         		e.printStackTrace();
                         	}
                     	 	time = driver.findElement(By.xpath(".//*[@id='RemainTitle']/span/span[2]"));
                     		t= time.getText() ;//取出剩余时间
                         	time2 = Long.parseLong(t); //转换成数字
                         	System.out.println(time2);
                 	 	}
                 	}
             		try
                 	{
                 		Thread.sleep(time2*1000-6000);
                 	}
                 	catch(InterruptedException e)
                 	{
                 		e.printStackTrace();
                 	}
             		break;	
         		case 15 :
         			while(time2>30)
                 	{
             			if(time2>30)
                 	 	{
                 	 		System.out.println("大于30秒");
                 	 		try
                         	{
                         		Thread.sleep(18000);
                         	}
                         	catch(InterruptedException e)
                         	{
                         		e.printStackTrace();
                         	}
                     	 	navigation.refresh();	
                     	 	try
                         	{
                         		Thread.sleep(2000);
                         	}
                         	catch(InterruptedException e)
                         	{
                         		e.printStackTrace();
                         	}
                     	 	time = driver.findElement(By.xpath(".//*[@id='RemainTitle']/span/span[2]"));
                     		t= time.getText() ;//取出剩余时间
                         	time2 = Long.parseLong(t); //转换成数字
                         	System.out.println(time2);
                 	 	}
                 	}
             		try
                 	{
                 		Thread.sleep(time2*1000-7000);
                 	}
                 	catch(InterruptedException e)
                 	{
                 		e.printStackTrace();
                 	}
             		break;
     		case 16 :
     			while(time2>40)
             	{
         			if(time2>40)
             	 	{
             	 		System.out.println("大于40秒");
             	 		try
                     	{
                     		Thread.sleep(15000);
                     	}
                     	catch(InterruptedException e)
                     	{
                     		e.printStackTrace();
                     	}
                 	 	navigation.refresh();	
                 	 	try
                     	{
                     		Thread.sleep(8000);
                     	}
                     	catch(InterruptedException e)
                     	{
                     		e.printStackTrace();
                     	}
                 	 	time = driver.findElement(By.xpath(".//*[@id='RemainTitle']/span/span[2]"));
                 		t= time.getText() ;//取出剩余时间
                     	time2 = Long.parseLong(t); //转换成数字
                     	System.out.println(time2);
             	 	}
             	}
     			try
             	{
             		Thread.sleep(8000);
             	}
             	catch(InterruptedException e)
             	{
             		e.printStackTrace();
             	}
         		break;
     		default:
     			System.out.println("时间随机数等于9，10秒钟后直接投注");
     			try
             	{
             		Thread.sleep(10000);
             	}
             	catch(InterruptedException e)
             	{
             		e.printStackTrace();
             	}
         		break;	  	
     	}
     	
     		/*time = driver.findElement(By.xpath(".//*[@id='RemainTitle']/span/span[2]"));
     		t= time.getText() ;//取出剩余时间
         	System.out.println(t);
         	time2 = Float.parseFloat(t); //转换成数字
         	System.out.println(time2);*/
     	int num=(int)(Math.random()*11);
     	System.out.println("投注方法随机数为：");     	
     	System.out.println(num);
     	//int n = 1;
				switch (num)
				{
				case 0:
				{
					WebElement moshi1 = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[8]/div[2]/div[4]/div[2]/div/div[2]/a[2]"));
			 		moshi1.click();//点击投注模式
			 		
					shuaxin = driver.findElement(By.xpath(".//*[@id='form1']/div[8]/div[2]/div[4]/div[4]/div[3]/div[1]"));
			 		shuaxin.click();//点击刷新
			     	//System.out.println("shuaxin");
			     	try
			     	{
			     		Thread.sleep(50);
			     	}
			     	catch(InterruptedException e)
			     	{
			     		e.printStackTrace();
			     	}
			 		
			     	/*WebElement peilv0  = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[2]/td[3]"));
			     	String p0= peilv0.getText() ;//取出0的赔率
			     	////System.out.println(p0);
			     	float i0 = Float.parseFloat(p0); //转换成数字
			     	//System.out.println(i0);
			     	
			     	if(i0<1010)
			     	{
			     		WebElement checkbox0 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[2]/td[4]/input"));
			     		checkbox0.click();
			     		
			     	}//判断0的赔率并下注*/
			     
			     	WebElement peilv1 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[3]/td[3]"));
			     	String p1= peilv1.getText() ;//取出1的赔率
			     	////System.out.println(p1);
			     	float i1 = Float.parseFloat(p1); //转换成数字
			     	////System.out.println(i1);
			     	
			     	if(i1<336.66)
			     	{
			     		
			     		WebElement checkbox1 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[3]/td[4]/input"));
			     		checkbox1.click();
			     	}//判断1的赔率并下注

			     	WebElement peilv2 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[4]/td[3]"));
			     	String p2= peilv2.getText() ;//取出2的赔率
			     	////System.out.println(p2);
			     	float i2 = Float.parseFloat(p2); //转换成数字
			     	////System.out.println(i2);
			     	//WebElement textbox2 = driver.findElement(By.xpath(".//*[@id='txt2']"));
			     	if(i2<168.33)
			     	{
			     		
			     		WebElement checkbox2 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[4]/td[4]/input"));
			     		checkbox2.click();
			         }
			     	//判断2的赔率并下注
			     	WebElement peilv3 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[5]/td[3]"));
			     	String p3= peilv3.getText() ;//取出13的赔率
			     	////System.out.println(p3);
			     	float i3 = Float.parseFloat(p3); //转换成数字
			     	////System.out.println(i3);
			     	//WebElement textbox3 = driver.findElement(By.xpath(".//*[@id='txt3']"));
			     	if(i3<101)
			     	{
			     		WebElement checkbox3 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[5]/td[4]/input"));
			     		checkbox3.click();
			     	}//判断0的赔率并下注
			     	WebElement peilv4 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[6]/td[3]"));
			     	String p4= peilv4.getText() ;//取出13的赔率
			     	////System.out.println(p4);
			     	float i4 = Float.parseFloat(p4); //转换成数字
			     	////System.out.println(i4);
			     	//WebElement textbox4 = driver.findElement(By.xpath(".//*[@id='txt4']"));
			     	if(i4<67.33)
			     	{
			     		WebElement checkbox4 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[6]/td[4]/input"));
			     		checkbox4.click();
			     	}//判断4的赔率并下注
			     	WebElement peilv5 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[7]/td[3]"));
			     	String p5= peilv5.getText() ;//取出13的赔率
			     	//System.out.println(p5);
			     	float i5 = Float.parseFloat(p5); //转换成数字
			     	////System.out.println(i5);
			     	//WebElement textbox5 = driver.findElement(By.xpath(".//*[@id='txt5']"));
			     	
			     	if(i5<48.1)
			     	{
			     		WebElement checkbox5 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[7]/td[4]/input"));
			     		checkbox5.click();
			     	}//判断5的赔率并下注
			     	WebElement peilv6 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[8]/td[3]"));
			     	String p6= peilv6.getText() ;//取出13的赔率
			     	//System.out.println(p6);
			     	float i6 = Float.parseFloat(p6); //转换成数字
			     	//System.out.println(i6);
			     	//WebElement textbox6 = driver.findElement(By.xpath(".//*[@id='txt6']"));
			     	if(i6<36.07)
			     	{
			     		WebElement checkbox6 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[8]/td[4]/input"));
			     		checkbox6.click();
			     	}//判断6的赔率并下注

			     	WebElement peilv7 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[9]/td[3]"));
			     	String p7= peilv7.getText() ;//取出13的赔率
			     	//System.out.println(p7);
			     	float i7 = Float.parseFloat(p7); //转换成数字
			     	//System.out.println(i7);
			     	//WebElement textbox7 = driver.findElement(By.xpath(".//*[@id='txt7']"));
			     	if(i7<28.05)
			     	{
			     		WebElement checkbox7 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[9]/td[4]/input"));
			     		checkbox7.click();
			     	}//判断7的赔率并下注
			     	shuaxin.click();//点击刷新

			     	
			     	//System.out.println("shuaxin");
			     	try
			     	{
			     		Thread.sleep(50);
			     	}
			     	catch(InterruptedException e)
			     	{
			     		e.printStackTrace();
			     	}	
			     	WebElement peilv8 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[10]/td[3]"));
			     	String p8= peilv8.getText() ;//取出13的赔率
			     	//System.out.println(p8);
			     	float i8 = Float.parseFloat(p8); //转换成数字
			     	//System.out.println(i8);
			     	//WebElement textbox8 = driver.findElement(By.xpath(".//*[@id='txt8']"));
			     	if(i8<22.44)
			     	{
			     		WebElement checkbox8 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[10]/td[4]/input"));
			     		checkbox8.click();
			     	}//判断8的赔率并下注
			     	
			     	WebElement peilv9 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[11]/td[3]"));
			     	String p9= peilv9.getText() ;//取出13的赔率
			     	//System.out.println(p9);
			     	float i9 = Float.parseFloat(p9); //转换成数字
			     	//System.out.println(i9);
			     	//WebElement textbox9 = driver.findElement(By.xpath(".//*[@id='txt9']"));
			     	if(i9<18.36)
			     	{
			     		WebElement checkbox9 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[11]/td[4]/input"));
			     		checkbox9.click();
			     	}//判断9的赔率并下注
			     	
			     	WebElement peilv10 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[12]/td[3]"));
			     	String p10= peilv10.getText() ;//取出13的赔率
			     	//System.out.println(p10);
			     	float i10 = Float.parseFloat(p10); //转换成数字
			     	//System.out.println(i10);
			     	//WebElement textbox10 = driver.findElement(By.xpath(".//*[@id='txt10']"));
			     	if(i10<16.03)
			     	{
			     		WebElement checkbox10 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[12]/td[4]/input"));
			     		checkbox10.click();
			     	}//判断10的赔率并下注
			     	WebElement peilv11 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[13]/td[3]"));
			     	String p11= peilv11.getText() ;//取出13的赔率
			     	//System.out.println(p11);
			     	float i11 = Float.parseFloat(p11); //转换成数字
			     	//System.out.println(i11);
			     	//WebElement textbox11 = driver.findElement(By.xpath(".//*[@id='txt11']"));
			     	if(i11<14.63)
			     	{
			     		WebElement checkbox11 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[13]/td[4]/input"));
			     		checkbox11.click();
			     	}//判断11的赔率并下注
			     	WebElement peilv12 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[14]/td[3]"));
			     	String p12= peilv12.getText() ;//取出13的赔率
			     	//System.out.println(p12);
			     	float i12 = Float.parseFloat(p12); //转换成数字
			     	//System.out.println(i12);
			     	//WebElement textbox12 = driver.findElement(By.xpath(".//*[@id='txt12']"));
			     	if(i12<13.83)
			     	{
			     		WebElement checkbox12 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[14]/td[4]/input"));
			     		checkbox12.click();
			     	}//判断12的赔率并下注
			   
			 	
			     	/*WebElement peilv13 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[15]/td[3]"));
			     	String p13= peilv13.getText() ;//取出13的赔率
			     	//System.out.println(p13);
			     	float i13 = Float.parseFloat(p13); //转换成数字
			     	//System.out.println(i13);
			     	//WebElement textbox13 = driver.findElement(By.xpath(".//*[@id='txt13']"));
			     	if(i13<13.46)
			     	{
			     		WebElement checkbox13 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[15]/td[4]/input"));
			     		checkbox13.click();
			     	}//判断13赔率并下注 */
			     	
			     	shuaxin.click();//点击刷新
			     	//System.out.println("shuaxin");
			     	try
			     	{
			     		Thread.sleep(50);
			     	}
			     	catch(InterruptedException e)
			     	{
			     		e.printStackTrace();
			     	}	
			     	
			     	/*WebElement peilv27 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[2]/td[3]"));
			     	String p27= peilv27.getText() ;//取出27的赔率
			     	//System.out.println(p27);
			     	float i27 = Float.parseFloat(p27); //转换成数字
			     	//System.out.println(i27);
			     	//WebElement textbox27 = driver.findElement(By.xpath(".//*[@id='txt27']"));
			     	if(i27<1010)
			     	{
			     		WebElement checkbox27 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[2]/td[4]/input"));
			     		checkbox27.click();
			     	}//判断0的赔率并下注*/
			     	WebElement peilv26 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[3]/td[3]"));
			     	String p26= peilv26.getText() ;//取出26的赔率
			     	//System.out.println(p26);
			     	float i26 = Float.parseFloat(p26); //转换成数字
			     	//System.out.println(i26);
			     	//WebElement textbox26 = driver.findElement(By.xpath(".//*[@id='txt26']"));
			     	if(i26<336.66)
			     	{
			     		WebElement checkbox26 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[3]/td[4]/input"));
			     		checkbox26.click();
			     	}//判断1的赔率并下注

			     	WebElement peilv25 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[4]/td[3]"));
			     	String p25= peilv25.getText() ;//取出25的赔率
			     	//System.out.println(p25);
			     	float i25 = Float.parseFloat(p25); //转换成数字
			     	//System.out.println(i25);
			     	//WebElement textbox25 = driver.findElement(By.xpath(".//*[@id='txt25']"));
			     	if(i25<168.33)
			     	{
			     		WebElement checkbox25 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[4]/td[4]/input"));
			     		checkbox25.click();
			     	}//判断2的赔率并下注
			     	WebElement peilv24 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[5]/td[3]"));
			     	String p24= peilv24.getText() ;//取出24的赔率
			     	//System.out.println(p24);
			     	float i24 = Float.parseFloat(p24); //转换成数字
			     	//System.out.println(i24);
			     	//WebElement textbox24 = driver.findElement(By.xpath(".//*[@id='txt24']"));
			     	if(i24<101)
			     	{
			     		WebElement checkbox24 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[5]/td[4]/input"));
			     		checkbox24.click();
			     	}//判断0的赔率并下注
			     	WebElement peilv23 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[6]/td[3]"));
			     	String p23= peilv23.getText() ;//取出23的赔率
			     	//System.out.println(p23);
			     	float i23 = Float.parseFloat(p23); //转换成数字
			     	//System.out.println(i23);
			     	//WebElement textbox23 = driver.findElement(By.xpath(".//*[@id='txt23']"));
			     	if(i23<67.33)
			     	{
			     		WebElement checkbox23 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[6]/td[4]/input"));
			     		checkbox23.click();
			     	}//判断23的赔率并下注
			     	WebElement peilv22 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[7]/td[3]"));
			     	String p22= peilv22.getText() ;//取出22的赔率
			     	//System.out.println(p22);
			     	float i22 = Float.parseFloat(p22); //转换成数字
			     	//System.out.println(i22);
			     	//WebElement textbox22 = driver.findElement(By.xpath(".//*[@id='txt22']"));
			     	if(i22<48.09)
			     	{
			     		WebElement checkbox22 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[7]/td[4]/input"));
			     		checkbox22.click();
			     	}//判断22的赔率并下注
			     	WebElement peilv21 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[8]/td[3]"));
			     	String p21= peilv21.getText() ;//取出21的赔率
			     	//System.out.println(p21);
			     	float i21 = Float.parseFloat(p21); //转换成数字
			     	//System.out.println(i21);
			     	//WebElement textbox21 = driver.findElement(By.xpath(".//*[@id='txt21']"));
			     	if(i21<36.07)
			     	{
			     		WebElement checkbox21 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[8]/td[4]/input"));
			     		checkbox21.click();
			     	}//判断21的赔率并下注

			     	WebElement peilv20 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[9]/td[3]"));
			     	String p20= peilv20.getText() ;//取出20的赔率
			     	////System.out.println(p20);
			     	float i20 = Float.parseFloat(p20); //转换成数字
			     	//System.out.println(i20);
			     	//WebElement textbox20 = driver.findElement(By.xpath(".//*[@id='txt20']"));
			     	shuaxin.click();//点击刷新
			     	//System.out.println("shuaxin");
			     	try
			     	{
			     		Thread.sleep(50);
			     	}
			     	catch(InterruptedException e)
			     	{
			     		e.printStackTrace();
			     	}	
			     	if(i20<28.05)
			     	{
			     		WebElement checkbox20 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[9]/td[4]/input"));
			     		checkbox20.click();
			     	}//判断20的赔率并下注
			     	WebElement peilv19 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[10]/td[3]"));
			     	String p19= peilv19.getText() ;//取出19的赔率
			     	////System.out.println(p19);
			     	float i19 = Float.parseFloat(p19); //转换成数字
			     	//System.out.println(i19);
			     	//WebElement textbox19 = driver.findElement(By.xpath(".//*[@id='txt19']"));
			     	if(i19<22.44)
			     	{
			     		WebElement checkbox19 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[10]/td[4]/input"));
			     		checkbox19.click();
			     	}//判断19的赔率并下注
			     	
			     	WebElement peilv18 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[11]/td[3]"));
			     	String p18= peilv18.getText() ;//取出18的赔率
			     	////System.out.println(p18);
			     	float i18 = Float.parseFloat(p18); //转换成数字
			     	//System.out.println(i18);
			     	//WebElement textbox18 = driver.findElement(By.xpath(".//*[@id='txt18']"));
			     	if(i18<18.36)
			     	{
			     		WebElement checkbox18 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[11]/td[4]/input"));
			     		checkbox18.click();
			     	}//判断18的赔率并下注
			     	
			     	WebElement peilv17 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[12]/td[3]"));
			     	String p17= peilv17.getText() ;//取出17的赔率
			     	////System.out.println(p17);
			     	float i17 = Float.parseFloat(p17); //转换成数字
			     	//System.out.println(i17);
			     	//WebElement textbox17 = driver.findElement(By.xpath(".//*[@id='txt17']"));
			     	if(i17<16.03)
			     	{
			     		WebElement checkbox17 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[12]/td[4]/input"));
			     		checkbox17.click();
			     	}//判断17的赔率并下注
			     	WebElement peilv16 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[13]/td[3]"));
			     	String p16= peilv16.getText() ;//取出16的赔率
			     	////System.out.println(p16);
			     	float i16 = Float.parseFloat(p16); //转换成数字
			     	//System.out.println(i16);
			     	//WebElement textbox16 = driver.findElement(By.xpath(".//*[@id='txt16']"));
			     	if(i16<14.64)
			     	{
			     		WebElement checkbox16 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[13]/td[4]/input"));
			     		checkbox16.click();
			     	}//判断16的赔率并下注
			     	WebElement peilv15 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[14]/td[3]"));
			     	String p15= peilv15.getText() ;//取出15的赔率
			     	////System.out.println(p15);
			     	float i15 = Float.parseFloat(p15); //转换成数字
			     	//System.out.println(i15);
			     	//WebElement textbox15 = driver.findElement(By.xpath(".//*[@id='txt15']"));
			     	if(i15<13.83)
			     	{
			     		WebElement checkbox15 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[14]/td[4]/input"));
			     		checkbox15.click();
			     	}//判断15的赔率并下注
			   
			 	
			     	/*WebElement peilv14 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[15]/td[3]"));
			     	String p14= peilv14.getText() ;//取出14的赔率
			     	////System.out.println(p14);
			     	float i14 = Float.parseFloat(p14); //转换成数字
			     	//System.out.println(i14);
			     	//WebElement textbox14 = driver.findElement(By.xpath(".//*[@id='txt14']"));
			     	if(i14<13.46)
			     	{
			     		WebElement checkbox14 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[15]/td[4]/input"));
			     		checkbox14.click();
			     	}//判断14赔率并下注*/ 
			     	
				}
					//n = 1;
					break;
				case 1:
				{
					WebElement moshi1 = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[8]/div[2]/div[4]/div[2]/div/div[2]/a[3]"));
			 		moshi1.click();//点击投注模式
			 		
			 		shuaxin = driver.findElement(By.xpath(".//*[@id='form1']/div[8]/div[2]/div[4]/div[4]/div[3]/div[1]"));
			 		shuaxin.click();//点击刷新
			     	//System.out.println("shuaxin");
			     	try
			     	{
			     		Thread.sleep(50);
			     	}
			     	catch(InterruptedException e)
			     	{
			     		e.printStackTrace();
			     	}
			 		
			     	/*WebElement peilv0  = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[2]/td[3]"));
			     	String p0= peilv0.getText() ;//取出0的赔率
			     	////System.out.println(p0);
			     	float i0 = Float.parseFloat(p0); //转换成数字
			     	//System.out.println(i0);
			     	
			     	if(i0<1010)
			     	{
			     		WebElement checkbox0 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[2]/td[4]/input"));
			     		checkbox0.click();
			     		
			     	}//判断0的赔率并下注*/
			     
			     	WebElement peilv1 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[3]/td[3]"));
			     	String p1= peilv1.getText() ;//取出1的赔率
			     	////System.out.println(p1);
			     	float i1 = Float.parseFloat(p1); //转换成数字
			     	////System.out.println(i1);
			     	
			     	if(i1<336.66)
			     	{
			     		
			     		WebElement checkbox1 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[3]/td[4]/input"));
			     		checkbox1.click();
			     	}//判断1的赔率并下注

			     	WebElement peilv2 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[4]/td[3]"));
			     	String p2= peilv2.getText() ;//取出2的赔率
			     	////System.out.println(p2);
			     	float i2 = Float.parseFloat(p2); //转换成数字
			     	////System.out.println(i2);
			     	//WebElement textbox2 = driver.findElement(By.xpath(".//*[@id='txt2']"));
			     	if(i2<168.33)
			     	{
			     		
			     		WebElement checkbox2 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[4]/td[4]/input"));
			     		checkbox2.click();
			         }
			     	//判断2的赔率并下注
			     	WebElement peilv3 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[5]/td[3]"));
			     	String p3= peilv3.getText() ;//取出13的赔率
			     	////System.out.println(p3);
			     	float i3 = Float.parseFloat(p3); //转换成数字
			     	////System.out.println(i3);
			     	//WebElement textbox3 = driver.findElement(By.xpath(".//*[@id='txt3']"));
			     	if(i3<101)
			     	{
			     		WebElement checkbox3 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[5]/td[4]/input"));
			     		checkbox3.click();
			     	}//判断0的赔率并下注
			     	WebElement peilv4 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[6]/td[3]"));
			     	String p4= peilv4.getText() ;//取出13的赔率
			     	////System.out.println(p4);
			     	float i4 = Float.parseFloat(p4); //转换成数字
			     	////System.out.println(i4);
			     	//WebElement textbox4 = driver.findElement(By.xpath(".//*[@id='txt4']"));
			     	if(i4<67.33)
			     	{
			     		WebElement checkbox4 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[6]/td[4]/input"));
			     		checkbox4.click();
			     	}//判断4的赔率并下注
			     	WebElement peilv5 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[7]/td[3]"));
			     	String p5= peilv5.getText() ;//取出13的赔率
			     	//System.out.println(p5);
			     	float i5 = Float.parseFloat(p5); //转换成数字
			     	////System.out.println(i5);
			     	//WebElement textbox5 = driver.findElement(By.xpath(".//*[@id='txt5']"));
			     	
			     	if(i5<48.1)
			     	{
			     		WebElement checkbox5 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[7]/td[4]/input"));
			     		checkbox5.click();
			     	}//判断5的赔率并下注
			     	WebElement peilv6 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[8]/td[3]"));
			     	String p6= peilv6.getText() ;//取出13的赔率
			     	//System.out.println(p6);
			     	float i6 = Float.parseFloat(p6); //转换成数字
			     	//System.out.println(i6);
			     	//WebElement textbox6 = driver.findElement(By.xpath(".//*[@id='txt6']"));
			     	if(i6<36.07)
			     	{
			     		WebElement checkbox6 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[8]/td[4]/input"));
			     		checkbox6.click();
			     	}//判断6的赔率并下注

			     	WebElement peilv7 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[9]/td[3]"));
			     	String p7= peilv7.getText() ;//取出13的赔率
			     	//System.out.println(p7);
			     	float i7 = Float.parseFloat(p7); //转换成数字
			     	//System.out.println(i7);
			     	//WebElement textbox7 = driver.findElement(By.xpath(".//*[@id='txt7']"));
			     	if(i7<28.05)
			     	{
			     		WebElement checkbox7 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[9]/td[4]/input"));
			     		checkbox7.click();
			     	}//判断7的赔率并下注
			     	shuaxin.click();//点击刷新

			     	
			     	//System.out.println("shuaxin");
			     	try
			     	{
			     		Thread.sleep(50);
			     	}
			     	catch(InterruptedException e)
			     	{
			     		e.printStackTrace();
			     	}	
			     	WebElement peilv8 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[10]/td[3]"));
			     	String p8= peilv8.getText() ;//取出13的赔率
			     	//System.out.println(p8);
			     	float i8 = Float.parseFloat(p8); //转换成数字
			     	//System.out.println(i8);
			     	//WebElement textbox8 = driver.findElement(By.xpath(".//*[@id='txt8']"));
			     	if(i8<22.44)
			     	{
			     		WebElement checkbox8 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[10]/td[4]/input"));
			     		checkbox8.click();
			     	}//判断8的赔率并下注
			     	
			     	WebElement peilv9 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[11]/td[3]"));
			     	String p9= peilv9.getText() ;//取出13的赔率
			     	//System.out.println(p9);
			     	float i9 = Float.parseFloat(p9); //转换成数字
			     	//System.out.println(i9);
			     	//WebElement textbox9 = driver.findElement(By.xpath(".//*[@id='txt9']"));
			     	if(i9<18.36)
			     	{
			     		WebElement checkbox9 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[11]/td[4]/input"));
			     		checkbox9.click();
			     	}//判断9的赔率并下注
			     	
			     	WebElement peilv10 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[12]/td[3]"));
			     	String p10= peilv10.getText() ;//取出13的赔率
			     	//System.out.println(p10);
			     	float i10 = Float.parseFloat(p10); //转换成数字
			     	//System.out.println(i10);
			     	//WebElement textbox10 = driver.findElement(By.xpath(".//*[@id='txt10']"));
			     	if(i10<16.03)
			     	{
			     		WebElement checkbox10 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[12]/td[4]/input"));
			     		checkbox10.click();
			     	}//判断10的赔率并下注
			     	WebElement peilv11 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[13]/td[3]"));
			     	String p11= peilv11.getText() ;//取出13的赔率
			     	//System.out.println(p11);
			     	float i11 = Float.parseFloat(p11); //转换成数字
			     	//System.out.println(i11);
			     	//WebElement textbox11 = driver.findElement(By.xpath(".//*[@id='txt11']"));
			     	if(i11<14.63)
			     	{
			     		WebElement checkbox11 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[13]/td[4]/input"));
			     		checkbox11.click();
			     	}//判断11的赔率并下注
			     	WebElement peilv12 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[14]/td[3]"));
			     	String p12= peilv12.getText() ;//取出13的赔率
			     	//System.out.println(p12);
			     	float i12 = Float.parseFloat(p12); //转换成数字
			     	//System.out.println(i12);
			     	//WebElement textbox12 = driver.findElement(By.xpath(".//*[@id='txt12']"));
			     	if(i12<13.83)
			     	{
			     		WebElement checkbox12 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[14]/td[4]/input"));
			     		checkbox12.click();
			     	}//判断12的赔率并下注
			   
			 	
			     	/*WebElement peilv13 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[15]/td[3]"));
			     	String p13= peilv13.getText() ;//取出13的赔率
			     	//System.out.println(p13);
			     	float i13 = Float.parseFloat(p13); //转换成数字
			     	//System.out.println(i13);
			     	//WebElement textbox13 = driver.findElement(By.xpath(".//*[@id='txt13']"));
			     	if(i13<13.46)
			     	{
			     		WebElement checkbox13 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[15]/td[4]/input"));
			     		checkbox13.click();
			     	}//判断13赔率并下注 */
			     	
			     	shuaxin.click();//点击刷新
			     	//System.out.println("shuaxin");
			     	try
			     	{
			     		Thread.sleep(50);
			     	}
			     	catch(InterruptedException e)
			     	{
			     		e.printStackTrace();
			     	}	
			     	
			     	/*WebElement peilv27 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[2]/td[3]"));
			     	String p27= peilv27.getText() ;//取出27的赔率
			     	//System.out.println(p27);
			     	float i27 = Float.parseFloat(p27); //转换成数字
			     	//System.out.println(i27);
			     	//WebElement textbox27 = driver.findElement(By.xpath(".//*[@id='txt27']"));
			     	if(i27<1010)
			     	{
			     		WebElement checkbox27 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[2]/td[4]/input"));
			     		checkbox27.click();
			     	}//判断0的赔率并下注*/
			     	WebElement peilv26 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[3]/td[3]"));
			     	String p26= peilv26.getText() ;//取出26的赔率
			     	//System.out.println(p26);
			     	float i26 = Float.parseFloat(p26); //转换成数字
			     	//System.out.println(i26);
			     	//WebElement textbox26 = driver.findElement(By.xpath(".//*[@id='txt26']"));
			     	if(i26<336.66)
			     	{
			     		WebElement checkbox26 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[3]/td[4]/input"));
			     		checkbox26.click();
			     	}//判断1的赔率并下注

			     	WebElement peilv25 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[4]/td[3]"));
			     	String p25= peilv25.getText() ;//取出25的赔率
			     	//System.out.println(p25);
			     	float i25 = Float.parseFloat(p25); //转换成数字
			     	//System.out.println(i25);
			     	//WebElement textbox25 = driver.findElement(By.xpath(".//*[@id='txt25']"));
			     	if(i25<168.33)
			     	{
			     		WebElement checkbox25 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[4]/td[4]/input"));
			     		checkbox25.click();
			     	}//判断2的赔率并下注
			     	WebElement peilv24 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[5]/td[3]"));
			     	String p24= peilv24.getText() ;//取出24的赔率
			     	//System.out.println(p24);
			     	float i24 = Float.parseFloat(p24); //转换成数字
			     	//System.out.println(i24);
			     	//WebElement textbox24 = driver.findElement(By.xpath(".//*[@id='txt24']"));
			     	if(i24<101)
			     	{
			     		WebElement checkbox24 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[5]/td[4]/input"));
			     		checkbox24.click();
			     	}//判断0的赔率并下注
			     	WebElement peilv23 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[6]/td[3]"));
			     	String p23= peilv23.getText() ;//取出23的赔率
			     	//System.out.println(p23);
			     	float i23 = Float.parseFloat(p23); //转换成数字
			     	//System.out.println(i23);
			     	//WebElement textbox23 = driver.findElement(By.xpath(".//*[@id='txt23']"));
			     	if(i23<67.33)
			     	{
			     		WebElement checkbox23 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[6]/td[4]/input"));
			     		checkbox23.click();
			     	}//判断23的赔率并下注
			     	WebElement peilv22 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[7]/td[3]"));
			     	String p22= peilv22.getText() ;//取出22的赔率
			     	//System.out.println(p22);
			     	float i22 = Float.parseFloat(p22); //转换成数字
			     	//System.out.println(i22);
			     	//WebElement textbox22 = driver.findElement(By.xpath(".//*[@id='txt22']"));
			     	if(i22<48.09)
			     	{
			     		WebElement checkbox22 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[7]/td[4]/input"));
			     		checkbox22.click();
			     	}//判断22的赔率并下注
			     	WebElement peilv21 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[8]/td[3]"));
			     	String p21= peilv21.getText() ;//取出21的赔率
			     	//System.out.println(p21);
			     	float i21 = Float.parseFloat(p21); //转换成数字
			     	//System.out.println(i21);
			     	//WebElement textbox21 = driver.findElement(By.xpath(".//*[@id='txt21']"));
			     	if(i21<36.07)
			     	{
			     		WebElement checkbox21 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[8]/td[4]/input"));
			     		checkbox21.click();
			     	}//判断21的赔率并下注

			     	WebElement peilv20 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[9]/td[3]"));
			     	String p20= peilv20.getText() ;//取出20的赔率
			     	////System.out.println(p20);
			     	float i20 = Float.parseFloat(p20); //转换成数字
			     	//System.out.println(i20);
			     	//WebElement textbox20 = driver.findElement(By.xpath(".//*[@id='txt20']"));
			     	shuaxin.click();//点击刷新
			     	//System.out.println("shuaxin");
			     	try
			     	{
			     		Thread.sleep(50);
			     	}
			     	catch(InterruptedException e)
			     	{
			     		e.printStackTrace();
			     	}	
			     	if(i20<28.05)
			     	{
			     		WebElement checkbox20 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[9]/td[4]/input"));
			     		checkbox20.click();
			     	}//判断20的赔率并下注
			     	WebElement peilv19 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[10]/td[3]"));
			     	String p19= peilv19.getText() ;//取出19的赔率
			     	////System.out.println(p19);
			     	float i19 = Float.parseFloat(p19); //转换成数字
			     	//System.out.println(i19);
			     	//WebElement textbox19 = driver.findElement(By.xpath(".//*[@id='txt19']"));
			     	if(i19<22.44)
			     	{
			     		WebElement checkbox19 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[10]/td[4]/input"));
			     		checkbox19.click();
			     	}//判断19的赔率并下注
			     	
			     	WebElement peilv18 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[11]/td[3]"));
			     	String p18= peilv18.getText() ;//取出18的赔率
			     	////System.out.println(p18);
			     	float i18 = Float.parseFloat(p18); //转换成数字
			     	//System.out.println(i18);
			     	//WebElement textbox18 = driver.findElement(By.xpath(".//*[@id='txt18']"));
			     	if(i18<18.36)
			     	{
			     		WebElement checkbox18 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[11]/td[4]/input"));
			     		checkbox18.click();
			     	}//判断18的赔率并下注
			     	
			     	WebElement peilv17 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[12]/td[3]"));
			     	String p17= peilv17.getText() ;//取出17的赔率
			     	////System.out.println(p17);
			     	float i17 = Float.parseFloat(p17); //转换成数字
			     	//System.out.println(i17);
			     	//WebElement textbox17 = driver.findElement(By.xpath(".//*[@id='txt17']"));
			     	if(i17<16.03)
			     	{
			     		WebElement checkbox17 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[12]/td[4]/input"));
			     		checkbox17.click();
			     	}//判断17的赔率并下注
			     	WebElement peilv16 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[13]/td[3]"));
			     	String p16= peilv16.getText() ;//取出16的赔率
			     	////System.out.println(p16);
			     	float i16 = Float.parseFloat(p16); //转换成数字
			     	//System.out.println(i16);
			     	//WebElement textbox16 = driver.findElement(By.xpath(".//*[@id='txt16']"));
			     	if(i16<14.64)
			     	{
			     		WebElement checkbox16 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[13]/td[4]/input"));
			     		checkbox16.click();
			     	}//判断16的赔率并下注
			     	WebElement peilv15 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[14]/td[3]"));
			     	String p15= peilv15.getText() ;//取出15的赔率
			     	////System.out.println(p15);
			     	float i15 = Float.parseFloat(p15); //转换成数字
			     	//System.out.println(i15);
			     	//WebElement textbox15 = driver.findElement(By.xpath(".//*[@id='txt15']"));
			     	if(i15<13.83)
			     	{
			     		WebElement checkbox15 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[14]/td[4]/input"));
			     		checkbox15.click();
			     	}//判断15的赔率并下注
			   
			 	
			     	/*WebElement peilv14 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[15]/td[3]"));
			     	String p14= peilv14.getText() ;//取出14的赔率
			     	////System.out.println(p14);
			     	float i14 = Float.parseFloat(p14); //转换成数字
			     	//System.out.println(i14);
			     	//WebElement textbox14 = driver.findElement(By.xpath(".//*[@id='txt14']"));
			     	if(i14<13.46)
			     	{
			     		WebElement checkbox14 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[15]/td[4]/input"));
			     		checkbox14.click();
			     	}//判断14赔率并下注*/ 
			     	
				
				}
					//n = 3;
					break;
				case 2:
				{
					WebElement moshi1 = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[8]/div[2]/div[4]/div[2]/div/div[2]/a[3]"));
			 		moshi1.click();//点击投注模式
			 		
			 		shuaxin = driver.findElement(By.xpath(".//*[@id='form1']/div[8]/div[2]/div[4]/div[4]/div[3]/div[1]"));
			 		shuaxin.click();//点击刷新
			     	//System.out.println("shuaxin");
			     	try
			     	{
			     		Thread.sleep(50);
			     	}
			     	catch(InterruptedException e)
			     	{
			     		e.printStackTrace();
			     	}
			 		
			     	/*WebElement peilv0  = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[2]/td[3]"));
			     	String p0= peilv0.getText() ;//取出0的赔率
			     	////System.out.println(p0);
			     	float i0 = Float.parseFloat(p0); //转换成数字
			     	//System.out.println(i0);
			     	
			     	if(i0<1010)
			     	{
			     		WebElement checkbox0 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[2]/td[4]/input"));
			     		checkbox0.click();
			     		
			     	}//判断0的赔率并下注*/
			     
			     	WebElement peilv1 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[3]/td[3]"));
			     	String p1= peilv1.getText() ;//取出1的赔率
			     	////System.out.println(p1);
			     	float i1 = Float.parseFloat(p1); //转换成数字
			     	////System.out.println(i1);
			     	
			     	if(i1<336.66)
			     	{
			     		
			     		WebElement checkbox1 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[3]/td[4]/input"));
			     		checkbox1.click();
			     	}//判断1的赔率并下注

			     	WebElement peilv2 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[4]/td[3]"));
			     	String p2= peilv2.getText() ;//取出2的赔率
			     	////System.out.println(p2);
			     	float i2 = Float.parseFloat(p2); //转换成数字
			     	////System.out.println(i2);
			     	//WebElement textbox2 = driver.findElement(By.xpath(".//*[@id='txt2']"));
			     	if(i2<168.33)
			     	{
			     		
			     		WebElement checkbox2 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[4]/td[4]/input"));
			     		checkbox2.click();
			         }
			     	//判断2的赔率并下注
			     	WebElement peilv3 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[5]/td[3]"));
			     	String p3= peilv3.getText() ;//取出13的赔率
			     	////System.out.println(p3);
			     	float i3 = Float.parseFloat(p3); //转换成数字
			     	////System.out.println(i3);
			     	//WebElement textbox3 = driver.findElement(By.xpath(".//*[@id='txt3']"));
			     	if(i3<101)
			     	{
			     		WebElement checkbox3 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[5]/td[4]/input"));
			     		checkbox3.click();
			     	}//判断0的赔率并下注
			     	WebElement peilv4 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[6]/td[3]"));
			     	String p4= peilv4.getText() ;//取出13的赔率
			     	////System.out.println(p4);
			     	float i4 = Float.parseFloat(p4); //转换成数字
			     	////System.out.println(i4);
			     	//WebElement textbox4 = driver.findElement(By.xpath(".//*[@id='txt4']"));
			     	if(i4<67.33)
			     	{
			     		WebElement checkbox4 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[6]/td[4]/input"));
			     		checkbox4.click();
			     	}//判断4的赔率并下注
			     	WebElement peilv5 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[7]/td[3]"));
			     	String p5= peilv5.getText() ;//取出13的赔率
			     	//System.out.println(p5);
			     	float i5 = Float.parseFloat(p5); //转换成数字
			     	////System.out.println(i5);
			     	//WebElement textbox5 = driver.findElement(By.xpath(".//*[@id='txt5']"));
			     	
			     	if(i5<48.1)
			     	{
			     		WebElement checkbox5 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[7]/td[4]/input"));
			     		checkbox5.click();
			     	}//判断5的赔率并下注
			     	WebElement peilv6 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[8]/td[3]"));
			     	String p6= peilv6.getText() ;//取出13的赔率
			     	//System.out.println(p6);
			     	float i6 = Float.parseFloat(p6); //转换成数字
			     	//System.out.println(i6);
			     	//WebElement textbox6 = driver.findElement(By.xpath(".//*[@id='txt6']"));
			     	if(i6<36.07)
			     	{
			     		WebElement checkbox6 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[8]/td[4]/input"));
			     		checkbox6.click();
			     	}//判断6的赔率并下注

			     	WebElement peilv7 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[9]/td[3]"));
			     	String p7= peilv7.getText() ;//取出13的赔率
			     	//System.out.println(p7);
			     	float i7 = Float.parseFloat(p7); //转换成数字
			     	//System.out.println(i7);
			     	//WebElement textbox7 = driver.findElement(By.xpath(".//*[@id='txt7']"));
			     	if(i7<28.05)
			     	{
			     		WebElement checkbox7 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[9]/td[4]/input"));
			     		checkbox7.click();
			     	}//判断7的赔率并下注
			     	shuaxin.click();//点击刷新

			     	
			     	//System.out.println("shuaxin");
			     	try
			     	{
			     		Thread.sleep(50);
			     	}
			     	catch(InterruptedException e)
			     	{
			     		e.printStackTrace();
			     	}	
			     	WebElement peilv8 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[10]/td[3]"));
			     	String p8= peilv8.getText() ;//取出13的赔率
			     	//System.out.println(p8);
			     	float i8 = Float.parseFloat(p8); //转换成数字
			     	//System.out.println(i8);
			     	//WebElement textbox8 = driver.findElement(By.xpath(".//*[@id='txt8']"));
			     	if(i8<22.44)
			     	{
			     		WebElement checkbox8 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[10]/td[4]/input"));
			     		checkbox8.click();
			     	}//判断8的赔率并下注
			     	
			     	WebElement peilv9 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[11]/td[3]"));
			     	String p9= peilv9.getText() ;//取出13的赔率
			     	//System.out.println(p9);
			     	float i9 = Float.parseFloat(p9); //转换成数字
			     	//System.out.println(i9);
			     	//WebElement textbox9 = driver.findElement(By.xpath(".//*[@id='txt9']"));
			     	if(i9<18.36)
			     	{
			     		WebElement checkbox9 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[11]/td[4]/input"));
			     		checkbox9.click();
			     	}//判断9的赔率并下注
			     	
			     	WebElement peilv10 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[12]/td[3]"));
			     	String p10= peilv10.getText() ;//取出13的赔率
			     	//System.out.println(p10);
			     	float i10 = Float.parseFloat(p10); //转换成数字
			     	//System.out.println(i10);
			     	//WebElement textbox10 = driver.findElement(By.xpath(".//*[@id='txt10']"));
			     	if(i10<16.03)
			     	{
			     		WebElement checkbox10 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[12]/td[4]/input"));
			     		checkbox10.click();
			     	}//判断10的赔率并下注
			     	WebElement peilv11 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[13]/td[3]"));
			     	String p11= peilv11.getText() ;//取出13的赔率
			     	//System.out.println(p11);
			     	float i11 = Float.parseFloat(p11); //转换成数字
			     	//System.out.println(i11);
			     	//WebElement textbox11 = driver.findElement(By.xpath(".//*[@id='txt11']"));
			     	if(i11<14.63)
			     	{
			     		WebElement checkbox11 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[13]/td[4]/input"));
			     		checkbox11.click();
			     	}//判断11的赔率并下注
			     	WebElement peilv12 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[14]/td[3]"));
			     	String p12= peilv12.getText() ;//取出13的赔率
			     	//System.out.println(p12);
			     	float i12 = Float.parseFloat(p12); //转换成数字
			     	//System.out.println(i12);
			     	//WebElement textbox12 = driver.findElement(By.xpath(".//*[@id='txt12']"));
			     	if(i12<13.83)
			     	{
			     		WebElement checkbox12 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[14]/td[4]/input"));
			     		checkbox12.click();
			     	}//判断12的赔率并下注
			   
			 	
			     	/*WebElement peilv13 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[15]/td[3]"));
			     	String p13= peilv13.getText() ;//取出13的赔率
			     	//System.out.println(p13);
			     	float i13 = Float.parseFloat(p13); //转换成数字
			     	//System.out.println(i13);
			     	//WebElement textbox13 = driver.findElement(By.xpath(".//*[@id='txt13']"));
			     	if(i13<13.46)
			     	{
			     		WebElement checkbox13 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[15]/td[4]/input"));
			     		checkbox13.click();
			     	}//判断13赔率并下注 */
			     	
			     	shuaxin.click();//点击刷新
			     	//System.out.println("shuaxin");
			     	try
			     	{
			     		Thread.sleep(50);
			     	}
			     	catch(InterruptedException e)
			     	{
			     		e.printStackTrace();
			     	}	
			     	
			     	/*WebElement peilv27 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[2]/td[3]"));
			     	String p27= peilv27.getText() ;//取出27的赔率
			     	//System.out.println(p27);
			     	float i27 = Float.parseFloat(p27); //转换成数字
			     	//System.out.println(i27);
			     	//WebElement textbox27 = driver.findElement(By.xpath(".//*[@id='txt27']"));
			     	if(i27<1010)
			     	{
			     		WebElement checkbox27 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[2]/td[4]/input"));
			     		checkbox27.click();
			     	}//判断0的赔率并下注*/
			     	WebElement peilv26 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[3]/td[3]"));
			     	String p26= peilv26.getText() ;//取出26的赔率
			     	//System.out.println(p26);
			     	float i26 = Float.parseFloat(p26); //转换成数字
			     	//System.out.println(i26);
			     	//WebElement textbox26 = driver.findElement(By.xpath(".//*[@id='txt26']"));
			     	if(i26<336.66)
			     	{
			     		WebElement checkbox26 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[3]/td[4]/input"));
			     		checkbox26.click();
			     	}//判断1的赔率并下注

			     	WebElement peilv25 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[4]/td[3]"));
			     	String p25= peilv25.getText() ;//取出25的赔率
			     	//System.out.println(p25);
			     	float i25 = Float.parseFloat(p25); //转换成数字
			     	//System.out.println(i25);
			     	//WebElement textbox25 = driver.findElement(By.xpath(".//*[@id='txt25']"));
			     	if(i25<168.33)
			     	{
			     		WebElement checkbox25 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[4]/td[4]/input"));
			     		checkbox25.click();
			     	}//判断2的赔率并下注
			     	WebElement peilv24 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[5]/td[3]"));
			     	String p24= peilv24.getText() ;//取出24的赔率
			     	//System.out.println(p24);
			     	float i24 = Float.parseFloat(p24); //转换成数字
			     	//System.out.println(i24);
			     	//WebElement textbox24 = driver.findElement(By.xpath(".//*[@id='txt24']"));
			     	if(i24<101)
			     	{
			     		WebElement checkbox24 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[5]/td[4]/input"));
			     		checkbox24.click();
			     	}//判断0的赔率并下注
			     	WebElement peilv23 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[6]/td[3]"));
			     	String p23= peilv23.getText() ;//取出23的赔率
			     	//System.out.println(p23);
			     	float i23 = Float.parseFloat(p23); //转换成数字
			     	//System.out.println(i23);
			     	//WebElement textbox23 = driver.findElement(By.xpath(".//*[@id='txt23']"));
			     	if(i23<67.33)
			     	{
			     		WebElement checkbox23 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[6]/td[4]/input"));
			     		checkbox23.click();
			     	}//判断23的赔率并下注
			     	WebElement peilv22 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[7]/td[3]"));
			     	String p22= peilv22.getText() ;//取出22的赔率
			     	//System.out.println(p22);
			     	float i22 = Float.parseFloat(p22); //转换成数字
			     	//System.out.println(i22);
			     	//WebElement textbox22 = driver.findElement(By.xpath(".//*[@id='txt22']"));
			     	if(i22<48.09)
			     	{
			     		WebElement checkbox22 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[7]/td[4]/input"));
			     		checkbox22.click();
			     	}//判断22的赔率并下注
			     	WebElement peilv21 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[8]/td[3]"));
			     	String p21= peilv21.getText() ;//取出21的赔率
			     	//System.out.println(p21);
			     	float i21 = Float.parseFloat(p21); //转换成数字
			     	//System.out.println(i21);
			     	//WebElement textbox21 = driver.findElement(By.xpath(".//*[@id='txt21']"));
			     	if(i21<36.07)
			     	{
			     		WebElement checkbox21 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[8]/td[4]/input"));
			     		checkbox21.click();
			     	}//判断21的赔率并下注

			     	WebElement peilv20 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[9]/td[3]"));
			     	String p20= peilv20.getText() ;//取出20的赔率
			     	////System.out.println(p20);
			     	float i20 = Float.parseFloat(p20); //转换成数字
			     	//System.out.println(i20);
			     	//WebElement textbox20 = driver.findElement(By.xpath(".//*[@id='txt20']"));
			     	shuaxin.click();//点击刷新
			     	//System.out.println("shuaxin");
			     	try
			     	{
			     		Thread.sleep(50);
			     	}
			     	catch(InterruptedException e)
			     	{
			     		e.printStackTrace();
			     	}	
			     	if(i20<28.05)
			     	{
			     		WebElement checkbox20 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[9]/td[4]/input"));
			     		checkbox20.click();
			     	}//判断20的赔率并下注
			     	WebElement peilv19 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[10]/td[3]"));
			     	String p19= peilv19.getText() ;//取出19的赔率
			     	////System.out.println(p19);
			     	float i19 = Float.parseFloat(p19); //转换成数字
			     	//System.out.println(i19);
			     	//WebElement textbox19 = driver.findElement(By.xpath(".//*[@id='txt19']"));
			     	if(i19<22.44)
			     	{
			     		WebElement checkbox19 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[10]/td[4]/input"));
			     		checkbox19.click();
			     	}//判断19的赔率并下注
			     	
			     	WebElement peilv18 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[11]/td[3]"));
			     	String p18= peilv18.getText() ;//取出18的赔率
			     	////System.out.println(p18);
			     	float i18 = Float.parseFloat(p18); //转换成数字
			     	//System.out.println(i18);
			     	//WebElement textbox18 = driver.findElement(By.xpath(".//*[@id='txt18']"));
			     	if(i18<18.36)
			     	{
			     		WebElement checkbox18 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[11]/td[4]/input"));
			     		checkbox18.click();
			     	}//判断18的赔率并下注
			     	
			     	WebElement peilv17 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[12]/td[3]"));
			     	String p17= peilv17.getText() ;//取出17的赔率
			     	////System.out.println(p17);
			     	float i17 = Float.parseFloat(p17); //转换成数字
			     	//System.out.println(i17);
			     	//WebElement textbox17 = driver.findElement(By.xpath(".//*[@id='txt17']"));
			     	if(i17<16.03)
			     	{
			     		WebElement checkbox17 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[12]/td[4]/input"));
			     		checkbox17.click();
			     	}//判断17的赔率并下注
			     	WebElement peilv16 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[13]/td[3]"));
			     	String p16= peilv16.getText() ;//取出16的赔率
			     	////System.out.println(p16);
			     	float i16 = Float.parseFloat(p16); //转换成数字
			     	//System.out.println(i16);
			     	//WebElement textbox16 = driver.findElement(By.xpath(".//*[@id='txt16']"));
			     	if(i16<14.64)
			     	{
			     		WebElement checkbox16 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[13]/td[4]/input"));
			     		checkbox16.click();
			     	}//判断16的赔率并下注
			     	WebElement peilv15 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[14]/td[3]"));
			     	String p15= peilv15.getText() ;//取出15的赔率
			     	////System.out.println(p15);
			     	float i15 = Float.parseFloat(p15); //转换成数字
			     	//System.out.println(i15);
			     	//WebElement textbox15 = driver.findElement(By.xpath(".//*[@id='txt15']"));
			     	if(i15<13.83)
			     	{
			     		WebElement checkbox15 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[14]/td[4]/input"));
			     		checkbox15.click();
			     	}//判断15的赔率并下注
			   
			 	
			     	/*WebElement peilv14 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[15]/td[3]"));
			     	String p14= peilv14.getText() ;//取出14的赔率
			     	////System.out.println(p14);
			     	float i14 = Float.parseFloat(p14); //转换成数字
			     	//System.out.println(i14);
			     	//WebElement textbox14 = driver.findElement(By.xpath(".//*[@id='txt14']"));
			     	if(i14<13.46)
			     	{
			     		WebElement checkbox14 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[15]/td[4]/input"));
			     		checkbox14.click();
			     	}//判断14赔率并下注*/ 
			     	
				
				}
					//n = 3;
					break;
				case 3:
				{
					WebElement moshi1 = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[8]/div[2]/div[4]/div[2]/div/div[2]/a[3]"));
			 		moshi1.click();//点击投注模式
			 		
			 		shuaxin = driver.findElement(By.xpath(".//*[@id='form1']/div[8]/div[2]/div[4]/div[4]/div[3]/div[1]"));
			 		shuaxin.click();//点击刷新
			     	//System.out.println("shuaxin");
			     	try
			     	{
			     		Thread.sleep(50);
			     	}
			     	catch(InterruptedException e)
			     	{
			     		e.printStackTrace();
			     	}
			 		
			     	/*WebElement peilv0  = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[2]/td[3]"));
			     	String p0= peilv0.getText() ;//取出0的赔率
			     	////System.out.println(p0);
			     	float i0 = Float.parseFloat(p0); //转换成数字
			     	//System.out.println(i0);
			     	
			     	if(i0<1010)
			     	{
			     		WebElement checkbox0 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[2]/td[4]/input"));
			     		checkbox0.click();
			     		
			     	}//判断0的赔率并下注*/
			     
			     	WebElement peilv1 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[3]/td[3]"));
			     	String p1= peilv1.getText() ;//取出1的赔率
			     	////System.out.println(p1);
			     	float i1 = Float.parseFloat(p1); //转换成数字
			     	////System.out.println(i1);
			     	
			     	if(i1<336.66)
			     	{
			     		
			     		WebElement checkbox1 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[3]/td[4]/input"));
			     		checkbox1.click();
			     	}//判断1的赔率并下注

			     	WebElement peilv2 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[4]/td[3]"));
			     	String p2= peilv2.getText() ;//取出2的赔率
			     	////System.out.println(p2);
			     	float i2 = Float.parseFloat(p2); //转换成数字
			     	////System.out.println(i2);
			     	//WebElement textbox2 = driver.findElement(By.xpath(".//*[@id='txt2']"));
			     	if(i2<168.33)
			     	{
			     		
			     		WebElement checkbox2 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[4]/td[4]/input"));
			     		checkbox2.click();
			         }
			     	//判断2的赔率并下注
			     	WebElement peilv3 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[5]/td[3]"));
			     	String p3= peilv3.getText() ;//取出13的赔率
			     	////System.out.println(p3);
			     	float i3 = Float.parseFloat(p3); //转换成数字
			     	////System.out.println(i3);
			     	//WebElement textbox3 = driver.findElement(By.xpath(".//*[@id='txt3']"));
			     	if(i3<101)
			     	{
			     		WebElement checkbox3 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[5]/td[4]/input"));
			     		checkbox3.click();
			     	}//判断0的赔率并下注
			     	WebElement peilv4 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[6]/td[3]"));
			     	String p4= peilv4.getText() ;//取出13的赔率
			     	////System.out.println(p4);
			     	float i4 = Float.parseFloat(p4); //转换成数字
			     	////System.out.println(i4);
			     	//WebElement textbox4 = driver.findElement(By.xpath(".//*[@id='txt4']"));
			     	if(i4<67.33)
			     	{
			     		WebElement checkbox4 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[6]/td[4]/input"));
			     		checkbox4.click();
			     	}//判断4的赔率并下注
			     	WebElement peilv5 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[7]/td[3]"));
			     	String p5= peilv5.getText() ;//取出13的赔率
			     	//System.out.println(p5);
			     	float i5 = Float.parseFloat(p5); //转换成数字
			     	////System.out.println(i5);
			     	//WebElement textbox5 = driver.findElement(By.xpath(".//*[@id='txt5']"));
			     	
			     	if(i5<48.1)
			     	{
			     		WebElement checkbox5 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[7]/td[4]/input"));
			     		checkbox5.click();
			     	}//判断5的赔率并下注
			     	WebElement peilv6 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[8]/td[3]"));
			     	String p6= peilv6.getText() ;//取出13的赔率
			     	//System.out.println(p6);
			     	float i6 = Float.parseFloat(p6); //转换成数字
			     	//System.out.println(i6);
			     	//WebElement textbox6 = driver.findElement(By.xpath(".//*[@id='txt6']"));
			     	if(i6<36.07)
			     	{
			     		WebElement checkbox6 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[8]/td[4]/input"));
			     		checkbox6.click();
			     	}//判断6的赔率并下注

			     	WebElement peilv7 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[9]/td[3]"));
			     	String p7= peilv7.getText() ;//取出13的赔率
			     	//System.out.println(p7);
			     	float i7 = Float.parseFloat(p7); //转换成数字
			     	//System.out.println(i7);
			     	//WebElement textbox7 = driver.findElement(By.xpath(".//*[@id='txt7']"));
			     	if(i7<28.05)
			     	{
			     		WebElement checkbox7 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[9]/td[4]/input"));
			     		checkbox7.click();
			     	}//判断7的赔率并下注
			     	shuaxin.click();//点击刷新

			     	
			     	//System.out.println("shuaxin");
			     	try
			     	{
			     		Thread.sleep(50);
			     	}
			     	catch(InterruptedException e)
			     	{
			     		e.printStackTrace();
			     	}	
			     	WebElement peilv8 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[10]/td[3]"));
			     	String p8= peilv8.getText() ;//取出13的赔率
			     	//System.out.println(p8);
			     	float i8 = Float.parseFloat(p8); //转换成数字
			     	//System.out.println(i8);
			     	//WebElement textbox8 = driver.findElement(By.xpath(".//*[@id='txt8']"));
			     	if(i8<22.44)
			     	{
			     		WebElement checkbox8 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[10]/td[4]/input"));
			     		checkbox8.click();
			     	}//判断8的赔率并下注
			     	
			     	WebElement peilv9 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[11]/td[3]"));
			     	String p9= peilv9.getText() ;//取出13的赔率
			     	//System.out.println(p9);
			     	float i9 = Float.parseFloat(p9); //转换成数字
			     	//System.out.println(i9);
			     	//WebElement textbox9 = driver.findElement(By.xpath(".//*[@id='txt9']"));
			     	if(i9<18.36)
			     	{
			     		WebElement checkbox9 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[11]/td[4]/input"));
			     		checkbox9.click();
			     	}//判断9的赔率并下注
			     	
			     	WebElement peilv10 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[12]/td[3]"));
			     	String p10= peilv10.getText() ;//取出13的赔率
			     	//System.out.println(p10);
			     	float i10 = Float.parseFloat(p10); //转换成数字
			     	//System.out.println(i10);
			     	//WebElement textbox10 = driver.findElement(By.xpath(".//*[@id='txt10']"));
			     	if(i10<16.03)
			     	{
			     		WebElement checkbox10 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[12]/td[4]/input"));
			     		checkbox10.click();
			     	}//判断10的赔率并下注
			     	WebElement peilv11 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[13]/td[3]"));
			     	String p11= peilv11.getText() ;//取出13的赔率
			     	//System.out.println(p11);
			     	float i11 = Float.parseFloat(p11); //转换成数字
			     	//System.out.println(i11);
			     	//WebElement textbox11 = driver.findElement(By.xpath(".//*[@id='txt11']"));
			     	if(i11<14.63)
			     	{
			     		WebElement checkbox11 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[13]/td[4]/input"));
			     		checkbox11.click();
			     	}//判断11的赔率并下注
			     	WebElement peilv12 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[14]/td[3]"));
			     	String p12= peilv12.getText() ;//取出13的赔率
			     	//System.out.println(p12);
			     	float i12 = Float.parseFloat(p12); //转换成数字
			     	//System.out.println(i12);
			     	//WebElement textbox12 = driver.findElement(By.xpath(".//*[@id='txt12']"));
			     	if(i12<13.83)
			     	{
			     		WebElement checkbox12 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[14]/td[4]/input"));
			     		checkbox12.click();
			     	}//判断12的赔率并下注
			   
			 	
			     	/*WebElement peilv13 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[15]/td[3]"));
			     	String p13= peilv13.getText() ;//取出13的赔率
			     	//System.out.println(p13);
			     	float i13 = Float.parseFloat(p13); //转换成数字
			     	//System.out.println(i13);
			     	//WebElement textbox13 = driver.findElement(By.xpath(".//*[@id='txt13']"));
			     	if(i13<13.46)
			     	{
			     		WebElement checkbox13 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[15]/td[4]/input"));
			     		checkbox13.click();
			     	}//判断13赔率并下注 */
			     	
			     	shuaxin.click();//点击刷新
			     	//System.out.println("shuaxin");
			     	try
			     	{
			     		Thread.sleep(50);
			     	}
			     	catch(InterruptedException e)
			     	{
			     		e.printStackTrace();
			     	}	
			     	
			     	/*WebElement peilv27 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[2]/td[3]"));
			     	String p27= peilv27.getText() ;//取出27的赔率
			     	//System.out.println(p27);
			     	float i27 = Float.parseFloat(p27); //转换成数字
			     	//System.out.println(i27);
			     	//WebElement textbox27 = driver.findElement(By.xpath(".//*[@id='txt27']"));
			     	if(i27<1010)
			     	{
			     		WebElement checkbox27 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[2]/td[4]/input"));
			     		checkbox27.click();
			     	}//判断0的赔率并下注*/
			     	WebElement peilv26 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[3]/td[3]"));
			     	String p26= peilv26.getText() ;//取出26的赔率
			     	//System.out.println(p26);
			     	float i26 = Float.parseFloat(p26); //转换成数字
			     	//System.out.println(i26);
			     	//WebElement textbox26 = driver.findElement(By.xpath(".//*[@id='txt26']"));
			     	if(i26<336.66)
			     	{
			     		WebElement checkbox26 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[3]/td[4]/input"));
			     		checkbox26.click();
			     	}//判断1的赔率并下注

			     	WebElement peilv25 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[4]/td[3]"));
			     	String p25= peilv25.getText() ;//取出25的赔率
			     	//System.out.println(p25);
			     	float i25 = Float.parseFloat(p25); //转换成数字
			     	//System.out.println(i25);
			     	//WebElement textbox25 = driver.findElement(By.xpath(".//*[@id='txt25']"));
			     	if(i25<168.33)
			     	{
			     		WebElement checkbox25 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[4]/td[4]/input"));
			     		checkbox25.click();
			     	}//判断2的赔率并下注
			     	WebElement peilv24 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[5]/td[3]"));
			     	String p24= peilv24.getText() ;//取出24的赔率
			     	//System.out.println(p24);
			     	float i24 = Float.parseFloat(p24); //转换成数字
			     	//System.out.println(i24);
			     	//WebElement textbox24 = driver.findElement(By.xpath(".//*[@id='txt24']"));
			     	if(i24<101)
			     	{
			     		WebElement checkbox24 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[5]/td[4]/input"));
			     		checkbox24.click();
			     	}//判断0的赔率并下注
			     	WebElement peilv23 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[6]/td[3]"));
			     	String p23= peilv23.getText() ;//取出23的赔率
			     	//System.out.println(p23);
			     	float i23 = Float.parseFloat(p23); //转换成数字
			     	//System.out.println(i23);
			     	//WebElement textbox23 = driver.findElement(By.xpath(".//*[@id='txt23']"));
			     	if(i23<67.33)
			     	{
			     		WebElement checkbox23 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[6]/td[4]/input"));
			     		checkbox23.click();
			     	}//判断23的赔率并下注
			     	WebElement peilv22 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[7]/td[3]"));
			     	String p22= peilv22.getText() ;//取出22的赔率
			     	//System.out.println(p22);
			     	float i22 = Float.parseFloat(p22); //转换成数字
			     	//System.out.println(i22);
			     	//WebElement textbox22 = driver.findElement(By.xpath(".//*[@id='txt22']"));
			     	if(i22<48.09)
			     	{
			     		WebElement checkbox22 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[7]/td[4]/input"));
			     		checkbox22.click();
			     	}//判断22的赔率并下注
			     	WebElement peilv21 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[8]/td[3]"));
			     	String p21= peilv21.getText() ;//取出21的赔率
			     	//System.out.println(p21);
			     	float i21 = Float.parseFloat(p21); //转换成数字
			     	//System.out.println(i21);
			     	//WebElement textbox21 = driver.findElement(By.xpath(".//*[@id='txt21']"));
			     	if(i21<36.07)
			     	{
			     		WebElement checkbox21 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[8]/td[4]/input"));
			     		checkbox21.click();
			     	}//判断21的赔率并下注

			     	WebElement peilv20 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[9]/td[3]"));
			     	String p20= peilv20.getText() ;//取出20的赔率
			     	////System.out.println(p20);
			     	float i20 = Float.parseFloat(p20); //转换成数字
			     	//System.out.println(i20);
			     	//WebElement textbox20 = driver.findElement(By.xpath(".//*[@id='txt20']"));
			     	shuaxin.click();//点击刷新
			     	//System.out.println("shuaxin");
			     	try
			     	{
			     		Thread.sleep(50);
			     	}
			     	catch(InterruptedException e)
			     	{
			     		e.printStackTrace();
			     	}	
			     	if(i20<28.05)
			     	{
			     		WebElement checkbox20 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[9]/td[4]/input"));
			     		checkbox20.click();
			     	}//判断20的赔率并下注
			     	WebElement peilv19 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[10]/td[3]"));
			     	String p19= peilv19.getText() ;//取出19的赔率
			     	////System.out.println(p19);
			     	float i19 = Float.parseFloat(p19); //转换成数字
			     	//System.out.println(i19);
			     	//WebElement textbox19 = driver.findElement(By.xpath(".//*[@id='txt19']"));
			     	if(i19<22.44)
			     	{
			     		WebElement checkbox19 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[10]/td[4]/input"));
			     		checkbox19.click();
			     	}//判断19的赔率并下注
			     	
			     	WebElement peilv18 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[11]/td[3]"));
			     	String p18= peilv18.getText() ;//取出18的赔率
			     	////System.out.println(p18);
			     	float i18 = Float.parseFloat(p18); //转换成数字
			     	//System.out.println(i18);
			     	//WebElement textbox18 = driver.findElement(By.xpath(".//*[@id='txt18']"));
			     	if(i18<18.36)
			     	{
			     		WebElement checkbox18 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[11]/td[4]/input"));
			     		checkbox18.click();
			     	}//判断18的赔率并下注
			     	
			     	WebElement peilv17 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[12]/td[3]"));
			     	String p17= peilv17.getText() ;//取出17的赔率
			     	////System.out.println(p17);
			     	float i17 = Float.parseFloat(p17); //转换成数字
			     	//System.out.println(i17);
			     	//WebElement textbox17 = driver.findElement(By.xpath(".//*[@id='txt17']"));
			     	if(i17<16.03)
			     	{
			     		WebElement checkbox17 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[12]/td[4]/input"));
			     		checkbox17.click();
			     	}//判断17的赔率并下注
			     	WebElement peilv16 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[13]/td[3]"));
			     	String p16= peilv16.getText() ;//取出16的赔率
			     	////System.out.println(p16);
			     	float i16 = Float.parseFloat(p16); //转换成数字
			     	//System.out.println(i16);
			     	//WebElement textbox16 = driver.findElement(By.xpath(".//*[@id='txt16']"));
			     	if(i16<14.64)
			     	{
			     		WebElement checkbox16 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[13]/td[4]/input"));
			     		checkbox16.click();
			     	}//判断16的赔率并下注
			     	WebElement peilv15 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[14]/td[3]"));
			     	String p15= peilv15.getText() ;//取出15的赔率
			     	////System.out.println(p15);
			     	float i15 = Float.parseFloat(p15); //转换成数字
			     	//System.out.println(i15);
			     	//WebElement textbox15 = driver.findElement(By.xpath(".//*[@id='txt15']"));
			     	if(i15<13.83)
			     	{
			     		WebElement checkbox15 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[14]/td[4]/input"));
			     		checkbox15.click();
			     	}//判断15的赔率并下注
			   
			 	
			     	/*WebElement peilv14 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[15]/td[3]"));
			     	String p14= peilv14.getText() ;//取出14的赔率
			     	////System.out.println(p14);
			     	float i14 = Float.parseFloat(p14); //转换成数字
			     	//System.out.println(i14);
			     	//WebElement textbox14 = driver.findElement(By.xpath(".//*[@id='txt14']"));
			     	if(i14<13.46)
			     	{
			     		WebElement checkbox14 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[15]/td[4]/input"));
			     		checkbox14.click();
			     	}//判断14赔率并下注*/ 
			     	
				
				}
					//n = 3;
					break;
				case 4:
				{
					WebElement moshi1 = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[8]/div[2]/div[4]/div[2]/div/div[2]/a[5]"));
			 		moshi1.click();//点击投注模式
			 		
			 		shuaxin = driver.findElement(By.xpath(".//*[@id='form1']/div[8]/div[2]/div[4]/div[4]/div[3]/div[1]"));
			 		shuaxin.click();//点击刷新
			     	//System.out.println("shuaxin");
			     	try
			     	{
			     		Thread.sleep(50);
			     	}
			     	catch(InterruptedException e)
			     	{
			     		e.printStackTrace();
			     	}
			 		
			     	/*WebElement peilv0  = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[2]/td[3]"));
			     	String p0= peilv0.getText() ;//取出0的赔率
			     	////System.out.println(p0);
			     	float i0 = Float.parseFloat(p0); //转换成数字
			     	//System.out.println(i0);
			     	
			     	if(i0<1010)
			     	{
			     		WebElement checkbox0 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[2]/td[4]/input"));
			     		checkbox0.click();
			     		
			     	}//判断0的赔率并下注*/
			     
			     	WebElement peilv1 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[3]/td[3]"));
			     	String p1= peilv1.getText() ;//取出1的赔率
			     	////System.out.println(p1);
			     	float i1 = Float.parseFloat(p1); //转换成数字
			     	////System.out.println(i1);
			     	
			     	if(i1<336.66)
			     	{
			     		
			     		WebElement checkbox1 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[3]/td[4]/input"));
			     		checkbox1.click();
			     	}//判断1的赔率并下注

			     	WebElement peilv2 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[4]/td[3]"));
			     	String p2= peilv2.getText() ;//取出2的赔率
			     	////System.out.println(p2);
			     	float i2 = Float.parseFloat(p2); //转换成数字
			     	////System.out.println(i2);
			     	//WebElement textbox2 = driver.findElement(By.xpath(".//*[@id='txt2']"));
			     	if(i2<168.33)
			     	{
			     		
			     		WebElement checkbox2 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[4]/td[4]/input"));
			     		checkbox2.click();
			         }
			     	//判断2的赔率并下注
			     	WebElement peilv3 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[5]/td[3]"));
			     	String p3= peilv3.getText() ;//取出13的赔率
			     	////System.out.println(p3);
			     	float i3 = Float.parseFloat(p3); //转换成数字
			     	////System.out.println(i3);
			     	//WebElement textbox3 = driver.findElement(By.xpath(".//*[@id='txt3']"));
			     	if(i3<101)
			     	{
			     		WebElement checkbox3 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[5]/td[4]/input"));
			     		checkbox3.click();
			     	}//判断0的赔率并下注
			     	WebElement peilv4 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[6]/td[3]"));
			     	String p4= peilv4.getText() ;//取出13的赔率
			     	////System.out.println(p4);
			     	float i4 = Float.parseFloat(p4); //转换成数字
			     	////System.out.println(i4);
			     	//WebElement textbox4 = driver.findElement(By.xpath(".//*[@id='txt4']"));
			     	if(i4<67.33)
			     	{
			     		WebElement checkbox4 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[6]/td[4]/input"));
			     		checkbox4.click();
			     	}//判断4的赔率并下注
			     	WebElement peilv5 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[7]/td[3]"));
			     	String p5= peilv5.getText() ;//取出13的赔率
			     	//System.out.println(p5);
			     	float i5 = Float.parseFloat(p5); //转换成数字
			     	////System.out.println(i5);
			     	//WebElement textbox5 = driver.findElement(By.xpath(".//*[@id='txt5']"));
			     	
			     	if(i5<48.1)
			     	{
			     		WebElement checkbox5 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[7]/td[4]/input"));
			     		checkbox5.click();
			     	}//判断5的赔率并下注
			     	WebElement peilv6 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[8]/td[3]"));
			     	String p6= peilv6.getText() ;//取出13的赔率
			     	//System.out.println(p6);
			     	float i6 = Float.parseFloat(p6); //转换成数字
			     	//System.out.println(i6);
			     	//WebElement textbox6 = driver.findElement(By.xpath(".//*[@id='txt6']"));
			     	if(i6<36.07)
			     	{
			     		WebElement checkbox6 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[8]/td[4]/input"));
			     		checkbox6.click();
			     	}//判断6的赔率并下注

			     	WebElement peilv7 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[9]/td[3]"));
			     	String p7= peilv7.getText() ;//取出13的赔率
			     	//System.out.println(p7);
			     	float i7 = Float.parseFloat(p7); //转换成数字
			     	//System.out.println(i7);
			     	//WebElement textbox7 = driver.findElement(By.xpath(".//*[@id='txt7']"));
			     	if(i7<28.05)
			     	{
			     		WebElement checkbox7 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[9]/td[4]/input"));
			     		checkbox7.click();
			     	}//判断7的赔率并下注
			     	shuaxin.click();//点击刷新

			     	
			     	//System.out.println("shuaxin");
			     	try
			     	{
			     		Thread.sleep(50);
			     	}
			     	catch(InterruptedException e)
			     	{
			     		e.printStackTrace();
			     	}	
			     	WebElement peilv8 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[10]/td[3]"));
			     	String p8= peilv8.getText() ;//取出13的赔率
			     	//System.out.println(p8);
			     	float i8 = Float.parseFloat(p8); //转换成数字
			     	//System.out.println(i8);
			     	//WebElement textbox8 = driver.findElement(By.xpath(".//*[@id='txt8']"));
			     	if(i8<22.44)
			     	{
			     		WebElement checkbox8 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[10]/td[4]/input"));
			     		checkbox8.click();
			     	}//判断8的赔率并下注
			     	
			     	WebElement peilv9 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[11]/td[3]"));
			     	String p9= peilv9.getText() ;//取出13的赔率
			     	//System.out.println(p9);
			     	float i9 = Float.parseFloat(p9); //转换成数字
			     	//System.out.println(i9);
			     	//WebElement textbox9 = driver.findElement(By.xpath(".//*[@id='txt9']"));
			     	if(i9<18.36)
			     	{
			     		WebElement checkbox9 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[11]/td[4]/input"));
			     		checkbox9.click();
			     	}//判断9的赔率并下注
			     	
			     	WebElement peilv10 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[12]/td[3]"));
			     	String p10= peilv10.getText() ;//取出13的赔率
			     	//System.out.println(p10);
			     	float i10 = Float.parseFloat(p10); //转换成数字
			     	//System.out.println(i10);
			     	//WebElement textbox10 = driver.findElement(By.xpath(".//*[@id='txt10']"));
			     	if(i10<16.03)
			     	{
			     		WebElement checkbox10 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[12]/td[4]/input"));
			     		checkbox10.click();
			     	}//判断10的赔率并下注
			     	WebElement peilv11 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[13]/td[3]"));
			     	String p11= peilv11.getText() ;//取出13的赔率
			     	//System.out.println(p11);
			     	float i11 = Float.parseFloat(p11); //转换成数字
			     	//System.out.println(i11);
			     	//WebElement textbox11 = driver.findElement(By.xpath(".//*[@id='txt11']"));
			     	if(i11<14.63)
			     	{
			     		WebElement checkbox11 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[13]/td[4]/input"));
			     		checkbox11.click();
			     	}//判断11的赔率并下注
			     	WebElement peilv12 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[14]/td[3]"));
			     	String p12= peilv12.getText() ;//取出13的赔率
			     	//System.out.println(p12);
			     	float i12 = Float.parseFloat(p12); //转换成数字
			     	//System.out.println(i12);
			     	//WebElement textbox12 = driver.findElement(By.xpath(".//*[@id='txt12']"));
			     	if(i12<13.83)
			     	{
			     		WebElement checkbox12 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[14]/td[4]/input"));
			     		checkbox12.click();
			     	}//判断12的赔率并下注
			   
			 	
			     	/*WebElement peilv13 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[15]/td[3]"));
			     	String p13= peilv13.getText() ;//取出13的赔率
			     	//System.out.println(p13);
			     	float i13 = Float.parseFloat(p13); //转换成数字
			     	//System.out.println(i13);
			     	//WebElement textbox13 = driver.findElement(By.xpath(".//*[@id='txt13']"));
			     	if(i13<13.46)
			     	{
			     		WebElement checkbox13 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[15]/td[4]/input"));
			     		checkbox13.click();
			     	}//判断13赔率并下注 */
			     	
			     	shuaxin.click();//点击刷新
			     	//System.out.println("shuaxin");
			     	try
			     	{
			     		Thread.sleep(50);
			     	}
			     	catch(InterruptedException e)
			     	{
			     		e.printStackTrace();
			     	}	
			     	
			     	/*WebElement peilv27 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[2]/td[3]"));
			     	String p27= peilv27.getText() ;//取出27的赔率
			     	//System.out.println(p27);
			     	float i27 = Float.parseFloat(p27); //转换成数字
			     	//System.out.println(i27);
			     	//WebElement textbox27 = driver.findElement(By.xpath(".//*[@id='txt27']"));
			     	if(i27<1010)
			     	{
			     		WebElement checkbox27 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[2]/td[4]/input"));
			     		checkbox27.click();
			     	}//判断0的赔率并下注*/
			     	WebElement peilv26 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[3]/td[3]"));
			     	String p26= peilv26.getText() ;//取出26的赔率
			     	//System.out.println(p26);
			     	float i26 = Float.parseFloat(p26); //转换成数字
			     	//System.out.println(i26);
			     	//WebElement textbox26 = driver.findElement(By.xpath(".//*[@id='txt26']"));
			     	if(i26<336.66)
			     	{
			     		WebElement checkbox26 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[3]/td[4]/input"));
			     		checkbox26.click();
			     	}//判断1的赔率并下注

			     	WebElement peilv25 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[4]/td[3]"));
			     	String p25= peilv25.getText() ;//取出25的赔率
			     	//System.out.println(p25);
			     	float i25 = Float.parseFloat(p25); //转换成数字
			     	//System.out.println(i25);
			     	//WebElement textbox25 = driver.findElement(By.xpath(".//*[@id='txt25']"));
			     	if(i25<168.33)
			     	{
			     		WebElement checkbox25 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[4]/td[4]/input"));
			     		checkbox25.click();
			     	}//判断2的赔率并下注
			     	WebElement peilv24 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[5]/td[3]"));
			     	String p24= peilv24.getText() ;//取出24的赔率
			     	//System.out.println(p24);
			     	float i24 = Float.parseFloat(p24); //转换成数字
			     	//System.out.println(i24);
			     	//WebElement textbox24 = driver.findElement(By.xpath(".//*[@id='txt24']"));
			     	if(i24<101)
			     	{
			     		WebElement checkbox24 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[5]/td[4]/input"));
			     		checkbox24.click();
			     	}//判断0的赔率并下注
			     	WebElement peilv23 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[6]/td[3]"));
			     	String p23= peilv23.getText() ;//取出23的赔率
			     	//System.out.println(p23);
			     	float i23 = Float.parseFloat(p23); //转换成数字
			     	//System.out.println(i23);
			     	//WebElement textbox23 = driver.findElement(By.xpath(".//*[@id='txt23']"));
			     	if(i23<67.33)
			     	{
			     		WebElement checkbox23 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[6]/td[4]/input"));
			     		checkbox23.click();
			     	}//判断23的赔率并下注
			     	WebElement peilv22 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[7]/td[3]"));
			     	String p22= peilv22.getText() ;//取出22的赔率
			     	//System.out.println(p22);
			     	float i22 = Float.parseFloat(p22); //转换成数字
			     	//System.out.println(i22);
			     	//WebElement textbox22 = driver.findElement(By.xpath(".//*[@id='txt22']"));
			     	if(i22<48.09)
			     	{
			     		WebElement checkbox22 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[7]/td[4]/input"));
			     		checkbox22.click();
			     	}//判断22的赔率并下注
			     	WebElement peilv21 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[8]/td[3]"));
			     	String p21= peilv21.getText() ;//取出21的赔率
			     	//System.out.println(p21);
			     	float i21 = Float.parseFloat(p21); //转换成数字
			     	//System.out.println(i21);
			     	//WebElement textbox21 = driver.findElement(By.xpath(".//*[@id='txt21']"));
			     	if(i21<36.07)
			     	{
			     		WebElement checkbox21 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[8]/td[4]/input"));
			     		checkbox21.click();
			     	}//判断21的赔率并下注

			     	WebElement peilv20 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[9]/td[3]"));
			     	String p20= peilv20.getText() ;//取出20的赔率
			     	////System.out.println(p20);
			     	float i20 = Float.parseFloat(p20); //转换成数字
			     	//System.out.println(i20);
			     	//WebElement textbox20 = driver.findElement(By.xpath(".//*[@id='txt20']"));
			     	shuaxin.click();//点击刷新
			     	//System.out.println("shuaxin");
			     	try
			     	{
			     		Thread.sleep(50);
			     	}
			     	catch(InterruptedException e)
			     	{
			     		e.printStackTrace();
			     	}	
			     	if(i20<28.05)
			     	{
			     		WebElement checkbox20 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[9]/td[4]/input"));
			     		checkbox20.click();
			     	}//判断20的赔率并下注
			     	WebElement peilv19 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[10]/td[3]"));
			     	String p19= peilv19.getText() ;//取出19的赔率
			     	////System.out.println(p19);
			     	float i19 = Float.parseFloat(p19); //转换成数字
			     	//System.out.println(i19);
			     	//WebElement textbox19 = driver.findElement(By.xpath(".//*[@id='txt19']"));
			     	if(i19<22.44)
			     	{
			     		WebElement checkbox19 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[10]/td[4]/input"));
			     		checkbox19.click();
			     	}//判断19的赔率并下注
			     	
			     	WebElement peilv18 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[11]/td[3]"));
			     	String p18= peilv18.getText() ;//取出18的赔率
			     	////System.out.println(p18);
			     	float i18 = Float.parseFloat(p18); //转换成数字
			     	//System.out.println(i18);
			     	//WebElement textbox18 = driver.findElement(By.xpath(".//*[@id='txt18']"));
			     	if(i18<18.36)
			     	{
			     		WebElement checkbox18 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[11]/td[4]/input"));
			     		checkbox18.click();
			     	}//判断18的赔率并下注
			     	
			     	WebElement peilv17 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[12]/td[3]"));
			     	String p17= peilv17.getText() ;//取出17的赔率
			     	////System.out.println(p17);
			     	float i17 = Float.parseFloat(p17); //转换成数字
			     	//System.out.println(i17);
			     	//WebElement textbox17 = driver.findElement(By.xpath(".//*[@id='txt17']"));
			     	if(i17<16.03)
			     	{
			     		WebElement checkbox17 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[12]/td[4]/input"));
			     		checkbox17.click();
			     	}//判断17的赔率并下注
			     	WebElement peilv16 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[13]/td[3]"));
			     	String p16= peilv16.getText() ;//取出16的赔率
			     	////System.out.println(p16);
			     	float i16 = Float.parseFloat(p16); //转换成数字
			     	//System.out.println(i16);
			     	//WebElement textbox16 = driver.findElement(By.xpath(".//*[@id='txt16']"));
			     	if(i16<14.64)
			     	{
			     		WebElement checkbox16 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[13]/td[4]/input"));
			     		checkbox16.click();
			     	}//判断16的赔率并下注
			     	WebElement peilv15 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[14]/td[3]"));
			     	String p15= peilv15.getText() ;//取出15的赔率
			     	////System.out.println(p15);
			     	float i15 = Float.parseFloat(p15); //转换成数字
			     	//System.out.println(i15);
			     	//WebElement textbox15 = driver.findElement(By.xpath(".//*[@id='txt15']"));
			     	if(i15<13.83)
			     	{
			     		WebElement checkbox15 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[14]/td[4]/input"));
			     		checkbox15.click();
			     	}//判断15的赔率并下注
			   
			 	
			     	/*WebElement peilv14 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[15]/td[3]"));
			     	String p14= peilv14.getText() ;//取出14的赔率
			     	////System.out.println(p14);
			     	float i14 = Float.parseFloat(p14); //转换成数字
			     	//System.out.println(i14);
			     	//WebElement textbox14 = driver.findElement(By.xpath(".//*[@id='txt14']"));
			     	if(i14<13.46)
			     	{
			     		WebElement checkbox14 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[15]/td[4]/input"));
			     		checkbox14.click();
			     	}//判断14赔率并下注*/ 
			     	
				
				}
					//n = 5;
					break;
				case 5:
				{
					WebElement moshi1 = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[8]/div[2]/div[4]/div[2]/div/div[2]/a[5]"));
			 		moshi1.click();//点击投注模式
			 		
			 		shuaxin = driver.findElement(By.xpath(".//*[@id='form1']/div[8]/div[2]/div[4]/div[4]/div[3]/div[1]"));
			 		shuaxin.click();//点击刷新
			     	//System.out.println("shuaxin");
			     	try
			     	{
			     		Thread.sleep(50);
			     	}
			     	catch(InterruptedException e)
			     	{
			     		e.printStackTrace();
			     	}
			 		
			     	/*WebElement peilv0  = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[2]/td[3]"));
			     	String p0= peilv0.getText() ;//取出0的赔率
			     	////System.out.println(p0);
			     	float i0 = Float.parseFloat(p0); //转换成数字
			     	//System.out.println(i0);
			     	
			     	if(i0<1010)
			     	{
			     		WebElement checkbox0 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[2]/td[4]/input"));
			     		checkbox0.click();
			     		
			     	}//判断0的赔率并下注*/
			     
			     	WebElement peilv1 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[3]/td[3]"));
			     	String p1= peilv1.getText() ;//取出1的赔率
			     	////System.out.println(p1);
			     	float i1 = Float.parseFloat(p1); //转换成数字
			     	////System.out.println(i1);
			     	
			     	if(i1<336.66)
			     	{
			     		
			     		WebElement checkbox1 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[3]/td[4]/input"));
			     		checkbox1.click();
			     	}//判断1的赔率并下注

			     	WebElement peilv2 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[4]/td[3]"));
			     	String p2= peilv2.getText() ;//取出2的赔率
			     	////System.out.println(p2);
			     	float i2 = Float.parseFloat(p2); //转换成数字
			     	////System.out.println(i2);
			     	//WebElement textbox2 = driver.findElement(By.xpath(".//*[@id='txt2']"));
			     	if(i2<168.33)
			     	{
			     		
			     		WebElement checkbox2 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[4]/td[4]/input"));
			     		checkbox2.click();
			         }
			     	//判断2的赔率并下注
			     	WebElement peilv3 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[5]/td[3]"));
			     	String p3= peilv3.getText() ;//取出13的赔率
			     	////System.out.println(p3);
			     	float i3 = Float.parseFloat(p3); //转换成数字
			     	////System.out.println(i3);
			     	//WebElement textbox3 = driver.findElement(By.xpath(".//*[@id='txt3']"));
			     	if(i3<101)
			     	{
			     		WebElement checkbox3 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[5]/td[4]/input"));
			     		checkbox3.click();
			     	}//判断0的赔率并下注
			     	WebElement peilv4 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[6]/td[3]"));
			     	String p4= peilv4.getText() ;//取出13的赔率
			     	////System.out.println(p4);
			     	float i4 = Float.parseFloat(p4); //转换成数字
			     	////System.out.println(i4);
			     	//WebElement textbox4 = driver.findElement(By.xpath(".//*[@id='txt4']"));
			     	if(i4<67.33)
			     	{
			     		WebElement checkbox4 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[6]/td[4]/input"));
			     		checkbox4.click();
			     	}//判断4的赔率并下注
			     	WebElement peilv5 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[7]/td[3]"));
			     	String p5= peilv5.getText() ;//取出13的赔率
			     	//System.out.println(p5);
			     	float i5 = Float.parseFloat(p5); //转换成数字
			     	////System.out.println(i5);
			     	//WebElement textbox5 = driver.findElement(By.xpath(".//*[@id='txt5']"));
			     	
			     	if(i5<48.1)
			     	{
			     		WebElement checkbox5 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[7]/td[4]/input"));
			     		checkbox5.click();
			     	}//判断5的赔率并下注
			     	WebElement peilv6 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[8]/td[3]"));
			     	String p6= peilv6.getText() ;//取出13的赔率
			     	//System.out.println(p6);
			     	float i6 = Float.parseFloat(p6); //转换成数字
			     	//System.out.println(i6);
			     	//WebElement textbox6 = driver.findElement(By.xpath(".//*[@id='txt6']"));
			     	if(i6<36.07)
			     	{
			     		WebElement checkbox6 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[8]/td[4]/input"));
			     		checkbox6.click();
			     	}//判断6的赔率并下注

			     	WebElement peilv7 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[9]/td[3]"));
			     	String p7= peilv7.getText() ;//取出13的赔率
			     	//System.out.println(p7);
			     	float i7 = Float.parseFloat(p7); //转换成数字
			     	//System.out.println(i7);
			     	//WebElement textbox7 = driver.findElement(By.xpath(".//*[@id='txt7']"));
			     	if(i7<28.05)
			     	{
			     		WebElement checkbox7 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[9]/td[4]/input"));
			     		checkbox7.click();
			     	}//判断7的赔率并下注
			     	shuaxin.click();//点击刷新

			     	
			     	//System.out.println("shuaxin");
			     	try
			     	{
			     		Thread.sleep(50);
			     	}
			     	catch(InterruptedException e)
			     	{
			     		e.printStackTrace();
			     	}	
			     	WebElement peilv8 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[10]/td[3]"));
			     	String p8= peilv8.getText() ;//取出13的赔率
			     	//System.out.println(p8);
			     	float i8 = Float.parseFloat(p8); //转换成数字
			     	//System.out.println(i8);
			     	//WebElement textbox8 = driver.findElement(By.xpath(".//*[@id='txt8']"));
			     	if(i8<22.44)
			     	{
			     		WebElement checkbox8 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[10]/td[4]/input"));
			     		checkbox8.click();
			     	}//判断8的赔率并下注
			     	
			     	WebElement peilv9 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[11]/td[3]"));
			     	String p9= peilv9.getText() ;//取出13的赔率
			     	//System.out.println(p9);
			     	float i9 = Float.parseFloat(p9); //转换成数字
			     	//System.out.println(i9);
			     	//WebElement textbox9 = driver.findElement(By.xpath(".//*[@id='txt9']"));
			     	if(i9<18.36)
			     	{
			     		WebElement checkbox9 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[11]/td[4]/input"));
			     		checkbox9.click();
			     	}//判断9的赔率并下注
			     	
			     	WebElement peilv10 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[12]/td[3]"));
			     	String p10= peilv10.getText() ;//取出13的赔率
			     	//System.out.println(p10);
			     	float i10 = Float.parseFloat(p10); //转换成数字
			     	//System.out.println(i10);
			     	//WebElement textbox10 = driver.findElement(By.xpath(".//*[@id='txt10']"));
			     	if(i10<16.03)
			     	{
			     		WebElement checkbox10 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[12]/td[4]/input"));
			     		checkbox10.click();
			     	}//判断10的赔率并下注
			     	WebElement peilv11 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[13]/td[3]"));
			     	String p11= peilv11.getText() ;//取出13的赔率
			     	//System.out.println(p11);
			     	float i11 = Float.parseFloat(p11); //转换成数字
			     	//System.out.println(i11);
			     	//WebElement textbox11 = driver.findElement(By.xpath(".//*[@id='txt11']"));
			     	if(i11<14.63)
			     	{
			     		WebElement checkbox11 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[13]/td[4]/input"));
			     		checkbox11.click();
			     	}//判断11的赔率并下注
			     	WebElement peilv12 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[14]/td[3]"));
			     	String p12= peilv12.getText() ;//取出13的赔率
			     	//System.out.println(p12);
			     	float i12 = Float.parseFloat(p12); //转换成数字
			     	//System.out.println(i12);
			     	//WebElement textbox12 = driver.findElement(By.xpath(".//*[@id='txt12']"));
			     	if(i12<13.83)
			     	{
			     		WebElement checkbox12 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[14]/td[4]/input"));
			     		checkbox12.click();
			     	}//判断12的赔率并下注
			   
			 	
			     	/*WebElement peilv13 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[15]/td[3]"));
			     	String p13= peilv13.getText() ;//取出13的赔率
			     	//System.out.println(p13);
			     	float i13 = Float.parseFloat(p13); //转换成数字
			     	//System.out.println(i13);
			     	//WebElement textbox13 = driver.findElement(By.xpath(".//*[@id='txt13']"));
			     	if(i13<13.46)
			     	{
			     		WebElement checkbox13 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[15]/td[4]/input"));
			     		checkbox13.click();
			     	}//判断13赔率并下注 */
			     	
			     	shuaxin.click();//点击刷新
			     	//System.out.println("shuaxin");
			     	try
			     	{
			     		Thread.sleep(50);
			     	}
			     	catch(InterruptedException e)
			     	{
			     		e.printStackTrace();
			     	}	
			     	
			     	/*WebElement peilv27 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[2]/td[3]"));
			     	String p27= peilv27.getText() ;//取出27的赔率
			     	//System.out.println(p27);
			     	float i27 = Float.parseFloat(p27); //转换成数字
			     	//System.out.println(i27);
			     	//WebElement textbox27 = driver.findElement(By.xpath(".//*[@id='txt27']"));
			     	if(i27<1010)
			     	{
			     		WebElement checkbox27 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[2]/td[4]/input"));
			     		checkbox27.click();
			     	}//判断0的赔率并下注*/
			     	WebElement peilv26 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[3]/td[3]"));
			     	String p26= peilv26.getText() ;//取出26的赔率
			     	//System.out.println(p26);
			     	float i26 = Float.parseFloat(p26); //转换成数字
			     	//System.out.println(i26);
			     	//WebElement textbox26 = driver.findElement(By.xpath(".//*[@id='txt26']"));
			     	if(i26<336.66)
			     	{
			     		WebElement checkbox26 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[3]/td[4]/input"));
			     		checkbox26.click();
			     	}//判断1的赔率并下注

			     	WebElement peilv25 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[4]/td[3]"));
			     	String p25= peilv25.getText() ;//取出25的赔率
			     	//System.out.println(p25);
			     	float i25 = Float.parseFloat(p25); //转换成数字
			     	//System.out.println(i25);
			     	//WebElement textbox25 = driver.findElement(By.xpath(".//*[@id='txt25']"));
			     	if(i25<168.33)
			     	{
			     		WebElement checkbox25 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[4]/td[4]/input"));
			     		checkbox25.click();
			     	}//判断2的赔率并下注
			     	WebElement peilv24 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[5]/td[3]"));
			     	String p24= peilv24.getText() ;//取出24的赔率
			     	//System.out.println(p24);
			     	float i24 = Float.parseFloat(p24); //转换成数字
			     	//System.out.println(i24);
			     	//WebElement textbox24 = driver.findElement(By.xpath(".//*[@id='txt24']"));
			     	if(i24<101)
			     	{
			     		WebElement checkbox24 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[5]/td[4]/input"));
			     		checkbox24.click();
			     	}//判断0的赔率并下注
			     	WebElement peilv23 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[6]/td[3]"));
			     	String p23= peilv23.getText() ;//取出23的赔率
			     	//System.out.println(p23);
			     	float i23 = Float.parseFloat(p23); //转换成数字
			     	//System.out.println(i23);
			     	//WebElement textbox23 = driver.findElement(By.xpath(".//*[@id='txt23']"));
			     	if(i23<67.33)
			     	{
			     		WebElement checkbox23 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[6]/td[4]/input"));
			     		checkbox23.click();
			     	}//判断23的赔率并下注
			     	WebElement peilv22 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[7]/td[3]"));
			     	String p22= peilv22.getText() ;//取出22的赔率
			     	//System.out.println(p22);
			     	float i22 = Float.parseFloat(p22); //转换成数字
			     	//System.out.println(i22);
			     	//WebElement textbox22 = driver.findElement(By.xpath(".//*[@id='txt22']"));
			     	if(i22<48.09)
			     	{
			     		WebElement checkbox22 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[7]/td[4]/input"));
			     		checkbox22.click();
			     	}//判断22的赔率并下注
			     	WebElement peilv21 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[8]/td[3]"));
			     	String p21= peilv21.getText() ;//取出21的赔率
			     	//System.out.println(p21);
			     	float i21 = Float.parseFloat(p21); //转换成数字
			     	//System.out.println(i21);
			     	//WebElement textbox21 = driver.findElement(By.xpath(".//*[@id='txt21']"));
			     	if(i21<36.07)
			     	{
			     		WebElement checkbox21 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[8]/td[4]/input"));
			     		checkbox21.click();
			     	}//判断21的赔率并下注

			     	WebElement peilv20 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[9]/td[3]"));
			     	String p20= peilv20.getText() ;//取出20的赔率
			     	////System.out.println(p20);
			     	float i20 = Float.parseFloat(p20); //转换成数字
			     	//System.out.println(i20);
			     	//WebElement textbox20 = driver.findElement(By.xpath(".//*[@id='txt20']"));
			     	shuaxin.click();//点击刷新
			     	//System.out.println("shuaxin");
			     	try
			     	{
			     		Thread.sleep(50);
			     	}
			     	catch(InterruptedException e)
			     	{
			     		e.printStackTrace();
			     	}	
			     	if(i20<28.05)
			     	{
			     		WebElement checkbox20 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[9]/td[4]/input"));
			     		checkbox20.click();
			     	}//判断20的赔率并下注
			     	WebElement peilv19 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[10]/td[3]"));
			     	String p19= peilv19.getText() ;//取出19的赔率
			     	////System.out.println(p19);
			     	float i19 = Float.parseFloat(p19); //转换成数字
			     	//System.out.println(i19);
			     	//WebElement textbox19 = driver.findElement(By.xpath(".//*[@id='txt19']"));
			     	if(i19<22.44)
			     	{
			     		WebElement checkbox19 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[10]/td[4]/input"));
			     		checkbox19.click();
			     	}//判断19的赔率并下注
			     	
			     	WebElement peilv18 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[11]/td[3]"));
			     	String p18= peilv18.getText() ;//取出18的赔率
			     	////System.out.println(p18);
			     	float i18 = Float.parseFloat(p18); //转换成数字
			     	//System.out.println(i18);
			     	//WebElement textbox18 = driver.findElement(By.xpath(".//*[@id='txt18']"));
			     	if(i18<18.36)
			     	{
			     		WebElement checkbox18 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[11]/td[4]/input"));
			     		checkbox18.click();
			     	}//判断18的赔率并下注
			     	
			     	WebElement peilv17 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[12]/td[3]"));
			     	String p17= peilv17.getText() ;//取出17的赔率
			     	////System.out.println(p17);
			     	float i17 = Float.parseFloat(p17); //转换成数字
			     	//System.out.println(i17);
			     	//WebElement textbox17 = driver.findElement(By.xpath(".//*[@id='txt17']"));
			     	if(i17<16.03)
			     	{
			     		WebElement checkbox17 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[12]/td[4]/input"));
			     		checkbox17.click();
			     	}//判断17的赔率并下注
			     	WebElement peilv16 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[13]/td[3]"));
			     	String p16= peilv16.getText() ;//取出16的赔率
			     	////System.out.println(p16);
			     	float i16 = Float.parseFloat(p16); //转换成数字
			     	//System.out.println(i16);
			     	//WebElement textbox16 = driver.findElement(By.xpath(".//*[@id='txt16']"));
			     	if(i16<14.64)
			     	{
			     		WebElement checkbox16 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[13]/td[4]/input"));
			     		checkbox16.click();
			     	}//判断16的赔率并下注
			     	WebElement peilv15 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[14]/td[3]"));
			     	String p15= peilv15.getText() ;//取出15的赔率
			     	////System.out.println(p15);
			     	float i15 = Float.parseFloat(p15); //转换成数字
			     	//System.out.println(i15);
			     	//WebElement textbox15 = driver.findElement(By.xpath(".//*[@id='txt15']"));
			     	if(i15<13.83)
			     	{
			     		WebElement checkbox15 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[14]/td[4]/input"));
			     		checkbox15.click();
			     	}//判断15的赔率并下注
			   
			 	
			     	/*WebElement peilv14 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[15]/td[3]"));
			     	String p14= peilv14.getText() ;//取出14的赔率
			     	////System.out.println(p14);
			     	float i14 = Float.parseFloat(p14); //转换成数字
			     	//System.out.println(i14);
			     	//WebElement textbox14 = driver.findElement(By.xpath(".//*[@id='txt14']"));
			     	if(i14<13.46)
			     	{
			     		WebElement checkbox14 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[15]/td[4]/input"));
			     		checkbox14.click();
			     	}//判断14赔率并下注*/ 
			     	
				
				}
					//n = 5;
					break;
				case 6:
				{
					WebElement moshi1 = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[8]/div[2]/div[4]/div[2]/div/div[2]/a[5]"));
			 		moshi1.click();//点击投注模式
			 		
			 		shuaxin = driver.findElement(By.xpath(".//*[@id='form1']/div[8]/div[2]/div[4]/div[4]/div[3]/div[1]"));
			 		shuaxin.click();//点击刷新
			     	//System.out.println("shuaxin");
			     	try
			     	{
			     		Thread.sleep(50);
			     	}
			     	catch(InterruptedException e)
			     	{
			     		e.printStackTrace();
			     	}
			 		
			     	/*WebElement peilv0  = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[2]/td[3]"));
			     	String p0= peilv0.getText() ;//取出0的赔率
			     	////System.out.println(p0);
			     	float i0 = Float.parseFloat(p0); //转换成数字
			     	//System.out.println(i0);
			     	
			     	if(i0<1010)
			     	{
			     		WebElement checkbox0 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[2]/td[4]/input"));
			     		checkbox0.click();
			     		
			     	}//判断0的赔率并下注*/
			     
			     	WebElement peilv1 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[3]/td[3]"));
			     	String p1= peilv1.getText() ;//取出1的赔率
			     	////System.out.println(p1);
			     	float i1 = Float.parseFloat(p1); //转换成数字
			     	////System.out.println(i1);
			     	
			     	if(i1<336.66)
			     	{
			     		
			     		WebElement checkbox1 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[3]/td[4]/input"));
			     		checkbox1.click();
			     	}//判断1的赔率并下注

			     	WebElement peilv2 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[4]/td[3]"));
			     	String p2= peilv2.getText() ;//取出2的赔率
			     	////System.out.println(p2);
			     	float i2 = Float.parseFloat(p2); //转换成数字
			     	////System.out.println(i2);
			     	//WebElement textbox2 = driver.findElement(By.xpath(".//*[@id='txt2']"));
			     	if(i2<168.33)
			     	{
			     		
			     		WebElement checkbox2 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[4]/td[4]/input"));
			     		checkbox2.click();
			         }
			     	//判断2的赔率并下注
			     	WebElement peilv3 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[5]/td[3]"));
			     	String p3= peilv3.getText() ;//取出13的赔率
			     	////System.out.println(p3);
			     	float i3 = Float.parseFloat(p3); //转换成数字
			     	////System.out.println(i3);
			     	//WebElement textbox3 = driver.findElement(By.xpath(".//*[@id='txt3']"));
			     	if(i3<101)
			     	{
			     		WebElement checkbox3 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[5]/td[4]/input"));
			     		checkbox3.click();
			     	}//判断0的赔率并下注
			     	WebElement peilv4 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[6]/td[3]"));
			     	String p4= peilv4.getText() ;//取出13的赔率
			     	////System.out.println(p4);
			     	float i4 = Float.parseFloat(p4); //转换成数字
			     	////System.out.println(i4);
			     	//WebElement textbox4 = driver.findElement(By.xpath(".//*[@id='txt4']"));
			     	if(i4<67.33)
			     	{
			     		WebElement checkbox4 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[6]/td[4]/input"));
			     		checkbox4.click();
			     	}//判断4的赔率并下注
			     	WebElement peilv5 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[7]/td[3]"));
			     	String p5= peilv5.getText() ;//取出13的赔率
			     	//System.out.println(p5);
			     	float i5 = Float.parseFloat(p5); //转换成数字
			     	////System.out.println(i5);
			     	//WebElement textbox5 = driver.findElement(By.xpath(".//*[@id='txt5']"));
			     	
			     	if(i5<48.1)
			     	{
			     		WebElement checkbox5 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[7]/td[4]/input"));
			     		checkbox5.click();
			     	}//判断5的赔率并下注
			     	WebElement peilv6 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[8]/td[3]"));
			     	String p6= peilv6.getText() ;//取出13的赔率
			     	//System.out.println(p6);
			     	float i6 = Float.parseFloat(p6); //转换成数字
			     	//System.out.println(i6);
			     	//WebElement textbox6 = driver.findElement(By.xpath(".//*[@id='txt6']"));
			     	if(i6<36.07)
			     	{
			     		WebElement checkbox6 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[8]/td[4]/input"));
			     		checkbox6.click();
			     	}//判断6的赔率并下注

			     	WebElement peilv7 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[9]/td[3]"));
			     	String p7= peilv7.getText() ;//取出13的赔率
			     	//System.out.println(p7);
			     	float i7 = Float.parseFloat(p7); //转换成数字
			     	//System.out.println(i7);
			     	//WebElement textbox7 = driver.findElement(By.xpath(".//*[@id='txt7']"));
			     	if(i7<28.05)
			     	{
			     		WebElement checkbox7 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[9]/td[4]/input"));
			     		checkbox7.click();
			     	}//判断7的赔率并下注
			     	shuaxin.click();//点击刷新

			     	
			     	//System.out.println("shuaxin");
			     	try
			     	{
			     		Thread.sleep(50);
			     	}
			     	catch(InterruptedException e)
			     	{
			     		e.printStackTrace();
			     	}	
			     	WebElement peilv8 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[10]/td[3]"));
			     	String p8= peilv8.getText() ;//取出13的赔率
			     	//System.out.println(p8);
			     	float i8 = Float.parseFloat(p8); //转换成数字
			     	//System.out.println(i8);
			     	//WebElement textbox8 = driver.findElement(By.xpath(".//*[@id='txt8']"));
			     	if(i8<22.44)
			     	{
			     		WebElement checkbox8 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[10]/td[4]/input"));
			     		checkbox8.click();
			     	}//判断8的赔率并下注
			     	
			     	WebElement peilv9 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[11]/td[3]"));
			     	String p9= peilv9.getText() ;//取出13的赔率
			     	//System.out.println(p9);
			     	float i9 = Float.parseFloat(p9); //转换成数字
			     	//System.out.println(i9);
			     	//WebElement textbox9 = driver.findElement(By.xpath(".//*[@id='txt9']"));
			     	if(i9<18.36)
			     	{
			     		WebElement checkbox9 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[11]/td[4]/input"));
			     		checkbox9.click();
			     	}//判断9的赔率并下注
			     	
			     	WebElement peilv10 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[12]/td[3]"));
			     	String p10= peilv10.getText() ;//取出13的赔率
			     	//System.out.println(p10);
			     	float i10 = Float.parseFloat(p10); //转换成数字
			     	//System.out.println(i10);
			     	//WebElement textbox10 = driver.findElement(By.xpath(".//*[@id='txt10']"));
			     	if(i10<16.03)
			     	{
			     		WebElement checkbox10 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[12]/td[4]/input"));
			     		checkbox10.click();
			     	}//判断10的赔率并下注
			     	WebElement peilv11 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[13]/td[3]"));
			     	String p11= peilv11.getText() ;//取出13的赔率
			     	//System.out.println(p11);
			     	float i11 = Float.parseFloat(p11); //转换成数字
			     	//System.out.println(i11);
			     	//WebElement textbox11 = driver.findElement(By.xpath(".//*[@id='txt11']"));
			     	if(i11<14.63)
			     	{
			     		WebElement checkbox11 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[13]/td[4]/input"));
			     		checkbox11.click();
			     	}//判断11的赔率并下注
			     	WebElement peilv12 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[14]/td[3]"));
			     	String p12= peilv12.getText() ;//取出13的赔率
			     	//System.out.println(p12);
			     	float i12 = Float.parseFloat(p12); //转换成数字
			     	//System.out.println(i12);
			     	//WebElement textbox12 = driver.findElement(By.xpath(".//*[@id='txt12']"));
			     	if(i12<13.83)
			     	{
			     		WebElement checkbox12 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[14]/td[4]/input"));
			     		checkbox12.click();
			     	}//判断12的赔率并下注
			   
			 	
			     	/*WebElement peilv13 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[15]/td[3]"));
			     	String p13= peilv13.getText() ;//取出13的赔率
			     	//System.out.println(p13);
			     	float i13 = Float.parseFloat(p13); //转换成数字
			     	//System.out.println(i13);
			     	//WebElement textbox13 = driver.findElement(By.xpath(".//*[@id='txt13']"));
			     	if(i13<13.46)
			     	{
			     		WebElement checkbox13 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[15]/td[4]/input"));
			     		checkbox13.click();
			     	}//判断13赔率并下注 */
			     	
			     	shuaxin.click();//点击刷新
			     	//System.out.println("shuaxin");
			     	try
			     	{
			     		Thread.sleep(50);
			     	}
			     	catch(InterruptedException e)
			     	{
			     		e.printStackTrace();
			     	}	
			     	
			     	/*WebElement peilv27 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[2]/td[3]"));
			     	String p27= peilv27.getText() ;//取出27的赔率
			     	//System.out.println(p27);
			     	float i27 = Float.parseFloat(p27); //转换成数字
			     	//System.out.println(i27);
			     	//WebElement textbox27 = driver.findElement(By.xpath(".//*[@id='txt27']"));
			     	if(i27<1010)
			     	{
			     		WebElement checkbox27 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[2]/td[4]/input"));
			     		checkbox27.click();
			     	}//判断0的赔率并下注*/
			     	WebElement peilv26 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[3]/td[3]"));
			     	String p26= peilv26.getText() ;//取出26的赔率
			     	//System.out.println(p26);
			     	float i26 = Float.parseFloat(p26); //转换成数字
			     	//System.out.println(i26);
			     	//WebElement textbox26 = driver.findElement(By.xpath(".//*[@id='txt26']"));
			     	if(i26<336.66)
			     	{
			     		WebElement checkbox26 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[3]/td[4]/input"));
			     		checkbox26.click();
			     	}//判断1的赔率并下注

			     	WebElement peilv25 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[4]/td[3]"));
			     	String p25= peilv25.getText() ;//取出25的赔率
			     	//System.out.println(p25);
			     	float i25 = Float.parseFloat(p25); //转换成数字
			     	//System.out.println(i25);
			     	//WebElement textbox25 = driver.findElement(By.xpath(".//*[@id='txt25']"));
			     	if(i25<168.33)
			     	{
			     		WebElement checkbox25 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[4]/td[4]/input"));
			     		checkbox25.click();
			     	}//判断2的赔率并下注
			     	WebElement peilv24 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[5]/td[3]"));
			     	String p24= peilv24.getText() ;//取出24的赔率
			     	//System.out.println(p24);
			     	float i24 = Float.parseFloat(p24); //转换成数字
			     	//System.out.println(i24);
			     	//WebElement textbox24 = driver.findElement(By.xpath(".//*[@id='txt24']"));
			     	if(i24<101)
			     	{
			     		WebElement checkbox24 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[5]/td[4]/input"));
			     		checkbox24.click();
			     	}//判断0的赔率并下注
			     	WebElement peilv23 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[6]/td[3]"));
			     	String p23= peilv23.getText() ;//取出23的赔率
			     	//System.out.println(p23);
			     	float i23 = Float.parseFloat(p23); //转换成数字
			     	//System.out.println(i23);
			     	//WebElement textbox23 = driver.findElement(By.xpath(".//*[@id='txt23']"));
			     	if(i23<67.33)
			     	{
			     		WebElement checkbox23 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[6]/td[4]/input"));
			     		checkbox23.click();
			     	}//判断23的赔率并下注
			     	WebElement peilv22 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[7]/td[3]"));
			     	String p22= peilv22.getText() ;//取出22的赔率
			     	//System.out.println(p22);
			     	float i22 = Float.parseFloat(p22); //转换成数字
			     	//System.out.println(i22);
			     	//WebElement textbox22 = driver.findElement(By.xpath(".//*[@id='txt22']"));
			     	if(i22<48.09)
			     	{
			     		WebElement checkbox22 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[7]/td[4]/input"));
			     		checkbox22.click();
			     	}//判断22的赔率并下注
			     	WebElement peilv21 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[8]/td[3]"));
			     	String p21= peilv21.getText() ;//取出21的赔率
			     	//System.out.println(p21);
			     	float i21 = Float.parseFloat(p21); //转换成数字
			     	//System.out.println(i21);
			     	//WebElement textbox21 = driver.findElement(By.xpath(".//*[@id='txt21']"));
			     	if(i21<36.07)
			     	{
			     		WebElement checkbox21 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[8]/td[4]/input"));
			     		checkbox21.click();
			     	}//判断21的赔率并下注

			     	WebElement peilv20 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[9]/td[3]"));
			     	String p20= peilv20.getText() ;//取出20的赔率
			     	////System.out.println(p20);
			     	float i20 = Float.parseFloat(p20); //转换成数字
			     	//System.out.println(i20);
			     	//WebElement textbox20 = driver.findElement(By.xpath(".//*[@id='txt20']"));
			     	shuaxin.click();//点击刷新
			     	//System.out.println("shuaxin");
			     	try
			     	{
			     		Thread.sleep(50);
			     	}
			     	catch(InterruptedException e)
			     	{
			     		e.printStackTrace();
			     	}	
			     	if(i20<28.05)
			     	{
			     		WebElement checkbox20 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[9]/td[4]/input"));
			     		checkbox20.click();
			     	}//判断20的赔率并下注
			     	WebElement peilv19 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[10]/td[3]"));
			     	String p19= peilv19.getText() ;//取出19的赔率
			     	////System.out.println(p19);
			     	float i19 = Float.parseFloat(p19); //转换成数字
			     	//System.out.println(i19);
			     	//WebElement textbox19 = driver.findElement(By.xpath(".//*[@id='txt19']"));
			     	if(i19<22.44)
			     	{
			     		WebElement checkbox19 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[10]/td[4]/input"));
			     		checkbox19.click();
			     	}//判断19的赔率并下注
			     	
			     	WebElement peilv18 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[11]/td[3]"));
			     	String p18= peilv18.getText() ;//取出18的赔率
			     	////System.out.println(p18);
			     	float i18 = Float.parseFloat(p18); //转换成数字
			     	//System.out.println(i18);
			     	//WebElement textbox18 = driver.findElement(By.xpath(".//*[@id='txt18']"));
			     	if(i18<18.36)
			     	{
			     		WebElement checkbox18 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[11]/td[4]/input"));
			     		checkbox18.click();
			     	}//判断18的赔率并下注
			     	
			     	WebElement peilv17 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[12]/td[3]"));
			     	String p17= peilv17.getText() ;//取出17的赔率
			     	////System.out.println(p17);
			     	float i17 = Float.parseFloat(p17); //转换成数字
			     	//System.out.println(i17);
			     	//WebElement textbox17 = driver.findElement(By.xpath(".//*[@id='txt17']"));
			     	if(i17<16.03)
			     	{
			     		WebElement checkbox17 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[12]/td[4]/input"));
			     		checkbox17.click();
			     	}//判断17的赔率并下注
			     	WebElement peilv16 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[13]/td[3]"));
			     	String p16= peilv16.getText() ;//取出16的赔率
			     	////System.out.println(p16);
			     	float i16 = Float.parseFloat(p16); //转换成数字
			     	//System.out.println(i16);
			     	//WebElement textbox16 = driver.findElement(By.xpath(".//*[@id='txt16']"));
			     	if(i16<14.64)
			     	{
			     		WebElement checkbox16 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[13]/td[4]/input"));
			     		checkbox16.click();
			     	}//判断16的赔率并下注
			     	WebElement peilv15 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[14]/td[3]"));
			     	String p15= peilv15.getText() ;//取出15的赔率
			     	////System.out.println(p15);
			     	float i15 = Float.parseFloat(p15); //转换成数字
			     	//System.out.println(i15);
			     	//WebElement textbox15 = driver.findElement(By.xpath(".//*[@id='txt15']"));
			     	if(i15<13.83)
			     	{
			     		WebElement checkbox15 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[14]/td[4]/input"));
			     		checkbox15.click();
			     	}//判断15的赔率并下注
			   
			 	
			     	/*WebElement peilv14 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[15]/td[3]"));
			     	String p14= peilv14.getText() ;//取出14的赔率
			     	////System.out.println(p14);
			     	float i14 = Float.parseFloat(p14); //转换成数字
			     	//System.out.println(i14);
			     	//WebElement textbox14 = driver.findElement(By.xpath(".//*[@id='txt14']"));
			     	if(i14<13.46)
			     	{
			     		WebElement checkbox14 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[15]/td[4]/input"));
			     		checkbox14.click();
			     	}//判断14赔率并下注*/ 
			     	
				
				}
					//n = 5;
					break;
				case 7:
				{
					WebElement moshi1 = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[8]/div[2]/div[4]/div[2]/div/div[2]/a[4]"));
			 		moshi1.click();//点击投注模式
			 		
			 		shuaxin = driver.findElement(By.xpath(".//*[@id='form1']/div[8]/div[2]/div[4]/div[4]/div[3]/div[1]"));
			 		shuaxin.click();//点击刷新
			     	//System.out.println("shuaxin");
			     	try
			     	{
			     		Thread.sleep(50);
			     	}
			     	catch(InterruptedException e)
			     	{
			     		e.printStackTrace();
			     	}
			 		
			     	/*WebElement peilv0  = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[2]/td[3]"));
			     	String p0= peilv0.getText() ;//取出0的赔率
			     	////System.out.println(p0);
			     	float i0 = Float.parseFloat(p0); //转换成数字
			     	//System.out.println(i0);
			     	
			     	if(i0<1010)
			     	{
			     		WebElement checkbox0 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[2]/td[4]/input"));
			     		checkbox0.click();
			     		
			     	}//判断0的赔率并下注*/
			     
			     	WebElement peilv1 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[3]/td[3]"));
			     	String p1= peilv1.getText() ;//取出1的赔率
			     	////System.out.println(p1);
			     	float i1 = Float.parseFloat(p1); //转换成数字
			     	////System.out.println(i1);
			     	
			     	if(i1<336.66)
			     	{
			     		
			     		WebElement checkbox1 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[3]/td[4]/input"));
			     		checkbox1.click();
			     	}//判断1的赔率并下注

			     	WebElement peilv2 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[4]/td[3]"));
			     	String p2= peilv2.getText() ;//取出2的赔率
			     	////System.out.println(p2);
			     	float i2 = Float.parseFloat(p2); //转换成数字
			     	////System.out.println(i2);
			     	//WebElement textbox2 = driver.findElement(By.xpath(".//*[@id='txt2']"));
			     	if(i2<168.33)
			     	{
			     		
			     		WebElement checkbox2 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[4]/td[4]/input"));
			     		checkbox2.click();
			         }
			     	//判断2的赔率并下注
			     	WebElement peilv3 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[5]/td[3]"));
			     	String p3= peilv3.getText() ;//取出13的赔率
			     	////System.out.println(p3);
			     	float i3 = Float.parseFloat(p3); //转换成数字
			     	////System.out.println(i3);
			     	//WebElement textbox3 = driver.findElement(By.xpath(".//*[@id='txt3']"));
			     	if(i3<101)
			     	{
			     		WebElement checkbox3 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[5]/td[4]/input"));
			     		checkbox3.click();
			     	}//判断0的赔率并下注
			     	WebElement peilv4 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[6]/td[3]"));
			     	String p4= peilv4.getText() ;//取出13的赔率
			     	////System.out.println(p4);
			     	float i4 = Float.parseFloat(p4); //转换成数字
			     	////System.out.println(i4);
			     	//WebElement textbox4 = driver.findElement(By.xpath(".//*[@id='txt4']"));
			     	if(i4<67.33)
			     	{
			     		WebElement checkbox4 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[6]/td[4]/input"));
			     		checkbox4.click();
			     	}//判断4的赔率并下注
			     	WebElement peilv5 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[7]/td[3]"));
			     	String p5= peilv5.getText() ;//取出13的赔率
			     	//System.out.println(p5);
			     	float i5 = Float.parseFloat(p5); //转换成数字
			     	////System.out.println(i5);
			     	//WebElement textbox5 = driver.findElement(By.xpath(".//*[@id='txt5']"));
			     	
			     	if(i5<48.1)
			     	{
			     		WebElement checkbox5 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[7]/td[4]/input"));
			     		checkbox5.click();
			     	}//判断5的赔率并下注
			     	WebElement peilv6 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[8]/td[3]"));
			     	String p6= peilv6.getText() ;//取出13的赔率
			     	//System.out.println(p6);
			     	float i6 = Float.parseFloat(p6); //转换成数字
			     	//System.out.println(i6);
			     	//WebElement textbox6 = driver.findElement(By.xpath(".//*[@id='txt6']"));
			     	if(i6<36.07)
			     	{
			     		WebElement checkbox6 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[8]/td[4]/input"));
			     		checkbox6.click();
			     	}//判断6的赔率并下注

			     	WebElement peilv7 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[9]/td[3]"));
			     	String p7= peilv7.getText() ;//取出13的赔率
			     	//System.out.println(p7);
			     	float i7 = Float.parseFloat(p7); //转换成数字
			     	//System.out.println(i7);
			     	//WebElement textbox7 = driver.findElement(By.xpath(".//*[@id='txt7']"));
			     	if(i7<28.05)
			     	{
			     		WebElement checkbox7 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[9]/td[4]/input"));
			     		checkbox7.click();
			     	}//判断7的赔率并下注
			     	shuaxin.click();//点击刷新

			     	
			     	//System.out.println("shuaxin");
			     	try
			     	{
			     		Thread.sleep(50);
			     	}
			     	catch(InterruptedException e)
			     	{
			     		e.printStackTrace();
			     	}	
			     	WebElement peilv8 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[10]/td[3]"));
			     	String p8= peilv8.getText() ;//取出13的赔率
			     	//System.out.println(p8);
			     	float i8 = Float.parseFloat(p8); //转换成数字
			     	//System.out.println(i8);
			     	//WebElement textbox8 = driver.findElement(By.xpath(".//*[@id='txt8']"));
			     	if(i8<22.44)
			     	{
			     		WebElement checkbox8 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[10]/td[4]/input"));
			     		checkbox8.click();
			     	}//判断8的赔率并下注
			     	
			     	WebElement peilv9 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[11]/td[3]"));
			     	String p9= peilv9.getText() ;//取出13的赔率
			     	//System.out.println(p9);
			     	float i9 = Float.parseFloat(p9); //转换成数字
			     	//System.out.println(i9);
			     	//WebElement textbox9 = driver.findElement(By.xpath(".//*[@id='txt9']"));
			     	if(i9<18.36)
			     	{
			     		WebElement checkbox9 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[11]/td[4]/input"));
			     		checkbox9.click();
			     	}//判断9的赔率并下注
			     	
			     	WebElement peilv10 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[12]/td[3]"));
			     	String p10= peilv10.getText() ;//取出13的赔率
			     	//System.out.println(p10);
			     	float i10 = Float.parseFloat(p10); //转换成数字
			     	//System.out.println(i10);
			     	//WebElement textbox10 = driver.findElement(By.xpath(".//*[@id='txt10']"));
			     	if(i10<16.03)
			     	{
			     		WebElement checkbox10 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[12]/td[4]/input"));
			     		checkbox10.click();
			     	}//判断10的赔率并下注
			     	WebElement peilv11 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[13]/td[3]"));
			     	String p11= peilv11.getText() ;//取出13的赔率
			     	//System.out.println(p11);
			     	float i11 = Float.parseFloat(p11); //转换成数字
			     	//System.out.println(i11);
			     	//WebElement textbox11 = driver.findElement(By.xpath(".//*[@id='txt11']"));
			     	if(i11<14.63)
			     	{
			     		WebElement checkbox11 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[13]/td[4]/input"));
			     		checkbox11.click();
			     	}//判断11的赔率并下注
			     	WebElement peilv12 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[14]/td[3]"));
			     	String p12= peilv12.getText() ;//取出13的赔率
			     	//System.out.println(p12);
			     	float i12 = Float.parseFloat(p12); //转换成数字
			     	//System.out.println(i12);
			     	//WebElement textbox12 = driver.findElement(By.xpath(".//*[@id='txt12']"));
			     	if(i12<13.83)
			     	{
			     		WebElement checkbox12 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[14]/td[4]/input"));
			     		checkbox12.click();
			     	}//判断12的赔率并下注
			   
			 	
			     	/*WebElement peilv13 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[15]/td[3]"));
			     	String p13= peilv13.getText() ;//取出13的赔率
			     	//System.out.println(p13);
			     	float i13 = Float.parseFloat(p13); //转换成数字
			     	//System.out.println(i13);
			     	//WebElement textbox13 = driver.findElement(By.xpath(".//*[@id='txt13']"));
			     	if(i13<13.46)
			     	{
			     		WebElement checkbox13 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[15]/td[4]/input"));
			     		checkbox13.click();
			     	}//判断13赔率并下注 */
			     	
			     	shuaxin.click();//点击刷新
			     	//System.out.println("shuaxin");
			     	try
			     	{
			     		Thread.sleep(50);
			     	}
			     	catch(InterruptedException e)
			     	{
			     		e.printStackTrace();
			     	}	
			     	
			     	/*WebElement peilv27 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[2]/td[3]"));
			     	String p27= peilv27.getText() ;//取出27的赔率
			     	//System.out.println(p27);
			     	float i27 = Float.parseFloat(p27); //转换成数字
			     	//System.out.println(i27);
			     	//WebElement textbox27 = driver.findElement(By.xpath(".//*[@id='txt27']"));
			     	if(i27<1010)
			     	{
			     		WebElement checkbox27 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[2]/td[4]/input"));
			     		checkbox27.click();
			     	}//判断0的赔率并下注*/
			     	WebElement peilv26 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[3]/td[3]"));
			     	String p26= peilv26.getText() ;//取出26的赔率
			     	//System.out.println(p26);
			     	float i26 = Float.parseFloat(p26); //转换成数字
			     	//System.out.println(i26);
			     	//WebElement textbox26 = driver.findElement(By.xpath(".//*[@id='txt26']"));
			     	if(i26<336.66)
			     	{
			     		WebElement checkbox26 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[3]/td[4]/input"));
			     		checkbox26.click();
			     	}//判断1的赔率并下注

			     	WebElement peilv25 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[4]/td[3]"));
			     	String p25= peilv25.getText() ;//取出25的赔率
			     	//System.out.println(p25);
			     	float i25 = Float.parseFloat(p25); //转换成数字
			     	//System.out.println(i25);
			     	//WebElement textbox25 = driver.findElement(By.xpath(".//*[@id='txt25']"));
			     	if(i25<168.33)
			     	{
			     		WebElement checkbox25 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[4]/td[4]/input"));
			     		checkbox25.click();
			     	}//判断2的赔率并下注
			     	WebElement peilv24 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[5]/td[3]"));
			     	String p24= peilv24.getText() ;//取出24的赔率
			     	//System.out.println(p24);
			     	float i24 = Float.parseFloat(p24); //转换成数字
			     	//System.out.println(i24);
			     	//WebElement textbox24 = driver.findElement(By.xpath(".//*[@id='txt24']"));
			     	if(i24<101)
			     	{
			     		WebElement checkbox24 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[5]/td[4]/input"));
			     		checkbox24.click();
			     	}//判断0的赔率并下注
			     	WebElement peilv23 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[6]/td[3]"));
			     	String p23= peilv23.getText() ;//取出23的赔率
			     	//System.out.println(p23);
			     	float i23 = Float.parseFloat(p23); //转换成数字
			     	//System.out.println(i23);
			     	//WebElement textbox23 = driver.findElement(By.xpath(".//*[@id='txt23']"));
			     	if(i23<67.33)
			     	{
			     		WebElement checkbox23 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[6]/td[4]/input"));
			     		checkbox23.click();
			     	}//判断23的赔率并下注
			     	WebElement peilv22 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[7]/td[3]"));
			     	String p22= peilv22.getText() ;//取出22的赔率
			     	//System.out.println(p22);
			     	float i22 = Float.parseFloat(p22); //转换成数字
			     	//System.out.println(i22);
			     	//WebElement textbox22 = driver.findElement(By.xpath(".//*[@id='txt22']"));
			     	if(i22<48.09)
			     	{
			     		WebElement checkbox22 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[7]/td[4]/input"));
			     		checkbox22.click();
			     	}//判断22的赔率并下注
			     	WebElement peilv21 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[8]/td[3]"));
			     	String p21= peilv21.getText() ;//取出21的赔率
			     	//System.out.println(p21);
			     	float i21 = Float.parseFloat(p21); //转换成数字
			     	//System.out.println(i21);
			     	//WebElement textbox21 = driver.findElement(By.xpath(".//*[@id='txt21']"));
			     	if(i21<36.07)
			     	{
			     		WebElement checkbox21 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[8]/td[4]/input"));
			     		checkbox21.click();
			     	}//判断21的赔率并下注

			     	WebElement peilv20 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[9]/td[3]"));
			     	String p20= peilv20.getText() ;//取出20的赔率
			     	////System.out.println(p20);
			     	float i20 = Float.parseFloat(p20); //转换成数字
			     	//System.out.println(i20);
			     	//WebElement textbox20 = driver.findElement(By.xpath(".//*[@id='txt20']"));
			     	shuaxin.click();//点击刷新
			     	//System.out.println("shuaxin");
			     	try
			     	{
			     		Thread.sleep(50);
			     	}
			     	catch(InterruptedException e)
			     	{
			     		e.printStackTrace();
			     	}	
			     	if(i20<28.05)
			     	{
			     		WebElement checkbox20 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[9]/td[4]/input"));
			     		checkbox20.click();
			     	}//判断20的赔率并下注
			     	WebElement peilv19 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[10]/td[3]"));
			     	String p19= peilv19.getText() ;//取出19的赔率
			     	////System.out.println(p19);
			     	float i19 = Float.parseFloat(p19); //转换成数字
			     	//System.out.println(i19);
			     	//WebElement textbox19 = driver.findElement(By.xpath(".//*[@id='txt19']"));
			     	if(i19<22.44)
			     	{
			     		WebElement checkbox19 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[10]/td[4]/input"));
			     		checkbox19.click();
			     	}//判断19的赔率并下注
			     	
			     	WebElement peilv18 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[11]/td[3]"));
			     	String p18= peilv18.getText() ;//取出18的赔率
			     	////System.out.println(p18);
			     	float i18 = Float.parseFloat(p18); //转换成数字
			     	//System.out.println(i18);
			     	//WebElement textbox18 = driver.findElement(By.xpath(".//*[@id='txt18']"));
			     	if(i18<18.36)
			     	{
			     		WebElement checkbox18 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[11]/td[4]/input"));
			     		checkbox18.click();
			     	}//判断18的赔率并下注
			     	
			     	WebElement peilv17 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[12]/td[3]"));
			     	String p17= peilv17.getText() ;//取出17的赔率
			     	////System.out.println(p17);
			     	float i17 = Float.parseFloat(p17); //转换成数字
			     	//System.out.println(i17);
			     	//WebElement textbox17 = driver.findElement(By.xpath(".//*[@id='txt17']"));
			     	if(i17<16.03)
			     	{
			     		WebElement checkbox17 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[12]/td[4]/input"));
			     		checkbox17.click();
			     	}//判断17的赔率并下注
			     	WebElement peilv16 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[13]/td[3]"));
			     	String p16= peilv16.getText() ;//取出16的赔率
			     	////System.out.println(p16);
			     	float i16 = Float.parseFloat(p16); //转换成数字
			     	//System.out.println(i16);
			     	//WebElement textbox16 = driver.findElement(By.xpath(".//*[@id='txt16']"));
			     	if(i16<14.64)
			     	{
			     		WebElement checkbox16 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[13]/td[4]/input"));
			     		checkbox16.click();
			     	}//判断16的赔率并下注
			     	WebElement peilv15 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[14]/td[3]"));
			     	String p15= peilv15.getText() ;//取出15的赔率
			     	////System.out.println(p15);
			     	float i15 = Float.parseFloat(p15); //转换成数字
			     	//System.out.println(i15);
			     	//WebElement textbox15 = driver.findElement(By.xpath(".//*[@id='txt15']"));
			     	if(i15<13.83)
			     	{
			     		WebElement checkbox15 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[14]/td[4]/input"));
			     		checkbox15.click();
			     	}//判断15的赔率并下注
			   
			 	
			     	/*WebElement peilv14 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[15]/td[3]"));
			     	String p14= peilv14.getText() ;//取出14的赔率
			     	////System.out.println(p14);
			     	float i14 = Float.parseFloat(p14); //转换成数字
			     	//System.out.println(i14);
			     	//WebElement textbox14 = driver.findElement(By.xpath(".//*[@id='txt14']"));
			     	if(i14<13.46)
			     	{
			     		WebElement checkbox14 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[15]/td[4]/input"));
			     		checkbox14.click();
			     	}//判断14赔率并下注*/ 
			     	
				
				}
					break;
				case 8:
				{
					WebElement moshi1 = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[8]/div[2]/div[4]/div[2]/div/div[2]/a[4]"));
			 		moshi1.click();//点击投注模式
			 		
			 		shuaxin = driver.findElement(By.xpath(".//*[@id='form1']/div[8]/div[2]/div[4]/div[4]/div[3]/div[1]"));
			 		shuaxin.click();//点击刷新
			     	//System.out.println("shuaxin");
			     	try
			     	{
			     		Thread.sleep(50);
			     	}
			     	catch(InterruptedException e)
			     	{
			     		e.printStackTrace();
			     	}
			 		
			     	/*WebElement peilv0  = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[2]/td[3]"));
			     	String p0= peilv0.getText() ;//取出0的赔率
			     	////System.out.println(p0);
			     	float i0 = Float.parseFloat(p0); //转换成数字
			     	//System.out.println(i0);
			     	
			     	if(i0<1010)
			     	{
			     		WebElement checkbox0 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[2]/td[4]/input"));
			     		checkbox0.click();
			     		
			     	}//判断0的赔率并下注*/
			     
			     	WebElement peilv1 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[3]/td[3]"));
			     	String p1= peilv1.getText() ;//取出1的赔率
			     	////System.out.println(p1);
			     	float i1 = Float.parseFloat(p1); //转换成数字
			     	////System.out.println(i1);
			     	
			     	if(i1<336.66)
			     	{
			     		
			     		WebElement checkbox1 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[3]/td[4]/input"));
			     		checkbox1.click();
			     	}//判断1的赔率并下注

			     	WebElement peilv2 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[4]/td[3]"));
			     	String p2= peilv2.getText() ;//取出2的赔率
			     	////System.out.println(p2);
			     	float i2 = Float.parseFloat(p2); //转换成数字
			     	////System.out.println(i2);
			     	//WebElement textbox2 = driver.findElement(By.xpath(".//*[@id='txt2']"));
			     	if(i2<168.33)
			     	{
			     		
			     		WebElement checkbox2 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[4]/td[4]/input"));
			     		checkbox2.click();
			         }
			     	//判断2的赔率并下注
			     	WebElement peilv3 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[5]/td[3]"));
			     	String p3= peilv3.getText() ;//取出13的赔率
			     	////System.out.println(p3);
			     	float i3 = Float.parseFloat(p3); //转换成数字
			     	////System.out.println(i3);
			     	//WebElement textbox3 = driver.findElement(By.xpath(".//*[@id='txt3']"));
			     	if(i3<101)
			     	{
			     		WebElement checkbox3 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[5]/td[4]/input"));
			     		checkbox3.click();
			     	}//判断0的赔率并下注
			     	WebElement peilv4 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[6]/td[3]"));
			     	String p4= peilv4.getText() ;//取出13的赔率
			     	////System.out.println(p4);
			     	float i4 = Float.parseFloat(p4); //转换成数字
			     	////System.out.println(i4);
			     	//WebElement textbox4 = driver.findElement(By.xpath(".//*[@id='txt4']"));
			     	if(i4<67.33)
			     	{
			     		WebElement checkbox4 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[6]/td[4]/input"));
			     		checkbox4.click();
			     	}//判断4的赔率并下注
			     	WebElement peilv5 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[7]/td[3]"));
			     	String p5= peilv5.getText() ;//取出13的赔率
			     	//System.out.println(p5);
			     	float i5 = Float.parseFloat(p5); //转换成数字
			     	////System.out.println(i5);
			     	//WebElement textbox5 = driver.findElement(By.xpath(".//*[@id='txt5']"));
			     	
			     	if(i5<48.1)
			     	{
			     		WebElement checkbox5 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[7]/td[4]/input"));
			     		checkbox5.click();
			     	}//判断5的赔率并下注
			     	WebElement peilv6 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[8]/td[3]"));
			     	String p6= peilv6.getText() ;//取出13的赔率
			     	//System.out.println(p6);
			     	float i6 = Float.parseFloat(p6); //转换成数字
			     	//System.out.println(i6);
			     	//WebElement textbox6 = driver.findElement(By.xpath(".//*[@id='txt6']"));
			     	if(i6<36.07)
			     	{
			     		WebElement checkbox6 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[8]/td[4]/input"));
			     		checkbox6.click();
			     	}//判断6的赔率并下注

			     	WebElement peilv7 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[9]/td[3]"));
			     	String p7= peilv7.getText() ;//取出13的赔率
			     	//System.out.println(p7);
			     	float i7 = Float.parseFloat(p7); //转换成数字
			     	//System.out.println(i7);
			     	//WebElement textbox7 = driver.findElement(By.xpath(".//*[@id='txt7']"));
			     	if(i7<28.05)
			     	{
			     		WebElement checkbox7 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[9]/td[4]/input"));
			     		checkbox7.click();
			     	}//判断7的赔率并下注
			     	shuaxin.click();//点击刷新

			     	
			     	//System.out.println("shuaxin");
			     	try
			     	{
			     		Thread.sleep(50);
			     	}
			     	catch(InterruptedException e)
			     	{
			     		e.printStackTrace();
			     	}	
			     	WebElement peilv8 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[10]/td[3]"));
			     	String p8= peilv8.getText() ;//取出13的赔率
			     	//System.out.println(p8);
			     	float i8 = Float.parseFloat(p8); //转换成数字
			     	//System.out.println(i8);
			     	//WebElement textbox8 = driver.findElement(By.xpath(".//*[@id='txt8']"));
			     	if(i8<22.44)
			     	{
			     		WebElement checkbox8 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[10]/td[4]/input"));
			     		checkbox8.click();
			     	}//判断8的赔率并下注
			     	
			     	WebElement peilv9 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[11]/td[3]"));
			     	String p9= peilv9.getText() ;//取出13的赔率
			     	//System.out.println(p9);
			     	float i9 = Float.parseFloat(p9); //转换成数字
			     	//System.out.println(i9);
			     	//WebElement textbox9 = driver.findElement(By.xpath(".//*[@id='txt9']"));
			     	if(i9<18.36)
			     	{
			     		WebElement checkbox9 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[11]/td[4]/input"));
			     		checkbox9.click();
			     	}//判断9的赔率并下注
			     	
			     	WebElement peilv10 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[12]/td[3]"));
			     	String p10= peilv10.getText() ;//取出13的赔率
			     	//System.out.println(p10);
			     	float i10 = Float.parseFloat(p10); //转换成数字
			     	//System.out.println(i10);
			     	//WebElement textbox10 = driver.findElement(By.xpath(".//*[@id='txt10']"));
			     	if(i10<16.03)
			     	{
			     		WebElement checkbox10 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[12]/td[4]/input"));
			     		checkbox10.click();
			     	}//判断10的赔率并下注
			     	WebElement peilv11 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[13]/td[3]"));
			     	String p11= peilv11.getText() ;//取出13的赔率
			     	//System.out.println(p11);
			     	float i11 = Float.parseFloat(p11); //转换成数字
			     	//System.out.println(i11);
			     	//WebElement textbox11 = driver.findElement(By.xpath(".//*[@id='txt11']"));
			     	if(i11<14.63)
			     	{
			     		WebElement checkbox11 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[13]/td[4]/input"));
			     		checkbox11.click();
			     	}//判断11的赔率并下注
			     	WebElement peilv12 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[14]/td[3]"));
			     	String p12= peilv12.getText() ;//取出13的赔率
			     	//System.out.println(p12);
			     	float i12 = Float.parseFloat(p12); //转换成数字
			     	//System.out.println(i12);
			     	//WebElement textbox12 = driver.findElement(By.xpath(".//*[@id='txt12']"));
			     	if(i12<13.83)
			     	{
			     		WebElement checkbox12 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[14]/td[4]/input"));
			     		checkbox12.click();
			     	}//判断12的赔率并下注
			   
			 	
			     	/*WebElement peilv13 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[15]/td[3]"));
			     	String p13= peilv13.getText() ;//取出13的赔率
			     	//System.out.println(p13);
			     	float i13 = Float.parseFloat(p13); //转换成数字
			     	//System.out.println(i13);
			     	//WebElement textbox13 = driver.findElement(By.xpath(".//*[@id='txt13']"));
			     	if(i13<13.46)
			     	{
			     		WebElement checkbox13 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[15]/td[4]/input"));
			     		checkbox13.click();
			     	}//判断13赔率并下注 */
			     	
			     	shuaxin.click();//点击刷新
			     	//System.out.println("shuaxin");
			     	try
			     	{
			     		Thread.sleep(50);
			     	}
			     	catch(InterruptedException e)
			     	{
			     		e.printStackTrace();
			     	}	
			     	
			     	/*WebElement peilv27 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[2]/td[3]"));
			     	String p27= peilv27.getText() ;//取出27的赔率
			     	//System.out.println(p27);
			     	float i27 = Float.parseFloat(p27); //转换成数字
			     	//System.out.println(i27);
			     	//WebElement textbox27 = driver.findElement(By.xpath(".//*[@id='txt27']"));
			     	if(i27<1010)
			     	{
			     		WebElement checkbox27 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[2]/td[4]/input"));
			     		checkbox27.click();
			     	}//判断0的赔率并下注*/
			     	WebElement peilv26 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[3]/td[3]"));
			     	String p26= peilv26.getText() ;//取出26的赔率
			     	//System.out.println(p26);
			     	float i26 = Float.parseFloat(p26); //转换成数字
			     	//System.out.println(i26);
			     	//WebElement textbox26 = driver.findElement(By.xpath(".//*[@id='txt26']"));
			     	if(i26<336.66)
			     	{
			     		WebElement checkbox26 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[3]/td[4]/input"));
			     		checkbox26.click();
			     	}//判断1的赔率并下注

			     	WebElement peilv25 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[4]/td[3]"));
			     	String p25= peilv25.getText() ;//取出25的赔率
			     	//System.out.println(p25);
			     	float i25 = Float.parseFloat(p25); //转换成数字
			     	//System.out.println(i25);
			     	//WebElement textbox25 = driver.findElement(By.xpath(".//*[@id='txt25']"));
			     	if(i25<168.33)
			     	{
			     		WebElement checkbox25 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[4]/td[4]/input"));
			     		checkbox25.click();
			     	}//判断2的赔率并下注
			     	WebElement peilv24 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[5]/td[3]"));
			     	String p24= peilv24.getText() ;//取出24的赔率
			     	//System.out.println(p24);
			     	float i24 = Float.parseFloat(p24); //转换成数字
			     	//System.out.println(i24);
			     	//WebElement textbox24 = driver.findElement(By.xpath(".//*[@id='txt24']"));
			     	if(i24<101)
			     	{
			     		WebElement checkbox24 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[5]/td[4]/input"));
			     		checkbox24.click();
			     	}//判断0的赔率并下注
			     	WebElement peilv23 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[6]/td[3]"));
			     	String p23= peilv23.getText() ;//取出23的赔率
			     	//System.out.println(p23);
			     	float i23 = Float.parseFloat(p23); //转换成数字
			     	//System.out.println(i23);
			     	//WebElement textbox23 = driver.findElement(By.xpath(".//*[@id='txt23']"));
			     	if(i23<67.33)
			     	{
			     		WebElement checkbox23 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[6]/td[4]/input"));
			     		checkbox23.click();
			     	}//判断23的赔率并下注
			     	WebElement peilv22 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[7]/td[3]"));
			     	String p22= peilv22.getText() ;//取出22的赔率
			     	//System.out.println(p22);
			     	float i22 = Float.parseFloat(p22); //转换成数字
			     	//System.out.println(i22);
			     	//WebElement textbox22 = driver.findElement(By.xpath(".//*[@id='txt22']"));
			     	if(i22<48.09)
			     	{
			     		WebElement checkbox22 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[7]/td[4]/input"));
			     		checkbox22.click();
			     	}//判断22的赔率并下注
			     	WebElement peilv21 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[8]/td[3]"));
			     	String p21= peilv21.getText() ;//取出21的赔率
			     	//System.out.println(p21);
			     	float i21 = Float.parseFloat(p21); //转换成数字
			     	//System.out.println(i21);
			     	//WebElement textbox21 = driver.findElement(By.xpath(".//*[@id='txt21']"));
			     	if(i21<36.07)
			     	{
			     		WebElement checkbox21 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[8]/td[4]/input"));
			     		checkbox21.click();
			     	}//判断21的赔率并下注

			     	WebElement peilv20 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[9]/td[3]"));
			     	String p20= peilv20.getText() ;//取出20的赔率
			     	////System.out.println(p20);
			     	float i20 = Float.parseFloat(p20); //转换成数字
			     	//System.out.println(i20);
			     	//WebElement textbox20 = driver.findElement(By.xpath(".//*[@id='txt20']"));
			     	shuaxin.click();//点击刷新
			     	//System.out.println("shuaxin");
			     	try
			     	{
			     		Thread.sleep(50);
			     	}
			     	catch(InterruptedException e)
			     	{
			     		e.printStackTrace();
			     	}	
			     	if(i20<28.05)
			     	{
			     		WebElement checkbox20 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[9]/td[4]/input"));
			     		checkbox20.click();
			     	}//判断20的赔率并下注
			     	WebElement peilv19 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[10]/td[3]"));
			     	String p19= peilv19.getText() ;//取出19的赔率
			     	////System.out.println(p19);
			     	float i19 = Float.parseFloat(p19); //转换成数字
			     	//System.out.println(i19);
			     	//WebElement textbox19 = driver.findElement(By.xpath(".//*[@id='txt19']"));
			     	if(i19<22.44)
			     	{
			     		WebElement checkbox19 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[10]/td[4]/input"));
			     		checkbox19.click();
			     	}//判断19的赔率并下注
			     	
			     	WebElement peilv18 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[11]/td[3]"));
			     	String p18= peilv18.getText() ;//取出18的赔率
			     	////System.out.println(p18);
			     	float i18 = Float.parseFloat(p18); //转换成数字
			     	//System.out.println(i18);
			     	//WebElement textbox18 = driver.findElement(By.xpath(".//*[@id='txt18']"));
			     	if(i18<18.36)
			     	{
			     		WebElement checkbox18 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[11]/td[4]/input"));
			     		checkbox18.click();
			     	}//判断18的赔率并下注
			     	
			     	WebElement peilv17 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[12]/td[3]"));
			     	String p17= peilv17.getText() ;//取出17的赔率
			     	////System.out.println(p17);
			     	float i17 = Float.parseFloat(p17); //转换成数字
			     	//System.out.println(i17);
			     	//WebElement textbox17 = driver.findElement(By.xpath(".//*[@id='txt17']"));
			     	if(i17<16.03)
			     	{
			     		WebElement checkbox17 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[12]/td[4]/input"));
			     		checkbox17.click();
			     	}//判断17的赔率并下注
			     	WebElement peilv16 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[13]/td[3]"));
			     	String p16= peilv16.getText() ;//取出16的赔率
			     	////System.out.println(p16);
			     	float i16 = Float.parseFloat(p16); //转换成数字
			     	//System.out.println(i16);
			     	//WebElement textbox16 = driver.findElement(By.xpath(".//*[@id='txt16']"));
			     	if(i16<14.64)
			     	{
			     		WebElement checkbox16 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[13]/td[4]/input"));
			     		checkbox16.click();
			     	}//判断16的赔率并下注
			     	WebElement peilv15 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[14]/td[3]"));
			     	String p15= peilv15.getText() ;//取出15的赔率
			     	////System.out.println(p15);
			     	float i15 = Float.parseFloat(p15); //转换成数字
			     	//System.out.println(i15);
			     	//WebElement textbox15 = driver.findElement(By.xpath(".//*[@id='txt15']"));
			     	if(i15<13.83)
			     	{
			     		WebElement checkbox15 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[14]/td[4]/input"));
			     		checkbox15.click();
			     	}//判断15的赔率并下注
			   
			 	
			     	/*WebElement peilv14 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[15]/td[3]"));
			     	String p14= peilv14.getText() ;//取出14的赔率
			     	////System.out.println(p14);
			     	float i14 = Float.parseFloat(p14); //转换成数字
			     	//System.out.println(i14);
			     	//WebElement textbox14 = driver.findElement(By.xpath(".//*[@id='txt14']"));
			     	if(i14<13.46)
			     	{
			     		WebElement checkbox14 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[15]/td[4]/input"));
			     		checkbox14.click();
			     	}//判断14赔率并下注*/ 
			     	
				
				}
					break;
				case 9:
				{
					WebElement moshi1 = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[8]/div[2]/div[4]/div[2]/div/div[2]/a[4]"));
			 		moshi1.click();//点击投注模式
			 		
			 		shuaxin = driver.findElement(By.xpath(".//*[@id='form1']/div[8]/div[2]/div[4]/div[4]/div[3]/div[1]"));
			 		shuaxin.click();//点击刷新
			     	//System.out.println("shuaxin");
			     	try
			     	{
			     		Thread.sleep(50);
			     	}
			     	catch(InterruptedException e)
			     	{
			     		e.printStackTrace();
			     	}
			 		
			     	/*WebElement peilv0  = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[2]/td[3]"));
			     	String p0= peilv0.getText() ;//取出0的赔率
			     	////System.out.println(p0);
			     	float i0 = Float.parseFloat(p0); //转换成数字
			     	//System.out.println(i0);
			     	
			     	if(i0<1010)
			     	{
			     		WebElement checkbox0 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[2]/td[4]/input"));
			     		checkbox0.click();
			     		
			     	}//判断0的赔率并下注*/
			     
			     	WebElement peilv1 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[3]/td[3]"));
			     	String p1= peilv1.getText() ;//取出1的赔率
			     	////System.out.println(p1);
			     	float i1 = Float.parseFloat(p1); //转换成数字
			     	////System.out.println(i1);
			     	
			     	if(i1<336.66)
			     	{
			     		
			     		WebElement checkbox1 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[3]/td[4]/input"));
			     		checkbox1.click();
			     	}//判断1的赔率并下注

			     	WebElement peilv2 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[4]/td[3]"));
			     	String p2= peilv2.getText() ;//取出2的赔率
			     	////System.out.println(p2);
			     	float i2 = Float.parseFloat(p2); //转换成数字
			     	////System.out.println(i2);
			     	//WebElement textbox2 = driver.findElement(By.xpath(".//*[@id='txt2']"));
			     	if(i2<168.33)
			     	{
			     		
			     		WebElement checkbox2 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[4]/td[4]/input"));
			     		checkbox2.click();
			         }
			     	//判断2的赔率并下注
			     	WebElement peilv3 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[5]/td[3]"));
			     	String p3= peilv3.getText() ;//取出13的赔率
			     	////System.out.println(p3);
			     	float i3 = Float.parseFloat(p3); //转换成数字
			     	////System.out.println(i3);
			     	//WebElement textbox3 = driver.findElement(By.xpath(".//*[@id='txt3']"));
			     	if(i3<101)
			     	{
			     		WebElement checkbox3 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[5]/td[4]/input"));
			     		checkbox3.click();
			     	}//判断0的赔率并下注
			     	WebElement peilv4 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[6]/td[3]"));
			     	String p4= peilv4.getText() ;//取出13的赔率
			     	////System.out.println(p4);
			     	float i4 = Float.parseFloat(p4); //转换成数字
			     	////System.out.println(i4);
			     	//WebElement textbox4 = driver.findElement(By.xpath(".//*[@id='txt4']"));
			     	if(i4<67.33)
			     	{
			     		WebElement checkbox4 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[6]/td[4]/input"));
			     		checkbox4.click();
			     	}//判断4的赔率并下注
			     	WebElement peilv5 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[7]/td[3]"));
			     	String p5= peilv5.getText() ;//取出13的赔率
			     	//System.out.println(p5);
			     	float i5 = Float.parseFloat(p5); //转换成数字
			     	////System.out.println(i5);
			     	//WebElement textbox5 = driver.findElement(By.xpath(".//*[@id='txt5']"));
			     	
			     	if(i5<48.1)
			     	{
			     		WebElement checkbox5 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[7]/td[4]/input"));
			     		checkbox5.click();
			     	}//判断5的赔率并下注
			     	WebElement peilv6 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[8]/td[3]"));
			     	String p6= peilv6.getText() ;//取出13的赔率
			     	//System.out.println(p6);
			     	float i6 = Float.parseFloat(p6); //转换成数字
			     	//System.out.println(i6);
			     	//WebElement textbox6 = driver.findElement(By.xpath(".//*[@id='txt6']"));
			     	if(i6<36.07)
			     	{
			     		WebElement checkbox6 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[8]/td[4]/input"));
			     		checkbox6.click();
			     	}//判断6的赔率并下注

			     	WebElement peilv7 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[9]/td[3]"));
			     	String p7= peilv7.getText() ;//取出13的赔率
			     	//System.out.println(p7);
			     	float i7 = Float.parseFloat(p7); //转换成数字
			     	//System.out.println(i7);
			     	//WebElement textbox7 = driver.findElement(By.xpath(".//*[@id='txt7']"));
			     	if(i7<28.05)
			     	{
			     		WebElement checkbox7 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[9]/td[4]/input"));
			     		checkbox7.click();
			     	}//判断7的赔率并下注
			     	shuaxin.click();//点击刷新

			     	
			     	//System.out.println("shuaxin");
			     	try
			     	{
			     		Thread.sleep(50);
			     	}
			     	catch(InterruptedException e)
			     	{
			     		e.printStackTrace();
			     	}	
			     	WebElement peilv8 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[10]/td[3]"));
			     	String p8= peilv8.getText() ;//取出13的赔率
			     	//System.out.println(p8);
			     	float i8 = Float.parseFloat(p8); //转换成数字
			     	//System.out.println(i8);
			     	//WebElement textbox8 = driver.findElement(By.xpath(".//*[@id='txt8']"));
			     	if(i8<22.44)
			     	{
			     		WebElement checkbox8 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[10]/td[4]/input"));
			     		checkbox8.click();
			     	}//判断8的赔率并下注
			     	
			     	WebElement peilv9 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[11]/td[3]"));
			     	String p9= peilv9.getText() ;//取出13的赔率
			     	//System.out.println(p9);
			     	float i9 = Float.parseFloat(p9); //转换成数字
			     	//System.out.println(i9);
			     	//WebElement textbox9 = driver.findElement(By.xpath(".//*[@id='txt9']"));
			     	if(i9<18.36)
			     	{
			     		WebElement checkbox9 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[11]/td[4]/input"));
			     		checkbox9.click();
			     	}//判断9的赔率并下注
			     	
			     	WebElement peilv10 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[12]/td[3]"));
			     	String p10= peilv10.getText() ;//取出13的赔率
			     	//System.out.println(p10);
			     	float i10 = Float.parseFloat(p10); //转换成数字
			     	//System.out.println(i10);
			     	//WebElement textbox10 = driver.findElement(By.xpath(".//*[@id='txt10']"));
			     	if(i10<16.03)
			     	{
			     		WebElement checkbox10 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[12]/td[4]/input"));
			     		checkbox10.click();
			     	}//判断10的赔率并下注
			     	WebElement peilv11 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[13]/td[3]"));
			     	String p11= peilv11.getText() ;//取出13的赔率
			     	//System.out.println(p11);
			     	float i11 = Float.parseFloat(p11); //转换成数字
			     	//System.out.println(i11);
			     	//WebElement textbox11 = driver.findElement(By.xpath(".//*[@id='txt11']"));
			     	if(i11<14.63)
			     	{
			     		WebElement checkbox11 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[13]/td[4]/input"));
			     		checkbox11.click();
			     	}//判断11的赔率并下注
			     	WebElement peilv12 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[14]/td[3]"));
			     	String p12= peilv12.getText() ;//取出13的赔率
			     	//System.out.println(p12);
			     	float i12 = Float.parseFloat(p12); //转换成数字
			     	//System.out.println(i12);
			     	//WebElement textbox12 = driver.findElement(By.xpath(".//*[@id='txt12']"));
			     	if(i12<13.83)
			     	{
			     		WebElement checkbox12 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[14]/td[4]/input"));
			     		checkbox12.click();
			     	}//判断12的赔率并下注
			   
			 	
			     	/*WebElement peilv13 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[15]/td[3]"));
			     	String p13= peilv13.getText() ;//取出13的赔率
			     	//System.out.println(p13);
			     	float i13 = Float.parseFloat(p13); //转换成数字
			     	//System.out.println(i13);
			     	//WebElement textbox13 = driver.findElement(By.xpath(".//*[@id='txt13']"));
			     	if(i13<13.46)
			     	{
			     		WebElement checkbox13 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[15]/td[4]/input"));
			     		checkbox13.click();
			     	}//判断13赔率并下注 */
			     	
			     	shuaxin.click();//点击刷新
			     	//System.out.println("shuaxin");
			     	try
			     	{
			     		Thread.sleep(50);
			     	}
			     	catch(InterruptedException e)
			     	{
			     		e.printStackTrace();
			     	}	
			     	
			     	/*WebElement peilv27 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[2]/td[3]"));
			     	String p27= peilv27.getText() ;//取出27的赔率
			     	//System.out.println(p27);
			     	float i27 = Float.parseFloat(p27); //转换成数字
			     	//System.out.println(i27);
			     	//WebElement textbox27 = driver.findElement(By.xpath(".//*[@id='txt27']"));
			     	if(i27<1010)
			     	{
			     		WebElement checkbox27 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[2]/td[4]/input"));
			     		checkbox27.click();
			     	}//判断0的赔率并下注*/
			     	WebElement peilv26 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[3]/td[3]"));
			     	String p26= peilv26.getText() ;//取出26的赔率
			     	//System.out.println(p26);
			     	float i26 = Float.parseFloat(p26); //转换成数字
			     	//System.out.println(i26);
			     	//WebElement textbox26 = driver.findElement(By.xpath(".//*[@id='txt26']"));
			     	if(i26<336.66)
			     	{
			     		WebElement checkbox26 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[3]/td[4]/input"));
			     		checkbox26.click();
			     	}//判断1的赔率并下注

			     	WebElement peilv25 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[4]/td[3]"));
			     	String p25= peilv25.getText() ;//取出25的赔率
			     	//System.out.println(p25);
			     	float i25 = Float.parseFloat(p25); //转换成数字
			     	//System.out.println(i25);
			     	//WebElement textbox25 = driver.findElement(By.xpath(".//*[@id='txt25']"));
			     	if(i25<168.33)
			     	{
			     		WebElement checkbox25 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[4]/td[4]/input"));
			     		checkbox25.click();
			     	}//判断2的赔率并下注
			     	WebElement peilv24 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[5]/td[3]"));
			     	String p24= peilv24.getText() ;//取出24的赔率
			     	//System.out.println(p24);
			     	float i24 = Float.parseFloat(p24); //转换成数字
			     	//System.out.println(i24);
			     	//WebElement textbox24 = driver.findElement(By.xpath(".//*[@id='txt24']"));
			     	if(i24<101)
			     	{
			     		WebElement checkbox24 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[5]/td[4]/input"));
			     		checkbox24.click();
			     	}//判断0的赔率并下注
			     	WebElement peilv23 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[6]/td[3]"));
			     	String p23= peilv23.getText() ;//取出23的赔率
			     	//System.out.println(p23);
			     	float i23 = Float.parseFloat(p23); //转换成数字
			     	//System.out.println(i23);
			     	//WebElement textbox23 = driver.findElement(By.xpath(".//*[@id='txt23']"));
			     	if(i23<67.33)
			     	{
			     		WebElement checkbox23 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[6]/td[4]/input"));
			     		checkbox23.click();
			     	}//判断23的赔率并下注
			     	WebElement peilv22 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[7]/td[3]"));
			     	String p22= peilv22.getText() ;//取出22的赔率
			     	//System.out.println(p22);
			     	float i22 = Float.parseFloat(p22); //转换成数字
			     	//System.out.println(i22);
			     	//WebElement textbox22 = driver.findElement(By.xpath(".//*[@id='txt22']"));
			     	if(i22<48.09)
			     	{
			     		WebElement checkbox22 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[7]/td[4]/input"));
			     		checkbox22.click();
			     	}//判断22的赔率并下注
			     	WebElement peilv21 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[8]/td[3]"));
			     	String p21= peilv21.getText() ;//取出21的赔率
			     	//System.out.println(p21);
			     	float i21 = Float.parseFloat(p21); //转换成数字
			     	//System.out.println(i21);
			     	//WebElement textbox21 = driver.findElement(By.xpath(".//*[@id='txt21']"));
			     	if(i21<36.07)
			     	{
			     		WebElement checkbox21 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[8]/td[4]/input"));
			     		checkbox21.click();
			     	}//判断21的赔率并下注

			     	WebElement peilv20 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[9]/td[3]"));
			     	String p20= peilv20.getText() ;//取出20的赔率
			     	////System.out.println(p20);
			     	float i20 = Float.parseFloat(p20); //转换成数字
			     	//System.out.println(i20);
			     	//WebElement textbox20 = driver.findElement(By.xpath(".//*[@id='txt20']"));
			     	shuaxin.click();//点击刷新
			     	//System.out.println("shuaxin");
			     	try
			     	{
			     		Thread.sleep(50);
			     	}
			     	catch(InterruptedException e)
			     	{
			     		e.printStackTrace();
			     	}	
			     	if(i20<28.05)
			     	{
			     		WebElement checkbox20 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[9]/td[4]/input"));
			     		checkbox20.click();
			     	}//判断20的赔率并下注
			     	WebElement peilv19 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[10]/td[3]"));
			     	String p19= peilv19.getText() ;//取出19的赔率
			     	////System.out.println(p19);
			     	float i19 = Float.parseFloat(p19); //转换成数字
			     	//System.out.println(i19);
			     	//WebElement textbox19 = driver.findElement(By.xpath(".//*[@id='txt19']"));
			     	if(i19<22.44)
			     	{
			     		WebElement checkbox19 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[10]/td[4]/input"));
			     		checkbox19.click();
			     	}//判断19的赔率并下注
			     	
			     	WebElement peilv18 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[11]/td[3]"));
			     	String p18= peilv18.getText() ;//取出18的赔率
			     	////System.out.println(p18);
			     	float i18 = Float.parseFloat(p18); //转换成数字
			     	//System.out.println(i18);
			     	//WebElement textbox18 = driver.findElement(By.xpath(".//*[@id='txt18']"));
			     	if(i18<18.36)
			     	{
			     		WebElement checkbox18 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[11]/td[4]/input"));
			     		checkbox18.click();
			     	}//判断18的赔率并下注
			     	
			     	WebElement peilv17 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[12]/td[3]"));
			     	String p17= peilv17.getText() ;//取出17的赔率
			     	////System.out.println(p17);
			     	float i17 = Float.parseFloat(p17); //转换成数字
			     	//System.out.println(i17);
			     	//WebElement textbox17 = driver.findElement(By.xpath(".//*[@id='txt17']"));
			     	if(i17<16.03)
			     	{
			     		WebElement checkbox17 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[12]/td[4]/input"));
			     		checkbox17.click();
			     	}//判断17的赔率并下注
			     	WebElement peilv16 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[13]/td[3]"));
			     	String p16= peilv16.getText() ;//取出16的赔率
			     	////System.out.println(p16);
			     	float i16 = Float.parseFloat(p16); //转换成数字
			     	//System.out.println(i16);
			     	//WebElement textbox16 = driver.findElement(By.xpath(".//*[@id='txt16']"));
			     	if(i16<14.64)
			     	{
			     		WebElement checkbox16 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[13]/td[4]/input"));
			     		checkbox16.click();
			     	}//判断16的赔率并下注
			     	WebElement peilv15 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[14]/td[3]"));
			     	String p15= peilv15.getText() ;//取出15的赔率
			     	////System.out.println(p15);
			     	float i15 = Float.parseFloat(p15); //转换成数字
			     	//System.out.println(i15);
			     	//WebElement textbox15 = driver.findElement(By.xpath(".//*[@id='txt15']"));
			     	if(i15<13.83)
			     	{
			     		WebElement checkbox15 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[14]/td[4]/input"));
			     		checkbox15.click();
			     	}//判断15的赔率并下注
			   
			 	
			     	/*WebElement peilv14 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[15]/td[3]"));
			     	String p14= peilv14.getText() ;//取出14的赔率
			     	////System.out.println(p14);
			     	float i14 = Float.parseFloat(p14); //转换成数字
			     	//System.out.println(i14);
			     	//WebElement textbox14 = driver.findElement(By.xpath(".//*[@id='txt14']"));
			     	if(i14<13.46)
			     	{
			     		WebElement checkbox14 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[15]/td[4]/input"));
			     		checkbox14.click();
			     	}//判断14赔率并下注*/ 
			     	
				
				}
					break;
				case 10:
					int num3=(int)(Math.random()*2);
		         	System.out.println(num3);
		         	switch (num3) 
		         	{
		         		case 0 :
		         			{
		         				try
		         					{
		         						Thread.sleep(50);
		         					}
		         				catch(InterruptedException e)
		         					{
		         						e.printStackTrace();
		         					}
		     		
		         	
		         				WebElement moshi1 = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[8]/div[2]/div[4]/div[2]/div/div[2]/a[1]"));
		    			 		moshi1.click();//点击投注模式
		      
		    	}
		         	break;  
		         	case 1 :		         		
		         	{
		         		try
     					{
     						Thread.sleep(50);
     					}
     				catch(InterruptedException e)
     					{
     						e.printStackTrace();
     					}
		         		WebElement moshi1 = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[8]/div[2]/div[4]/div[2]/div/div[2]/a[6]"));
    			 		moshi1.click();//点击投注模式
		    	}
					break;
				}
			}
 		
     	
     
     	WebElement conform_btn = driver.findElement(By.xpath(".//*[@id='conform_btn']"));
     	conform_btn.click();//确定投注
     	try
     	{
     		Thread.sleep(200);
     	}
     	catch(InterruptedException e)
     	{
     		e.printStackTrace();
     	}
     	WebElement queren = driver.findElement(By.xpath(".//*[@id='fc_an_l170223']"));
     	queren.click();
    	try
     	{
     		Thread.sleep(200);
     	}
     	catch(InterruptedException e)
     	{
     		e.printStackTrace();
     	}
     	navigation.to("http://www.pceggs.com/play/pxya.aspx");
     	try
     	{
     		Thread.sleep(2000);
     	}
     	catch(InterruptedException e)
     	{
     		e.printStackTrace();
     	}
     	{//获取电脑时间，并判断
            Date date = new Date();  
            //DateFormat df1 = DateFormat.getDateInstance();//日期格式，精确到日  
            //System.out.println(df1.format(date));  
            //DateFormat df2 = DateFormat.getDateTimeInstance();//可以精确到时分秒  
            //System.out.println(df2.format(date));  
            DateFormat df3 = DateFormat.getTimeInstance();//只显示出时分秒  
            System.out.println(df3.format(date)); 
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date dt1 = df.parse("2019-07-17 11:00:00");
            Date dt2 = df.parse("2019-07-17 11:10:00");
            Date dt3 = df.parse("2019-07-17 18:30:00");
            Date dt4 = df.parse("2019-07-17 18:40:00");
            Date dt5 = df.parse("2019-07-17 23:30:00");
            Date dt6 = df.parse("2019-07-18 23:48:00");
            if(date.getTime()>dt5.getTime()&&date.getTime()<dt6.getTime() )
            {
            	try
             	{
             		Thread.sleep(39700000);
             	}
             	catch(InterruptedException e)
             	{
             		e.printStackTrace();
             	}  
            }
            else if(date.getTime()>dt1.getTime()&&date.getTime()<dt2.getTime()||date.getTime()>dt3.getTime()&&date.getTime()<dt4.getTime()) 
            {  
            	try
             	{
             		Thread.sleep(1800000);
             	}
             	catch(InterruptedException e)
             	{
             		e.printStackTrace();
             	}    
            }   
         }
     	int num4=(int)(Math.random()*28000);//设置进入投入页面得时间为随机,上下浮动30秒
     	System.out.println("打印本次休息时间"); 
     	System.out.println(num4); 
     	System.out.println(250000+num4); 
     	
     	
     	try
     	{
     		Thread.sleep(250000+num4);
     	}
     	catch(InterruptedException e)
     	{
     		e.printStackTrace();
     	}
     	//navigation.refresh();
		}
       	}

	public boolean doesWebElementExist(WebDriver driver, By selector) // 函数，存在函数返回true；如果不存在元素，则返回false，
	{

		try {
			driver.findElement(selector);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

}
