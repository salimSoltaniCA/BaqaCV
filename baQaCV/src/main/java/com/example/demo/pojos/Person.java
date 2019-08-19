package com.example.demo.pojos;

import java.util.Date;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@ToString
abstract class Person {
	@NotNull
	String idIAM;
	@NotNull
	String firstName;
	@NotNull
	String LastName;
	@NotNull
	Date   birthDay;
	@NotNull
    String email; 	
	Address address;
	Phone phone;		
}

