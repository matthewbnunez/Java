package com.matthewnunez.daikichiu;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/daikichi")
public class HomeController {
    @RequestMapping("")
    public String welcome() {
            return "Welcome!";
    }
    
	@RequestMapping("/today")
	public String today() {
		return "Today you will find luck in all you endeavors!";
	}
	
	@RequestMapping("/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	
	@RequestMapping("/travel")
	public String travel(@RequestParam(value="1", required=false) String searchQuery) {
		if(searchQuery == null) {
			return "Wrong Url";
		} else {
			return "Congratulations! You will soo travel to " + searchQuery + "!";
		}
	}
	
	@RequestMapping("/lotto/{num}")
	public String lotto(@PathVariable("num") int num) {
		if(num % 2 == 0) {
			return "You will take a grand journey in the near future, but be weary of tempting offers.";
		} else {
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
		}
	}
}
