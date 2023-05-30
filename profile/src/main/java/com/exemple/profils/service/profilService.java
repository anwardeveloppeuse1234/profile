package com.exemple.profils.service;

import java.util.List;

import com.exemple.profils.entities.profil;

public interface profilService {
	profil saveprofil(profil p);
	profil updateprofil(profil p);
	void deleteprofil(profil p);
	 void deleteprofilById(Long id);
	profil getprofil(Long id);
	List<profil> getAllprofils();
	boolean existsById(Long id);
	profil findById(Long id);
}
