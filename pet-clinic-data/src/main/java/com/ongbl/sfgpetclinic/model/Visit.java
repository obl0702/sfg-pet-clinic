/*
 * Created by boonloong
 */

package com.ongbl.sfgpetclinic.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

/**
 * @created: 3/11/2022
 * @author: boonloong
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Visit extends BaseEntity{

    @Column(name="date")
    private LocalDate date;

    @Column(name="description")
    private String description;

    @ManyToOne
    @JoinColumn(name="pet_id")
    private Pet pet;
}
