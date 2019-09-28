package br.com.facef.aula3.controller;

import br.com.facef.aula3.model.Empresa;
import br.com.facef.aula3.business.EmpresaBusiness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/empresas")
public class EmpresaController {

    private EmpresaBusiness empresaBusinnes;

    @Autowired
    public EmpresaController(EmpresaBusiness empresaBusiness){
        this.empresaBusinnes = empresaBusiness;
    }

    @GetMapping
    public ResponseEntity<List<Empresa>> findAll(@RequestParam(required = false) String nome){
        if (nome == null)
            return ResponseEntity.status(200).body(empresaBusinnes.findAll());

        return ResponseEntity.status(200).body(empresaBusinnes.findByNome(nome));
    }

    @PostMapping
    public ResponseEntity<Empresa> post(@RequestBody Empresa empresa){
        return ResponseEntity.status(HttpStatus.CREATED).body(empresa);
    }

   /* @GetMapping
    public ResponseEntity<String> get(){
        return ResponseEntity.status(HttpStatus.MULTI_STATUS).body("Olá Mundo");
    }*/

    @GetMapping ("/get1")
    public ResponseEntity<String> get1(){
        return ResponseEntity.status(201).body("Olá Mundo");
    }

    @GetMapping("/metodo")
    public String method2(){
        return "method2";
    }

    @GetMapping("/{id}")
    public String findBy(@PathVariable int id){
        return "findby id: " + id;
    }
}
