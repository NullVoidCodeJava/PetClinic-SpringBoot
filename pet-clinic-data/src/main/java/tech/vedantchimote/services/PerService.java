package tech.vedantchimote.services;

import java.util.Set;
import tech.vedantchimote.model.Pet;

public interface PerService {

  Pet findPetById(Long id);

  Pet savePet(Pet pet);

  Set<Pet> findAllPets();

}
