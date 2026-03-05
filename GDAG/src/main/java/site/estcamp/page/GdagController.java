package site.estcamp.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GdagController {

	@RequestMapping("/") 
	public String goMain() {
		return "main";
	}
}
