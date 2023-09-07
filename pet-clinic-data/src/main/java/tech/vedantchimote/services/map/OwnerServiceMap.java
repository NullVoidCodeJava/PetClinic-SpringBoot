/**
 * Created By Vedant Chimote Date : 07-09-2023 Time : 19:41 Project-Name : ownpetclinic
 */

package tech.vedantchimote.services.map;

import java.util.Set;
import tech.vedantchimote.model.Owner;
import tech.vedantchimote.services.CrudService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements
    CrudService<Owner, Long> {

  @Override
  public Set<Owner> findAll() {
    return super.findAll();
  }

  @Override
  public void deleteById(Long id) {
    super.deleteById(id);
  }

  @Override
  public void delete(Owner object) {
    super.delete(object);
  }

  @Override
  public Owner save(Owner object) {
    return super.save(object.getId(), object);
  }

  @Override
  public Owner findById(Long id) {
    return super.findById(id);
  }
}
