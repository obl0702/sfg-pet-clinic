package com.ongbl.sfgpetclinic.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @created: 1/11/2022
 * @author: boonloong
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="types")
public class PetType extends BaseEntity{

    @Column(name="name")
    private String name;
}
