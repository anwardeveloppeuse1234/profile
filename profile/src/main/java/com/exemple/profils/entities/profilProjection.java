package com.exemple.profils.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomprofil", types = { profil.class })
public interface profilProjection {
	public String getNomprofil();

}
