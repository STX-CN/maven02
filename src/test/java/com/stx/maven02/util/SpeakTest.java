package com.stx.maven02.util;

import org.junit.*;
import org.junit.Assert.*;

public class SpeakTest
{
	@Test
	public void testSpeak()
	{
		Assert.assertEquals("Hello World", new Speak().sayHi());
	}
	
	
}
