package com.example.demo;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.example.demo.Help.FamilySituation;
import com.example.demo.Help.Status;
import com.example.demo.Help.Visibility;
import com.example.demo.pojos.Address;
import com.example.demo.pojos.Phone;
import com.example.demo.pojos.Profile;


public class CreationProfileTest {

	private Profile profile;
	private Address adr;
	private Phone phone;
	
	@Before
	public void executedBeforeEach() {
//		adr = new Address("0", "10047 rue Rancourt", "Montréal", "H2B2N7", "Québec", "Canada");
//		phone = new Phone("0","+1","514-250-1732");
//		profile = new Profile("P","salim", "Soltani", new java.util.Date(System.currentTimeMillis()) ,"salimohsoltani@gmail.com", adr, phone, "salimohsoltani@gmail.com", "tafaraoui1976", 
//				null, null, null, null, Status.BEGINNER , Visibility.AVAILABLE, true, true, "3 mois", "Je voudrais une mission en freelance longuie durée en Java", FamilySituation.SINGLE);
//		System.out.println("====BEFORE====»"+this.profile.getLogin());
	}
	@Test
	public void profileExistTest() {			
		
		System.out.println("========»"+this.profile.getLogin());
		if(profile.getLogin().equalsIgnoreCase("salimohsoltani@gmail.com"))
		assertTrue("", (profile != null));
	}
	
	@Test
	public void profileNotExistTest() {
	
		
		//Profile profile = new Profile("P","salim", "Soltani", new java.util.Date(System.currentTimeMillis()) ,"salimohsoltani@gmail.com", adr, phone, "salimohsoltani@gmail.com", "tafaraoui1976", null, null, null, null);
	
		
		//if( profile.getLogin() )
		//assertTrue("", (profile != null));
	}
}
