package tech.vedantchimote.services;

import java.util.Set;
import tech.vedantchimote.model.Vet;

public interface VetService {

  Vet getVetById(Long id);

  Vet saveVet(Vet vet);

  Set<Vet> getAllVets();

}
