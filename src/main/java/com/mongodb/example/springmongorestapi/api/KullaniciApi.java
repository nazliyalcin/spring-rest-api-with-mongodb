package com.mongodb.example.springmongorestapi.api;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.example.springmongorestapi.entity.Kullanici;
import com.mongodb.example.springmongorestapi.repository.KullaniciRepository;

@RestController
@RequestMapping("/kullanici")
public class KullaniciApi {
	
	@Autowired
	private KullaniciRepository kullaniciRepository;
	
	@PostConstruct
	public void init() {
		Kullanici kullanici = new Kullanici();
		kullanici.setAdi("Nazli");
		kullanici.setSoyadi("yalcin");
		kullaniciRepository.save(kullanici);
	}
	
	@PostMapping
	public ResponseEntity<Kullanici> ekle(@RequestBody Kullanici kullanici)
	{
		return ResponseEntity.ok(kullaniciRepository.save(kullanici));		
	}
	
	@GetMapping
	public ResponseEntity<List<Kullanici>> tumunuListele()
	{
		return ResponseEntity.ok(kullaniciRepository.findAll());		
	}
	
	
	
}
