package com.example.demo.pojos;

import java.io.Serializable;
import java.util.List;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@FieldDefaults(level=AccessLevel.PRIVATE)
public class Experience implements Serializable{

	private static final long serialVersionUID = 1L;
	
	String entreprise;
	String addressEntreprise;
	String StartDate;
	String EndDate;
	Responsable responsableName;
	String projectName;
	String projectDiscription;
	String poste;
	List<String> responsibilities;
	
}
