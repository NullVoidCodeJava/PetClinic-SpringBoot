/**
 * Created By Vedant Chimote Date : 07-09-2023 Time : 19:33 Project-Name : ownpetclinic
 */

package tech.vedantchimote.services.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import tech.vedantchimote.model.BaseEntity;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

  protected Map<Long, T> map = new HashMap();

  Set<T> findAll() {
    return new HashSet<>(map.values());
  }

  T findById(ID id) {
    return map.get(id);
  }

  T save(T object) {
    if (object != null) {
      if (object.getId() == null) {
        object.setId(getNextId());
      }
      map.put(object.getId(), object);
    } else {
      throw new IllegalArgumentException("Object cannot be null");
    }
    return object;
  }

  void deleteById(ID id) {
    map.remove(id);
  }

  void deleteAll() {
    map.clear();
  }

  void delete(T object) {
    map.entrySet().removeIf(entry -> entry.getValue().equals(object));
  }

  public Long getNextId() {
    Long nextIndex = null;

    try {
      nextIndex = Collections.max(map.keySet()) + 1;
    } catch (NoSuchElementException e) {
      nextIndex = 1L;
    }
    return nextIndex;
  }

}
