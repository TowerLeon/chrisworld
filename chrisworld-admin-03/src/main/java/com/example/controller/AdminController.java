/**
 * FileName: AdminController
 * Author:   Lenovo
 * Date:     9/7/2018 6:38 PM
 * Description:
 * History:
 */
package com.example.controller;

import com.example.model.Admin;
import com.example.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService service;

    @RequestMapping("login")
    public Admin page1(Admin admin) {
        return service.findByNameAndPassword(admin);
    }

}


