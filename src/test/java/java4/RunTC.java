package java4;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RunTC {

	Device_purchase T1 = new Device_purchase();
	SmokeTest T2 = new SmokeTest();

	@Test
	public void RunTC1() throws Exception {
		T1.loginSu1();

	}

	@Test

	public void RunTC2() throws Exception {

		T2.loginSu();
	}

	@BeforeTest
	public void BeforeTC() {
		T2.BforeTest();
	}
}
