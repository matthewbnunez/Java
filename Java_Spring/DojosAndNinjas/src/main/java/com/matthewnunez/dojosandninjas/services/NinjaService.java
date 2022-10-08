package com.matthewnunez.dojosandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matthewnunez.dojosandninjas.models.Ninja;
import com.matthewnunez.dojosandninjas.repositories.NinjaRepository;

@Service
public class NinjaService {
	@Autowired
	private NinjaRepository ninjaRepo;

	// Find All Ninjas
	public List<Ninja> getAllNinjas() {
		return ninjaRepo.findAll();
	}
    // Create Ninja
    public Ninja createNinja(Ninja ninja) {
        return ninjaRepo.save(ninja);
    }
    // Find One Ninja
    public Ninja getOneNinja(Long id) {
        Optional<Ninja> optionalNinja = ninjaRepo.findById(id);
        if(optionalNinja.isPresent()) {
        	return optionalNinja.get();
        } else {
        	return null;
        }
    }
    // Edit Ninja
    public Ninja editNinja(Ninja ninja) {
        return ninjaRepo.save(ninja);
    }
    // Delete Ninja
    public void deleteNinja(Long id) {
    	ninjaRepo.deleteById(id);
    }
}
