/*
 * Created by boonloong
 */

package com.ongbl.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @created: 2/11/2022
 * @author: boonloong
 */
@RequestMapping("/owners")
@Controller
public class OwnerController {

    @RequestMapping({"","/","/index"})
    public String listOwners(){
        return "owners/index";
    }
}
