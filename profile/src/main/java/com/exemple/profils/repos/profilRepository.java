package com.exemple.profils.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.exemple.profils.entities.profil;

@RepositoryRestResource(path = "rest")
@CrossOrigin("http://localhost:4200/")
public interface profilRepository extends JpaRepository<profil, Long> {



}
