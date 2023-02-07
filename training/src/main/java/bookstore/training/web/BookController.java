package bookstore.training.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class BookController {

		@GetMapping("/index")
		public String greetingSubmit(@ModelAttribute  Model model) {


			return "index";
		}

	}


