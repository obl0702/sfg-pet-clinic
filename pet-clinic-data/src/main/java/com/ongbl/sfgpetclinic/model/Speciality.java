/*
 * Created by boonloong
 */

package com.ongbl.sfgpetclinic.model;

/**
 * @created: 3/11/2022
 * @author: boonloong
 */
public class Speciality extends BaseEntity{

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
