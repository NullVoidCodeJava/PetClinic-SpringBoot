package tech.vedantchimote.services;

import java.util.Set;
import tech.vedantchimote.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
  Owner findByLastName(String lastName);

}
