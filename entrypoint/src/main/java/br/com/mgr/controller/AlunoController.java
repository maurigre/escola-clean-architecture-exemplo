package br.com.mgr.controller;

import br.com.mgr.aluno.entity.Aluno;
import br.com.mgr.aluno.usecase.RegistroAluno;
import br.com.mgr.converter.AlunoRequestConverter;
import br.com.mgr.request.AlunoRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/alunos")
public class AlunoController {

   private RegistroAluno registroAluno;
   private AlunoRequestConverter requestConverter;

    public AlunoController(RegistroAluno registroAluno, AlunoRequestConverter requestConverter) {
        this.registroAluno = registroAluno;
        this.requestConverter = requestConverter;
    }

    @GetMapping
    public String doYouHearMe() {
        return "I Hear you ";
    }

    @PostMapping
    public void save(@RequestBody AlunoRequest request){
        Aluno aluno = requestConverter.toAluno(request);
        this.registroAluno.save(aluno);
    }
}
