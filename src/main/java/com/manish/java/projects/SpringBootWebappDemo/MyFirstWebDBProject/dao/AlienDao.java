package com.manish.java.projects.SpringBootWebappDemo.MyFirstWebDBProject.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.manish.java.projects.SpringBootWebappDemo.MyFirstWebDBProject.Model.Alien;

public interface AlienDao extends CrudRepository<Alien, Integer>
{
	
	List <Alien> findByAname(String aname); 
	
	
}
