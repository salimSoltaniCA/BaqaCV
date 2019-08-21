package com.example.demo.services;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.pojos.Profile;

@Repository
public interface IProfileRepository extends CrudRepository<Profile, String>{
}
