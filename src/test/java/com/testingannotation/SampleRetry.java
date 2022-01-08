package com.testingannotation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleRetry {

	@Test(retryAnalyzer = MyRetry.class)
	private void usernamevalidation() {
		Assert.assertEquals("haresh", "HARESH");

	}
}
