package com.matthewnunez.dojosandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matthewnunez.dojosandninjas.models.Dojo;
import com.matthewnunez.dojosandninjas.repositories.DojoRepository;

@Service
public class DojoService {
	@Autowired
	private DojoRepository dojoRepo;

	// Find All Dojos
	public List<Dojo> getAllDojos() {
		return dojoRepo.findAll();
	}
    // Create Dojo
    public Dojo createDojo(Dojo dojo) {
        return dojoRepo.save(dojo);
    }
    // Find One Dojo
    public Dojo getOneDojo(Long id) {
        Optional<Dojo> optionalDojo = dojoRepo.findById(id);
        if(optionalDojo.isPresent()) {
        	return optionalDojo.get();
        } else {
        	return null;
        }
    }
    // Edit Dojo
    public Dojo editDojo(Dojo dojo) {
        return dojoRepo.save(dojo);
    }
    // Delete Dojo
    public void deleteDojo(Long id) {
    	dojoRepo.deleteById(id);
    }
}