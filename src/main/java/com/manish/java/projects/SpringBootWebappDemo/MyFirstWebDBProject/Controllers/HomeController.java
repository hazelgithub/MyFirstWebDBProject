package com.manish.java.projects.SpringBootWebappDemo.MyFirstWebDBProject.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.manish.java.projects.SpringBootWebappDemo.MyFirstWebDBProject.Model.Alien;
import com.manish.java.projects.SpringBootWebappDemo.MyFirstWebDBProject.dao.AlienDao;

@Controller
public class HomeController 
{
	
	@Autowired
	AlienDao aliendao ; 
	
	@RequestMapping("home")
	public String home()
	{
		return "home.jsp"; 
	}
	
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien)
	{
		System.out.println(alien);
		
		aliendao.save(alien) ; 
		
		return "ThankYou.jsp" ; 
	}
	
	@RequestMapping("/getAlien")
	public ModelAndView getAlien(@RequestParam int aid)
	{
		Alien alienData = aliendao.findById(aid).orElse(new Alien()); 
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject(alienData) ;
		mv.setViewName("showdata.jsp");
		
		
		System.out.println(aliendao.findByAname("Usha"));

		return mv ; 
	}
	
	@RequestMapping("/delAlien")
	public String delAlien(@RequestParam int aid)
	{
		aliendao.deleteById(aid);
		System.out.println("Record Deleted Sucess..  " + aid);
		return "home.jsp"; 
		
		
	}
	
	
	
	
	

}
