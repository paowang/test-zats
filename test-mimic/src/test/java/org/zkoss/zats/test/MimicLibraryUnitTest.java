/* MimicLibraryUnitTest.java

	Purpose:
		
	Description:
		
	History:
		2012/3/26 Created by pao

Copyright (C) 2011 Potix Corporation. All Rights Reserved.
 */
package org.zkoss.zats.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.zkoss.zats.testcase.BasicAgentTest;
import org.zkoss.zats.testcase.bind.BindTest;
import org.zkoss.zats.testcase.bind.OrderTest;
import org.zkoss.zats.testcase.ext6.MiscTest;

/**
 * Test mimic library.
 * @author pao
 */
@RunWith(Suite.class)
@SuiteClasses({ BasicAgentTest.class, org.zkoss.zats.testcase.ext6.BasicAgentTest.class, MiscTest.class, BindTest.class, OrderTest.class })
public class MimicLibraryUnitTest {

}
