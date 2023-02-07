package com.example.viikko2.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.viikko2.domain.Student;

@Controller
public class StudentController {
	
	@GetMapping("/hello")
	public String greetingForm(Model model) {
		
		
		ArrayList<Student> lista = new ArrayList<Student>();
		Student olli = new Student("Olli", "Ollinen");
		Student matti = new Student("Matti", "Mattinen");
		Student keijo = new Student("Keijo", "Keijonen");
		lista.add(olli);
		lista.add(matti);
		lista.add(keijo);
		
		model.addAttribute("lista", lista);
		
		return "StudentList";
		
		
	}
	
	
	

}
