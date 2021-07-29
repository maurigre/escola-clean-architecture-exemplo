package br.com.mgr.converter;

import br.com.mgr.aluno.entity.Aluno;
import br.com.mgr.request.AlunoRequest;
import org.springframework.stereotype.Component;

public class AlunoRequestConverter {

    public Aluno toAluno(AlunoRequest request) {
        return new Aluno(request.getName());
    }
}
