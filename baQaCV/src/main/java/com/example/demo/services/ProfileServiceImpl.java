package com.example.demo.services;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ProfileServiceImpl implements IProfileService {

	private static final Logger log = LoggerFactory.getLogger(ProfileServiceImpl.class);
	
	@Override
	public String sendMessage() {
		log.info("Start method : sendMessage");
		return null;
	}

	@Override
	public boolean acceptedContact() {
		// TODO Auto-generated method stub
		return false;
	}

}
