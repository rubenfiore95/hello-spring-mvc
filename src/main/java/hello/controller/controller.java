package hello.controller;



import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class controller {

  @GetMapping("/")
  public String saluta() {
    return "home";
  }
  
  @GetMapping("/ora")
	public String orario(Model hour) {
		LocalDateTime ciao = LocalDateTime.now();
		System.out.println("Before : " + ciao);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMMM/yyyy HH:mm:ss");
		String formatDateTime = ciao.format(formatter);
		hour.addAttribute("orario", formatDateTime);
		return "ora";
		
		// ora non e' una stringa ma il file html contenente il codice.
	}

}
