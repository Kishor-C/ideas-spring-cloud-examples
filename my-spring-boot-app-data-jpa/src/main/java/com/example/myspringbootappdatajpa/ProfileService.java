package com.example.myspringbootappdatajpa;

import java.util.List;

public interface ProfileService {
	
	public Profile createProfile(Profile profile);
	public Profile fetchProfileById(int id);
	public List<Profile> getProfiles();
	public void deleteProfile(int id);
}
