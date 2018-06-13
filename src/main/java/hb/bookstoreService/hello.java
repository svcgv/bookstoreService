package hb.bookstoreService;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
public class hello {
	 @RequestMapping("/")
	    public String index() {
	        return "Greetings from Spring Boot!";
	    }

}
