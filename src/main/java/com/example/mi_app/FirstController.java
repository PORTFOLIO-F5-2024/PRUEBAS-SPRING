package com.example.mi_app;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/saludar")

public class FirstController {

    @GetMapping
    public String saludar (){
        return "Hola";
    }
    @PostMapping
    public String saludarPost (@RequestBody String name){
        return "Hola post: " + name ;
    }
    @DeleteMapping ("/{id}")
    public String saludarDelete (@PathVariable String id){
        return "Quieres eliminar es recurso con id: " + id;
    }
    @PutMapping ("/{id}")
    public String saludarUpdate (@PathVariable String id, @RequestBody String name){
        return "Vas a modificar el nombre asociado al id '" + id + "' por el siguiente nombre: " + name;
    }

}
