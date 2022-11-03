package com.ongbl.sfgpetclinic.model;

import java.util.HashSet;
import java.util.Set;

/**
 * @created: 1/11/2022
 * @author: boonloong
 */
public class Vet extends Person {
    private Set<Speciality> specialities = new HashSet<>();

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}
