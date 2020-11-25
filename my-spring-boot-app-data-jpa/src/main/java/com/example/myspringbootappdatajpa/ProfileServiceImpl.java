package com.example.myspringbootappdatajpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileServiceImpl implements ProfileService {
	
	@Autowired
	private ProfileDaoRepository profileDao;

	@Override
	public Profile createProfile(Profile profile) {
		
		return profileDao.save(profile);
	}

	@Override
	public Profile fetchProfileById(int id) {
		
		return profileDao.findById(id).get();
	}

	@Override
	public List<Profile> getProfiles() {
		// TODO Auto-generated method stub
		return profileDao.findAll();
	}

	@Override
	public void deleteProfile(int id) {
		profileDao.deleteById(id);
	}

}
