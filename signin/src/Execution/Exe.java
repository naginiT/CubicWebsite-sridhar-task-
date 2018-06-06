package Execution;

import org.testng.annotations.Test;

import Operation.Login;
import Repository.Browser;

public class Exe {

	@Test
	public void Exe() throws Exception {
		Browser.Browser();
		Browser.opeen();
	Login.Actions();
}

}
