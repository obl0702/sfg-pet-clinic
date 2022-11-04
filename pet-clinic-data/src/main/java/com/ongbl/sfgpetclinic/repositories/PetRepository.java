/*
 * Created by boonloong
 */

package com.ongbl.sfgpetclinic.repositories;

import com.ongbl.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

/**
 * @created: 4/11/2022
 * @author: boonloong
 */
public interface PetRepository extends CrudRepository<Pet, Long> {
}
