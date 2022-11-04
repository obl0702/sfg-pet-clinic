/*
 * Created by boonloong
 */

/*
 * Created by boonloong
 */

package com.ongbl.sfgpetclinic.services.map;

import com.ongbl.sfgpetclinic.model.Speciality;
import com.ongbl.sfgpetclinic.model.Vet;
import com.ongbl.sfgpetclinic.services.SpecialtyService;
import com.ongbl.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Service;
import java.util.Set;

/**
 * @created: 2/11/2022
 * @author: boonloong
 */
@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialtyService specialtyService;

    public VetServiceMap(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

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

        if(object.getSpecialities().size()>0){
            object.getSpecialities().forEach(speciality -> {
                if(speciality.getId() == null){
                    Speciality savedSpeciality = specialtyService.save(speciality);
                    speciality.setId(savedSpeciality.getId());
                }
            });
        }

        return super.save(object);
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
