package test.system.com.voy.todolist;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import test.support.com.voy.todolist.web.ApplicationDriver;
import test.support.com.voy.todolist.web.TestEnvironment;

public class AppFeature {
	private TestEnvironment environment=TestEnvironment.load();
	private ApplicationDriver appDriver=new ApplicationDriver(environment);
	
	@Test
	public void homePageTitleTest(){
		appDriver.returnHome();
	}
	
	@Before
	public void startApp() throws Exception{
		appDriver.start();
	}
	
	@After
	public void stopApp(){
		appDriver.stop();
		System.out.println("stop app");
	}
}