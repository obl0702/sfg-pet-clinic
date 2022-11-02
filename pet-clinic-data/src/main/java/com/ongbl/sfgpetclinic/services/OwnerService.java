/*
 * Created by boonloong
 */

package com.ongbl.sfgpetclinic.services;

import com.ongbl.sfgpetclinic.model.Owner;
import java.util.Set;

/**
 * @created: 2/11/2022
 * @author: boonloong
 */
public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
