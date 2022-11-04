package com.ongbl.sfgpetclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @created: 1/11/2022
 * @author: boonloong
 */
@Entity
@Table(name="types")
public class PetType extends BaseEntity{

    @Column(name="name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
