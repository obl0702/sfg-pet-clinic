package com.ongbl.sfgpetclinic.model;

/**
 * @created: 1/11/2022
 * @author: boonloong
 */
public class PetType extends BaseEntity{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
