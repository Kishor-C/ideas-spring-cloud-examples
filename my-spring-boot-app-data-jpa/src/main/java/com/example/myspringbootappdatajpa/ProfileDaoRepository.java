package com.example.myspringbootappdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileDaoRepository extends JpaRepository<Profile, Integer> {

	
}
