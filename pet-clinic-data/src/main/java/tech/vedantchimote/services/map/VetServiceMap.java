/**
 * Created By Vedant Chimote Date : 07-09-2023 Time : 19:50 Project-Name : ownpetclinic
 */

package tech.vedantchimote.services.map;

import java.util.Set;
import org.springframework.stereotype.Service;
import tech.vedantchimote.model.Vet;
import tech.vedantchimote.services.CrudService;
import tech.vedantchimote.services.VetService;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

  @Override
  public Set<Vet> findAll() {
    return super.findAll();
  }

  @Override
  public void deleteById(Long id) {
    super.deleteById(id);
  }

  @Override
  public void delete(Vet object) {
    super.delete(object);
  }

  @Override
  public Vet save(Vet object) {
    return super.save(object.getId(), object);
  }

  @Override
  public Vet findById(Long id) {
    return super.findById(id);
  }
}
