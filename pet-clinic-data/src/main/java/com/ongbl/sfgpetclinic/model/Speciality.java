/*
 * Created by boonloong
 */

package com.ongbl.sfgpetclinic.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @created: 3/11/2022
 * @author: boonloong
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="specialities")
public class Speciality extends BaseEntity{

    @Column(name="description")
    private String description;
}
