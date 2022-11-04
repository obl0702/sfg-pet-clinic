/*
 * Created by boonloong
 */

package com.ongbl.sfgpetclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @created: 3/11/2022
 * @author: boonloong
 */
@Entity
@Table(name="specialities")
public class Speciality extends BaseEntity{

    @Column(name="description")
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
