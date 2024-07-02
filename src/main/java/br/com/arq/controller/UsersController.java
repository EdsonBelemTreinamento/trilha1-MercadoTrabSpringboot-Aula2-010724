package br.com.arq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.arq.model.Users;
import br.com.arq.repository.UsersRepository;


@ResponseBody
@RestController
@RequestMapping("/api/users")
public class UsersController {
	
	@Autowired
	private UsersRepository usersRepository;
	
	@PostMapping("/save") 
	public ResponseEntity<?> saveUser(@RequestBody Users users){
		try {
			Users resultadoGravacao = usersRepository.save(users);  // salva o que vier 
			return ResponseEntity.status(200).body(resultadoGravacao); //imprime em json
		}catch(Exception ex) {
			return ResponseEntity.status(500).body("error :" + ex.getMessage());  // imprime em String
			 // O error
		}
	}

	// jamais crie um findAll em users ...desativa 
	
	@GetMapping
	public ResponseEntity<?> findAll(){
		return ResponseEntity.status(200).body(usersRepository.findAll());
	}
	
 
}
