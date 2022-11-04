package com.ongbl.sfgpetclinic.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * @created: 1/11/2022
 * @author: boonloong
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class Person extends BaseEntity{

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

}
