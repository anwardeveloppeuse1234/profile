package com.exemple.profils.repos;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exemple.profils.entities.FileDb;



@Repository
public interface FileDbRepository extends JpaRepository<FileDb, String>{

}
