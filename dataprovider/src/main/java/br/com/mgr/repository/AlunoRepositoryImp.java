package br.com.mgr.repository;

import br.com.mgr.aluno.contract.AlunoRepository;
import br.com.mgr.aluno.entity.Aluno;
import br.com.mgr.repository.entity.AlunoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AlunoRepositoryImp implements AlunoRepository {

    @Autowired
    AlunoDao alunoDao;

    @Override
    public void save(Aluno aluno) {
        alunoDao.save(AlunoEntity.from(aluno));
    }
}
