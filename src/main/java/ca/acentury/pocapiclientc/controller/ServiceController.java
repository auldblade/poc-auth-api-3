package ca.acentury.pocapiclientc.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

    @CrossOrigin(origins = "http://localhost:8089")
    @GetMapping("/service/c")
    public String[] getServices() {
        return new String[] {"Service C 1", "Service C 2", "Service C 3"};
    }
}
