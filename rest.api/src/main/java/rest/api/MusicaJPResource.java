package rest.api;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


@RestController
public class MusicaJPResource {
	@Autowired
	private MusicaRepository musicaRepository;
	
	@GetMapping("/jpa/musicas")
	public List<Musica> retrievlAllMusica(){
		List<Musica> Musica = musicaRepository.findAll();
		
		return Musica;
	}
	
	@PostMapping("/jpa/musicas")
	public ResponseEntity<Object> createUser(@RequestBody Musica musica) {
		Musica savedMusica = musicaRepository.save(musica);
		
		URI location = ServletUriComponentsBuilder
			.fromCurrentRequest()
			.path("/{id}")
			.buildAndExpand(savedMusica.getId()).toUri();
		return ResponseEntity.created(location).build();
	}
}
