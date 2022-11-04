/*
 * Created by boonloong
 */

package com.ongbl.sfgpetclinic.repositories;

import com.ongbl.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * @created: 4/11/2022
 * @author: boonloong
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
