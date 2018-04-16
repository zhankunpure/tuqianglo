package automatedriver;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AutomateDriver {
	public WebDriver dr;
	
	

//	public AutomateDriver() {
//		
//		dr = new FirefoxDriver();
//	}
	public AutomateDriver(WebDriver dr) {
		this.dr = dr;
	}
	/**
	 * 获取当前网址
	 * @return
	 */
	public String getCurrentUrl() {
		return dr.getCurrentUrl();
	}
	/**
	 * 打开访问网址
	 * @param base_url
	 * @param url
	 */
	public void navigate(String base_url, String url) {
		dr.get(base_url + url);
	}
	/**
	 * 打开网址
	 * @param url
	 */
	public void navigateToPage(String url) {
		dr.get(url);
	}
	/**
	 * 删除Cookies缓存
	 */
	public void clearCookies() {
		dr.manage().deleteAllCookies();
	}
	/**
	 * 清除元素内容
	 * @param selector
	 */
	public void clearElementInfo(String selector){
		this.getElement(selector).clear();
	}
	
	/**
	 * 元素输入
	 * @param selector
	 * @param value
	 */
	public void operateInputElement(String selector, String value) {
		this.getElement(selector).clear();
		this.getElement(selector).sendKeys(value);
	}
	/**
	 * 清除元素内容
	 * @param selector
	 */
	public void clearOperateInputElement(String selector) {
		this.getElement(selector).clear();
	}
	/**
	 * 获取元素
	 * @param selector
	 * @return
	 */
	public WebElement getElement(String selector) {
		if (selector.equals(null)) {
			WebElement element = null;
			return element;
		} else {
			if (!selector.contains(",")) {
				WebElement element = dr.findElement(By.id(selector));
				return element;
			} else {
				String selectBy = selector.split(",")[0];
				String selectValue = selector.split(",")[1];
				if (selectBy.equals("s")) {
					WebElement element = dr.findElement(By.cssSelector(selectValue));
					return element;
				} else if (selectBy.equals("x")) {
					WebElement element = dr.findElement(By.xpath(selectValue));
					return element;
				} else if (selectBy.equals("l")) {
					WebElement element = dr.findElement(By.linkText(selectValue));
					return element;
				} else if (selectBy.equals("c")) {
					WebElement element = dr.findElement(By.className(selectValue));
					return element;
				} else if (selectBy.equals("p")) {
					WebElement element = dr.findElement(By.partialLinkText(selectValue));
					return element;
				}
			}
		}
		return null;

	}
	
	/**
	 * 获取元素集合
	 * @param selector
	 * @return
	 */

	public List<WebElement> getElements(String selector) {
		List<WebElement> elements = new ArrayList<WebElement>();
		if (selector.equals(null)) {
			// WebElement elements=null;
			return null;
		} else {
			if (!selector.contains(",")) {
				elements = dr.findElements(By.id(selector));
				return elements;
			} else {
				String selectBy = selector.split(",")[0];
				String selectValue = selector.split(",")[1];
				if (selectBy.equals("s")) {
					elements = dr.findElements(By.cssSelector(selectValue));
					return elements;
				} else if (selectBy.equals("x")) {
					elements = dr.findElements(By.xpath(selectValue));
					return elements;
				} else if (selectBy.equals("l")) {
					elements = dr.findElements(By.linkText(selectValue));
					return elements;
				} else if (selectBy.equals("c")) {
					elements = dr.findElements(By.className(selectValue));
					return elements;
				} else if (selectBy.equals("p")) {
					elements = dr.findElements(By.partialLinkText(selectValue));
					return elements;
				}
			}
		}
		return null;

	}
	
	/**
	 * 点击元素
	 * @param selector
	 */
	public void clickElement(String selector) {
		WebElement element = this.getElement(selector);
		element.click();
	}

	public String getText(String selector) {
		WebElement element = this.getElement(selector);
		String text = element.getText();
		return text;
	}

	/**
	 * 鼠标悬浮
	 * @param selector
	 */
	public void floatElement(String selector) {
		Actions ac = new Actions(dr);
		ac.moveToElement(this.getElement(selector)).perform();

	}

	public String getCurrentWindowHandle() {
		String handle = dr.getWindowHandle();
		return handle;
	}

	public Set<String> getAllWindowHandles() {
		Set<String> handles = new HashSet<String>();
		handles = dr.getWindowHandles();
		return handles;
	}
	/**
	 * 返回原来窗口
	 * @param handle
	 */
	public void getCurrentWindow(String handle) {
		
		dr.switchTo().window(handle);
	}
	/**
	 * 获取新窗口
	 * @param handle
	 * @throws InterruptedException 
	 */
	public void switchToWindow(String handle) throws InterruptedException {
		Thread.sleep(10000);
		Set<String> handles = new HashSet<String>();
		handles = dr.getWindowHandles();
		for (String handle1 :handles){
			if(handle1 != handle){
				dr.close();
//				Thread.sleep(1000);
				dr.switchTo().window(handle1);
			}else {
				
			}
		}
		
	}
	/**
	 * 判断元素是否存在
	 * @param selector
	 * @return
	 */
	public boolean isElementExist(String selector) {
		if (this.getElement(selector).isDisplayed()) {
			return true;
		} else {
			return false;
		}

	}
	/**
	 * 切入表单
	 * @param selector
	 */
	public void switchToFrame(String selector) {
		dr.switchTo().frame(selector);
	}
	/**
	 * 返回原始表单
	 * @param selector
	 */
	public void switchToDefaultContent() {
		dr.switchTo().defaultContent();
	}
	/**
	 * 显性等待
	 * @param selector
	 */
	public void explicitWait(String selector) {
		WebDriverWait wait = (new WebDriverWait(dr, 10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(selector)));
	}

	public Set<Cookie> getCookies() {
		Set<Cookie> cookies = dr.manage().getCookies();
		return cookies;
	}

	public Cookie addCookie(Cookie cookie) {
		dr.manage().addCookie(cookie);
		return cookie;
	}
	/**
	 * 关闭浏览器窗口
	 */
	public void close() {
		dr.close();
	}
	/**
	 * 下拉框
	 * @param selector
	 * @param value
	 */
	public void selectGetElement(String selector, String value) {
		Select sel = new Select(this.getElement(selector));
		sel.selectByValue(value);
		
	}

	public void dissSelectGetElement(String selector, String value) {
		Select sel = new Select(this.getElement(selector));
		sel.deselectByValue(value);

	}

	public void clickCheckbox(String selector) {
		this.getElement(selector).sendKeys(Keys.SPACE);
	}

	public boolean checkboxIsSelector(String selector) {
		if(this.getElement(selector).isSelected()){
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * 多表单处理
	 * @param selector
	 */
	public void switch_to_frame(String selector){
		
		if(selector!=""){
			dr.switchTo().frame(selector);
		}else{
//			dr.switchTo().parentFrame();
			dr.switchTo().defaultContent();
		}
	}
	
	/**
	 * 	警示框处理
	 * @param by
	 */
	public void switch_alert(String by){
		//		String[] str = selector.split(",");
		//		String by = str[0];
		//		String element = str[1];
		if(by=="a"){
			dr.switchTo().alert().accept();
		}
		if(by=="d"){
			dr.switchTo().alert().dismiss();
		}
		if(by=="t"){
			dr.switchTo().alert().getText();
		}
		//		if (by=="s") {
		//			dr.switchTo().alert().sendKeys("");
		//		}	
	}
	
	/**
	 * 窗口最大化
	 */
	public void max_window() {
		dr.manage().window().maximize();
		
	}
	
	/**
	 *  下拉框处理
	 * @param selector
	 * @param by
	 * @param value
	 */
	 
	public void Select(String selector,String by,String value){
		
		WebElement element = this.getElement(selector);
		
		Select select = new Select(element);
		
		if (by=="i") {
			select.selectByIndex(Integer.parseInt(value));
		}
		if (by=="v"){
			select.selectByValue(value);
		}
		if (by=="t"){
			select.selectByVisibleText(value);
		}
	}
	/**
	 * JS处理
	 * @param selector
	 * @param js
	 */
	public void JavascriptExecutor(String selector,String js){
		
		WebElement element = this.getElement(selector);
		((JavascriptExecutor)dr).executeScript(js, element);
		
	}
	/**
	 * 智能等待
	 * @param timeout
	 * @param by
	 */
	public void waitForElementToLoad(int timeout,final String selector){
		try {
			new WebDriverWait(dr,timeout).until(new ExpectedCondition<Boolean>() {

				@Override
				public Boolean apply(WebDriver dr) {
					WebElement element;
					if (!selector.contains(",")) {
						 element = dr.findElement(By.id(selector));
						 return element.isDisplayed();
					} else {
						String by = selector.split(",")[0];
						String seleValue = selector.split(",")[1];
						if (by.equals("x")) {
							element = dr.findElement(By.xpath(seleValue));
							return element.isDisplayed();
						}
						
					}
					return null ;
					
				}
			} );
		} catch (Exception e) {
			Assert.fail("超时"+timeout+"秒之后还没找到元素",e);
		}
		
	}
	/**
	 * 退出浏览器
	 */
	public void quit_bor(){
		
		dr.quit();
	}
	
	public void deleteCookie() {
		
		dr.manage().deleteAllCookies();
	}
	
	/**
	 * 刷新页面
	 */
	public void refresh() {
		
		dr.navigate().refresh();
	}
}
