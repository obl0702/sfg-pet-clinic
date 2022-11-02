/*
 * Created by boonloong
 */

package com.ongbl.sfgpetclinic.map;

import com.ongbl.sfgpetclinic.model.Vet;
import com.ongbl.sfgpetclinic.services.CrudService;
import com.ongbl.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @created: 2/11/2022
 * @author: boonloong
 */
@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
