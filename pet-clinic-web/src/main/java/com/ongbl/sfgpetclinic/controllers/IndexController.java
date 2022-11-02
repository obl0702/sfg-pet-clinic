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
@Controller
public class IndexController {
    @RequestMapping({"","/","index","index.html"})
    public String index(){
        return "index";
    }
}
