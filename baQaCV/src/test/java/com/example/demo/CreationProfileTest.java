package com.example.demo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.example.demo.Help.FamilySituation;
import com.example.demo.Help.Status;
import com.example.demo.Help.Visibility;
import com.example.demo.pojos.Address;
import com.example.demo.pojos.Experience;
import com.example.demo.pojos.Formation;
import com.example.demo.pojos.Phone;
import com.example.demo.pojos.Profile;


public class CreationProfileTest {

	private Profile profile;
	private Address adr;
	private Phone phone;
	
	@Before
	public void executedBeforeEach() {
		adr = new Address("0", "10047 rue Rancourt", "Montréal", "H2B2N7", "Québec", "Canada");
		phone = new Phone("0","+1","514-250-1732");
		List<Experience> experiences = null;
		HashSet<Formation> trainings = null;
		HashSet<String> skills = null; 
		HashSet<String> patiences = null;
		Status status = null;
		Visibility visibility =null;
		boolean displacement = true;
		boolean move = true;
		String priorNotice = "1";
		String objectif = "Java / JEE Developper";
		FamilySituation familySituation= FamilySituation.MARRIED;
		String driversLicense = "B";
		
		profile = new Profile("P", "salim", "Soltani", new java.util.Date(System.currentTimeMillis()), "salimohsoltani@gmail.com", 
				   adr, phone, "salimohsoltani@gmail.com", "tatatoto", experiences, trainings, skills, patiences, status, visibility, 
				   displacement, move, priorNotice, objectif, familySituation, 
				   driversLicense );				
	}
	
	@Test
	public void profileExist_loginTrue_profileExistedTest() {	
		String login="salimohsoltani@gmail.com";
		boolean profileExisted = (profile.getLogin().equalsIgnoreCase(login))? true: false;
		
		assertTrue(profileExisted);
//		System.out.println("----------------------TEST LOGIN :PROFILE EXISTED---------------------------");
//		System.out.println("Login   : " + profile.getLogin());				
	}
	
	@Test
	public void profileExist_loginFalse_profileExistedTest() {
		String login="salimohsoltan..i@gmail.com";
		boolean profileExisted = (profile.getLogin().equalsIgnoreCase(login))? true: false;
		
		assertFalse(profileExisted);
//		System.out.println("----------------------TEST LOGIN :PROFILE NOT EXISTED---------------------------");
//		System.out.println("Login   : " + profile.getLogin());			
	}
	
	
	/** Test password (login is correct) */
	@Test
	public void profileExist_passwordTrueAndLoginTrue_profileExistedTest() {
		String login ="salimohsoltani@gmail.com";
		String password="tatatoto";
		boolean profileExisted = (profile.getLogin().equalsIgnoreCase(login) && profile.getPassword().equalsIgnoreCase(password))? true: false;
		
		assertTrue(profileExisted);
//		System.out.println("----------------------TEST PASSWORD : PROFILE EXISTED---------------------------");
//		System.out.println("Login   : " + profile.getLogin());
//		System.out.println("Password: " + profile.getPassword());		
	}
	
	@Test
	public void profileExist_passwordFalseAndLoginTrue_profileNotExistedTest() {
		String login ="salimohsoltani@gmail.com";
		String password="tatatot1";		
		boolean profileExisted = (profile.getLogin().equalsIgnoreCase(login) && profile.getPassword().equalsIgnoreCase(password))? true: false;
		
		assertFalse(profileExisted);
//		System.out.println("----------------------TEST PASSWORD :PROFILE NOT EXISTED-----------------------------");
//		System.out.println("Login           : " + profile.getLogin());
//		System.out.println("Password        : " + profile.getPassword());
//		System.out.println("password entered: " + password);
	}
		
	
	@Test
	public void profileExist_passwordTrueAndLoginFalse_profileExistedTest() {	
		
		String login ="salimohsoltani..@gmail.com";
		String password="tatatoto";
		
		boolean profileExisted = (profile.getPassword().equalsIgnoreCase(password) && profile.getLogin().equalsIgnoreCase(login))? true: false;
		
		assertFalse(profileExisted);
//		System.out.println("----------------------TEST PASSWORD : PROFILE EXISTED---------------------------");
//		System.out.println("Login   : " + profile.getLogin());
//		System.out.println("Password: " + profile.getPassword());		
	}
	
	@Test
	public void profileExist_passwordFalseAndLoginFalse_profileNotExistedTest() {
		String login ="salimohsoltani..@gmail.com";
		String password="tatatot1";		
		boolean profileExisted = (profile.getPassword().equalsIgnoreCase(password) && profile.getLogin().equalsIgnoreCase(login))? true: false;
		
		assertFalse(profileExisted);
//		System.out.println("----------------------TEST PASSWORD :PROFILE NOT EXISTED-----------------------------");
//		System.out.println("Login           : " + profile.getLogin());
//		System.out.println("Password        : " + profile.getPassword());
//		System.out.println("password entered: " + password);
	}	
}
