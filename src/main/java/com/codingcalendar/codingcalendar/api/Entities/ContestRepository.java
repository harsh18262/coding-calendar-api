package com.codingcalendar.codingcalendar.api.Entities;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.sun.xml.bind.v2.model.core.ID;

@Service
public interface ContestRepository extends CrudRepository<Contest, ID> {
	

}