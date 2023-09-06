package tech.vedantchimote.services;

import java.util.Set;
import tech.vedantchimote.model.Owner;

public interface OwnerService {

  Owner findByLastName(String lastName);

  Owner findOwnerById(Long id);

  Owner saveOwner(Owner owner);

  Set<Owner> findAllOwners();

}
