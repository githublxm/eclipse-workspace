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
		/*System.setProperty("webdriver.gecko.driver","D:\\Program Files\\firefox-sdk\\bin\\geckodriver.exe");//���п��п���
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
     	passwordTextBox.sendKeys("276797");//�����û�������
     	try
     	{
     		Thread.sleep(7000);
     	}
     	catch(InterruptedException e)
     	{
     		e.printStackTrace();
     	}//�ȴ�7�룬�ֹ�������֤��
     	WebElement Login = driver.findElement(By.id("Login_Submit"));
     	Login.click();//��¼
    	try
     	{
     		Thread.sleep(1000);
     	}
     	catch(InterruptedException e)
     	{
     		e.printStackTrace();
     	}
     	navigation.to("http://www.pceggs.com/play/pxya.aspx");//ת����Ϸ����
     	//final double TIMES = 1.4 ;
    	while(1>0)
    	{
    		
    		
    		/*WebElement time8 = driver.findElement(By.xpath(".//*[@id='RemainS']/strong[1]"));
         	String t8= time8.getText() ;//ȡ��ʣ��ʱ��
         	float tt = Float.parseFloat(t8); //ת��������
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
     	
     	//�ж��Ƿ��ܽ���Ͷע
     	Project1Class a = new Project1Class();//ʵ��������࣬�������±ߵļ��Ԫ�غ���
     	if(a.doesWebElementExist(driver, By.xpath(".//*[@id='RemainS']/strong[2]"))==false)
     	{
     		System.out.println("����ϵͳʱ�����У��ݲ�Ͷע");
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
     	System.out.println("�����Ƿ�Ͷע�����Ϊ��");
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
     		System.out.println("����Ͷע�����Ϊ10�����ڲ�Ͷע");
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
     		System.out.println("����Ͷע�����Ϊ11������2���ڲ�Ͷע");
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
    	
    	touzhu.click();//���Ͷע
     	try
     	{
     		Thread.sleep(2000);
     	}
     	catch(InterruptedException e)
     	{
     		e.printStackTrace();
     	}
     	
     	WebElement time = driver.findElement(By.xpath(".//*[@id='RemainTitle']/span/span[2]"));
     	String t= time.getText() ;//ȡ��ʣ��ʱ��
     	long time2 = Long.parseLong(t); //ת��������
     	System.out.println("ʣ��Ͷעʱ�䣺");
     	System.out.println(time2);
     	WebElement shuaxin = driver.findElement(By.xpath(".//*[@id='form1']/div[8]/div[2]/div[4]/div[4]/div[3]/div[1]"));     	
     	int num1=(int)(Math.random()*18);
     	System.out.println("ʱ�������Ϊ��");
     	System.out.println(num1);
     	switch (num1) 
     	{
     	case 0 :
     		while(time2>30)
         	{
     			if(time2>30)
         	 	{
         	 		System.out.println("ʣ��Ͷעʱ�����30��");
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
             		t= time.getText() ;//ȡ��ʣ��ʱ��
                 	time2 = Long.parseLong(t); //ת��������
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
         	 		System.out.println("ʣ��Ͷעʱ�����30��");
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
             		t= time.getText() ;//ȡ��ʣ��ʱ��
                 	time2 = Long.parseLong(t); //ת��������
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
         	 		System.out.println("����30��");
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
             		t= time.getText() ;//ȡ��ʣ��ʱ��
                 	time2 = Long.parseLong(t); //ת��������
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
         	 		System.out.println("����30��");
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
             		t= time.getText() ;//ȡ��ʣ��ʱ��
                 	time2 = Long.parseLong(t); //ת��������
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
             	 		System.out.println("����30��");
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
                 		t= time.getText() ;//ȡ��ʣ��ʱ��
                     	time2 = Long.parseLong(t); //ת��������
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
             	 		System.out.println("����30��");
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
                 		t= time.getText() ;//ȡ��ʣ��ʱ��
                     	time2 = Long.parseLong(t); //ת��������
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
             	 		System.out.println("����30��");
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
                 		t= time.getText() ;//ȡ��ʣ��ʱ��
                     	time2 = Long.parseLong(t); //ת��������
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
             	 		System.out.println("����30��");
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
                 		t= time.getText() ;//ȡ��ʣ��ʱ��
                     	time2 = Long.parseLong(t); //ת��������
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
             	 		System.out.println("ʣ��Ͷעʱ�����30��");
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
                 		t= time.getText() ;//ȡ��ʣ��ʱ��
                     	time2 = Long.parseLong(t); //ת��������
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
             	 		System.out.println("ʣ��Ͷעʱ�����30��");
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
                 		t= time.getText() ;//ȡ��ʣ��ʱ��
                     	time2 = Long.parseLong(t); //ת��������
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
             	 		System.out.println("����30��");
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
                 		t= time.getText() ;//ȡ��ʣ��ʱ��
                     	time2 = Long.parseLong(t); //ת��������
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
             	 		System.out.println("����30��");
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
                 		t= time.getText() ;//ȡ��ʣ��ʱ��
                     	time2 = Long.parseLong(t); //ת��������
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
                 	 		System.out.println("����30��");
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
                     		t= time.getText() ;//ȡ��ʣ��ʱ��
                         	time2 = Long.parseLong(t); //ת��������
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
                 	 		System.out.println("����30��");
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
                     		t= time.getText() ;//ȡ��ʣ��ʱ��
                         	time2 = Long.parseLong(t); //ת��������
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
                 	 		System.out.println("����30��");
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
                     		t= time.getText() ;//ȡ��ʣ��ʱ��
                         	time2 = Long.parseLong(t); //ת��������
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
                 	 		System.out.println("����30��");
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
                     		t= time.getText() ;//ȡ��ʣ��ʱ��
                         	time2 = Long.parseLong(t); //ת��������
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
             	 		System.out.println("����40��");
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
                 		t= time.getText() ;//ȡ��ʣ��ʱ��
                     	time2 = Long.parseLong(t); //ת��������
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
     			System.out.println("ʱ�����������9��10���Ӻ�ֱ��Ͷע");
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
     		t= time.getText() ;//ȡ��ʣ��ʱ��
         	System.out.println(t);
         	time2 = Float.parseFloat(t); //ת��������
         	System.out.println(time2);*/
     	int num=(int)(Math.random()*11);
     	System.out.println("Ͷע���������Ϊ��");     	
     	System.out.println(num);
     	//int n = 1;
				switch (num)
				{
				case 0:
				{
					WebElement moshi1 = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[8]/div[2]/div[4]/div[2]/div/div[2]/a[2]"));
			 		moshi1.click();//���Ͷעģʽ
			 		
					shuaxin = driver.findElement(By.xpath(".//*[@id='form1']/div[8]/div[2]/div[4]/div[4]/div[3]/div[1]"));
			 		shuaxin.click();//���ˢ��
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
			     	String p0= peilv0.getText() ;//ȡ��0������
			     	////System.out.println(p0);
			     	float i0 = Float.parseFloat(p0); //ת��������
			     	//System.out.println(i0);
			     	
			     	if(i0<1010)
			     	{
			     		WebElement checkbox0 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[2]/td[4]/input"));
			     		checkbox0.click();
			     		
			     	}//�ж�0�����ʲ���ע*/
			     
			     	WebElement peilv1 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[3]/td[3]"));
			     	String p1= peilv1.getText() ;//ȡ��1������
			     	////System.out.println(p1);
			     	float i1 = Float.parseFloat(p1); //ת��������
			     	////System.out.println(i1);
			     	
			     	if(i1<336.66)
			     	{
			     		
			     		WebElement checkbox1 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[3]/td[4]/input"));
			     		checkbox1.click();
			     	}//�ж�1�����ʲ���ע

			     	WebElement peilv2 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[4]/td[3]"));
			     	String p2= peilv2.getText() ;//ȡ��2������
			     	////System.out.println(p2);
			     	float i2 = Float.parseFloat(p2); //ת��������
			     	////System.out.println(i2);
			     	//WebElement textbox2 = driver.findElement(By.xpath(".//*[@id='txt2']"));
			     	if(i2<168.33)
			     	{
			     		
			     		WebElement checkbox2 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[4]/td[4]/input"));
			     		checkbox2.click();
			         }
			     	//�ж�2�����ʲ���ע
			     	WebElement peilv3 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[5]/td[3]"));
			     	String p3= peilv3.getText() ;//ȡ��13������
			     	////System.out.println(p3);
			     	float i3 = Float.parseFloat(p3); //ת��������
			     	////System.out.println(i3);
			     	//WebElement textbox3 = driver.findElement(By.xpath(".//*[@id='txt3']"));
			     	if(i3<101)
			     	{
			     		WebElement checkbox3 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[5]/td[4]/input"));
			     		checkbox3.click();
			     	}//�ж�0�����ʲ���ע
			     	WebElement peilv4 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[6]/td[3]"));
			     	String p4= peilv4.getText() ;//ȡ��13������
			     	////System.out.println(p4);
			     	float i4 = Float.parseFloat(p4); //ת��������
			     	////System.out.println(i4);
			     	//WebElement textbox4 = driver.findElement(By.xpath(".//*[@id='txt4']"));
			     	if(i4<67.33)
			     	{
			     		WebElement checkbox4 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[6]/td[4]/input"));
			     		checkbox4.click();
			     	}//�ж�4�����ʲ���ע
			     	WebElement peilv5 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[7]/td[3]"));
			     	String p5= peilv5.getText() ;//ȡ��13������
			     	//System.out.println(p5);
			     	float i5 = Float.parseFloat(p5); //ת��������
			     	////System.out.println(i5);
			     	//WebElement textbox5 = driver.findElement(By.xpath(".//*[@id='txt5']"));
			     	
			     	if(i5<48.1)
			     	{
			     		WebElement checkbox5 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[7]/td[4]/input"));
			     		checkbox5.click();
			     	}//�ж�5�����ʲ���ע
			     	WebElement peilv6 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[8]/td[3]"));
			     	String p6= peilv6.getText() ;//ȡ��13������
			     	//System.out.println(p6);
			     	float i6 = Float.parseFloat(p6); //ת��������
			     	//System.out.println(i6);
			     	//WebElement textbox6 = driver.findElement(By.xpath(".//*[@id='txt6']"));
			     	if(i6<36.07)
			     	{
			     		WebElement checkbox6 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[8]/td[4]/input"));
			     		checkbox6.click();
			     	}//�ж�6�����ʲ���ע

			     	WebElement peilv7 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[9]/td[3]"));
			     	String p7= peilv7.getText() ;//ȡ��13������
			     	//System.out.println(p7);
			     	float i7 = Float.parseFloat(p7); //ת��������
			     	//System.out.println(i7);
			     	//WebElement textbox7 = driver.findElement(By.xpath(".//*[@id='txt7']"));
			     	if(i7<28.05)
			     	{
			     		WebElement checkbox7 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[9]/td[4]/input"));
			     		checkbox7.click();
			     	}//�ж�7�����ʲ���ע
			     	shuaxin.click();//���ˢ��

			     	
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
			     	String p8= peilv8.getText() ;//ȡ��13������
			     	//System.out.println(p8);
			     	float i8 = Float.parseFloat(p8); //ת��������
			     	//System.out.println(i8);
			     	//WebElement textbox8 = driver.findElement(By.xpath(".//*[@id='txt8']"));
			     	if(i8<22.44)
			     	{
			     		WebElement checkbox8 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[10]/td[4]/input"));
			     		checkbox8.click();
			     	}//�ж�8�����ʲ���ע
			     	
			     	WebElement peilv9 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[11]/td[3]"));
			     	String p9= peilv9.getText() ;//ȡ��13������
			     	//System.out.println(p9);
			     	float i9 = Float.parseFloat(p9); //ת��������
			     	//System.out.println(i9);
			     	//WebElement textbox9 = driver.findElement(By.xpath(".//*[@id='txt9']"));
			     	if(i9<18.36)
			     	{
			     		WebElement checkbox9 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[11]/td[4]/input"));
			     		checkbox9.click();
			     	}//�ж�9�����ʲ���ע
			     	
			     	WebElement peilv10 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[12]/td[3]"));
			     	String p10= peilv10.getText() ;//ȡ��13������
			     	//System.out.println(p10);
			     	float i10 = Float.parseFloat(p10); //ת��������
			     	//System.out.println(i10);
			     	//WebElement textbox10 = driver.findElement(By.xpath(".//*[@id='txt10']"));
			     	if(i10<16.03)
			     	{
			     		WebElement checkbox10 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[12]/td[4]/input"));
			     		checkbox10.click();
			     	}//�ж�10�����ʲ���ע
			     	WebElement peilv11 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[13]/td[3]"));
			     	String p11= peilv11.getText() ;//ȡ��13������
			     	//System.out.println(p11);
			     	float i11 = Float.parseFloat(p11); //ת��������
			     	//System.out.println(i11);
			     	//WebElement textbox11 = driver.findElement(By.xpath(".//*[@id='txt11']"));
			     	if(i11<14.63)
			     	{
			     		WebElement checkbox11 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[13]/td[4]/input"));
			     		checkbox11.click();
			     	}//�ж�11�����ʲ���ע
			     	WebElement peilv12 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[14]/td[3]"));
			     	String p12= peilv12.getText() ;//ȡ��13������
			     	//System.out.println(p12);
			     	float i12 = Float.parseFloat(p12); //ת��������
			     	//System.out.println(i12);
			     	//WebElement textbox12 = driver.findElement(By.xpath(".//*[@id='txt12']"));
			     	if(i12<13.83)
			     	{
			     		WebElement checkbox12 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[14]/td[4]/input"));
			     		checkbox12.click();
			     	}//�ж�12�����ʲ���ע
			   
			 	
			     	/*WebElement peilv13 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[15]/td[3]"));
			     	String p13= peilv13.getText() ;//ȡ��13������
			     	//System.out.println(p13);
			     	float i13 = Float.parseFloat(p13); //ת��������
			     	//System.out.println(i13);
			     	//WebElement textbox13 = driver.findElement(By.xpath(".//*[@id='txt13']"));
			     	if(i13<13.46)
			     	{
			     		WebElement checkbox13 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[15]/td[4]/input"));
			     		checkbox13.click();
			     	}//�ж�13���ʲ���ע */
			     	
			     	shuaxin.click();//���ˢ��
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
			     	String p27= peilv27.getText() ;//ȡ��27������
			     	//System.out.println(p27);
			     	float i27 = Float.parseFloat(p27); //ת��������
			     	//System.out.println(i27);
			     	//WebElement textbox27 = driver.findElement(By.xpath(".//*[@id='txt27']"));
			     	if(i27<1010)
			     	{
			     		WebElement checkbox27 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[2]/td[4]/input"));
			     		checkbox27.click();
			     	}//�ж�0�����ʲ���ע*/
			     	WebElement peilv26 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[3]/td[3]"));
			     	String p26= peilv26.getText() ;//ȡ��26������
			     	//System.out.println(p26);
			     	float i26 = Float.parseFloat(p26); //ת��������
			     	//System.out.println(i26);
			     	//WebElement textbox26 = driver.findElement(By.xpath(".//*[@id='txt26']"));
			     	if(i26<336.66)
			     	{
			     		WebElement checkbox26 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[3]/td[4]/input"));
			     		checkbox26.click();
			     	}//�ж�1�����ʲ���ע

			     	WebElement peilv25 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[4]/td[3]"));
			     	String p25= peilv25.getText() ;//ȡ��25������
			     	//System.out.println(p25);
			     	float i25 = Float.parseFloat(p25); //ת��������
			     	//System.out.println(i25);
			     	//WebElement textbox25 = driver.findElement(By.xpath(".//*[@id='txt25']"));
			     	if(i25<168.33)
			     	{
			     		WebElement checkbox25 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[4]/td[4]/input"));
			     		checkbox25.click();
			     	}//�ж�2�����ʲ���ע
			     	WebElement peilv24 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[5]/td[3]"));
			     	String p24= peilv24.getText() ;//ȡ��24������
			     	//System.out.println(p24);
			     	float i24 = Float.parseFloat(p24); //ת��������
			     	//System.out.println(i24);
			     	//WebElement textbox24 = driver.findElement(By.xpath(".//*[@id='txt24']"));
			     	if(i24<101)
			     	{
			     		WebElement checkbox24 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[5]/td[4]/input"));
			     		checkbox24.click();
			     	}//�ж�0�����ʲ���ע
			     	WebElement peilv23 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[6]/td[3]"));
			     	String p23= peilv23.getText() ;//ȡ��23������
			     	//System.out.println(p23);
			     	float i23 = Float.parseFloat(p23); //ת��������
			     	//System.out.println(i23);
			     	//WebElement textbox23 = driver.findElement(By.xpath(".//*[@id='txt23']"));
			     	if(i23<67.33)
			     	{
			     		WebElement checkbox23 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[6]/td[4]/input"));
			     		checkbox23.click();
			     	}//�ж�23�����ʲ���ע
			     	WebElement peilv22 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[7]/td[3]"));
			     	String p22= peilv22.getText() ;//ȡ��22������
			     	//System.out.println(p22);
			     	float i22 = Float.parseFloat(p22); //ת��������
			     	//System.out.println(i22);
			     	//WebElement textbox22 = driver.findElement(By.xpath(".//*[@id='txt22']"));
			     	if(i22<48.09)
			     	{
			     		WebElement checkbox22 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[7]/td[4]/input"));
			     		checkbox22.click();
			     	}//�ж�22�����ʲ���ע
			     	WebElement peilv21 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[8]/td[3]"));
			     	String p21= peilv21.getText() ;//ȡ��21������
			     	//System.out.println(p21);
			     	float i21 = Float.parseFloat(p21); //ת��������
			     	//System.out.println(i21);
			     	//WebElement textbox21 = driver.findElement(By.xpath(".//*[@id='txt21']"));
			     	if(i21<36.07)
			     	{
			     		WebElement checkbox21 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[8]/td[4]/input"));
			     		checkbox21.click();
			     	}//�ж�21�����ʲ���ע

			     	WebElement peilv20 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[9]/td[3]"));
			     	String p20= peilv20.getText() ;//ȡ��20������
			     	////System.out.println(p20);
			     	float i20 = Float.parseFloat(p20); //ת��������
			     	//System.out.println(i20);
			     	//WebElement textbox20 = driver.findElement(By.xpath(".//*[@id='txt20']"));
			     	shuaxin.click();//���ˢ��
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
			     	}//�ж�20�����ʲ���ע
			     	WebElement peilv19 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[10]/td[3]"));
			     	String p19= peilv19.getText() ;//ȡ��19������
			     	////System.out.println(p19);
			     	float i19 = Float.parseFloat(p19); //ת��������
			     	//System.out.println(i19);
			     	//WebElement textbox19 = driver.findElement(By.xpath(".//*[@id='txt19']"));
			     	if(i19<22.44)
			     	{
			     		WebElement checkbox19 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[10]/td[4]/input"));
			     		checkbox19.click();
			     	}//�ж�19�����ʲ���ע
			     	
			     	WebElement peilv18 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[11]/td[3]"));
			     	String p18= peilv18.getText() ;//ȡ��18������
			     	////System.out.println(p18);
			     	float i18 = Float.parseFloat(p18); //ת��������
			     	//System.out.println(i18);
			     	//WebElement textbox18 = driver.findElement(By.xpath(".//*[@id='txt18']"));
			     	if(i18<18.36)
			     	{
			     		WebElement checkbox18 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[11]/td[4]/input"));
			     		checkbox18.click();
			     	}//�ж�18�����ʲ���ע
			     	
			     	WebElement peilv17 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[12]/td[3]"));
			     	String p17= peilv17.getText() ;//ȡ��17������
			     	////System.out.println(p17);
			     	float i17 = Float.parseFloat(p17); //ת��������
			     	//System.out.println(i17);
			     	//WebElement textbox17 = driver.findElement(By.xpath(".//*[@id='txt17']"));
			     	if(i17<16.03)
			     	{
			     		WebElement checkbox17 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[12]/td[4]/input"));
			     		checkbox17.click();
			     	}//�ж�17�����ʲ���ע
			     	WebElement peilv16 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[13]/td[3]"));
			     	String p16= peilv16.getText() ;//ȡ��16������
			     	////System.out.println(p16);
			     	float i16 = Float.parseFloat(p16); //ת��������
			     	//System.out.println(i16);
			     	//WebElement textbox16 = driver.findElement(By.xpath(".//*[@id='txt16']"));
			     	if(i16<14.64)
			     	{
			     		WebElement checkbox16 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[13]/td[4]/input"));
			     		checkbox16.click();
			     	}//�ж�16�����ʲ���ע
			     	WebElement peilv15 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[14]/td[3]"));
			     	String p15= peilv15.getText() ;//ȡ��15������
			     	////System.out.println(p15);
			     	float i15 = Float.parseFloat(p15); //ת��������
			     	//System.out.println(i15);
			     	//WebElement textbox15 = driver.findElement(By.xpath(".//*[@id='txt15']"));
			     	if(i15<13.83)
			     	{
			     		WebElement checkbox15 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[14]/td[4]/input"));
			     		checkbox15.click();
			     	}//�ж�15�����ʲ���ע
			   
			 	
			     	/*WebElement peilv14 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[15]/td[3]"));
			     	String p14= peilv14.getText() ;//ȡ��14������
			     	////System.out.println(p14);
			     	float i14 = Float.parseFloat(p14); //ת��������
			     	//System.out.println(i14);
			     	//WebElement textbox14 = driver.findElement(By.xpath(".//*[@id='txt14']"));
			     	if(i14<13.46)
			     	{
			     		WebElement checkbox14 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[15]/td[4]/input"));
			     		checkbox14.click();
			     	}//�ж�14���ʲ���ע*/ 
			     	
				}
					//n = 1;
					break;
				case 1:
				{
					WebElement moshi1 = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[8]/div[2]/div[4]/div[2]/div/div[2]/a[3]"));
			 		moshi1.click();//���Ͷעģʽ
			 		
			 		shuaxin = driver.findElement(By.xpath(".//*[@id='form1']/div[8]/div[2]/div[4]/div[4]/div[3]/div[1]"));
			 		shuaxin.click();//���ˢ��
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
			     	String p0= peilv0.getText() ;//ȡ��0������
			     	////System.out.println(p0);
			     	float i0 = Float.parseFloat(p0); //ת��������
			     	//System.out.println(i0);
			     	
			     	if(i0<1010)
			     	{
			     		WebElement checkbox0 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[2]/td[4]/input"));
			     		checkbox0.click();
			     		
			     	}//�ж�0�����ʲ���ע*/
			     
			     	WebElement peilv1 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[3]/td[3]"));
			     	String p1= peilv1.getText() ;//ȡ��1������
			     	////System.out.println(p1);
			     	float i1 = Float.parseFloat(p1); //ת��������
			     	////System.out.println(i1);
			     	
			     	if(i1<336.66)
			     	{
			     		
			     		WebElement checkbox1 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[3]/td[4]/input"));
			     		checkbox1.click();
			     	}//�ж�1�����ʲ���ע

			     	WebElement peilv2 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[4]/td[3]"));
			     	String p2= peilv2.getText() ;//ȡ��2������
			     	////System.out.println(p2);
			     	float i2 = Float.parseFloat(p2); //ת��������
			     	////System.out.println(i2);
			     	//WebElement textbox2 = driver.findElement(By.xpath(".//*[@id='txt2']"));
			     	if(i2<168.33)
			     	{
			     		
			     		WebElement checkbox2 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[4]/td[4]/input"));
			     		checkbox2.click();
			         }
			     	//�ж�2�����ʲ���ע
			     	WebElement peilv3 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[5]/td[3]"));
			     	String p3= peilv3.getText() ;//ȡ��13������
			     	////System.out.println(p3);
			     	float i3 = Float.parseFloat(p3); //ת��������
			     	////System.out.println(i3);
			     	//WebElement textbox3 = driver.findElement(By.xpath(".//*[@id='txt3']"));
			     	if(i3<101)
			     	{
			     		WebElement checkbox3 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[5]/td[4]/input"));
			     		checkbox3.click();
			     	}//�ж�0�����ʲ���ע
			     	WebElement peilv4 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[6]/td[3]"));
			     	String p4= peilv4.getText() ;//ȡ��13������
			     	////System.out.println(p4);
			     	float i4 = Float.parseFloat(p4); //ת��������
			     	////System.out.println(i4);
			     	//WebElement textbox4 = driver.findElement(By.xpath(".//*[@id='txt4']"));
			     	if(i4<67.33)
			     	{
			     		WebElement checkbox4 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[6]/td[4]/input"));
			     		checkbox4.click();
			     	}//�ж�4�����ʲ���ע
			     	WebElement peilv5 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[7]/td[3]"));
			     	String p5= peilv5.getText() ;//ȡ��13������
			     	//System.out.println(p5);
			     	float i5 = Float.parseFloat(p5); //ת��������
			     	////System.out.println(i5);
			     	//WebElement textbox5 = driver.findElement(By.xpath(".//*[@id='txt5']"));
			     	
			     	if(i5<48.1)
			     	{
			     		WebElement checkbox5 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[7]/td[4]/input"));
			     		checkbox5.click();
			     	}//�ж�5�����ʲ���ע
			     	WebElement peilv6 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[8]/td[3]"));
			     	String p6= peilv6.getText() ;//ȡ��13������
			     	//System.out.println(p6);
			     	float i6 = Float.parseFloat(p6); //ת��������
			     	//System.out.println(i6);
			     	//WebElement textbox6 = driver.findElement(By.xpath(".//*[@id='txt6']"));
			     	if(i6<36.07)
			     	{
			     		WebElement checkbox6 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[8]/td[4]/input"));
			     		checkbox6.click();
			     	}//�ж�6�����ʲ���ע

			     	WebElement peilv7 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[9]/td[3]"));
			     	String p7= peilv7.getText() ;//ȡ��13������
			     	//System.out.println(p7);
			     	float i7 = Float.parseFloat(p7); //ת��������
			     	//System.out.println(i7);
			     	//WebElement textbox7 = driver.findElement(By.xpath(".//*[@id='txt7']"));
			     	if(i7<28.05)
			     	{
			     		WebElement checkbox7 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[9]/td[4]/input"));
			     		checkbox7.click();
			     	}//�ж�7�����ʲ���ע
			     	shuaxin.click();//���ˢ��

			     	
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
			     	String p8= peilv8.getText() ;//ȡ��13������
			     	//System.out.println(p8);
			     	float i8 = Float.parseFloat(p8); //ת��������
			     	//System.out.println(i8);
			     	//WebElement textbox8 = driver.findElement(By.xpath(".//*[@id='txt8']"));
			     	if(i8<22.44)
			     	{
			     		WebElement checkbox8 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[10]/td[4]/input"));
			     		checkbox8.click();
			     	}//�ж�8�����ʲ���ע
			     	
			     	WebElement peilv9 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[11]/td[3]"));
			     	String p9= peilv9.getText() ;//ȡ��13������
			     	//System.out.println(p9);
			     	float i9 = Float.parseFloat(p9); //ת��������
			     	//System.out.println(i9);
			     	//WebElement textbox9 = driver.findElement(By.xpath(".//*[@id='txt9']"));
			     	if(i9<18.36)
			     	{
			     		WebElement checkbox9 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[11]/td[4]/input"));
			     		checkbox9.click();
			     	}//�ж�9�����ʲ���ע
			     	
			     	WebElement peilv10 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[12]/td[3]"));
			     	String p10= peilv10.getText() ;//ȡ��13������
			     	//System.out.println(p10);
			     	float i10 = Float.parseFloat(p10); //ת��������
			     	//System.out.println(i10);
			     	//WebElement textbox10 = driver.findElement(By.xpath(".//*[@id='txt10']"));
			     	if(i10<16.03)
			     	{
			     		WebElement checkbox10 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[12]/td[4]/input"));
			     		checkbox10.click();
			     	}//�ж�10�����ʲ���ע
			     	WebElement peilv11 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[13]/td[3]"));
			     	String p11= peilv11.getText() ;//ȡ��13������
			     	//System.out.println(p11);
			     	float i11 = Float.parseFloat(p11); //ת��������
			     	//System.out.println(i11);
			     	//WebElement textbox11 = driver.findElement(By.xpath(".//*[@id='txt11']"));
			     	if(i11<14.63)
			     	{
			     		WebElement checkbox11 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[13]/td[4]/input"));
			     		checkbox11.click();
			     	}//�ж�11�����ʲ���ע
			     	WebElement peilv12 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[14]/td[3]"));
			     	String p12= peilv12.getText() ;//ȡ��13������
			     	//System.out.println(p12);
			     	float i12 = Float.parseFloat(p12); //ת��������
			     	//System.out.println(i12);
			     	//WebElement textbox12 = driver.findElement(By.xpath(".//*[@id='txt12']"));
			     	if(i12<13.83)
			     	{
			     		WebElement checkbox12 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[14]/td[4]/input"));
			     		checkbox12.click();
			     	}//�ж�12�����ʲ���ע
			   
			 	
			     	/*WebElement peilv13 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[15]/td[3]"));
			     	String p13= peilv13.getText() ;//ȡ��13������
			     	//System.out.println(p13);
			     	float i13 = Float.parseFloat(p13); //ת��������
			     	//System.out.println(i13);
			     	//WebElement textbox13 = driver.findElement(By.xpath(".//*[@id='txt13']"));
			     	if(i13<13.46)
			     	{
			     		WebElement checkbox13 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[15]/td[4]/input"));
			     		checkbox13.click();
			     	}//�ж�13���ʲ���ע */
			     	
			     	shuaxin.click();//���ˢ��
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
			     	String p27= peilv27.getText() ;//ȡ��27������
			     	//System.out.println(p27);
			     	float i27 = Float.parseFloat(p27); //ת��������
			     	//System.out.println(i27);
			     	//WebElement textbox27 = driver.findElement(By.xpath(".//*[@id='txt27']"));
			     	if(i27<1010)
			     	{
			     		WebElement checkbox27 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[2]/td[4]/input"));
			     		checkbox27.click();
			     	}//�ж�0�����ʲ���ע*/
			     	WebElement peilv26 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[3]/td[3]"));
			     	String p26= peilv26.getText() ;//ȡ��26������
			     	//System.out.println(p26);
			     	float i26 = Float.parseFloat(p26); //ת��������
			     	//System.out.println(i26);
			     	//WebElement textbox26 = driver.findElement(By.xpath(".//*[@id='txt26']"));
			     	if(i26<336.66)
			     	{
			     		WebElement checkbox26 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[3]/td[4]/input"));
			     		checkbox26.click();
			     	}//�ж�1�����ʲ���ע

			     	WebElement peilv25 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[4]/td[3]"));
			     	String p25= peilv25.getText() ;//ȡ��25������
			     	//System.out.println(p25);
			     	float i25 = Float.parseFloat(p25); //ת��������
			     	//System.out.println(i25);
			     	//WebElement textbox25 = driver.findElement(By.xpath(".//*[@id='txt25']"));
			     	if(i25<168.33)
			     	{
			     		WebElement checkbox25 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[4]/td[4]/input"));
			     		checkbox25.click();
			     	}//�ж�2�����ʲ���ע
			     	WebElement peilv24 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[5]/td[3]"));
			     	String p24= peilv24.getText() ;//ȡ��24������
			     	//System.out.println(p24);
			     	float i24 = Float.parseFloat(p24); //ת��������
			     	//System.out.println(i24);
			     	//WebElement textbox24 = driver.findElement(By.xpath(".//*[@id='txt24']"));
			     	if(i24<101)
			     	{
			     		WebElement checkbox24 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[5]/td[4]/input"));
			     		checkbox24.click();
			     	}//�ж�0�����ʲ���ע
			     	WebElement peilv23 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[6]/td[3]"));
			     	String p23= peilv23.getText() ;//ȡ��23������
			     	//System.out.println(p23);
			     	float i23 = Float.parseFloat(p23); //ת��������
			     	//System.out.println(i23);
			     	//WebElement textbox23 = driver.findElement(By.xpath(".//*[@id='txt23']"));
			     	if(i23<67.33)
			     	{
			     		WebElement checkbox23 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[6]/td[4]/input"));
			     		checkbox23.click();
			     	}//�ж�23�����ʲ���ע
			     	WebElement peilv22 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[7]/td[3]"));
			     	String p22= peilv22.getText() ;//ȡ��22������
			     	//System.out.println(p22);
			     	float i22 = Float.parseFloat(p22); //ת��������
			     	//System.out.println(i22);
			     	//WebElement textbox22 = driver.findElement(By.xpath(".//*[@id='txt22']"));
			     	if(i22<48.09)
			     	{
			     		WebElement checkbox22 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[7]/td[4]/input"));
			     		checkbox22.click();
			     	}//�ж�22�����ʲ���ע
			     	WebElement peilv21 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[8]/td[3]"));
			     	String p21= peilv21.getText() ;//ȡ��21������
			     	//System.out.println(p21);
			     	float i21 = Float.parseFloat(p21); //ת��������
			     	//System.out.println(i21);
			     	//WebElement textbox21 = driver.findElement(By.xpath(".//*[@id='txt21']"));
			     	if(i21<36.07)
			     	{
			     		WebElement checkbox21 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[8]/td[4]/input"));
			     		checkbox21.click();
			     	}//�ж�21�����ʲ���ע

			     	WebElement peilv20 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[9]/td[3]"));
			     	String p20= peilv20.getText() ;//ȡ��20������
			     	////System.out.println(p20);
			     	float i20 = Float.parseFloat(p20); //ת��������
			     	//System.out.println(i20);
			     	//WebElement textbox20 = driver.findElement(By.xpath(".//*[@id='txt20']"));
			     	shuaxin.click();//���ˢ��
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
			     	}//�ж�20�����ʲ���ע
			     	WebElement peilv19 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[10]/td[3]"));
			     	String p19= peilv19.getText() ;//ȡ��19������
			     	////System.out.println(p19);
			     	float i19 = Float.parseFloat(p19); //ת��������
			     	//System.out.println(i19);
			     	//WebElement textbox19 = driver.findElement(By.xpath(".//*[@id='txt19']"));
			     	if(i19<22.44)
			     	{
			     		WebElement checkbox19 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[10]/td[4]/input"));
			     		checkbox19.click();
			     	}//�ж�19�����ʲ���ע
			     	
			     	WebElement peilv18 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[11]/td[3]"));
			     	String p18= peilv18.getText() ;//ȡ��18������
			     	////System.out.println(p18);
			     	float i18 = Float.parseFloat(p18); //ת��������
			     	//System.out.println(i18);
			     	//WebElement textbox18 = driver.findElement(By.xpath(".//*[@id='txt18']"));
			     	if(i18<18.36)
			     	{
			     		WebElement checkbox18 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[11]/td[4]/input"));
			     		checkbox18.click();
			     	}//�ж�18�����ʲ���ע
			     	
			     	WebElement peilv17 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[12]/td[3]"));
			     	String p17= peilv17.getText() ;//ȡ��17������
			     	////System.out.println(p17);
			     	float i17 = Float.parseFloat(p17); //ת��������
			     	//System.out.println(i17);
			     	//WebElement textbox17 = driver.findElement(By.xpath(".//*[@id='txt17']"));
			     	if(i17<16.03)
			     	{
			     		WebElement checkbox17 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[12]/td[4]/input"));
			     		checkbox17.click();
			     	}//�ж�17�����ʲ���ע
			     	WebElement peilv16 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[13]/td[3]"));
			     	String p16= peilv16.getText() ;//ȡ��16������
			     	////System.out.println(p16);
			     	float i16 = Float.parseFloat(p16); //ת��������
			     	//System.out.println(i16);
			     	//WebElement textbox16 = driver.findElement(By.xpath(".//*[@id='txt16']"));
			     	if(i16<14.64)
			     	{
			     		WebElement checkbox16 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[13]/td[4]/input"));
			     		checkbox16.click();
			     	}//�ж�16�����ʲ���ע
			     	WebElement peilv15 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[14]/td[3]"));
			     	String p15= peilv15.getText() ;//ȡ��15������
			     	////System.out.println(p15);
			     	float i15 = Float.parseFloat(p15); //ת��������
			     	//System.out.println(i15);
			     	//WebElement textbox15 = driver.findElement(By.xpath(".//*[@id='txt15']"));
			     	if(i15<13.83)
			     	{
			     		WebElement checkbox15 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[14]/td[4]/input"));
			     		checkbox15.click();
			     	}//�ж�15�����ʲ���ע
			   
			 	
			     	/*WebElement peilv14 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[15]/td[3]"));
			     	String p14= peilv14.getText() ;//ȡ��14������
			     	////System.out.println(p14);
			     	float i14 = Float.parseFloat(p14); //ת��������
			     	//System.out.println(i14);
			     	//WebElement textbox14 = driver.findElement(By.xpath(".//*[@id='txt14']"));
			     	if(i14<13.46)
			     	{
			     		WebElement checkbox14 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[15]/td[4]/input"));
			     		checkbox14.click();
			     	}//�ж�14���ʲ���ע*/ 
			     	
				
				}
					//n = 3;
					break;
				case 2:
				{
					WebElement moshi1 = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[8]/div[2]/div[4]/div[2]/div/div[2]/a[3]"));
			 		moshi1.click();//���Ͷעģʽ
			 		
			 		shuaxin = driver.findElement(By.xpath(".//*[@id='form1']/div[8]/div[2]/div[4]/div[4]/div[3]/div[1]"));
			 		shuaxin.click();//���ˢ��
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
			     	String p0= peilv0.getText() ;//ȡ��0������
			     	////System.out.println(p0);
			     	float i0 = Float.parseFloat(p0); //ת��������
			     	//System.out.println(i0);
			     	
			     	if(i0<1010)
			     	{
			     		WebElement checkbox0 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[2]/td[4]/input"));
			     		checkbox0.click();
			     		
			     	}//�ж�0�����ʲ���ע*/
			     
			     	WebElement peilv1 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[3]/td[3]"));
			     	String p1= peilv1.getText() ;//ȡ��1������
			     	////System.out.println(p1);
			     	float i1 = Float.parseFloat(p1); //ת��������
			     	////System.out.println(i1);
			     	
			     	if(i1<336.66)
			     	{
			     		
			     		WebElement checkbox1 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[3]/td[4]/input"));
			     		checkbox1.click();
			     	}//�ж�1�����ʲ���ע

			     	WebElement peilv2 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[4]/td[3]"));
			     	String p2= peilv2.getText() ;//ȡ��2������
			     	////System.out.println(p2);
			     	float i2 = Float.parseFloat(p2); //ת��������
			     	////System.out.println(i2);
			     	//WebElement textbox2 = driver.findElement(By.xpath(".//*[@id='txt2']"));
			     	if(i2<168.33)
			     	{
			     		
			     		WebElement checkbox2 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[4]/td[4]/input"));
			     		checkbox2.click();
			         }
			     	//�ж�2�����ʲ���ע
			     	WebElement peilv3 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[5]/td[3]"));
			     	String p3= peilv3.getText() ;//ȡ��13������
			     	////System.out.println(p3);
			     	float i3 = Float.parseFloat(p3); //ת��������
			     	////System.out.println(i3);
			     	//WebElement textbox3 = driver.findElement(By.xpath(".//*[@id='txt3']"));
			     	if(i3<101)
			     	{
			     		WebElement checkbox3 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[5]/td[4]/input"));
			     		checkbox3.click();
			     	}//�ж�0�����ʲ���ע
			     	WebElement peilv4 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[6]/td[3]"));
			     	String p4= peilv4.getText() ;//ȡ��13������
			     	////System.out.println(p4);
			     	float i4 = Float.parseFloat(p4); //ת��������
			     	////System.out.println(i4);
			     	//WebElement textbox4 = driver.findElement(By.xpath(".//*[@id='txt4']"));
			     	if(i4<67.33)
			     	{
			     		WebElement checkbox4 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[6]/td[4]/input"));
			     		checkbox4.click();
			     	}//�ж�4�����ʲ���ע
			     	WebElement peilv5 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[7]/td[3]"));
			     	String p5= peilv5.getText() ;//ȡ��13������
			     	//System.out.println(p5);
			     	float i5 = Float.parseFloat(p5); //ת��������
			     	////System.out.println(i5);
			     	//WebElement textbox5 = driver.findElement(By.xpath(".//*[@id='txt5']"));
			     	
			     	if(i5<48.1)
			     	{
			     		WebElement checkbox5 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[7]/td[4]/input"));
			     		checkbox5.click();
			     	}//�ж�5�����ʲ���ע
			     	WebElement peilv6 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[8]/td[3]"));
			     	String p6= peilv6.getText() ;//ȡ��13������
			     	//System.out.println(p6);
			     	float i6 = Float.parseFloat(p6); //ת��������
			     	//System.out.println(i6);
			     	//WebElement textbox6 = driver.findElement(By.xpath(".//*[@id='txt6']"));
			     	if(i6<36.07)
			     	{
			     		WebElement checkbox6 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[8]/td[4]/input"));
			     		checkbox6.click();
			     	}//�ж�6�����ʲ���ע

			     	WebElement peilv7 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[9]/td[3]"));
			     	String p7= peilv7.getText() ;//ȡ��13������
			     	//System.out.println(p7);
			     	float i7 = Float.parseFloat(p7); //ת��������
			     	//System.out.println(i7);
			     	//WebElement textbox7 = driver.findElement(By.xpath(".//*[@id='txt7']"));
			     	if(i7<28.05)
			     	{
			     		WebElement checkbox7 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[9]/td[4]/input"));
			     		checkbox7.click();
			     	}//�ж�7�����ʲ���ע
			     	shuaxin.click();//���ˢ��

			     	
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
			     	String p8= peilv8.getText() ;//ȡ��13������
			     	//System.out.println(p8);
			     	float i8 = Float.parseFloat(p8); //ת��������
			     	//System.out.println(i8);
			     	//WebElement textbox8 = driver.findElement(By.xpath(".//*[@id='txt8']"));
			     	if(i8<22.44)
			     	{
			     		WebElement checkbox8 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[10]/td[4]/input"));
			     		checkbox8.click();
			     	}//�ж�8�����ʲ���ע
			     	
			     	WebElement peilv9 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[11]/td[3]"));
			     	String p9= peilv9.getText() ;//ȡ��13������
			     	//System.out.println(p9);
			     	float i9 = Float.parseFloat(p9); //ת��������
			     	//System.out.println(i9);
			     	//WebElement textbox9 = driver.findElement(By.xpath(".//*[@id='txt9']"));
			     	if(i9<18.36)
			     	{
			     		WebElement checkbox9 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[11]/td[4]/input"));
			     		checkbox9.click();
			     	}//�ж�9�����ʲ���ע
			     	
			     	WebElement peilv10 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[12]/td[3]"));
			     	String p10= peilv10.getText() ;//ȡ��13������
			     	//System.out.println(p10);
			     	float i10 = Float.parseFloat(p10); //ת��������
			     	//System.out.println(i10);
			     	//WebElement textbox10 = driver.findElement(By.xpath(".//*[@id='txt10']"));
			     	if(i10<16.03)
			     	{
			     		WebElement checkbox10 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[12]/td[4]/input"));
			     		checkbox10.click();
			     	}//�ж�10�����ʲ���ע
			     	WebElement peilv11 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[13]/td[3]"));
			     	String p11= peilv11.getText() ;//ȡ��13������
			     	//System.out.println(p11);
			     	float i11 = Float.parseFloat(p11); //ת��������
			     	//System.out.println(i11);
			     	//WebElement textbox11 = driver.findElement(By.xpath(".//*[@id='txt11']"));
			     	if(i11<14.63)
			     	{
			     		WebElement checkbox11 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[13]/td[4]/input"));
			     		checkbox11.click();
			     	}//�ж�11�����ʲ���ע
			     	WebElement peilv12 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[14]/td[3]"));
			     	String p12= peilv12.getText() ;//ȡ��13������
			     	//System.out.println(p12);
			     	float i12 = Float.parseFloat(p12); //ת��������
			     	//System.out.println(i12);
			     	//WebElement textbox12 = driver.findElement(By.xpath(".//*[@id='txt12']"));
			     	if(i12<13.83)
			     	{
			     		WebElement checkbox12 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[14]/td[4]/input"));
			     		checkbox12.click();
			     	}//�ж�12�����ʲ���ע
			   
			 	
			     	/*WebElement peilv13 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[15]/td[3]"));
			     	String p13= peilv13.getText() ;//ȡ��13������
			     	//System.out.println(p13);
			     	float i13 = Float.parseFloat(p13); //ת��������
			     	//System.out.println(i13);
			     	//WebElement textbox13 = driver.findElement(By.xpath(".//*[@id='txt13']"));
			     	if(i13<13.46)
			     	{
			     		WebElement checkbox13 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[15]/td[4]/input"));
			     		checkbox13.click();
			     	}//�ж�13���ʲ���ע */
			     	
			     	shuaxin.click();//���ˢ��
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
			     	String p27= peilv27.getText() ;//ȡ��27������
			     	//System.out.println(p27);
			     	float i27 = Float.parseFloat(p27); //ת��������
			     	//System.out.println(i27);
			     	//WebElement textbox27 = driver.findElement(By.xpath(".//*[@id='txt27']"));
			     	if(i27<1010)
			     	{
			     		WebElement checkbox27 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[2]/td[4]/input"));
			     		checkbox27.click();
			     	}//�ж�0�����ʲ���ע*/
			     	WebElement peilv26 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[3]/td[3]"));
			     	String p26= peilv26.getText() ;//ȡ��26������
			     	//System.out.println(p26);
			     	float i26 = Float.parseFloat(p26); //ת��������
			     	//System.out.println(i26);
			     	//WebElement textbox26 = driver.findElement(By.xpath(".//*[@id='txt26']"));
			     	if(i26<336.66)
			     	{
			     		WebElement checkbox26 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[3]/td[4]/input"));
			     		checkbox26.click();
			     	}//�ж�1�����ʲ���ע

			     	WebElement peilv25 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[4]/td[3]"));
			     	String p25= peilv25.getText() ;//ȡ��25������
			     	//System.out.println(p25);
			     	float i25 = Float.parseFloat(p25); //ת��������
			     	//System.out.println(i25);
			     	//WebElement textbox25 = driver.findElement(By.xpath(".//*[@id='txt25']"));
			     	if(i25<168.33)
			     	{
			     		WebElement checkbox25 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[4]/td[4]/input"));
			     		checkbox25.click();
			     	}//�ж�2�����ʲ���ע
			     	WebElement peilv24 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[5]/td[3]"));
			     	String p24= peilv24.getText() ;//ȡ��24������
			     	//System.out.println(p24);
			     	float i24 = Float.parseFloat(p24); //ת��������
			     	//System.out.println(i24);
			     	//WebElement textbox24 = driver.findElement(By.xpath(".//*[@id='txt24']"));
			     	if(i24<101)
			     	{
			     		WebElement checkbox24 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[5]/td[4]/input"));
			     		checkbox24.click();
			     	}//�ж�0�����ʲ���ע
			     	WebElement peilv23 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[6]/td[3]"));
			     	String p23= peilv23.getText() ;//ȡ��23������
			     	//System.out.println(p23);
			     	float i23 = Float.parseFloat(p23); //ת��������
			     	//System.out.println(i23);
			     	//WebElement textbox23 = driver.findElement(By.xpath(".//*[@id='txt23']"));
			     	if(i23<67.33)
			     	{
			     		WebElement checkbox23 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[6]/td[4]/input"));
			     		checkbox23.click();
			     	}//�ж�23�����ʲ���ע
			     	WebElement peilv22 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[7]/td[3]"));
			     	String p22= peilv22.getText() ;//ȡ��22������
			     	//System.out.println(p22);
			     	float i22 = Float.parseFloat(p22); //ת��������
			     	//System.out.println(i22);
			     	//WebElement textbox22 = driver.findElement(By.xpath(".//*[@id='txt22']"));
			     	if(i22<48.09)
			     	{
			     		WebElement checkbox22 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[7]/td[4]/input"));
			     		checkbox22.click();
			     	}//�ж�22�����ʲ���ע
			     	WebElement peilv21 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[8]/td[3]"));
			     	String p21= peilv21.getText() ;//ȡ��21������
			     	//System.out.println(p21);
			     	float i21 = Float.parseFloat(p21); //ת��������
			     	//System.out.println(i21);
			     	//WebElement textbox21 = driver.findElement(By.xpath(".//*[@id='txt21']"));
			     	if(i21<36.07)
			     	{
			     		WebElement checkbox21 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[8]/td[4]/input"));
			     		checkbox21.click();
			     	}//�ж�21�����ʲ���ע

			     	WebElement peilv20 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[9]/td[3]"));
			     	String p20= peilv20.getText() ;//ȡ��20������
			     	////System.out.println(p20);
			     	float i20 = Float.parseFloat(p20); //ת��������
			     	//System.out.println(i20);
			     	//WebElement textbox20 = driver.findElement(By.xpath(".//*[@id='txt20']"));
			     	shuaxin.click();//���ˢ��
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
			     	}//�ж�20�����ʲ���ע
			     	WebElement peilv19 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[10]/td[3]"));
			     	String p19= peilv19.getText() ;//ȡ��19������
			     	////System.out.println(p19);
			     	float i19 = Float.parseFloat(p19); //ת��������
			     	//System.out.println(i19);
			     	//WebElement textbox19 = driver.findElement(By.xpath(".//*[@id='txt19']"));
			     	if(i19<22.44)
			     	{
			     		WebElement checkbox19 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[10]/td[4]/input"));
			     		checkbox19.click();
			     	}//�ж�19�����ʲ���ע
			     	
			     	WebElement peilv18 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[11]/td[3]"));
			     	String p18= peilv18.getText() ;//ȡ��18������
			     	////System.out.println(p18);
			     	float i18 = Float.parseFloat(p18); //ת��������
			     	//System.out.println(i18);
			     	//WebElement textbox18 = driver.findElement(By.xpath(".//*[@id='txt18']"));
			     	if(i18<18.36)
			     	{
			     		WebElement checkbox18 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[11]/td[4]/input"));
			     		checkbox18.click();
			     	}//�ж�18�����ʲ���ע
			     	
			     	WebElement peilv17 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[12]/td[3]"));
			     	String p17= peilv17.getText() ;//ȡ��17������
			     	////System.out.println(p17);
			     	float i17 = Float.parseFloat(p17); //ת��������
			     	//System.out.println(i17);
			     	//WebElement textbox17 = driver.findElement(By.xpath(".//*[@id='txt17']"));
			     	if(i17<16.03)
			     	{
			     		WebElement checkbox17 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[12]/td[4]/input"));
			     		checkbox17.click();
			     	}//�ж�17�����ʲ���ע
			     	WebElement peilv16 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[13]/td[3]"));
			     	String p16= peilv16.getText() ;//ȡ��16������
			     	////System.out.println(p16);
			     	float i16 = Float.parseFloat(p16); //ת��������
			     	//System.out.println(i16);
			     	//WebElement textbox16 = driver.findElement(By.xpath(".//*[@id='txt16']"));
			     	if(i16<14.64)
			     	{
			     		WebElement checkbox16 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[13]/td[4]/input"));
			     		checkbox16.click();
			     	}//�ж�16�����ʲ���ע
			     	WebElement peilv15 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[14]/td[3]"));
			     	String p15= peilv15.getText() ;//ȡ��15������
			     	////System.out.println(p15);
			     	float i15 = Float.parseFloat(p15); //ת��������
			     	//System.out.println(i15);
			     	//WebElement textbox15 = driver.findElement(By.xpath(".//*[@id='txt15']"));
			     	if(i15<13.83)
			     	{
			     		WebElement checkbox15 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[14]/td[4]/input"));
			     		checkbox15.click();
			     	}//�ж�15�����ʲ���ע
			   
			 	
			     	/*WebElement peilv14 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[15]/td[3]"));
			     	String p14= peilv14.getText() ;//ȡ��14������
			     	////System.out.println(p14);
			     	float i14 = Float.parseFloat(p14); //ת��������
			     	//System.out.println(i14);
			     	//WebElement textbox14 = driver.findElement(By.xpath(".//*[@id='txt14']"));
			     	if(i14<13.46)
			     	{
			     		WebElement checkbox14 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[15]/td[4]/input"));
			     		checkbox14.click();
			     	}//�ж�14���ʲ���ע*/ 
			     	
				
				}
					//n = 3;
					break;
				case 3:
				{
					WebElement moshi1 = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[8]/div[2]/div[4]/div[2]/div/div[2]/a[3]"));
			 		moshi1.click();//���Ͷעģʽ
			 		
			 		shuaxin = driver.findElement(By.xpath(".//*[@id='form1']/div[8]/div[2]/div[4]/div[4]/div[3]/div[1]"));
			 		shuaxin.click();//���ˢ��
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
			     	String p0= peilv0.getText() ;//ȡ��0������
			     	////System.out.println(p0);
			     	float i0 = Float.parseFloat(p0); //ת��������
			     	//System.out.println(i0);
			     	
			     	if(i0<1010)
			     	{
			     		WebElement checkbox0 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[2]/td[4]/input"));
			     		checkbox0.click();
			     		
			     	}//�ж�0�����ʲ���ע*/
			     
			     	WebElement peilv1 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[3]/td[3]"));
			     	String p1= peilv1.getText() ;//ȡ��1������
			     	////System.out.println(p1);
			     	float i1 = Float.parseFloat(p1); //ת��������
			     	////System.out.println(i1);
			     	
			     	if(i1<336.66)
			     	{
			     		
			     		WebElement checkbox1 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[3]/td[4]/input"));
			     		checkbox1.click();
			     	}//�ж�1�����ʲ���ע

			     	WebElement peilv2 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[4]/td[3]"));
			     	String p2= peilv2.getText() ;//ȡ��2������
			     	////System.out.println(p2);
			     	float i2 = Float.parseFloat(p2); //ת��������
			     	////System.out.println(i2);
			     	//WebElement textbox2 = driver.findElement(By.xpath(".//*[@id='txt2']"));
			     	if(i2<168.33)
			     	{
			     		
			     		WebElement checkbox2 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[4]/td[4]/input"));
			     		checkbox2.click();
			         }
			     	//�ж�2�����ʲ���ע
			     	WebElement peilv3 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[5]/td[3]"));
			     	String p3= peilv3.getText() ;//ȡ��13������
			     	////System.out.println(p3);
			     	float i3 = Float.parseFloat(p3); //ת��������
			     	////System.out.println(i3);
			     	//WebElement textbox3 = driver.findElement(By.xpath(".//*[@id='txt3']"));
			     	if(i3<101)
			     	{
			     		WebElement checkbox3 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[5]/td[4]/input"));
			     		checkbox3.click();
			     	}//�ж�0�����ʲ���ע
			     	WebElement peilv4 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[6]/td[3]"));
			     	String p4= peilv4.getText() ;//ȡ��13������
			     	////System.out.println(p4);
			     	float i4 = Float.parseFloat(p4); //ת��������
			     	////System.out.println(i4);
			     	//WebElement textbox4 = driver.findElement(By.xpath(".//*[@id='txt4']"));
			     	if(i4<67.33)
			     	{
			     		WebElement checkbox4 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[6]/td[4]/input"));
			     		checkbox4.click();
			     	}//�ж�4�����ʲ���ע
			     	WebElement peilv5 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[7]/td[3]"));
			     	String p5= peilv5.getText() ;//ȡ��13������
			     	//System.out.println(p5);
			     	float i5 = Float.parseFloat(p5); //ת��������
			     	////System.out.println(i5);
			     	//WebElement textbox5 = driver.findElement(By.xpath(".//*[@id='txt5']"));
			     	
			     	if(i5<48.1)
			     	{
			     		WebElement checkbox5 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[7]/td[4]/input"));
			     		checkbox5.click();
			     	}//�ж�5�����ʲ���ע
			     	WebElement peilv6 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[8]/td[3]"));
			     	String p6= peilv6.getText() ;//ȡ��13������
			     	//System.out.println(p6);
			     	float i6 = Float.parseFloat(p6); //ת��������
			     	//System.out.println(i6);
			     	//WebElement textbox6 = driver.findElement(By.xpath(".//*[@id='txt6']"));
			     	if(i6<36.07)
			     	{
			     		WebElement checkbox6 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[8]/td[4]/input"));
			     		checkbox6.click();
			     	}//�ж�6�����ʲ���ע

			     	WebElement peilv7 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[9]/td[3]"));
			     	String p7= peilv7.getText() ;//ȡ��13������
			     	//System.out.println(p7);
			     	float i7 = Float.parseFloat(p7); //ת��������
			     	//System.out.println(i7);
			     	//WebElement textbox7 = driver.findElement(By.xpath(".//*[@id='txt7']"));
			     	if(i7<28.05)
			     	{
			     		WebElement checkbox7 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[9]/td[4]/input"));
			     		checkbox7.click();
			     	}//�ж�7�����ʲ���ע
			     	shuaxin.click();//���ˢ��

			     	
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
			     	String p8= peilv8.getText() ;//ȡ��13������
			     	//System.out.println(p8);
			     	float i8 = Float.parseFloat(p8); //ת��������
			     	//System.out.println(i8);
			     	//WebElement textbox8 = driver.findElement(By.xpath(".//*[@id='txt8']"));
			     	if(i8<22.44)
			     	{
			     		WebElement checkbox8 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[10]/td[4]/input"));
			     		checkbox8.click();
			     	}//�ж�8�����ʲ���ע
			     	
			     	WebElement peilv9 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[11]/td[3]"));
			     	String p9= peilv9.getText() ;//ȡ��13������
			     	//System.out.println(p9);
			     	float i9 = Float.parseFloat(p9); //ת��������
			     	//System.out.println(i9);
			     	//WebElement textbox9 = driver.findElement(By.xpath(".//*[@id='txt9']"));
			     	if(i9<18.36)
			     	{
			     		WebElement checkbox9 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[11]/td[4]/input"));
			     		checkbox9.click();
			     	}//�ж�9�����ʲ���ע
			     	
			     	WebElement peilv10 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[12]/td[3]"));
			     	String p10= peilv10.getText() ;//ȡ��13������
			     	//System.out.println(p10);
			     	float i10 = Float.parseFloat(p10); //ת��������
			     	//System.out.println(i10);
			     	//WebElement textbox10 = driver.findElement(By.xpath(".//*[@id='txt10']"));
			     	if(i10<16.03)
			     	{
			     		WebElement checkbox10 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[12]/td[4]/input"));
			     		checkbox10.click();
			     	}//�ж�10�����ʲ���ע
			     	WebElement peilv11 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[13]/td[3]"));
			     	String p11= peilv11.getText() ;//ȡ��13������
			     	//System.out.println(p11);
			     	float i11 = Float.parseFloat(p11); //ת��������
			     	//System.out.println(i11);
			     	//WebElement textbox11 = driver.findElement(By.xpath(".//*[@id='txt11']"));
			     	if(i11<14.63)
			     	{
			     		WebElement checkbox11 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[13]/td[4]/input"));
			     		checkbox11.click();
			     	}//�ж�11�����ʲ���ע
			     	WebElement peilv12 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[14]/td[3]"));
			     	String p12= peilv12.getText() ;//ȡ��13������
			     	//System.out.println(p12);
			     	float i12 = Float.parseFloat(p12); //ת��������
			     	//System.out.println(i12);
			     	//WebElement textbox12 = driver.findElement(By.xpath(".//*[@id='txt12']"));
			     	if(i12<13.83)
			     	{
			     		WebElement checkbox12 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[14]/td[4]/input"));
			     		checkbox12.click();
			     	}//�ж�12�����ʲ���ע
			   
			 	
			     	/*WebElement peilv13 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[15]/td[3]"));
			     	String p13= peilv13.getText() ;//ȡ��13������
			     	//System.out.println(p13);
			     	float i13 = Float.parseFloat(p13); //ת��������
			     	//System.out.println(i13);
			     	//WebElement textbox13 = driver.findElement(By.xpath(".//*[@id='txt13']"));
			     	if(i13<13.46)
			     	{
			     		WebElement checkbox13 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[15]/td[4]/input"));
			     		checkbox13.click();
			     	}//�ж�13���ʲ���ע */
			     	
			     	shuaxin.click();//���ˢ��
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
			     	String p27= peilv27.getText() ;//ȡ��27������
			     	//System.out.println(p27);
			     	float i27 = Float.parseFloat(p27); //ת��������
			     	//System.out.println(i27);
			     	//WebElement textbox27 = driver.findElement(By.xpath(".//*[@id='txt27']"));
			     	if(i27<1010)
			     	{
			     		WebElement checkbox27 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[2]/td[4]/input"));
			     		checkbox27.click();
			     	}//�ж�0�����ʲ���ע*/
			     	WebElement peilv26 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[3]/td[3]"));
			     	String p26= peilv26.getText() ;//ȡ��26������
			     	//System.out.println(p26);
			     	float i26 = Float.parseFloat(p26); //ת��������
			     	//System.out.println(i26);
			     	//WebElement textbox26 = driver.findElement(By.xpath(".//*[@id='txt26']"));
			     	if(i26<336.66)
			     	{
			     		WebElement checkbox26 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[3]/td[4]/input"));
			     		checkbox26.click();
			     	}//�ж�1�����ʲ���ע

			     	WebElement peilv25 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[4]/td[3]"));
			     	String p25= peilv25.getText() ;//ȡ��25������
			     	//System.out.println(p25);
			     	float i25 = Float.parseFloat(p25); //ת��������
			     	//System.out.println(i25);
			     	//WebElement textbox25 = driver.findElement(By.xpath(".//*[@id='txt25']"));
			     	if(i25<168.33)
			     	{
			     		WebElement checkbox25 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[4]/td[4]/input"));
			     		checkbox25.click();
			     	}//�ж�2�����ʲ���ע
			     	WebElement peilv24 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[5]/td[3]"));
			     	String p24= peilv24.getText() ;//ȡ��24������
			     	//System.out.println(p24);
			     	float i24 = Float.parseFloat(p24); //ת��������
			     	//System.out.println(i24);
			     	//WebElement textbox24 = driver.findElement(By.xpath(".//*[@id='txt24']"));
			     	if(i24<101)
			     	{
			     		WebElement checkbox24 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[5]/td[4]/input"));
			     		checkbox24.click();
			     	}//�ж�0�����ʲ���ע
			     	WebElement peilv23 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[6]/td[3]"));
			     	String p23= peilv23.getText() ;//ȡ��23������
			     	//System.out.println(p23);
			     	float i23 = Float.parseFloat(p23); //ת��������
			     	//System.out.println(i23);
			     	//WebElement textbox23 = driver.findElement(By.xpath(".//*[@id='txt23']"));
			     	if(i23<67.33)
			     	{
			     		WebElement checkbox23 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[6]/td[4]/input"));
			     		checkbox23.click();
			     	}//�ж�23�����ʲ���ע
			     	WebElement peilv22 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[7]/td[3]"));
			     	String p22= peilv22.getText() ;//ȡ��22������
			     	//System.out.println(p22);
			     	float i22 = Float.parseFloat(p22); //ת��������
			     	//System.out.println(i22);
			     	//WebElement textbox22 = driver.findElement(By.xpath(".//*[@id='txt22']"));
			     	if(i22<48.09)
			     	{
			     		WebElement checkbox22 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[7]/td[4]/input"));
			     		checkbox22.click();
			     	}//�ж�22�����ʲ���ע
			     	WebElement peilv21 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[8]/td[3]"));
			     	String p21= peilv21.getText() ;//ȡ��21������
			     	//System.out.println(p21);
			     	float i21 = Float.parseFloat(p21); //ת��������
			     	//System.out.println(i21);
			     	//WebElement textbox21 = driver.findElement(By.xpath(".//*[@id='txt21']"));
			     	if(i21<36.07)
			     	{
			     		WebElement checkbox21 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[8]/td[4]/input"));
			     		checkbox21.click();
			     	}//�ж�21�����ʲ���ע

			     	WebElement peilv20 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[9]/td[3]"));
			     	String p20= peilv20.getText() ;//ȡ��20������
			     	////System.out.println(p20);
			     	float i20 = Float.parseFloat(p20); //ת��������
			     	//System.out.println(i20);
			     	//WebElement textbox20 = driver.findElement(By.xpath(".//*[@id='txt20']"));
			     	shuaxin.click();//���ˢ��
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
			     	}//�ж�20�����ʲ���ע
			     	WebElement peilv19 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[10]/td[3]"));
			     	String p19= peilv19.getText() ;//ȡ��19������
			     	////System.out.println(p19);
			     	float i19 = Float.parseFloat(p19); //ת��������
			     	//System.out.println(i19);
			     	//WebElement textbox19 = driver.findElement(By.xpath(".//*[@id='txt19']"));
			     	if(i19<22.44)
			     	{
			     		WebElement checkbox19 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[10]/td[4]/input"));
			     		checkbox19.click();
			     	}//�ж�19�����ʲ���ע
			     	
			     	WebElement peilv18 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[11]/td[3]"));
			     	String p18= peilv18.getText() ;//ȡ��18������
			     	////System.out.println(p18);
			     	float i18 = Float.parseFloat(p18); //ת��������
			     	//System.out.println(i18);
			     	//WebElement textbox18 = driver.findElement(By.xpath(".//*[@id='txt18']"));
			     	if(i18<18.36)
			     	{
			     		WebElement checkbox18 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[11]/td[4]/input"));
			     		checkbox18.click();
			     	}//�ж�18�����ʲ���ע
			     	
			     	WebElement peilv17 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[12]/td[3]"));
			     	String p17= peilv17.getText() ;//ȡ��17������
			     	////System.out.println(p17);
			     	float i17 = Float.parseFloat(p17); //ת��������
			     	//System.out.println(i17);
			     	//WebElement textbox17 = driver.findElement(By.xpath(".//*[@id='txt17']"));
			     	if(i17<16.03)
			     	{
			     		WebElement checkbox17 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[12]/td[4]/input"));
			     		checkbox17.click();
			     	}//�ж�17�����ʲ���ע
			     	WebElement peilv16 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[13]/td[3]"));
			     	String p16= peilv16.getText() ;//ȡ��16������
			     	////System.out.println(p16);
			     	float i16 = Float.parseFloat(p16); //ת��������
			     	//System.out.println(i16);
			     	//WebElement textbox16 = driver.findElement(By.xpath(".//*[@id='txt16']"));
			     	if(i16<14.64)
			     	{
			     		WebElement checkbox16 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[13]/td[4]/input"));
			     		checkbox16.click();
			     	}//�ж�16�����ʲ���ע
			     	WebElement peilv15 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[14]/td[3]"));
			     	String p15= peilv15.getText() ;//ȡ��15������
			     	////System.out.println(p15);
			     	float i15 = Float.parseFloat(p15); //ת��������
			     	//System.out.println(i15);
			     	//WebElement textbox15 = driver.findElement(By.xpath(".//*[@id='txt15']"));
			     	if(i15<13.83)
			     	{
			     		WebElement checkbox15 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[14]/td[4]/input"));
			     		checkbox15.click();
			     	}//�ж�15�����ʲ���ע
			   
			 	
			     	/*WebElement peilv14 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[15]/td[3]"));
			     	String p14= peilv14.getText() ;//ȡ��14������
			     	////System.out.println(p14);
			     	float i14 = Float.parseFloat(p14); //ת��������
			     	//System.out.println(i14);
			     	//WebElement textbox14 = driver.findElement(By.xpath(".//*[@id='txt14']"));
			     	if(i14<13.46)
			     	{
			     		WebElement checkbox14 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[15]/td[4]/input"));
			     		checkbox14.click();
			     	}//�ж�14���ʲ���ע*/ 
			     	
				
				}
					//n = 3;
					break;
				case 4:
				{
					WebElement moshi1 = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[8]/div[2]/div[4]/div[2]/div/div[2]/a[5]"));
			 		moshi1.click();//���Ͷעģʽ
			 		
			 		shuaxin = driver.findElement(By.xpath(".//*[@id='form1']/div[8]/div[2]/div[4]/div[4]/div[3]/div[1]"));
			 		shuaxin.click();//���ˢ��
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
			     	String p0= peilv0.getText() ;//ȡ��0������
			     	////System.out.println(p0);
			     	float i0 = Float.parseFloat(p0); //ת��������
			     	//System.out.println(i0);
			     	
			     	if(i0<1010)
			     	{
			     		WebElement checkbox0 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[2]/td[4]/input"));
			     		checkbox0.click();
			     		
			     	}//�ж�0�����ʲ���ע*/
			     
			     	WebElement peilv1 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[3]/td[3]"));
			     	String p1= peilv1.getText() ;//ȡ��1������
			     	////System.out.println(p1);
			     	float i1 = Float.parseFloat(p1); //ת��������
			     	////System.out.println(i1);
			     	
			     	if(i1<336.66)
			     	{
			     		
			     		WebElement checkbox1 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[3]/td[4]/input"));
			     		checkbox1.click();
			     	}//�ж�1�����ʲ���ע

			     	WebElement peilv2 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[4]/td[3]"));
			     	String p2= peilv2.getText() ;//ȡ��2������
			     	////System.out.println(p2);
			     	float i2 = Float.parseFloat(p2); //ת��������
			     	////System.out.println(i2);
			     	//WebElement textbox2 = driver.findElement(By.xpath(".//*[@id='txt2']"));
			     	if(i2<168.33)
			     	{
			     		
			     		WebElement checkbox2 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[4]/td[4]/input"));
			     		checkbox2.click();
			         }
			     	//�ж�2�����ʲ���ע
			     	WebElement peilv3 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[5]/td[3]"));
			     	String p3= peilv3.getText() ;//ȡ��13������
			     	////System.out.println(p3);
			     	float i3 = Float.parseFloat(p3); //ת��������
			     	////System.out.println(i3);
			     	//WebElement textbox3 = driver.findElement(By.xpath(".//*[@id='txt3']"));
			     	if(i3<101)
			     	{
			     		WebElement checkbox3 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[5]/td[4]/input"));
			     		checkbox3.click();
			     	}//�ж�0�����ʲ���ע
			     	WebElement peilv4 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[6]/td[3]"));
			     	String p4= peilv4.getText() ;//ȡ��13������
			     	////System.out.println(p4);
			     	float i4 = Float.parseFloat(p4); //ת��������
			     	////System.out.println(i4);
			     	//WebElement textbox4 = driver.findElement(By.xpath(".//*[@id='txt4']"));
			     	if(i4<67.33)
			     	{
			     		WebElement checkbox4 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[6]/td[4]/input"));
			     		checkbox4.click();
			     	}//�ж�4�����ʲ���ע
			     	WebElement peilv5 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[7]/td[3]"));
			     	String p5= peilv5.getText() ;//ȡ��13������
			     	//System.out.println(p5);
			     	float i5 = Float.parseFloat(p5); //ת��������
			     	////System.out.println(i5);
			     	//WebElement textbox5 = driver.findElement(By.xpath(".//*[@id='txt5']"));
			     	
			     	if(i5<48.1)
			     	{
			     		WebElement checkbox5 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[7]/td[4]/input"));
			     		checkbox5.click();
			     	}//�ж�5�����ʲ���ע
			     	WebElement peilv6 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[8]/td[3]"));
			     	String p6= peilv6.getText() ;//ȡ��13������
			     	//System.out.println(p6);
			     	float i6 = Float.parseFloat(p6); //ת��������
			     	//System.out.println(i6);
			     	//WebElement textbox6 = driver.findElement(By.xpath(".//*[@id='txt6']"));
			     	if(i6<36.07)
			     	{
			     		WebElement checkbox6 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[8]/td[4]/input"));
			     		checkbox6.click();
			     	}//�ж�6�����ʲ���ע

			     	WebElement peilv7 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[9]/td[3]"));
			     	String p7= peilv7.getText() ;//ȡ��13������
			     	//System.out.println(p7);
			     	float i7 = Float.parseFloat(p7); //ת��������
			     	//System.out.println(i7);
			     	//WebElement textbox7 = driver.findElement(By.xpath(".//*[@id='txt7']"));
			     	if(i7<28.05)
			     	{
			     		WebElement checkbox7 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[9]/td[4]/input"));
			     		checkbox7.click();
			     	}//�ж�7�����ʲ���ע
			     	shuaxin.click();//���ˢ��

			     	
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
			     	String p8= peilv8.getText() ;//ȡ��13������
			     	//System.out.println(p8);
			     	float i8 = Float.parseFloat(p8); //ת��������
			     	//System.out.println(i8);
			     	//WebElement textbox8 = driver.findElement(By.xpath(".//*[@id='txt8']"));
			     	if(i8<22.44)
			     	{
			     		WebElement checkbox8 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[10]/td[4]/input"));
			     		checkbox8.click();
			     	}//�ж�8�����ʲ���ע
			     	
			     	WebElement peilv9 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[11]/td[3]"));
			     	String p9= peilv9.getText() ;//ȡ��13������
			     	//System.out.println(p9);
			     	float i9 = Float.parseFloat(p9); //ת��������
			     	//System.out.println(i9);
			     	//WebElement textbox9 = driver.findElement(By.xpath(".//*[@id='txt9']"));
			     	if(i9<18.36)
			     	{
			     		WebElement checkbox9 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[11]/td[4]/input"));
			     		checkbox9.click();
			     	}//�ж�9�����ʲ���ע
			     	
			     	WebElement peilv10 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[12]/td[3]"));
			     	String p10= peilv10.getText() ;//ȡ��13������
			     	//System.out.println(p10);
			     	float i10 = Float.parseFloat(p10); //ת��������
			     	//System.out.println(i10);
			     	//WebElement textbox10 = driver.findElement(By.xpath(".//*[@id='txt10']"));
			     	if(i10<16.03)
			     	{
			     		WebElement checkbox10 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[12]/td[4]/input"));
			     		checkbox10.click();
			     	}//�ж�10�����ʲ���ע
			     	WebElement peilv11 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[13]/td[3]"));
			     	String p11= peilv11.getText() ;//ȡ��13������
			     	//System.out.println(p11);
			     	float i11 = Float.parseFloat(p11); //ת��������
			     	//System.out.println(i11);
			     	//WebElement textbox11 = driver.findElement(By.xpath(".//*[@id='txt11']"));
			     	if(i11<14.63)
			     	{
			     		WebElement checkbox11 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[13]/td[4]/input"));
			     		checkbox11.click();
			     	}//�ж�11�����ʲ���ע
			     	WebElement peilv12 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[14]/td[3]"));
			     	String p12= peilv12.getText() ;//ȡ��13������
			     	//System.out.println(p12);
			     	float i12 = Float.parseFloat(p12); //ת��������
			     	//System.out.println(i12);
			     	//WebElement textbox12 = driver.findElement(By.xpath(".//*[@id='txt12']"));
			     	if(i12<13.83)
			     	{
			     		WebElement checkbox12 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[14]/td[4]/input"));
			     		checkbox12.click();
			     	}//�ж�12�����ʲ���ע
			   
			 	
			     	/*WebElement peilv13 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[15]/td[3]"));
			     	String p13= peilv13.getText() ;//ȡ��13������
			     	//System.out.println(p13);
			     	float i13 = Float.parseFloat(p13); //ת��������
			     	//System.out.println(i13);
			     	//WebElement textbox13 = driver.findElement(By.xpath(".//*[@id='txt13']"));
			     	if(i13<13.46)
			     	{
			     		WebElement checkbox13 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[15]/td[4]/input"));
			     		checkbox13.click();
			     	}//�ж�13���ʲ���ע */
			     	
			     	shuaxin.click();//���ˢ��
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
			     	String p27= peilv27.getText() ;//ȡ��27������
			     	//System.out.println(p27);
			     	float i27 = Float.parseFloat(p27); //ת��������
			     	//System.out.println(i27);
			     	//WebElement textbox27 = driver.findElement(By.xpath(".//*[@id='txt27']"));
			     	if(i27<1010)
			     	{
			     		WebElement checkbox27 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[2]/td[4]/input"));
			     		checkbox27.click();
			     	}//�ж�0�����ʲ���ע*/
			     	WebElement peilv26 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[3]/td[3]"));
			     	String p26= peilv26.getText() ;//ȡ��26������
			     	//System.out.println(p26);
			     	float i26 = Float.parseFloat(p26); //ת��������
			     	//System.out.println(i26);
			     	//WebElement textbox26 = driver.findElement(By.xpath(".//*[@id='txt26']"));
			     	if(i26<336.66)
			     	{
			     		WebElement checkbox26 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[3]/td[4]/input"));
			     		checkbox26.click();
			     	}//�ж�1�����ʲ���ע

			     	WebElement peilv25 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[4]/td[3]"));
			     	String p25= peilv25.getText() ;//ȡ��25������
			     	//System.out.println(p25);
			     	float i25 = Float.parseFloat(p25); //ת��������
			     	//System.out.println(i25);
			     	//WebElement textbox25 = driver.findElement(By.xpath(".//*[@id='txt25']"));
			     	if(i25<168.33)
			     	{
			     		WebElement checkbox25 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[4]/td[4]/input"));
			     		checkbox25.click();
			     	}//�ж�2�����ʲ���ע
			     	WebElement peilv24 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[5]/td[3]"));
			     	String p24= peilv24.getText() ;//ȡ��24������
			     	//System.out.println(p24);
			     	float i24 = Float.parseFloat(p24); //ת��������
			     	//System.out.println(i24);
			     	//WebElement textbox24 = driver.findElement(By.xpath(".//*[@id='txt24']"));
			     	if(i24<101)
			     	{
			     		WebElement checkbox24 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[5]/td[4]/input"));
			     		checkbox24.click();
			     	}//�ж�0�����ʲ���ע
			     	WebElement peilv23 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[6]/td[3]"));
			     	String p23= peilv23.getText() ;//ȡ��23������
			     	//System.out.println(p23);
			     	float i23 = Float.parseFloat(p23); //ת��������
			     	//System.out.println(i23);
			     	//WebElement textbox23 = driver.findElement(By.xpath(".//*[@id='txt23']"));
			     	if(i23<67.33)
			     	{
			     		WebElement checkbox23 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[6]/td[4]/input"));
			     		checkbox23.click();
			     	}//�ж�23�����ʲ���ע
			     	WebElement peilv22 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[7]/td[3]"));
			     	String p22= peilv22.getText() ;//ȡ��22������
			     	//System.out.println(p22);
			     	float i22 = Float.parseFloat(p22); //ת��������
			     	//System.out.println(i22);
			     	//WebElement textbox22 = driver.findElement(By.xpath(".//*[@id='txt22']"));
			     	if(i22<48.09)
			     	{
			     		WebElement checkbox22 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[7]/td[4]/input"));
			     		checkbox22.click();
			     	}//�ж�22�����ʲ���ע
			     	WebElement peilv21 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[8]/td[3]"));
			     	String p21= peilv21.getText() ;//ȡ��21������
			     	//System.out.println(p21);
			     	float i21 = Float.parseFloat(p21); //ת��������
			     	//System.out.println(i21);
			     	//WebElement textbox21 = driver.findElement(By.xpath(".//*[@id='txt21']"));
			     	if(i21<36.07)
			     	{
			     		WebElement checkbox21 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[8]/td[4]/input"));
			     		checkbox21.click();
			     	}//�ж�21�����ʲ���ע

			     	WebElement peilv20 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[9]/td[3]"));
			     	String p20= peilv20.getText() ;//ȡ��20������
			     	////System.out.println(p20);
			     	float i20 = Float.parseFloat(p20); //ת��������
			     	//System.out.println(i20);
			     	//WebElement textbox20 = driver.findElement(By.xpath(".//*[@id='txt20']"));
			     	shuaxin.click();//���ˢ��
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
			     	}//�ж�20�����ʲ���ע
			     	WebElement peilv19 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[10]/td[3]"));
			     	String p19= peilv19.getText() ;//ȡ��19������
			     	////System.out.println(p19);
			     	float i19 = Float.parseFloat(p19); //ת��������
			     	//System.out.println(i19);
			     	//WebElement textbox19 = driver.findElement(By.xpath(".//*[@id='txt19']"));
			     	if(i19<22.44)
			     	{
			     		WebElement checkbox19 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[10]/td[4]/input"));
			     		checkbox19.click();
			     	}//�ж�19�����ʲ���ע
			     	
			     	WebElement peilv18 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[11]/td[3]"));
			     	String p18= peilv18.getText() ;//ȡ��18������
			     	////System.out.println(p18);
			     	float i18 = Float.parseFloat(p18); //ת��������
			     	//System.out.println(i18);
			     	//WebElement textbox18 = driver.findElement(By.xpath(".//*[@id='txt18']"));
			     	if(i18<18.36)
			     	{
			     		WebElement checkbox18 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[11]/td[4]/input"));
			     		checkbox18.click();
			     	}//�ж�18�����ʲ���ע
			     	
			     	WebElement peilv17 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[12]/td[3]"));
			     	String p17= peilv17.getText() ;//ȡ��17������
			     	////System.out.println(p17);
			     	float i17 = Float.parseFloat(p17); //ת��������
			     	//System.out.println(i17);
			     	//WebElement textbox17 = driver.findElement(By.xpath(".//*[@id='txt17']"));
			     	if(i17<16.03)
			     	{
			     		WebElement checkbox17 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[12]/td[4]/input"));
			     		checkbox17.click();
			     	}//�ж�17�����ʲ���ע
			     	WebElement peilv16 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[13]/td[3]"));
			     	String p16= peilv16.getText() ;//ȡ��16������
			     	////System.out.println(p16);
			     	float i16 = Float.parseFloat(p16); //ת��������
			     	//System.out.println(i16);
			     	//WebElement textbox16 = driver.findElement(By.xpath(".//*[@id='txt16']"));
			     	if(i16<14.64)
			     	{
			     		WebElement checkbox16 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[13]/td[4]/input"));
			     		checkbox16.click();
			     	}//�ж�16�����ʲ���ע
			     	WebElement peilv15 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[14]/td[3]"));
			     	String p15= peilv15.getText() ;//ȡ��15������
			     	////System.out.println(p15);
			     	float i15 = Float.parseFloat(p15); //ת��������
			     	//System.out.println(i15);
			     	//WebElement textbox15 = driver.findElement(By.xpath(".//*[@id='txt15']"));
			     	if(i15<13.83)
			     	{
			     		WebElement checkbox15 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[14]/td[4]/input"));
			     		checkbox15.click();
			     	}//�ж�15�����ʲ���ע
			   
			 	
			     	/*WebElement peilv14 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[15]/td[3]"));
			     	String p14= peilv14.getText() ;//ȡ��14������
			     	////System.out.println(p14);
			     	float i14 = Float.parseFloat(p14); //ת��������
			     	//System.out.println(i14);
			     	//WebElement textbox14 = driver.findElement(By.xpath(".//*[@id='txt14']"));
			     	if(i14<13.46)
			     	{
			     		WebElement checkbox14 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[15]/td[4]/input"));
			     		checkbox14.click();
			     	}//�ж�14���ʲ���ע*/ 
			     	
				
				}
					//n = 5;
					break;
				case 5:
				{
					WebElement moshi1 = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[8]/div[2]/div[4]/div[2]/div/div[2]/a[5]"));
			 		moshi1.click();//���Ͷעģʽ
			 		
			 		shuaxin = driver.findElement(By.xpath(".//*[@id='form1']/div[8]/div[2]/div[4]/div[4]/div[3]/div[1]"));
			 		shuaxin.click();//���ˢ��
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
			     	String p0= peilv0.getText() ;//ȡ��0������
			     	////System.out.println(p0);
			     	float i0 = Float.parseFloat(p0); //ת��������
			     	//System.out.println(i0);
			     	
			     	if(i0<1010)
			     	{
			     		WebElement checkbox0 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[2]/td[4]/input"));
			     		checkbox0.click();
			     		
			     	}//�ж�0�����ʲ���ע*/
			     
			     	WebElement peilv1 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[3]/td[3]"));
			     	String p1= peilv1.getText() ;//ȡ��1������
			     	////System.out.println(p1);
			     	float i1 = Float.parseFloat(p1); //ת��������
			     	////System.out.println(i1);
			     	
			     	if(i1<336.66)
			     	{
			     		
			     		WebElement checkbox1 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[3]/td[4]/input"));
			     		checkbox1.click();
			     	}//�ж�1�����ʲ���ע

			     	WebElement peilv2 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[4]/td[3]"));
			     	String p2= peilv2.getText() ;//ȡ��2������
			     	////System.out.println(p2);
			     	float i2 = Float.parseFloat(p2); //ת��������
			     	////System.out.println(i2);
			     	//WebElement textbox2 = driver.findElement(By.xpath(".//*[@id='txt2']"));
			     	if(i2<168.33)
			     	{
			     		
			     		WebElement checkbox2 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[4]/td[4]/input"));
			     		checkbox2.click();
			         }
			     	//�ж�2�����ʲ���ע
			     	WebElement peilv3 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[5]/td[3]"));
			     	String p3= peilv3.getText() ;//ȡ��13������
			     	////System.out.println(p3);
			     	float i3 = Float.parseFloat(p3); //ת��������
			     	////System.out.println(i3);
			     	//WebElement textbox3 = driver.findElement(By.xpath(".//*[@id='txt3']"));
			     	if(i3<101)
			     	{
			     		WebElement checkbox3 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[5]/td[4]/input"));
			     		checkbox3.click();
			     	}//�ж�0�����ʲ���ע
			     	WebElement peilv4 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[6]/td[3]"));
			     	String p4= peilv4.getText() ;//ȡ��13������
			     	////System.out.println(p4);
			     	float i4 = Float.parseFloat(p4); //ת��������
			     	////System.out.println(i4);
			     	//WebElement textbox4 = driver.findElement(By.xpath(".//*[@id='txt4']"));
			     	if(i4<67.33)
			     	{
			     		WebElement checkbox4 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[6]/td[4]/input"));
			     		checkbox4.click();
			     	}//�ж�4�����ʲ���ע
			     	WebElement peilv5 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[7]/td[3]"));
			     	String p5= peilv5.getText() ;//ȡ��13������
			     	//System.out.println(p5);
			     	float i5 = Float.parseFloat(p5); //ת��������
			     	////System.out.println(i5);
			     	//WebElement textbox5 = driver.findElement(By.xpath(".//*[@id='txt5']"));
			     	
			     	if(i5<48.1)
			     	{
			     		WebElement checkbox5 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[7]/td[4]/input"));
			     		checkbox5.click();
			     	}//�ж�5�����ʲ���ע
			     	WebElement peilv6 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[8]/td[3]"));
			     	String p6= peilv6.getText() ;//ȡ��13������
			     	//System.out.println(p6);
			     	float i6 = Float.parseFloat(p6); //ת��������
			     	//System.out.println(i6);
			     	//WebElement textbox6 = driver.findElement(By.xpath(".//*[@id='txt6']"));
			     	if(i6<36.07)
			     	{
			     		WebElement checkbox6 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[8]/td[4]/input"));
			     		checkbox6.click();
			     	}//�ж�6�����ʲ���ע

			     	WebElement peilv7 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[9]/td[3]"));
			     	String p7= peilv7.getText() ;//ȡ��13������
			     	//System.out.println(p7);
			     	float i7 = Float.parseFloat(p7); //ת��������
			     	//System.out.println(i7);
			     	//WebElement textbox7 = driver.findElement(By.xpath(".//*[@id='txt7']"));
			     	if(i7<28.05)
			     	{
			     		WebElement checkbox7 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[9]/td[4]/input"));
			     		checkbox7.click();
			     	}//�ж�7�����ʲ���ע
			     	shuaxin.click();//���ˢ��

			     	
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
			     	String p8= peilv8.getText() ;//ȡ��13������
			     	//System.out.println(p8);
			     	float i8 = Float.parseFloat(p8); //ת��������
			     	//System.out.println(i8);
			     	//WebElement textbox8 = driver.findElement(By.xpath(".//*[@id='txt8']"));
			     	if(i8<22.44)
			     	{
			     		WebElement checkbox8 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[10]/td[4]/input"));
			     		checkbox8.click();
			     	}//�ж�8�����ʲ���ע
			     	
			     	WebElement peilv9 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[11]/td[3]"));
			     	String p9= peilv9.getText() ;//ȡ��13������
			     	//System.out.println(p9);
			     	float i9 = Float.parseFloat(p9); //ת��������
			     	//System.out.println(i9);
			     	//WebElement textbox9 = driver.findElement(By.xpath(".//*[@id='txt9']"));
			     	if(i9<18.36)
			     	{
			     		WebElement checkbox9 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[11]/td[4]/input"));
			     		checkbox9.click();
			     	}//�ж�9�����ʲ���ע
			     	
			     	WebElement peilv10 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[12]/td[3]"));
			     	String p10= peilv10.getText() ;//ȡ��13������
			     	//System.out.println(p10);
			     	float i10 = Float.parseFloat(p10); //ת��������
			     	//System.out.println(i10);
			     	//WebElement textbox10 = driver.findElement(By.xpath(".//*[@id='txt10']"));
			     	if(i10<16.03)
			     	{
			     		WebElement checkbox10 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[12]/td[4]/input"));
			     		checkbox10.click();
			     	}//�ж�10�����ʲ���ע
			     	WebElement peilv11 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[13]/td[3]"));
			     	String p11= peilv11.getText() ;//ȡ��13������
			     	//System.out.println(p11);
			     	float i11 = Float.parseFloat(p11); //ת��������
			     	//System.out.println(i11);
			     	//WebElement textbox11 = driver.findElement(By.xpath(".//*[@id='txt11']"));
			     	if(i11<14.63)
			     	{
			     		WebElement checkbox11 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[13]/td[4]/input"));
			     		checkbox11.click();
			     	}//�ж�11�����ʲ���ע
			     	WebElement peilv12 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[14]/td[3]"));
			     	String p12= peilv12.getText() ;//ȡ��13������
			     	//System.out.println(p12);
			     	float i12 = Float.parseFloat(p12); //ת��������
			     	//System.out.println(i12);
			     	//WebElement textbox12 = driver.findElement(By.xpath(".//*[@id='txt12']"));
			     	if(i12<13.83)
			     	{
			     		WebElement checkbox12 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[14]/td[4]/input"));
			     		checkbox12.click();
			     	}//�ж�12�����ʲ���ע
			   
			 	
			     	/*WebElement peilv13 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[15]/td[3]"));
			     	String p13= peilv13.getText() ;//ȡ��13������
			     	//System.out.println(p13);
			     	float i13 = Float.parseFloat(p13); //ת��������
			     	//System.out.println(i13);
			     	//WebElement textbox13 = driver.findElement(By.xpath(".//*[@id='txt13']"));
			     	if(i13<13.46)
			     	{
			     		WebElement checkbox13 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[15]/td[4]/input"));
			     		checkbox13.click();
			     	}//�ж�13���ʲ���ע */
			     	
			     	shuaxin.click();//���ˢ��
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
			     	String p27= peilv27.getText() ;//ȡ��27������
			     	//System.out.println(p27);
			     	float i27 = Float.parseFloat(p27); //ת��������
			     	//System.out.println(i27);
			     	//WebElement textbox27 = driver.findElement(By.xpath(".//*[@id='txt27']"));
			     	if(i27<1010)
			     	{
			     		WebElement checkbox27 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[2]/td[4]/input"));
			     		checkbox27.click();
			     	}//�ж�0�����ʲ���ע*/
			     	WebElement peilv26 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[3]/td[3]"));
			     	String p26= peilv26.getText() ;//ȡ��26������
			     	//System.out.println(p26);
			     	float i26 = Float.parseFloat(p26); //ת��������
			     	//System.out.println(i26);
			     	//WebElement textbox26 = driver.findElement(By.xpath(".//*[@id='txt26']"));
			     	if(i26<336.66)
			     	{
			     		WebElement checkbox26 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[3]/td[4]/input"));
			     		checkbox26.click();
			     	}//�ж�1�����ʲ���ע

			     	WebElement peilv25 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[4]/td[3]"));
			     	String p25= peilv25.getText() ;//ȡ��25������
			     	//System.out.println(p25);
			     	float i25 = Float.parseFloat(p25); //ת��������
			     	//System.out.println(i25);
			     	//WebElement textbox25 = driver.findElement(By.xpath(".//*[@id='txt25']"));
			     	if(i25<168.33)
			     	{
			     		WebElement checkbox25 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[4]/td[4]/input"));
			     		checkbox25.click();
			     	}//�ж�2�����ʲ���ע
			     	WebElement peilv24 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[5]/td[3]"));
			     	String p24= peilv24.getText() ;//ȡ��24������
			     	//System.out.println(p24);
			     	float i24 = Float.parseFloat(p24); //ת��������
			     	//System.out.println(i24);
			     	//WebElement textbox24 = driver.findElement(By.xpath(".//*[@id='txt24']"));
			     	if(i24<101)
			     	{
			     		WebElement checkbox24 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[5]/td[4]/input"));
			     		checkbox24.click();
			     	}//�ж�0�����ʲ���ע
			     	WebElement peilv23 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[6]/td[3]"));
			     	String p23= peilv23.getText() ;//ȡ��23������
			     	//System.out.println(p23);
			     	float i23 = Float.parseFloat(p23); //ת��������
			     	//System.out.println(i23);
			     	//WebElement textbox23 = driver.findElement(By.xpath(".//*[@id='txt23']"));
			     	if(i23<67.33)
			     	{
			     		WebElement checkbox23 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[6]/td[4]/input"));
			     		checkbox23.click();
			     	}//�ж�23�����ʲ���ע
			     	WebElement peilv22 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[7]/td[3]"));
			     	String p22= peilv22.getText() ;//ȡ��22������
			     	//System.out.println(p22);
			     	float i22 = Float.parseFloat(p22); //ת��������
			     	//System.out.println(i22);
			     	//WebElement textbox22 = driver.findElement(By.xpath(".//*[@id='txt22']"));
			     	if(i22<48.09)
			     	{
			     		WebElement checkbox22 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[7]/td[4]/input"));
			     		checkbox22.click();
			     	}//�ж�22�����ʲ���ע
			     	WebElement peilv21 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[8]/td[3]"));
			     	String p21= peilv21.getText() ;//ȡ��21������
			     	//System.out.println(p21);
			     	float i21 = Float.parseFloat(p21); //ת��������
			     	//System.out.println(i21);
			     	//WebElement textbox21 = driver.findElement(By.xpath(".//*[@id='txt21']"));
			     	if(i21<36.07)
			     	{
			     		WebElement checkbox21 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[8]/td[4]/input"));
			     		checkbox21.click();
			     	}//�ж�21�����ʲ���ע

			     	WebElement peilv20 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[9]/td[3]"));
			     	String p20= peilv20.getText() ;//ȡ��20������
			     	////System.out.println(p20);
			     	float i20 = Float.parseFloat(p20); //ת��������
			     	//System.out.println(i20);
			     	//WebElement textbox20 = driver.findElement(By.xpath(".//*[@id='txt20']"));
			     	shuaxin.click();//���ˢ��
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
			     	}//�ж�20�����ʲ���ע
			     	WebElement peilv19 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[10]/td[3]"));
			     	String p19= peilv19.getText() ;//ȡ��19������
			     	////System.out.println(p19);
			     	float i19 = Float.parseFloat(p19); //ת��������
			     	//System.out.println(i19);
			     	//WebElement textbox19 = driver.findElement(By.xpath(".//*[@id='txt19']"));
			     	if(i19<22.44)
			     	{
			     		WebElement checkbox19 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[10]/td[4]/input"));
			     		checkbox19.click();
			     	}//�ж�19�����ʲ���ע
			     	
			     	WebElement peilv18 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[11]/td[3]"));
			     	String p18= peilv18.getText() ;//ȡ��18������
			     	////System.out.println(p18);
			     	float i18 = Float.parseFloat(p18); //ת��������
			     	//System.out.println(i18);
			     	//WebElement textbox18 = driver.findElement(By.xpath(".//*[@id='txt18']"));
			     	if(i18<18.36)
			     	{
			     		WebElement checkbox18 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[11]/td[4]/input"));
			     		checkbox18.click();
			     	}//�ж�18�����ʲ���ע
			     	
			     	WebElement peilv17 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[12]/td[3]"));
			     	String p17= peilv17.getText() ;//ȡ��17������
			     	////System.out.println(p17);
			     	float i17 = Float.parseFloat(p17); //ת��������
			     	//System.out.println(i17);
			     	//WebElement textbox17 = driver.findElement(By.xpath(".//*[@id='txt17']"));
			     	if(i17<16.03)
			     	{
			     		WebElement checkbox17 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[12]/td[4]/input"));
			     		checkbox17.click();
			     	}//�ж�17�����ʲ���ע
			     	WebElement peilv16 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[13]/td[3]"));
			     	String p16= peilv16.getText() ;//ȡ��16������
			     	////System.out.println(p16);
			     	float i16 = Float.parseFloat(p16); //ת��������
			     	//System.out.println(i16);
			     	//WebElement textbox16 = driver.findElement(By.xpath(".//*[@id='txt16']"));
			     	if(i16<14.64)
			     	{
			     		WebElement checkbox16 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[13]/td[4]/input"));
			     		checkbox16.click();
			     	}//�ж�16�����ʲ���ע
			     	WebElement peilv15 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[14]/td[3]"));
			     	String p15= peilv15.getText() ;//ȡ��15������
			     	////System.out.println(p15);
			     	float i15 = Float.parseFloat(p15); //ת��������
			     	//System.out.println(i15);
			     	//WebElement textbox15 = driver.findElement(By.xpath(".//*[@id='txt15']"));
			     	if(i15<13.83)
			     	{
			     		WebElement checkbox15 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[14]/td[4]/input"));
			     		checkbox15.click();
			     	}//�ж�15�����ʲ���ע
			   
			 	
			     	/*WebElement peilv14 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[15]/td[3]"));
			     	String p14= peilv14.getText() ;//ȡ��14������
			     	////System.out.println(p14);
			     	float i14 = Float.parseFloat(p14); //ת��������
			     	//System.out.println(i14);
			     	//WebElement textbox14 = driver.findElement(By.xpath(".//*[@id='txt14']"));
			     	if(i14<13.46)
			     	{
			     		WebElement checkbox14 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[15]/td[4]/input"));
			     		checkbox14.click();
			     	}//�ж�14���ʲ���ע*/ 
			     	
				
				}
					//n = 5;
					break;
				case 6:
				{
					WebElement moshi1 = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[8]/div[2]/div[4]/div[2]/div/div[2]/a[5]"));
			 		moshi1.click();//���Ͷעģʽ
			 		
			 		shuaxin = driver.findElement(By.xpath(".//*[@id='form1']/div[8]/div[2]/div[4]/div[4]/div[3]/div[1]"));
			 		shuaxin.click();//���ˢ��
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
			     	String p0= peilv0.getText() ;//ȡ��0������
			     	////System.out.println(p0);
			     	float i0 = Float.parseFloat(p0); //ת��������
			     	//System.out.println(i0);
			     	
			     	if(i0<1010)
			     	{
			     		WebElement checkbox0 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[2]/td[4]/input"));
			     		checkbox0.click();
			     		
			     	}//�ж�0�����ʲ���ע*/
			     
			     	WebElement peilv1 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[3]/td[3]"));
			     	String p1= peilv1.getText() ;//ȡ��1������
			     	////System.out.println(p1);
			     	float i1 = Float.parseFloat(p1); //ת��������
			     	////System.out.println(i1);
			     	
			     	if(i1<336.66)
			     	{
			     		
			     		WebElement checkbox1 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[3]/td[4]/input"));
			     		checkbox1.click();
			     	}//�ж�1�����ʲ���ע

			     	WebElement peilv2 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[4]/td[3]"));
			     	String p2= peilv2.getText() ;//ȡ��2������
			     	////System.out.println(p2);
			     	float i2 = Float.parseFloat(p2); //ת��������
			     	////System.out.println(i2);
			     	//WebElement textbox2 = driver.findElement(By.xpath(".//*[@id='txt2']"));
			     	if(i2<168.33)
			     	{
			     		
			     		WebElement checkbox2 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[4]/td[4]/input"));
			     		checkbox2.click();
			         }
			     	//�ж�2�����ʲ���ע
			     	WebElement peilv3 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[5]/td[3]"));
			     	String p3= peilv3.getText() ;//ȡ��13������
			     	////System.out.println(p3);
			     	float i3 = Float.parseFloat(p3); //ת��������
			     	////System.out.println(i3);
			     	//WebElement textbox3 = driver.findElement(By.xpath(".//*[@id='txt3']"));
			     	if(i3<101)
			     	{
			     		WebElement checkbox3 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[5]/td[4]/input"));
			     		checkbox3.click();
			     	}//�ж�0�����ʲ���ע
			     	WebElement peilv4 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[6]/td[3]"));
			     	String p4= peilv4.getText() ;//ȡ��13������
			     	////System.out.println(p4);
			     	float i4 = Float.parseFloat(p4); //ת��������
			     	////System.out.println(i4);
			     	//WebElement textbox4 = driver.findElement(By.xpath(".//*[@id='txt4']"));
			     	if(i4<67.33)
			     	{
			     		WebElement checkbox4 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[6]/td[4]/input"));
			     		checkbox4.click();
			     	}//�ж�4�����ʲ���ע
			     	WebElement peilv5 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[7]/td[3]"));
			     	String p5= peilv5.getText() ;//ȡ��13������
			     	//System.out.println(p5);
			     	float i5 = Float.parseFloat(p5); //ת��������
			     	////System.out.println(i5);
			     	//WebElement textbox5 = driver.findElement(By.xpath(".//*[@id='txt5']"));
			     	
			     	if(i5<48.1)
			     	{
			     		WebElement checkbox5 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[7]/td[4]/input"));
			     		checkbox5.click();
			     	}//�ж�5�����ʲ���ע
			     	WebElement peilv6 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[8]/td[3]"));
			     	String p6= peilv6.getText() ;//ȡ��13������
			     	//System.out.println(p6);
			     	float i6 = Float.parseFloat(p6); //ת��������
			     	//System.out.println(i6);
			     	//WebElement textbox6 = driver.findElement(By.xpath(".//*[@id='txt6']"));
			     	if(i6<36.07)
			     	{
			     		WebElement checkbox6 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[8]/td[4]/input"));
			     		checkbox6.click();
			     	}//�ж�6�����ʲ���ע

			     	WebElement peilv7 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[9]/td[3]"));
			     	String p7= peilv7.getText() ;//ȡ��13������
			     	//System.out.println(p7);
			     	float i7 = Float.parseFloat(p7); //ת��������
			     	//System.out.println(i7);
			     	//WebElement textbox7 = driver.findElement(By.xpath(".//*[@id='txt7']"));
			     	if(i7<28.05)
			     	{
			     		WebElement checkbox7 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[9]/td[4]/input"));
			     		checkbox7.click();
			     	}//�ж�7�����ʲ���ע
			     	shuaxin.click();//���ˢ��

			     	
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
			     	String p8= peilv8.getText() ;//ȡ��13������
			     	//System.out.println(p8);
			     	float i8 = Float.parseFloat(p8); //ת��������
			     	//System.out.println(i8);
			     	//WebElement textbox8 = driver.findElement(By.xpath(".//*[@id='txt8']"));
			     	if(i8<22.44)
			     	{
			     		WebElement checkbox8 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[10]/td[4]/input"));
			     		checkbox8.click();
			     	}//�ж�8�����ʲ���ע
			     	
			     	WebElement peilv9 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[11]/td[3]"));
			     	String p9= peilv9.getText() ;//ȡ��13������
			     	//System.out.println(p9);
			     	float i9 = Float.parseFloat(p9); //ת��������
			     	//System.out.println(i9);
			     	//WebElement textbox9 = driver.findElement(By.xpath(".//*[@id='txt9']"));
			     	if(i9<18.36)
			     	{
			     		WebElement checkbox9 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[11]/td[4]/input"));
			     		checkbox9.click();
			     	}//�ж�9�����ʲ���ע
			     	
			     	WebElement peilv10 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[12]/td[3]"));
			     	String p10= peilv10.getText() ;//ȡ��13������
			     	//System.out.println(p10);
			     	float i10 = Float.parseFloat(p10); //ת��������
			     	//System.out.println(i10);
			     	//WebElement textbox10 = driver.findElement(By.xpath(".//*[@id='txt10']"));
			     	if(i10<16.03)
			     	{
			     		WebElement checkbox10 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[12]/td[4]/input"));
			     		checkbox10.click();
			     	}//�ж�10�����ʲ���ע
			     	WebElement peilv11 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[13]/td[3]"));
			     	String p11= peilv11.getText() ;//ȡ��13������
			     	//System.out.println(p11);
			     	float i11 = Float.parseFloat(p11); //ת��������
			     	//System.out.println(i11);
			     	//WebElement textbox11 = driver.findElement(By.xpath(".//*[@id='txt11']"));
			     	if(i11<14.63)
			     	{
			     		WebElement checkbox11 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[13]/td[4]/input"));
			     		checkbox11.click();
			     	}//�ж�11�����ʲ���ע
			     	WebElement peilv12 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[14]/td[3]"));
			     	String p12= peilv12.getText() ;//ȡ��13������
			     	//System.out.println(p12);
			     	float i12 = Float.parseFloat(p12); //ת��������
			     	//System.out.println(i12);
			     	//WebElement textbox12 = driver.findElement(By.xpath(".//*[@id='txt12']"));
			     	if(i12<13.83)
			     	{
			     		WebElement checkbox12 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[14]/td[4]/input"));
			     		checkbox12.click();
			     	}//�ж�12�����ʲ���ע
			   
			 	
			     	/*WebElement peilv13 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[15]/td[3]"));
			     	String p13= peilv13.getText() ;//ȡ��13������
			     	//System.out.println(p13);
			     	float i13 = Float.parseFloat(p13); //ת��������
			     	//System.out.println(i13);
			     	//WebElement textbox13 = driver.findElement(By.xpath(".//*[@id='txt13']"));
			     	if(i13<13.46)
			     	{
			     		WebElement checkbox13 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[15]/td[4]/input"));
			     		checkbox13.click();
			     	}//�ж�13���ʲ���ע */
			     	
			     	shuaxin.click();//���ˢ��
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
			     	String p27= peilv27.getText() ;//ȡ��27������
			     	//System.out.println(p27);
			     	float i27 = Float.parseFloat(p27); //ת��������
			     	//System.out.println(i27);
			     	//WebElement textbox27 = driver.findElement(By.xpath(".//*[@id='txt27']"));
			     	if(i27<1010)
			     	{
			     		WebElement checkbox27 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[2]/td[4]/input"));
			     		checkbox27.click();
			     	}//�ж�0�����ʲ���ע*/
			     	WebElement peilv26 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[3]/td[3]"));
			     	String p26= peilv26.getText() ;//ȡ��26������
			     	//System.out.println(p26);
			     	float i26 = Float.parseFloat(p26); //ת��������
			     	//System.out.println(i26);
			     	//WebElement textbox26 = driver.findElement(By.xpath(".//*[@id='txt26']"));
			     	if(i26<336.66)
			     	{
			     		WebElement checkbox26 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[3]/td[4]/input"));
			     		checkbox26.click();
			     	}//�ж�1�����ʲ���ע

			     	WebElement peilv25 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[4]/td[3]"));
			     	String p25= peilv25.getText() ;//ȡ��25������
			     	//System.out.println(p25);
			     	float i25 = Float.parseFloat(p25); //ת��������
			     	//System.out.println(i25);
			     	//WebElement textbox25 = driver.findElement(By.xpath(".//*[@id='txt25']"));
			     	if(i25<168.33)
			     	{
			     		WebElement checkbox25 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[4]/td[4]/input"));
			     		checkbox25.click();
			     	}//�ж�2�����ʲ���ע
			     	WebElement peilv24 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[5]/td[3]"));
			     	String p24= peilv24.getText() ;//ȡ��24������
			     	//System.out.println(p24);
			     	float i24 = Float.parseFloat(p24); //ת��������
			     	//System.out.println(i24);
			     	//WebElement textbox24 = driver.findElement(By.xpath(".//*[@id='txt24']"));
			     	if(i24<101)
			     	{
			     		WebElement checkbox24 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[5]/td[4]/input"));
			     		checkbox24.click();
			     	}//�ж�0�����ʲ���ע
			     	WebElement peilv23 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[6]/td[3]"));
			     	String p23= peilv23.getText() ;//ȡ��23������
			     	//System.out.println(p23);
			     	float i23 = Float.parseFloat(p23); //ת��������
			     	//System.out.println(i23);
			     	//WebElement textbox23 = driver.findElement(By.xpath(".//*[@id='txt23']"));
			     	if(i23<67.33)
			     	{
			     		WebElement checkbox23 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[6]/td[4]/input"));
			     		checkbox23.click();
			     	}//�ж�23�����ʲ���ע
			     	WebElement peilv22 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[7]/td[3]"));
			     	String p22= peilv22.getText() ;//ȡ��22������
			     	//System.out.println(p22);
			     	float i22 = Float.parseFloat(p22); //ת��������
			     	//System.out.println(i22);
			     	//WebElement textbox22 = driver.findElement(By.xpath(".//*[@id='txt22']"));
			     	if(i22<48.09)
			     	{
			     		WebElement checkbox22 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[7]/td[4]/input"));
			     		checkbox22.click();
			     	}//�ж�22�����ʲ���ע
			     	WebElement peilv21 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[8]/td[3]"));
			     	String p21= peilv21.getText() ;//ȡ��21������
			     	//System.out.println(p21);
			     	float i21 = Float.parseFloat(p21); //ת��������
			     	//System.out.println(i21);
			     	//WebElement textbox21 = driver.findElement(By.xpath(".//*[@id='txt21']"));
			     	if(i21<36.07)
			     	{
			     		WebElement checkbox21 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[8]/td[4]/input"));
			     		checkbox21.click();
			     	}//�ж�21�����ʲ���ע

			     	WebElement peilv20 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[9]/td[3]"));
			     	String p20= peilv20.getText() ;//ȡ��20������
			     	////System.out.println(p20);
			     	float i20 = Float.parseFloat(p20); //ת��������
			     	//System.out.println(i20);
			     	//WebElement textbox20 = driver.findElement(By.xpath(".//*[@id='txt20']"));
			     	shuaxin.click();//���ˢ��
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
			     	}//�ж�20�����ʲ���ע
			     	WebElement peilv19 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[10]/td[3]"));
			     	String p19= peilv19.getText() ;//ȡ��19������
			     	////System.out.println(p19);
			     	float i19 = Float.parseFloat(p19); //ת��������
			     	//System.out.println(i19);
			     	//WebElement textbox19 = driver.findElement(By.xpath(".//*[@id='txt19']"));
			     	if(i19<22.44)
			     	{
			     		WebElement checkbox19 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[10]/td[4]/input"));
			     		checkbox19.click();
			     	}//�ж�19�����ʲ���ע
			     	
			     	WebElement peilv18 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[11]/td[3]"));
			     	String p18= peilv18.getText() ;//ȡ��18������
			     	////System.out.println(p18);
			     	float i18 = Float.parseFloat(p18); //ת��������
			     	//System.out.println(i18);
			     	//WebElement textbox18 = driver.findElement(By.xpath(".//*[@id='txt18']"));
			     	if(i18<18.36)
			     	{
			     		WebElement checkbox18 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[11]/td[4]/input"));
			     		checkbox18.click();
			     	}//�ж�18�����ʲ���ע
			     	
			     	WebElement peilv17 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[12]/td[3]"));
			     	String p17= peilv17.getText() ;//ȡ��17������
			     	////System.out.println(p17);
			     	float i17 = Float.parseFloat(p17); //ת��������
			     	//System.out.println(i17);
			     	//WebElement textbox17 = driver.findElement(By.xpath(".//*[@id='txt17']"));
			     	if(i17<16.03)
			     	{
			     		WebElement checkbox17 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[12]/td[4]/input"));
			     		checkbox17.click();
			     	}//�ж�17�����ʲ���ע
			     	WebElement peilv16 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[13]/td[3]"));
			     	String p16= peilv16.getText() ;//ȡ��16������
			     	////System.out.println(p16);
			     	float i16 = Float.parseFloat(p16); //ת��������
			     	//System.out.println(i16);
			     	//WebElement textbox16 = driver.findElement(By.xpath(".//*[@id='txt16']"));
			     	if(i16<14.64)
			     	{
			     		WebElement checkbox16 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[13]/td[4]/input"));
			     		checkbox16.click();
			     	}//�ж�16�����ʲ���ע
			     	WebElement peilv15 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[14]/td[3]"));
			     	String p15= peilv15.getText() ;//ȡ��15������
			     	////System.out.println(p15);
			     	float i15 = Float.parseFloat(p15); //ת��������
			     	//System.out.println(i15);
			     	//WebElement textbox15 = driver.findElement(By.xpath(".//*[@id='txt15']"));
			     	if(i15<13.83)
			     	{
			     		WebElement checkbox15 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[14]/td[4]/input"));
			     		checkbox15.click();
			     	}//�ж�15�����ʲ���ע
			   
			 	
			     	/*WebElement peilv14 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[15]/td[3]"));
			     	String p14= peilv14.getText() ;//ȡ��14������
			     	////System.out.println(p14);
			     	float i14 = Float.parseFloat(p14); //ת��������
			     	//System.out.println(i14);
			     	//WebElement textbox14 = driver.findElement(By.xpath(".//*[@id='txt14']"));
			     	if(i14<13.46)
			     	{
			     		WebElement checkbox14 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[15]/td[4]/input"));
			     		checkbox14.click();
			     	}//�ж�14���ʲ���ע*/ 
			     	
				
				}
					//n = 5;
					break;
				case 7:
				{
					WebElement moshi1 = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[8]/div[2]/div[4]/div[2]/div/div[2]/a[4]"));
			 		moshi1.click();//���Ͷעģʽ
			 		
			 		shuaxin = driver.findElement(By.xpath(".//*[@id='form1']/div[8]/div[2]/div[4]/div[4]/div[3]/div[1]"));
			 		shuaxin.click();//���ˢ��
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
			     	String p0= peilv0.getText() ;//ȡ��0������
			     	////System.out.println(p0);
			     	float i0 = Float.parseFloat(p0); //ת��������
			     	//System.out.println(i0);
			     	
			     	if(i0<1010)
			     	{
			     		WebElement checkbox0 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[2]/td[4]/input"));
			     		checkbox0.click();
			     		
			     	}//�ж�0�����ʲ���ע*/
			     
			     	WebElement peilv1 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[3]/td[3]"));
			     	String p1= peilv1.getText() ;//ȡ��1������
			     	////System.out.println(p1);
			     	float i1 = Float.parseFloat(p1); //ת��������
			     	////System.out.println(i1);
			     	
			     	if(i1<336.66)
			     	{
			     		
			     		WebElement checkbox1 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[3]/td[4]/input"));
			     		checkbox1.click();
			     	}//�ж�1�����ʲ���ע

			     	WebElement peilv2 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[4]/td[3]"));
			     	String p2= peilv2.getText() ;//ȡ��2������
			     	////System.out.println(p2);
			     	float i2 = Float.parseFloat(p2); //ת��������
			     	////System.out.println(i2);
			     	//WebElement textbox2 = driver.findElement(By.xpath(".//*[@id='txt2']"));
			     	if(i2<168.33)
			     	{
			     		
			     		WebElement checkbox2 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[4]/td[4]/input"));
			     		checkbox2.click();
			         }
			     	//�ж�2�����ʲ���ע
			     	WebElement peilv3 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[5]/td[3]"));
			     	String p3= peilv3.getText() ;//ȡ��13������
			     	////System.out.println(p3);
			     	float i3 = Float.parseFloat(p3); //ת��������
			     	////System.out.println(i3);
			     	//WebElement textbox3 = driver.findElement(By.xpath(".//*[@id='txt3']"));
			     	if(i3<101)
			     	{
			     		WebElement checkbox3 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[5]/td[4]/input"));
			     		checkbox3.click();
			     	}//�ж�0�����ʲ���ע
			     	WebElement peilv4 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[6]/td[3]"));
			     	String p4= peilv4.getText() ;//ȡ��13������
			     	////System.out.println(p4);
			     	float i4 = Float.parseFloat(p4); //ת��������
			     	////System.out.println(i4);
			     	//WebElement textbox4 = driver.findElement(By.xpath(".//*[@id='txt4']"));
			     	if(i4<67.33)
			     	{
			     		WebElement checkbox4 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[6]/td[4]/input"));
			     		checkbox4.click();
			     	}//�ж�4�����ʲ���ע
			     	WebElement peilv5 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[7]/td[3]"));
			     	String p5= peilv5.getText() ;//ȡ��13������
			     	//System.out.println(p5);
			     	float i5 = Float.parseFloat(p5); //ת��������
			     	////System.out.println(i5);
			     	//WebElement textbox5 = driver.findElement(By.xpath(".//*[@id='txt5']"));
			     	
			     	if(i5<48.1)
			     	{
			     		WebElement checkbox5 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[7]/td[4]/input"));
			     		checkbox5.click();
			     	}//�ж�5�����ʲ���ע
			     	WebElement peilv6 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[8]/td[3]"));
			     	String p6= peilv6.getText() ;//ȡ��13������
			     	//System.out.println(p6);
			     	float i6 = Float.parseFloat(p6); //ת��������
			     	//System.out.println(i6);
			     	//WebElement textbox6 = driver.findElement(By.xpath(".//*[@id='txt6']"));
			     	if(i6<36.07)
			     	{
			     		WebElement checkbox6 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[8]/td[4]/input"));
			     		checkbox6.click();
			     	}//�ж�6�����ʲ���ע

			     	WebElement peilv7 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[9]/td[3]"));
			     	String p7= peilv7.getText() ;//ȡ��13������
			     	//System.out.println(p7);
			     	float i7 = Float.parseFloat(p7); //ת��������
			     	//System.out.println(i7);
			     	//WebElement textbox7 = driver.findElement(By.xpath(".//*[@id='txt7']"));
			     	if(i7<28.05)
			     	{
			     		WebElement checkbox7 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[9]/td[4]/input"));
			     		checkbox7.click();
			     	}//�ж�7�����ʲ���ע
			     	shuaxin.click();//���ˢ��

			     	
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
			     	String p8= peilv8.getText() ;//ȡ��13������
			     	//System.out.println(p8);
			     	float i8 = Float.parseFloat(p8); //ת��������
			     	//System.out.println(i8);
			     	//WebElement textbox8 = driver.findElement(By.xpath(".//*[@id='txt8']"));
			     	if(i8<22.44)
			     	{
			     		WebElement checkbox8 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[10]/td[4]/input"));
			     		checkbox8.click();
			     	}//�ж�8�����ʲ���ע
			     	
			     	WebElement peilv9 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[11]/td[3]"));
			     	String p9= peilv9.getText() ;//ȡ��13������
			     	//System.out.println(p9);
			     	float i9 = Float.parseFloat(p9); //ת��������
			     	//System.out.println(i9);
			     	//WebElement textbox9 = driver.findElement(By.xpath(".//*[@id='txt9']"));
			     	if(i9<18.36)
			     	{
			     		WebElement checkbox9 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[11]/td[4]/input"));
			     		checkbox9.click();
			     	}//�ж�9�����ʲ���ע
			     	
			     	WebElement peilv10 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[12]/td[3]"));
			     	String p10= peilv10.getText() ;//ȡ��13������
			     	//System.out.println(p10);
			     	float i10 = Float.parseFloat(p10); //ת��������
			     	//System.out.println(i10);
			     	//WebElement textbox10 = driver.findElement(By.xpath(".//*[@id='txt10']"));
			     	if(i10<16.03)
			     	{
			     		WebElement checkbox10 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[12]/td[4]/input"));
			     		checkbox10.click();
			     	}//�ж�10�����ʲ���ע
			     	WebElement peilv11 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[13]/td[3]"));
			     	String p11= peilv11.getText() ;//ȡ��13������
			     	//System.out.println(p11);
			     	float i11 = Float.parseFloat(p11); //ת��������
			     	//System.out.println(i11);
			     	//WebElement textbox11 = driver.findElement(By.xpath(".//*[@id='txt11']"));
			     	if(i11<14.63)
			     	{
			     		WebElement checkbox11 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[13]/td[4]/input"));
			     		checkbox11.click();
			     	}//�ж�11�����ʲ���ע
			     	WebElement peilv12 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[14]/td[3]"));
			     	String p12= peilv12.getText() ;//ȡ��13������
			     	//System.out.println(p12);
			     	float i12 = Float.parseFloat(p12); //ת��������
			     	//System.out.println(i12);
			     	//WebElement textbox12 = driver.findElement(By.xpath(".//*[@id='txt12']"));
			     	if(i12<13.83)
			     	{
			     		WebElement checkbox12 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[14]/td[4]/input"));
			     		checkbox12.click();
			     	}//�ж�12�����ʲ���ע
			   
			 	
			     	/*WebElement peilv13 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[15]/td[3]"));
			     	String p13= peilv13.getText() ;//ȡ��13������
			     	//System.out.println(p13);
			     	float i13 = Float.parseFloat(p13); //ת��������
			     	//System.out.println(i13);
			     	//WebElement textbox13 = driver.findElement(By.xpath(".//*[@id='txt13']"));
			     	if(i13<13.46)
			     	{
			     		WebElement checkbox13 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[15]/td[4]/input"));
			     		checkbox13.click();
			     	}//�ж�13���ʲ���ע */
			     	
			     	shuaxin.click();//���ˢ��
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
			     	String p27= peilv27.getText() ;//ȡ��27������
			     	//System.out.println(p27);
			     	float i27 = Float.parseFloat(p27); //ת��������
			     	//System.out.println(i27);
			     	//WebElement textbox27 = driver.findElement(By.xpath(".//*[@id='txt27']"));
			     	if(i27<1010)
			     	{
			     		WebElement checkbox27 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[2]/td[4]/input"));
			     		checkbox27.click();
			     	}//�ж�0�����ʲ���ע*/
			     	WebElement peilv26 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[3]/td[3]"));
			     	String p26= peilv26.getText() ;//ȡ��26������
			     	//System.out.println(p26);
			     	float i26 = Float.parseFloat(p26); //ת��������
			     	//System.out.println(i26);
			     	//WebElement textbox26 = driver.findElement(By.xpath(".//*[@id='txt26']"));
			     	if(i26<336.66)
			     	{
			     		WebElement checkbox26 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[3]/td[4]/input"));
			     		checkbox26.click();
			     	}//�ж�1�����ʲ���ע

			     	WebElement peilv25 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[4]/td[3]"));
			     	String p25= peilv25.getText() ;//ȡ��25������
			     	//System.out.println(p25);
			     	float i25 = Float.parseFloat(p25); //ת��������
			     	//System.out.println(i25);
			     	//WebElement textbox25 = driver.findElement(By.xpath(".//*[@id='txt25']"));
			     	if(i25<168.33)
			     	{
			     		WebElement checkbox25 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[4]/td[4]/input"));
			     		checkbox25.click();
			     	}//�ж�2�����ʲ���ע
			     	WebElement peilv24 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[5]/td[3]"));
			     	String p24= peilv24.getText() ;//ȡ��24������
			     	//System.out.println(p24);
			     	float i24 = Float.parseFloat(p24); //ת��������
			     	//System.out.println(i24);
			     	//WebElement textbox24 = driver.findElement(By.xpath(".//*[@id='txt24']"));
			     	if(i24<101)
			     	{
			     		WebElement checkbox24 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[5]/td[4]/input"));
			     		checkbox24.click();
			     	}//�ж�0�����ʲ���ע
			     	WebElement peilv23 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[6]/td[3]"));
			     	String p23= peilv23.getText() ;//ȡ��23������
			     	//System.out.println(p23);
			     	float i23 = Float.parseFloat(p23); //ת��������
			     	//System.out.println(i23);
			     	//WebElement textbox23 = driver.findElement(By.xpath(".//*[@id='txt23']"));
			     	if(i23<67.33)
			     	{
			     		WebElement checkbox23 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[6]/td[4]/input"));
			     		checkbox23.click();
			     	}//�ж�23�����ʲ���ע
			     	WebElement peilv22 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[7]/td[3]"));
			     	String p22= peilv22.getText() ;//ȡ��22������
			     	//System.out.println(p22);
			     	float i22 = Float.parseFloat(p22); //ת��������
			     	//System.out.println(i22);
			     	//WebElement textbox22 = driver.findElement(By.xpath(".//*[@id='txt22']"));
			     	if(i22<48.09)
			     	{
			     		WebElement checkbox22 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[7]/td[4]/input"));
			     		checkbox22.click();
			     	}//�ж�22�����ʲ���ע
			     	WebElement peilv21 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[8]/td[3]"));
			     	String p21= peilv21.getText() ;//ȡ��21������
			     	//System.out.println(p21);
			     	float i21 = Float.parseFloat(p21); //ת��������
			     	//System.out.println(i21);
			     	//WebElement textbox21 = driver.findElement(By.xpath(".//*[@id='txt21']"));
			     	if(i21<36.07)
			     	{
			     		WebElement checkbox21 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[8]/td[4]/input"));
			     		checkbox21.click();
			     	}//�ж�21�����ʲ���ע

			     	WebElement peilv20 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[9]/td[3]"));
			     	String p20= peilv20.getText() ;//ȡ��20������
			     	////System.out.println(p20);
			     	float i20 = Float.parseFloat(p20); //ת��������
			     	//System.out.println(i20);
			     	//WebElement textbox20 = driver.findElement(By.xpath(".//*[@id='txt20']"));
			     	shuaxin.click();//���ˢ��
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
			     	}//�ж�20�����ʲ���ע
			     	WebElement peilv19 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[10]/td[3]"));
			     	String p19= peilv19.getText() ;//ȡ��19������
			     	////System.out.println(p19);
			     	float i19 = Float.parseFloat(p19); //ת��������
			     	//System.out.println(i19);
			     	//WebElement textbox19 = driver.findElement(By.xpath(".//*[@id='txt19']"));
			     	if(i19<22.44)
			     	{
			     		WebElement checkbox19 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[10]/td[4]/input"));
			     		checkbox19.click();
			     	}//�ж�19�����ʲ���ע
			     	
			     	WebElement peilv18 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[11]/td[3]"));
			     	String p18= peilv18.getText() ;//ȡ��18������
			     	////System.out.println(p18);
			     	float i18 = Float.parseFloat(p18); //ת��������
			     	//System.out.println(i18);
			     	//WebElement textbox18 = driver.findElement(By.xpath(".//*[@id='txt18']"));
			     	if(i18<18.36)
			     	{
			     		WebElement checkbox18 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[11]/td[4]/input"));
			     		checkbox18.click();
			     	}//�ж�18�����ʲ���ע
			     	
			     	WebElement peilv17 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[12]/td[3]"));
			     	String p17= peilv17.getText() ;//ȡ��17������
			     	////System.out.println(p17);
			     	float i17 = Float.parseFloat(p17); //ת��������
			     	//System.out.println(i17);
			     	//WebElement textbox17 = driver.findElement(By.xpath(".//*[@id='txt17']"));
			     	if(i17<16.03)
			     	{
			     		WebElement checkbox17 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[12]/td[4]/input"));
			     		checkbox17.click();
			     	}//�ж�17�����ʲ���ע
			     	WebElement peilv16 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[13]/td[3]"));
			     	String p16= peilv16.getText() ;//ȡ��16������
			     	////System.out.println(p16);
			     	float i16 = Float.parseFloat(p16); //ת��������
			     	//System.out.println(i16);
			     	//WebElement textbox16 = driver.findElement(By.xpath(".//*[@id='txt16']"));
			     	if(i16<14.64)
			     	{
			     		WebElement checkbox16 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[13]/td[4]/input"));
			     		checkbox16.click();
			     	}//�ж�16�����ʲ���ע
			     	WebElement peilv15 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[14]/td[3]"));
			     	String p15= peilv15.getText() ;//ȡ��15������
			     	////System.out.println(p15);
			     	float i15 = Float.parseFloat(p15); //ת��������
			     	//System.out.println(i15);
			     	//WebElement textbox15 = driver.findElement(By.xpath(".//*[@id='txt15']"));
			     	if(i15<13.83)
			     	{
			     		WebElement checkbox15 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[14]/td[4]/input"));
			     		checkbox15.click();
			     	}//�ж�15�����ʲ���ע
			   
			 	
			     	/*WebElement peilv14 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[15]/td[3]"));
			     	String p14= peilv14.getText() ;//ȡ��14������
			     	////System.out.println(p14);
			     	float i14 = Float.parseFloat(p14); //ת��������
			     	//System.out.println(i14);
			     	//WebElement textbox14 = driver.findElement(By.xpath(".//*[@id='txt14']"));
			     	if(i14<13.46)
			     	{
			     		WebElement checkbox14 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[15]/td[4]/input"));
			     		checkbox14.click();
			     	}//�ж�14���ʲ���ע*/ 
			     	
				
				}
					break;
				case 8:
				{
					WebElement moshi1 = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[8]/div[2]/div[4]/div[2]/div/div[2]/a[4]"));
			 		moshi1.click();//���Ͷעģʽ
			 		
			 		shuaxin = driver.findElement(By.xpath(".//*[@id='form1']/div[8]/div[2]/div[4]/div[4]/div[3]/div[1]"));
			 		shuaxin.click();//���ˢ��
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
			     	String p0= peilv0.getText() ;//ȡ��0������
			     	////System.out.println(p0);
			     	float i0 = Float.parseFloat(p0); //ת��������
			     	//System.out.println(i0);
			     	
			     	if(i0<1010)
			     	{
			     		WebElement checkbox0 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[2]/td[4]/input"));
			     		checkbox0.click();
			     		
			     	}//�ж�0�����ʲ���ע*/
			     
			     	WebElement peilv1 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[3]/td[3]"));
			     	String p1= peilv1.getText() ;//ȡ��1������
			     	////System.out.println(p1);
			     	float i1 = Float.parseFloat(p1); //ת��������
			     	////System.out.println(i1);
			     	
			     	if(i1<336.66)
			     	{
			     		
			     		WebElement checkbox1 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[3]/td[4]/input"));
			     		checkbox1.click();
			     	}//�ж�1�����ʲ���ע

			     	WebElement peilv2 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[4]/td[3]"));
			     	String p2= peilv2.getText() ;//ȡ��2������
			     	////System.out.println(p2);
			     	float i2 = Float.parseFloat(p2); //ת��������
			     	////System.out.println(i2);
			     	//WebElement textbox2 = driver.findElement(By.xpath(".//*[@id='txt2']"));
			     	if(i2<168.33)
			     	{
			     		
			     		WebElement checkbox2 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[4]/td[4]/input"));
			     		checkbox2.click();
			         }
			     	//�ж�2�����ʲ���ע
			     	WebElement peilv3 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[5]/td[3]"));
			     	String p3= peilv3.getText() ;//ȡ��13������
			     	////System.out.println(p3);
			     	float i3 = Float.parseFloat(p3); //ת��������
			     	////System.out.println(i3);
			     	//WebElement textbox3 = driver.findElement(By.xpath(".//*[@id='txt3']"));
			     	if(i3<101)
			     	{
			     		WebElement checkbox3 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[5]/td[4]/input"));
			     		checkbox3.click();
			     	}//�ж�0�����ʲ���ע
			     	WebElement peilv4 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[6]/td[3]"));
			     	String p4= peilv4.getText() ;//ȡ��13������
			     	////System.out.println(p4);
			     	float i4 = Float.parseFloat(p4); //ת��������
			     	////System.out.println(i4);
			     	//WebElement textbox4 = driver.findElement(By.xpath(".//*[@id='txt4']"));
			     	if(i4<67.33)
			     	{
			     		WebElement checkbox4 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[6]/td[4]/input"));
			     		checkbox4.click();
			     	}//�ж�4�����ʲ���ע
			     	WebElement peilv5 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[7]/td[3]"));
			     	String p5= peilv5.getText() ;//ȡ��13������
			     	//System.out.println(p5);
			     	float i5 = Float.parseFloat(p5); //ת��������
			     	////System.out.println(i5);
			     	//WebElement textbox5 = driver.findElement(By.xpath(".//*[@id='txt5']"));
			     	
			     	if(i5<48.1)
			     	{
			     		WebElement checkbox5 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[7]/td[4]/input"));
			     		checkbox5.click();
			     	}//�ж�5�����ʲ���ע
			     	WebElement peilv6 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[8]/td[3]"));
			     	String p6= peilv6.getText() ;//ȡ��13������
			     	//System.out.println(p6);
			     	float i6 = Float.parseFloat(p6); //ת��������
			     	//System.out.println(i6);
			     	//WebElement textbox6 = driver.findElement(By.xpath(".//*[@id='txt6']"));
			     	if(i6<36.07)
			     	{
			     		WebElement checkbox6 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[8]/td[4]/input"));
			     		checkbox6.click();
			     	}//�ж�6�����ʲ���ע

			     	WebElement peilv7 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[9]/td[3]"));
			     	String p7= peilv7.getText() ;//ȡ��13������
			     	//System.out.println(p7);
			     	float i7 = Float.parseFloat(p7); //ת��������
			     	//System.out.println(i7);
			     	//WebElement textbox7 = driver.findElement(By.xpath(".//*[@id='txt7']"));
			     	if(i7<28.05)
			     	{
			     		WebElement checkbox7 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[9]/td[4]/input"));
			     		checkbox7.click();
			     	}//�ж�7�����ʲ���ע
			     	shuaxin.click();//���ˢ��

			     	
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
			     	String p8= peilv8.getText() ;//ȡ��13������
			     	//System.out.println(p8);
			     	float i8 = Float.parseFloat(p8); //ת��������
			     	//System.out.println(i8);
			     	//WebElement textbox8 = driver.findElement(By.xpath(".//*[@id='txt8']"));
			     	if(i8<22.44)
			     	{
			     		WebElement checkbox8 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[10]/td[4]/input"));
			     		checkbox8.click();
			     	}//�ж�8�����ʲ���ע
			     	
			     	WebElement peilv9 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[11]/td[3]"));
			     	String p9= peilv9.getText() ;//ȡ��13������
			     	//System.out.println(p9);
			     	float i9 = Float.parseFloat(p9); //ת��������
			     	//System.out.println(i9);
			     	//WebElement textbox9 = driver.findElement(By.xpath(".//*[@id='txt9']"));
			     	if(i9<18.36)
			     	{
			     		WebElement checkbox9 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[11]/td[4]/input"));
			     		checkbox9.click();
			     	}//�ж�9�����ʲ���ע
			     	
			     	WebElement peilv10 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[12]/td[3]"));
			     	String p10= peilv10.getText() ;//ȡ��13������
			     	//System.out.println(p10);
			     	float i10 = Float.parseFloat(p10); //ת��������
			     	//System.out.println(i10);
			     	//WebElement textbox10 = driver.findElement(By.xpath(".//*[@id='txt10']"));
			     	if(i10<16.03)
			     	{
			     		WebElement checkbox10 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[12]/td[4]/input"));
			     		checkbox10.click();
			     	}//�ж�10�����ʲ���ע
			     	WebElement peilv11 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[13]/td[3]"));
			     	String p11= peilv11.getText() ;//ȡ��13������
			     	//System.out.println(p11);
			     	float i11 = Float.parseFloat(p11); //ת��������
			     	//System.out.println(i11);
			     	//WebElement textbox11 = driver.findElement(By.xpath(".//*[@id='txt11']"));
			     	if(i11<14.63)
			     	{
			     		WebElement checkbox11 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[13]/td[4]/input"));
			     		checkbox11.click();
			     	}//�ж�11�����ʲ���ע
			     	WebElement peilv12 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[14]/td[3]"));
			     	String p12= peilv12.getText() ;//ȡ��13������
			     	//System.out.println(p12);
			     	float i12 = Float.parseFloat(p12); //ת��������
			     	//System.out.println(i12);
			     	//WebElement textbox12 = driver.findElement(By.xpath(".//*[@id='txt12']"));
			     	if(i12<13.83)
			     	{
			     		WebElement checkbox12 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[14]/td[4]/input"));
			     		checkbox12.click();
			     	}//�ж�12�����ʲ���ע
			   
			 	
			     	/*WebElement peilv13 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[15]/td[3]"));
			     	String p13= peilv13.getText() ;//ȡ��13������
			     	//System.out.println(p13);
			     	float i13 = Float.parseFloat(p13); //ת��������
			     	//System.out.println(i13);
			     	//WebElement textbox13 = driver.findElement(By.xpath(".//*[@id='txt13']"));
			     	if(i13<13.46)
			     	{
			     		WebElement checkbox13 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[15]/td[4]/input"));
			     		checkbox13.click();
			     	}//�ж�13���ʲ���ע */
			     	
			     	shuaxin.click();//���ˢ��
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
			     	String p27= peilv27.getText() ;//ȡ��27������
			     	//System.out.println(p27);
			     	float i27 = Float.parseFloat(p27); //ת��������
			     	//System.out.println(i27);
			     	//WebElement textbox27 = driver.findElement(By.xpath(".//*[@id='txt27']"));
			     	if(i27<1010)
			     	{
			     		WebElement checkbox27 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[2]/td[4]/input"));
			     		checkbox27.click();
			     	}//�ж�0�����ʲ���ע*/
			     	WebElement peilv26 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[3]/td[3]"));
			     	String p26= peilv26.getText() ;//ȡ��26������
			     	//System.out.println(p26);
			     	float i26 = Float.parseFloat(p26); //ת��������
			     	//System.out.println(i26);
			     	//WebElement textbox26 = driver.findElement(By.xpath(".//*[@id='txt26']"));
			     	if(i26<336.66)
			     	{
			     		WebElement checkbox26 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[3]/td[4]/input"));
			     		checkbox26.click();
			     	}//�ж�1�����ʲ���ע

			     	WebElement peilv25 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[4]/td[3]"));
			     	String p25= peilv25.getText() ;//ȡ��25������
			     	//System.out.println(p25);
			     	float i25 = Float.parseFloat(p25); //ת��������
			     	//System.out.println(i25);
			     	//WebElement textbox25 = driver.findElement(By.xpath(".//*[@id='txt25']"));
			     	if(i25<168.33)
			     	{
			     		WebElement checkbox25 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[4]/td[4]/input"));
			     		checkbox25.click();
			     	}//�ж�2�����ʲ���ע
			     	WebElement peilv24 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[5]/td[3]"));
			     	String p24= peilv24.getText() ;//ȡ��24������
			     	//System.out.println(p24);
			     	float i24 = Float.parseFloat(p24); //ת��������
			     	//System.out.println(i24);
			     	//WebElement textbox24 = driver.findElement(By.xpath(".//*[@id='txt24']"));
			     	if(i24<101)
			     	{
			     		WebElement checkbox24 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[5]/td[4]/input"));
			     		checkbox24.click();
			     	}//�ж�0�����ʲ���ע
			     	WebElement peilv23 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[6]/td[3]"));
			     	String p23= peilv23.getText() ;//ȡ��23������
			     	//System.out.println(p23);
			     	float i23 = Float.parseFloat(p23); //ת��������
			     	//System.out.println(i23);
			     	//WebElement textbox23 = driver.findElement(By.xpath(".//*[@id='txt23']"));
			     	if(i23<67.33)
			     	{
			     		WebElement checkbox23 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[6]/td[4]/input"));
			     		checkbox23.click();
			     	}//�ж�23�����ʲ���ע
			     	WebElement peilv22 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[7]/td[3]"));
			     	String p22= peilv22.getText() ;//ȡ��22������
			     	//System.out.println(p22);
			     	float i22 = Float.parseFloat(p22); //ת��������
			     	//System.out.println(i22);
			     	//WebElement textbox22 = driver.findElement(By.xpath(".//*[@id='txt22']"));
			     	if(i22<48.09)
			     	{
			     		WebElement checkbox22 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[7]/td[4]/input"));
			     		checkbox22.click();
			     	}//�ж�22�����ʲ���ע
			     	WebElement peilv21 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[8]/td[3]"));
			     	String p21= peilv21.getText() ;//ȡ��21������
			     	//System.out.println(p21);
			     	float i21 = Float.parseFloat(p21); //ת��������
			     	//System.out.println(i21);
			     	//WebElement textbox21 = driver.findElement(By.xpath(".//*[@id='txt21']"));
			     	if(i21<36.07)
			     	{
			     		WebElement checkbox21 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[8]/td[4]/input"));
			     		checkbox21.click();
			     	}//�ж�21�����ʲ���ע

			     	WebElement peilv20 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[9]/td[3]"));
			     	String p20= peilv20.getText() ;//ȡ��20������
			     	////System.out.println(p20);
			     	float i20 = Float.parseFloat(p20); //ת��������
			     	//System.out.println(i20);
			     	//WebElement textbox20 = driver.findElement(By.xpath(".//*[@id='txt20']"));
			     	shuaxin.click();//���ˢ��
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
			     	}//�ж�20�����ʲ���ע
			     	WebElement peilv19 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[10]/td[3]"));
			     	String p19= peilv19.getText() ;//ȡ��19������
			     	////System.out.println(p19);
			     	float i19 = Float.parseFloat(p19); //ת��������
			     	//System.out.println(i19);
			     	//WebElement textbox19 = driver.findElement(By.xpath(".//*[@id='txt19']"));
			     	if(i19<22.44)
			     	{
			     		WebElement checkbox19 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[10]/td[4]/input"));
			     		checkbox19.click();
			     	}//�ж�19�����ʲ���ע
			     	
			     	WebElement peilv18 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[11]/td[3]"));
			     	String p18= peilv18.getText() ;//ȡ��18������
			     	////System.out.println(p18);
			     	float i18 = Float.parseFloat(p18); //ת��������
			     	//System.out.println(i18);
			     	//WebElement textbox18 = driver.findElement(By.xpath(".//*[@id='txt18']"));
			     	if(i18<18.36)
			     	{
			     		WebElement checkbox18 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[11]/td[4]/input"));
			     		checkbox18.click();
			     	}//�ж�18�����ʲ���ע
			     	
			     	WebElement peilv17 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[12]/td[3]"));
			     	String p17= peilv17.getText() ;//ȡ��17������
			     	////System.out.println(p17);
			     	float i17 = Float.parseFloat(p17); //ת��������
			     	//System.out.println(i17);
			     	//WebElement textbox17 = driver.findElement(By.xpath(".//*[@id='txt17']"));
			     	if(i17<16.03)
			     	{
			     		WebElement checkbox17 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[12]/td[4]/input"));
			     		checkbox17.click();
			     	}//�ж�17�����ʲ���ע
			     	WebElement peilv16 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[13]/td[3]"));
			     	String p16= peilv16.getText() ;//ȡ��16������
			     	////System.out.println(p16);
			     	float i16 = Float.parseFloat(p16); //ת��������
			     	//System.out.println(i16);
			     	//WebElement textbox16 = driver.findElement(By.xpath(".//*[@id='txt16']"));
			     	if(i16<14.64)
			     	{
			     		WebElement checkbox16 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[13]/td[4]/input"));
			     		checkbox16.click();
			     	}//�ж�16�����ʲ���ע
			     	WebElement peilv15 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[14]/td[3]"));
			     	String p15= peilv15.getText() ;//ȡ��15������
			     	////System.out.println(p15);
			     	float i15 = Float.parseFloat(p15); //ת��������
			     	//System.out.println(i15);
			     	//WebElement textbox15 = driver.findElement(By.xpath(".//*[@id='txt15']"));
			     	if(i15<13.83)
			     	{
			     		WebElement checkbox15 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[14]/td[4]/input"));
			     		checkbox15.click();
			     	}//�ж�15�����ʲ���ע
			   
			 	
			     	/*WebElement peilv14 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[15]/td[3]"));
			     	String p14= peilv14.getText() ;//ȡ��14������
			     	////System.out.println(p14);
			     	float i14 = Float.parseFloat(p14); //ת��������
			     	//System.out.println(i14);
			     	//WebElement textbox14 = driver.findElement(By.xpath(".//*[@id='txt14']"));
			     	if(i14<13.46)
			     	{
			     		WebElement checkbox14 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[15]/td[4]/input"));
			     		checkbox14.click();
			     	}//�ж�14���ʲ���ע*/ 
			     	
				
				}
					break;
				case 9:
				{
					WebElement moshi1 = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[8]/div[2]/div[4]/div[2]/div/div[2]/a[4]"));
			 		moshi1.click();//���Ͷעģʽ
			 		
			 		shuaxin = driver.findElement(By.xpath(".//*[@id='form1']/div[8]/div[2]/div[4]/div[4]/div[3]/div[1]"));
			 		shuaxin.click();//���ˢ��
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
			     	String p0= peilv0.getText() ;//ȡ��0������
			     	////System.out.println(p0);
			     	float i0 = Float.parseFloat(p0); //ת��������
			     	//System.out.println(i0);
			     	
			     	if(i0<1010)
			     	{
			     		WebElement checkbox0 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[2]/td[4]/input"));
			     		checkbox0.click();
			     		
			     	}//�ж�0�����ʲ���ע*/
			     
			     	WebElement peilv1 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[3]/td[3]"));
			     	String p1= peilv1.getText() ;//ȡ��1������
			     	////System.out.println(p1);
			     	float i1 = Float.parseFloat(p1); //ת��������
			     	////System.out.println(i1);
			     	
			     	if(i1<336.66)
			     	{
			     		
			     		WebElement checkbox1 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[3]/td[4]/input"));
			     		checkbox1.click();
			     	}//�ж�1�����ʲ���ע

			     	WebElement peilv2 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[4]/td[3]"));
			     	String p2= peilv2.getText() ;//ȡ��2������
			     	////System.out.println(p2);
			     	float i2 = Float.parseFloat(p2); //ת��������
			     	////System.out.println(i2);
			     	//WebElement textbox2 = driver.findElement(By.xpath(".//*[@id='txt2']"));
			     	if(i2<168.33)
			     	{
			     		
			     		WebElement checkbox2 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[4]/td[4]/input"));
			     		checkbox2.click();
			         }
			     	//�ж�2�����ʲ���ע
			     	WebElement peilv3 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[5]/td[3]"));
			     	String p3= peilv3.getText() ;//ȡ��13������
			     	////System.out.println(p3);
			     	float i3 = Float.parseFloat(p3); //ת��������
			     	////System.out.println(i3);
			     	//WebElement textbox3 = driver.findElement(By.xpath(".//*[@id='txt3']"));
			     	if(i3<101)
			     	{
			     		WebElement checkbox3 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[5]/td[4]/input"));
			     		checkbox3.click();
			     	}//�ж�0�����ʲ���ע
			     	WebElement peilv4 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[6]/td[3]"));
			     	String p4= peilv4.getText() ;//ȡ��13������
			     	////System.out.println(p4);
			     	float i4 = Float.parseFloat(p4); //ת��������
			     	////System.out.println(i4);
			     	//WebElement textbox4 = driver.findElement(By.xpath(".//*[@id='txt4']"));
			     	if(i4<67.33)
			     	{
			     		WebElement checkbox4 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[6]/td[4]/input"));
			     		checkbox4.click();
			     	}//�ж�4�����ʲ���ע
			     	WebElement peilv5 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[7]/td[3]"));
			     	String p5= peilv5.getText() ;//ȡ��13������
			     	//System.out.println(p5);
			     	float i5 = Float.parseFloat(p5); //ת��������
			     	////System.out.println(i5);
			     	//WebElement textbox5 = driver.findElement(By.xpath(".//*[@id='txt5']"));
			     	
			     	if(i5<48.1)
			     	{
			     		WebElement checkbox5 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[7]/td[4]/input"));
			     		checkbox5.click();
			     	}//�ж�5�����ʲ���ע
			     	WebElement peilv6 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[8]/td[3]"));
			     	String p6= peilv6.getText() ;//ȡ��13������
			     	//System.out.println(p6);
			     	float i6 = Float.parseFloat(p6); //ת��������
			     	//System.out.println(i6);
			     	//WebElement textbox6 = driver.findElement(By.xpath(".//*[@id='txt6']"));
			     	if(i6<36.07)
			     	{
			     		WebElement checkbox6 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[8]/td[4]/input"));
			     		checkbox6.click();
			     	}//�ж�6�����ʲ���ע

			     	WebElement peilv7 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[9]/td[3]"));
			     	String p7= peilv7.getText() ;//ȡ��13������
			     	//System.out.println(p7);
			     	float i7 = Float.parseFloat(p7); //ת��������
			     	//System.out.println(i7);
			     	//WebElement textbox7 = driver.findElement(By.xpath(".//*[@id='txt7']"));
			     	if(i7<28.05)
			     	{
			     		WebElement checkbox7 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[9]/td[4]/input"));
			     		checkbox7.click();
			     	}//�ж�7�����ʲ���ע
			     	shuaxin.click();//���ˢ��

			     	
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
			     	String p8= peilv8.getText() ;//ȡ��13������
			     	//System.out.println(p8);
			     	float i8 = Float.parseFloat(p8); //ת��������
			     	//System.out.println(i8);
			     	//WebElement textbox8 = driver.findElement(By.xpath(".//*[@id='txt8']"));
			     	if(i8<22.44)
			     	{
			     		WebElement checkbox8 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[10]/td[4]/input"));
			     		checkbox8.click();
			     	}//�ж�8�����ʲ���ע
			     	
			     	WebElement peilv9 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[11]/td[3]"));
			     	String p9= peilv9.getText() ;//ȡ��13������
			     	//System.out.println(p9);
			     	float i9 = Float.parseFloat(p9); //ת��������
			     	//System.out.println(i9);
			     	//WebElement textbox9 = driver.findElement(By.xpath(".//*[@id='txt9']"));
			     	if(i9<18.36)
			     	{
			     		WebElement checkbox9 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[11]/td[4]/input"));
			     		checkbox9.click();
			     	}//�ж�9�����ʲ���ע
			     	
			     	WebElement peilv10 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[12]/td[3]"));
			     	String p10= peilv10.getText() ;//ȡ��13������
			     	//System.out.println(p10);
			     	float i10 = Float.parseFloat(p10); //ת��������
			     	//System.out.println(i10);
			     	//WebElement textbox10 = driver.findElement(By.xpath(".//*[@id='txt10']"));
			     	if(i10<16.03)
			     	{
			     		WebElement checkbox10 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[12]/td[4]/input"));
			     		checkbox10.click();
			     	}//�ж�10�����ʲ���ע
			     	WebElement peilv11 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[13]/td[3]"));
			     	String p11= peilv11.getText() ;//ȡ��13������
			     	//System.out.println(p11);
			     	float i11 = Float.parseFloat(p11); //ת��������
			     	//System.out.println(i11);
			     	//WebElement textbox11 = driver.findElement(By.xpath(".//*[@id='txt11']"));
			     	if(i11<14.63)
			     	{
			     		WebElement checkbox11 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[13]/td[4]/input"));
			     		checkbox11.click();
			     	}//�ж�11�����ʲ���ע
			     	WebElement peilv12 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[14]/td[3]"));
			     	String p12= peilv12.getText() ;//ȡ��13������
			     	//System.out.println(p12);
			     	float i12 = Float.parseFloat(p12); //ת��������
			     	//System.out.println(i12);
			     	//WebElement textbox12 = driver.findElement(By.xpath(".//*[@id='txt12']"));
			     	if(i12<13.83)
			     	{
			     		WebElement checkbox12 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[14]/td[4]/input"));
			     		checkbox12.click();
			     	}//�ж�12�����ʲ���ע
			   
			 	
			     	/*WebElement peilv13 = driver.findElement(By.xpath(".//*[@id='panel']/table[1]/tbody/tr[15]/td[3]"));
			     	String p13= peilv13.getText() ;//ȡ��13������
			     	//System.out.println(p13);
			     	float i13 = Float.parseFloat(p13); //ת��������
			     	//System.out.println(i13);
			     	//WebElement textbox13 = driver.findElement(By.xpath(".//*[@id='txt13']"));
			     	if(i13<13.46)
			     	{
			     		WebElement checkbox13 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[1]/tbody/tr[15]/td[4]/input"));
			     		checkbox13.click();
			     	}//�ж�13���ʲ���ע */
			     	
			     	shuaxin.click();//���ˢ��
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
			     	String p27= peilv27.getText() ;//ȡ��27������
			     	//System.out.println(p27);
			     	float i27 = Float.parseFloat(p27); //ת��������
			     	//System.out.println(i27);
			     	//WebElement textbox27 = driver.findElement(By.xpath(".//*[@id='txt27']"));
			     	if(i27<1010)
			     	{
			     		WebElement checkbox27 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[2]/td[4]/input"));
			     		checkbox27.click();
			     	}//�ж�0�����ʲ���ע*/
			     	WebElement peilv26 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[3]/td[3]"));
			     	String p26= peilv26.getText() ;//ȡ��26������
			     	//System.out.println(p26);
			     	float i26 = Float.parseFloat(p26); //ת��������
			     	//System.out.println(i26);
			     	//WebElement textbox26 = driver.findElement(By.xpath(".//*[@id='txt26']"));
			     	if(i26<336.66)
			     	{
			     		WebElement checkbox26 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[3]/td[4]/input"));
			     		checkbox26.click();
			     	}//�ж�1�����ʲ���ע

			     	WebElement peilv25 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[4]/td[3]"));
			     	String p25= peilv25.getText() ;//ȡ��25������
			     	//System.out.println(p25);
			     	float i25 = Float.parseFloat(p25); //ת��������
			     	//System.out.println(i25);
			     	//WebElement textbox25 = driver.findElement(By.xpath(".//*[@id='txt25']"));
			     	if(i25<168.33)
			     	{
			     		WebElement checkbox25 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[4]/td[4]/input"));
			     		checkbox25.click();
			     	}//�ж�2�����ʲ���ע
			     	WebElement peilv24 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[5]/td[3]"));
			     	String p24= peilv24.getText() ;//ȡ��24������
			     	//System.out.println(p24);
			     	float i24 = Float.parseFloat(p24); //ת��������
			     	//System.out.println(i24);
			     	//WebElement textbox24 = driver.findElement(By.xpath(".//*[@id='txt24']"));
			     	if(i24<101)
			     	{
			     		WebElement checkbox24 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[5]/td[4]/input"));
			     		checkbox24.click();
			     	}//�ж�0�����ʲ���ע
			     	WebElement peilv23 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[6]/td[3]"));
			     	String p23= peilv23.getText() ;//ȡ��23������
			     	//System.out.println(p23);
			     	float i23 = Float.parseFloat(p23); //ת��������
			     	//System.out.println(i23);
			     	//WebElement textbox23 = driver.findElement(By.xpath(".//*[@id='txt23']"));
			     	if(i23<67.33)
			     	{
			     		WebElement checkbox23 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[6]/td[4]/input"));
			     		checkbox23.click();
			     	}//�ж�23�����ʲ���ע
			     	WebElement peilv22 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[7]/td[3]"));
			     	String p22= peilv22.getText() ;//ȡ��22������
			     	//System.out.println(p22);
			     	float i22 = Float.parseFloat(p22); //ת��������
			     	//System.out.println(i22);
			     	//WebElement textbox22 = driver.findElement(By.xpath(".//*[@id='txt22']"));
			     	if(i22<48.09)
			     	{
			     		WebElement checkbox22 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[7]/td[4]/input"));
			     		checkbox22.click();
			     	}//�ж�22�����ʲ���ע
			     	WebElement peilv21 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[8]/td[3]"));
			     	String p21= peilv21.getText() ;//ȡ��21������
			     	//System.out.println(p21);
			     	float i21 = Float.parseFloat(p21); //ת��������
			     	//System.out.println(i21);
			     	//WebElement textbox21 = driver.findElement(By.xpath(".//*[@id='txt21']"));
			     	if(i21<36.07)
			     	{
			     		WebElement checkbox21 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[8]/td[4]/input"));
			     		checkbox21.click();
			     	}//�ж�21�����ʲ���ע

			     	WebElement peilv20 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[9]/td[3]"));
			     	String p20= peilv20.getText() ;//ȡ��20������
			     	////System.out.println(p20);
			     	float i20 = Float.parseFloat(p20); //ת��������
			     	//System.out.println(i20);
			     	//WebElement textbox20 = driver.findElement(By.xpath(".//*[@id='txt20']"));
			     	shuaxin.click();//���ˢ��
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
			     	}//�ж�20�����ʲ���ע
			     	WebElement peilv19 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[10]/td[3]"));
			     	String p19= peilv19.getText() ;//ȡ��19������
			     	////System.out.println(p19);
			     	float i19 = Float.parseFloat(p19); //ת��������
			     	//System.out.println(i19);
			     	//WebElement textbox19 = driver.findElement(By.xpath(".//*[@id='txt19']"));
			     	if(i19<22.44)
			     	{
			     		WebElement checkbox19 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[10]/td[4]/input"));
			     		checkbox19.click();
			     	}//�ж�19�����ʲ���ע
			     	
			     	WebElement peilv18 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[11]/td[3]"));
			     	String p18= peilv18.getText() ;//ȡ��18������
			     	////System.out.println(p18);
			     	float i18 = Float.parseFloat(p18); //ת��������
			     	//System.out.println(i18);
			     	//WebElement textbox18 = driver.findElement(By.xpath(".//*[@id='txt18']"));
			     	if(i18<18.36)
			     	{
			     		WebElement checkbox18 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[11]/td[4]/input"));
			     		checkbox18.click();
			     	}//�ж�18�����ʲ���ע
			     	
			     	WebElement peilv17 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[12]/td[3]"));
			     	String p17= peilv17.getText() ;//ȡ��17������
			     	////System.out.println(p17);
			     	float i17 = Float.parseFloat(p17); //ת��������
			     	//System.out.println(i17);
			     	//WebElement textbox17 = driver.findElement(By.xpath(".//*[@id='txt17']"));
			     	if(i17<16.03)
			     	{
			     		WebElement checkbox17 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[12]/td[4]/input"));
			     		checkbox17.click();
			     	}//�ж�17�����ʲ���ע
			     	WebElement peilv16 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[13]/td[3]"));
			     	String p16= peilv16.getText() ;//ȡ��16������
			     	////System.out.println(p16);
			     	float i16 = Float.parseFloat(p16); //ת��������
			     	//System.out.println(i16);
			     	//WebElement textbox16 = driver.findElement(By.xpath(".//*[@id='txt16']"));
			     	if(i16<14.64)
			     	{
			     		WebElement checkbox16 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[13]/td[4]/input"));
			     		checkbox16.click();
			     	}//�ж�16�����ʲ���ע
			     	WebElement peilv15 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[14]/td[3]"));
			     	String p15= peilv15.getText() ;//ȡ��15������
			     	////System.out.println(p15);
			     	float i15 = Float.parseFloat(p15); //ת��������
			     	//System.out.println(i15);
			     	//WebElement textbox15 = driver.findElement(By.xpath(".//*[@id='txt15']"));
			     	if(i15<13.83)
			     	{
			     		WebElement checkbox15 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[14]/td[4]/input"));
			     		checkbox15.click();
			     	}//�ж�15�����ʲ���ע
			   
			 	
			     	/*WebElement peilv14 = driver.findElement(By.xpath(".//*[@id='panel']/table[2]/tbody/tr[15]/td[3]"));
			     	String p14= peilv14.getText() ;//ȡ��14������
			     	////System.out.println(p14);
			     	float i14 = Float.parseFloat(p14); //ת��������
			     	//System.out.println(i14);
			     	//WebElement textbox14 = driver.findElement(By.xpath(".//*[@id='txt14']"));
			     	if(i14<13.46)
			     	{
			     		WebElement checkbox14 = driver.findElement(By.xpath("//*[@id=\"panel\"]/table[2]/tbody/tr[15]/td[4]/input"));
			     		checkbox14.click();
			     	}//�ж�14���ʲ���ע*/ 
			     	
				
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
		    			 		moshi1.click();//���Ͷעģʽ
		      
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
    			 		moshi1.click();//���Ͷעģʽ
		    	}
					break;
				}
			}
 		
     	
     
     	WebElement conform_btn = driver.findElement(By.xpath(".//*[@id='conform_btn']"));
     	conform_btn.click();//ȷ��Ͷע
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
     	{//��ȡ����ʱ�䣬���ж�
            Date date = new Date();  
            //DateFormat df1 = DateFormat.getDateInstance();//���ڸ�ʽ����ȷ����  
            //System.out.println(df1.format(date));  
            //DateFormat df2 = DateFormat.getDateTimeInstance();//���Ծ�ȷ��ʱ����  
            //System.out.println(df2.format(date));  
            DateFormat df3 = DateFormat.getTimeInstance();//ֻ��ʾ��ʱ����  
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
     	int num4=(int)(Math.random()*28000);//���ý���Ͷ��ҳ���ʱ��Ϊ���,���¸���30��
     	System.out.println("��ӡ������Ϣʱ��"); 
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

	public boolean doesWebElementExist(WebDriver driver, By selector) // ���������ں�������true�����������Ԫ�أ��򷵻�false��
	{

		try {
			driver.findElement(selector);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

}
