package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.entity.TouristContact;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<TouristContact, String> {

}

