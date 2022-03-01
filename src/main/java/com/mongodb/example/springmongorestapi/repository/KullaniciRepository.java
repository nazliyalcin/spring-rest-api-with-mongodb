package com.mongodb.example.springmongorestapi.repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongodb.example.springmongorestapi.entity.Kullanici;

//Entity aracılığıyla veritabanına bağlanıp, veritabanına kaydet veritabanından getir gibi kök işlemleri yapacak katmanın tamamı burada
public interface KullaniciRepository extends MongoRepository<Kullanici,String> {

}
