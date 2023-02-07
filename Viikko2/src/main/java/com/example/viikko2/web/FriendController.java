package com.example.viikko2.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.viikko2.domain.Friend;


@Controller
public class FriendController {
	
	
	ArrayList<Friend> lista = new ArrayList<Friend>();
	
	@GetMapping("/index")
	public String greetingSubmit(@ModelAttribute Friend name, Model model) {
		
		String nimi = name.toString();
		
		if (nimi != null) {
		String[] splitted = nimi.split(" ");
		String firstName = splitted[0];
		String lastName = splitted[1];
		
		name = new Friend(firstName, lastName);
		lista.add(name);
		}
		model.addAttribute("lista", lista);
		
		return "index";
	}

}
