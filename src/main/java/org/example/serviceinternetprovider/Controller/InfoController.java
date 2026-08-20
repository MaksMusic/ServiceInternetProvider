package org.example.serviceinternetprovider.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class InfoController {


    @GetMapping("/info")
    public String info(){
        return "info";
    }

    @PostMapping("/sum")
    public long sum (@RequestBody long[]a){
        long sum = Arrays.stream(a).sum();
        return sum;
    }
}
