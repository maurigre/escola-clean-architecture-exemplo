package br.com.mgr.repository;


import br.com.mgr.repository.entity.AlunoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoDao extends JpaRepository<AlunoEntity, Long> {


}
