/**
 * Created By Vedant Chimote Date : 07-09-2023 Time : 19:48 Project-Name : ownpetclinic
 */

package tech.vedantchimote.services.map;

import java.util.Set;
import tech.vedantchimote.model.Pet;
import tech.vedantchimote.services.CrudService;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

  @Override
  public Set<Pet> findAll() {
    return super.findAll();
  }

  @Override
  public void deleteById(Long id) {
    super.deleteById(id);
  }

  @Override
  public void delete(Pet object) {
    super.delete(object);
  }

  @Override
  public Pet save(Pet object) {
    return super.save(object.getId(), object);
  }

  @Override
  public Pet findById(Long id) {
    return super.findById(id);
  }
}
