package ps2.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ps2.project.model.Professor;
import ps2.project.repository.ProfessorRepo;

import java.util.List;

@RestController
@RequestMapping("/professores")
public class ProfessorController {

    @Autowired
    private ProfessorRepo professorRepo;

    @GetMapping
    public List<Professor> listar() {
        return professorRepo.findAll();
    }

    @PostMapping
    public Professor criar(@RequestBody Professor professor) {
        return professorRepo.save(professor);
    }
}
