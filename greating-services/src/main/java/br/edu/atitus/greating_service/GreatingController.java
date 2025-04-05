package br.edu.atitus.greating_service;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greating-services")
public class GreatingController {

@GetMapping({"", "/", "{namePath}"})
	public ResponseEntity<String> getGreeting(
		@PathVariable(required = false) String namePath, 
		@RequestParam(required = false) String name
		) {
		if (name == null)
			name = namePath != null ? namePath : "World";
		
	
		String returnText = String.format("Hello %s!", name);
		
		return ResponseEntity.ok(returnText);
		
	}

}