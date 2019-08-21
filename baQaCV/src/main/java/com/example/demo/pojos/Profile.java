package com.example.demo.pojos;

import java.util.Date;
import java.util.HashSet;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.example.demo.Help.FamilySituation;
import com.example.demo.Help.Status;
import com.example.demo.Help.Visibility;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
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
@EqualsAndHashCode(callSuper=true)
@FieldDefaults(level=AccessLevel.PRIVATE)
public class Profile extends Person {
	/**-------- PERSONAL DATA --------*/
	@NotNull
	private String login;
	@NotNull
	String password;
	FamilySituation familySituation;	
	String driversLicense;
		
	/**-------- PROFESSIONAL DATA DATA ---------*/
	List<Experience> experiences;
	HashSet<Formation> trainings;
	HashSet<String> skills;
	HashSet<String> patiences;	
	Status status; 
	Visibility visibility;
	boolean displacement;
	boolean move; //déménagement
	String priorNotice; //préavis
	String objectif; 
		
	/**-----OPTIONS TO ADD-----*/
	//photo
	//video

	@Builder(builderMethodName = "profileBuilder")
	public Profile(String idIAM, String firstName, String lastName, Date birthDay, String email, 
				   Address adr, Phone phone, String login ,String password, List<Experience> experiences, 
				   HashSet<Formation> trainings, HashSet<String> skills, HashSet<String> patiences, Status status, Visibility visibility, 
				   boolean displacement, boolean move, String priorNotice, String objectif, FamilySituation familySituation, 
				   String driversLicense ) {
		super(idIAM, firstName, lastName, birthDay , email, adr, phone);
		
		this.login= login;		
		this.password=password;		
		this.driversLicense=driversLicense;
		this.experiences=experiences;
		this.trainings=trainings;
		this.skills=skills;
		this.patiences=patiences;	
		this.status=status; 
		this.visibility=visibility;
		this.displacement=displacement;
		this.move=move;
		this.priorNotice =priorNotice;
		this.objectif =objectif; 
		this.familySituation=familySituation;		
	}

}
