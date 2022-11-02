

package com.ongbl.sfgpetclinic.services;

import com.ongbl.sfgpetclinic.model.Pet;
import java.util.Set;

/**
 * Created by boonloong
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();

}
