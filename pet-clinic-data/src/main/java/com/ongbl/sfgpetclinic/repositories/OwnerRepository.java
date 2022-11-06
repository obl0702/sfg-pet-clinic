/*
 * Created by boonloong
 */

package com.ongbl.sfgpetclinic.repositories;

import com.ongbl.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @created: 4/11/2022
 * @author: boonloong
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {
    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
}
