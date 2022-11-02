/*
 * Created by boonloong
 */

package com.ongbl.sfgpetclinic.map;

import com.ongbl.sfgpetclinic.model.Pet;
import com.ongbl.sfgpetclinic.services.CrudService;

import java.util.Set;

/**
 * @created: 2/11/2022
 * @author: boonloong
 */
public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
