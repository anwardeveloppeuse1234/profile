package com.exemple.profils.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.exemple.profils.entities.profil;
import com.exemple.profils.repos.profilRepository;


@Service
public class profilServiceImpl implements profilService {
@Autowired
profilRepository profilRepository;
@Override
public profil saveprofil(profil p) {
	return profilRepository.save(p);
	}
	@Override
	public profil updateprofil(profil p) {
	return profilRepository.save(p);
	}
	@Override
	public void deleteprofil(profil p) {
	profilRepository.delete(p);
	}
	 @Override
	public void deleteprofilById(Long id) {
	profilRepository.deleteById(id);
	}
	@Override
	public profil getprofil(Long id) {
	return profilRepository.findById(id).get();
	}
	
	@Override
	public List<profil> getAllprofils() {
		return profilRepository.findAll();

	}
	@Override
	public boolean existsById(Long id){ return profilRepository.existsById(id);
	}
	/*@Autowired
	private profilRepository repo;
	 
	public List<profil> listAll(String keyword) {
	    if (keyword != null) {
	        return repo.search(keyword);
	    }
	    return repo.findAll();
	}*/
	@Override
	public profil findById(Long id) {
		if(profilRepository.existsById(id))
			return profilRepository.findById(id).get();
		else
			return null;
	}
	
}