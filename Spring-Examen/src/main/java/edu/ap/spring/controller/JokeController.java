package edu.ap.spring.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import edu.ap.spring.jpa.JokeRepository;
import org.springframework.ui.Model;
import edu.ap.spring.jpa.*;

@Controller
@Scope("session")
public class JokeController {
	
	@Autowired
	JokeRepository repo;
   
   public JokeController() {
   }
       
   @RequestMapping("/joke")
   public String joke() {
	   return "joke";
   }
		   
   @RequestMapping("/joke_post")
   public String joke_post() {
	   return "";
   }
   
   @RequestMapping("/")
   public String root() {
	   return "redirect:/joke";
   }
   
   @PostMapping("/random")
   public String setJoke(@RequestParam("joke") String joke, 
		   					Model model) {
	   model.addAttribute("joke", joke);
	   
	   repo.save(new Joke(joke));
	   
	   return "result";
	   
   }
}
