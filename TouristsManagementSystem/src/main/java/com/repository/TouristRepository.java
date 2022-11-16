package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.entity.TouristMaster;
import org.springframework.stereotype.Repository;

@Repository
public interface TouristRepository extends JpaRepository<TouristMaster, Integer>  {

}
