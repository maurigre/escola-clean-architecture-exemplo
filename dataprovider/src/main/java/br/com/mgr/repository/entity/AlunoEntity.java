package br.com.mgr.repository.entity;

import br.com.mgr.aluno.entity.Aluno;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "ALUNO")
public class AlunoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private UUID registrationNumber;
    private String name;

    public AlunoEntity(UUID registrationNumber, String name) {
        this.registrationNumber = registrationNumber;
        this.name = name;
    }

    public AlunoEntity(Long id, UUID registrationNumber, String name) {
        this(registrationNumber, name);
        this.id = id;
    }

    public static AlunoEntity from(Aluno aluno) {
        return new AlunoEntity(aluno.getRegistrationNumber(), aluno.getName());
    }
}
