package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
