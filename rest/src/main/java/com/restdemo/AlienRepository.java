package com.restdemo;

import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;

public interface AlienRepository extends CrudRepository<Alien, Integer>
{

}
