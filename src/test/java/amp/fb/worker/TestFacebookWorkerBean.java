package amp.fb.worker;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import amp.source.fb.worker.FacebookManagerBean;

public class TestFacebookWorkerBean {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testInitBean() 
	{
		@SuppressWarnings("unused")
		boolean cRes = true;
		
		String cMethodName = "";
		
		try
		{
			StackTraceElement[] stacktrace = Thread.currentThread().getStackTrace();
	        StackTraceElement ste = stacktrace[1];
	        cMethodName = ste.getMethodName();
	        
	        FacebookManagerBean cFBWorkerBean = new FacebookManagerBean();
	        
	        cFBWorkerBean.initJUnit();
	        
	        assert(cRes = true);
		}
		catch( Exception e)
		{
			System.out.println("M.V. Custom::" + cMethodName + "::" + e.getMessage());
			
			e.printStackTrace();
			
			fail(cMethodName + "::" + e.getMessage()); 
		}
	}
}
