package tesnglearn1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class flowoftestestng {
  @BeforeSuite
   public void bsuit() {
	  System.out.println("dis will excute before the test suit");
  }
  
  @AfterSuite
  public void asuit(){
	  
	  
	  System.out.println("this will excute after the  suit");
  }
  @BeforeTest
  public void btest(){
	  System.out.println("this will excute before all tests in all classes");
	  
	  
  }
  @AfterTest()
  public void atest(){
	  
	  System.out.println("this will excute afteer all test methods in classes");
  }
  @BeforeClass
  public void bclass(){
	  System.out.println("this will excute before current class tests");
	  
	  
  }
  @AfterClass
  public void aclass(){
	  
	  System.out.println("this will excute after each test cases in current class");
  }
  @Test
  public void login(){
	  
	  System.out.println("this is my test case");
  }
  
  
}
