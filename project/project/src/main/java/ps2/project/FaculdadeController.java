package ps2.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ps2.project.model.Faculdade;
import ps2.project.repository.FaculdadeRepo;

import java.util.List;

@RestController
@RequestMapping("/faculdades")
public class FaculdadeController {

    @Autowired
    private FaculdadeRepo faculdadeRepo;

    @GetMapping
    public List<Faculdade> listar() {
        return faculdadeRepo.findAll();
    }

    @PostMapping
    public Faculdade criar(@RequestBody Faculdade faculdade) {
        return faculdadeRepo.save(faculdade);
    }
}
