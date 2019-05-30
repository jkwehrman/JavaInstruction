package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller // add
public class GreetingControler {
	@GetMapping("/greeting")
	public void greeting(@RequestParam(name="name", required=false, defaultValue="World")
	String name, Model model) {
		model.addAttribute("name", name);
	}
}
