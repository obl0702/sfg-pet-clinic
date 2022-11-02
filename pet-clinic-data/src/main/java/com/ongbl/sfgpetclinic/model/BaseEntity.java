/*
 * Created by boonloong
 */

package com.ongbl.sfgpetclinic.model;

import java.io.Serializable;

/**
 * @created: 1/11/2022
 * @author: boonloong
 */
public class BaseEntity implements Serializable {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
