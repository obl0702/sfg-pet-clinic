/*
 * Created by boonloong
 */

package com.ongbl.sfgpetclinic.services;

import java.util.Set;

/**
 * @created: 2/11/2022
 * @author: boonloong
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
