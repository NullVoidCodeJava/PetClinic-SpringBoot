/**
 * Created By Vedant Chimote Date : 07-09-2023 Time : 19:23 Project-Name : ownpetclinic
 */

package tech.vedantchimote.services;

import java.util.Set;

public interface CrudService<T, ID> {

  Set<T> findAll();

  T findById(ID id);

  T save(T object);

  void delete(T object);

  void deleteById(ID id);


}
