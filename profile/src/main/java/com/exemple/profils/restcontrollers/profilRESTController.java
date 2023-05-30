package com.exemple.profils.restcontrollers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.exemple.profils.entities.profil;
import com.exemple.profils.repos.profilRepository;
import com.exemple.profils.service.profilService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class profilRESTController {
@Autowired
profilService profilService;
@RequestMapping(method = RequestMethod.GET)
public List<profil> getAllProfils() {
return profilService.getAllprofils();
}

@GetMapping(value="/{numtel}")
public profil getprofilById(@PathVariable("numtel") Long numtel) {
return profilService.getprofil(numtel);
 }
@RequestMapping(method = RequestMethod.POST)
public profil createprofil(@RequestBody profil profil) {
return profilService.saveprofil(profil);
}

@PutMapping(path = "/{id}")
public ResponseEntity<profil> updateprofil(@PathVariable("id")Long id ,@RequestBody profil profil) {
    profil _profil = new profil();
    

    _profil = profilService.findById(id);
    if(_profil == null) return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    _profil.setNomprofil(profil.getNomprofil());
    _profil.setPrenomprofil(profil.getPrenomprofil());
    _profil.setEmail(profil.getEmail());
    _profil.setNumtel(profil.getNumtel());
    _profil.setPhoto(profil.getPhoto());
    
    return new ResponseEntity<>(profilService.updateprofil(_profil), HttpStatus.OK);
}

}
