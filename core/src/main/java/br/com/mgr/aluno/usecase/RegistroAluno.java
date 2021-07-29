package br.com.mgr.aluno.usecase;

import br.com.mgr.aluno.contract.AlunoRepository;
import br.com.mgr.aluno.entity.Aluno;

public class RegistroAluno {

    private AlunoRepository alunoRepository;

    public RegistroAluno(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public void save(Aluno aluno){
        alunoRepository.save(aluno);
    }


}
