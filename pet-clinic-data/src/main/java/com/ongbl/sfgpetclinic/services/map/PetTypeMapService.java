/*
 * Created by boonloong
 */

/*
 * Created by boonloong
 */

package com.ongbl.sfgpetclinic.services.map;

import com.ongbl.sfgpetclinic.model.PetType;
import com.ongbl.sfgpetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;
import java.util.Set;

/**
 * @created: 3/11/2022
 * @author: boonloong
 */
@Service
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public void delete(PetType object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
