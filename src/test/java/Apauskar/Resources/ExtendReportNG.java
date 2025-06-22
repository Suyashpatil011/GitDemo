package Apauskar.Resources;

public class ExtendReportNG {
	
	public void getReportObject() {
		
		

        String path = System.getProperty("user.dir") + "//reports/index.html";
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setReportName("WebAutomationResult");
        reporter.config().setDocumentTitle("MyFirstDocument");
        extend.attachReporter(reporter);
        
        extend.setSystemInfo("Tester","Suyash Patil");
	}

}
