/*
 * Created by boonloong
 */

package com.ongbl.sfgpetclinic.repositories;

import com.ongbl.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

/**
 * @created: 4/11/2022
 * @author: boonloong
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
