package com.example.demo.Help;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class FormatCheckTest {
	
	//String email;
	@Before
	public void executedBeforeEach() {
		
	}
	/** valid email*/
	@Test
	public void checkFomatEmail_emailFomatTrue_checkEmailFormatOKTest() {
		String email="salim.soltani@cgi.com"; 
//		System.out.println(email);
//		System.out.println("=======»" + FormatCheck.emailFormat(email));
		assertTrue(FormatCheck.emailFormat(email));
	}
	
	
	
	/** Invalid emails : @@*/
	@Test
	public void checkFomatEmail_emailFomatFalseTwoAA_checkEmailFormatKOTest() {
		String email="sal@im@com"; 
//		System.out.println(email);
//		System.out.println("==///////////=====»" + FormatCheck.emailFormat(email));
		assertFalse(FormatCheck.emailFormat(email));
	}
	
	
	@Test
	public void checkFomatEmail_emailFomatFalseNotA_checkEmailFormatKOTest() {
		String email="salim.com"; 
//		System.out.println(email);
//		System.out.println("==///////////=====»" + FormatCheck.emailFormat(email));
		assertFalse(FormatCheck.emailFormat(email));
	}
	
	@Test
	public void checkFomatEmail_emailFomatFalseNotHasPointOfExtention_checkEmailFormatKOTest() {
		String email="salim.soltani@cgicom"; 
//		System.out.println(email);
//		System.out.println("==///////emailFomatFalseNotHasPointOfExtentio///=====»" + FormatCheck.emailFormat(email));
		assertFalse(FormatCheck.emailFormat(email));
	}
	
	@Test
	public void checkFomatEmail_emailFomatFalseNotHasterminatedBySlash_checkEmailFormatKOTest() {
		String email="salim.soltani@/"; 
//		System.out.println(email);
//		System.out.println("==///////emailFomatFalseNotHasterminatedBySlash///=====»" + FormatCheck.emailFormat(email));
		assertFalse(FormatCheck.emailFormat(email));
	}
	
	@Test
	public void checkFomatEmail_emailFomatFalseNotHasterminatedBycomma_checkEmailFormatKOTest() {
		String email="salim.soltani@,"; 
//		System.out.println(email);
//		System.out.println("==///////emailFomatFalseNotHasterminatedBycomma///=====»" + FormatCheck.emailFormat(email));
		assertFalse(FormatCheck.emailFormat(email));
	}
	
	@Test
	public void checkFomatEmail_emailFomatFalseNotHasterminatedBysemicolon_checkEmailFormatKOTest() {
		String email="salim.soltani@;"; 
//		System.out.println(email);
//		System.out.println("==///////emailFomatFalseNotHasterminatedBycomma///=====»" + FormatCheck.emailFormat(email));
		assertFalse(FormatCheck.emailFormat(email));
	}
	
	@Test
	public void checkFomatEmail_emailFomatFalseNotHasterminatedByBlanc_checkEmailFormatKOTest() {
		String email="salim.soltani@ "; 
//		System.out.println(email);
//		System.out.println("==///////emailFomatFalseNotHasterminatedBycomma///=====»" + FormatCheck.emailFormat(email));
		assertFalse(FormatCheck.emailFormat(email));
	}
	
	@Test
	public void checkFomatEmail_emailFomatFalseNotHasStartByBlanc_checkEmailFormatKOTest() {
		String email=" @cgi.com"; 
//		System.out.println(email);
//		System.out.println("==///////emailFomatFalseNotHasterminatedBycomma///=====»" + FormatCheck.emailFormat(email));
		assertFalse(FormatCheck.emailFormat(email));
	}
	
	@Test
	public void checkFomatEmail_emailFomatFalseNotHasStartByEmpty_checkEmailFormatKOTest() {
		String email="@cgi.com"; 
//		System.out.println(email);
//		System.out.println("==///////emailFomatFalseNotHasterminatedBycomma///=====»" + FormatCheck.emailFormat(email));
		assertFalse(FormatCheck.emailFormat(email));
	}
}
