package org.example.serviceinternetprovider;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {


    @GetMapping("/info")
    public String info(){
        return "info";
    }
}
