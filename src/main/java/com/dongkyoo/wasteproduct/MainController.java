package com.dongkyoo.wasteproduct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("main")
    private String main() {
        System.out.println("hi");
        return "index";
    }
}
