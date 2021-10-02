package com.ipiecoles.java.java230.repository;

import com.ipiecoles.java.java230.model.Employe;
import org.joda.time.LocalDate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeRepository extends JpaRepository<Employe, Long> {

    List<Employe> findByMatricule(String matricule);

    List<Employe> findByNomAndPrenom(String nom, String prenom);

    List<Employe> findByNomIgnoreCase (String nom);

    List<Employe> findByDateEmbaucheBefore (LocalDate date);

    List<Employe> findByDateEmbaucheAfter (LocalDate date);

    List<Employe> findBySalaireGreaterThanOrderBySalaireDesc(Double salaire);
}
