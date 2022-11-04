/*
 * Created by boonloong
 */

package com.ongbl.sfgpetclinic.repositories;

import com.ongbl.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

/**
 * @created: 4/11/2022
 * @author: boonloong
 */
public interface VisitRepository extends CrudRepository<Visit,Long> {
}
