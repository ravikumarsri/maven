package IAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.IAnnotation;
import org.testng.annotations.ITestAnnotation;

public class Tranformer implements IAnnotationTransformer {

	public void transform(ITestAnnotation annotation, Class tesdtclas, Constructor testconsttructor, Method testmethod) {
		
		annotation.setRetryAnalyzer(Analzer.IRetry.class);
		
	}

}
