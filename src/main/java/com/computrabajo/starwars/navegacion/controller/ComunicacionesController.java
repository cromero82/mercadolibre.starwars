package com.computrabajo.starwars.navegacion.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({ "v1/comunicaciones" })
@CrossOrigin(origins = "*")
public class ComunicacionesController {
    @GetMapping("/health")
    public ResponseEntity<String> health() {
        return new ResponseEntity<>("ok-worked", HttpStatus.OK);
    }
}
