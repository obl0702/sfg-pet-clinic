/*
 * Created by boonloong
 */

package com.ongbl.sfgpetclinic.services;

import com.ongbl.sfgpetclinic.model.Owner;
import com.ongbl.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
