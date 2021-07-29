package br.com.mgr.configuration;

import br.com.mgr.aluno.usecase.RegistroAluno;
import br.com.mgr.controller.AlunoController;
import br.com.mgr.converter.AlunoRequestConverter;
import br.com.mgr.repository.AlunoRepositoryImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Mauri Reis
 * @since 29/07/21
 */

@Configuration
public class AlunoControllerConfiguration {

    @Bean
    public AlunoController alunoControllerConfigration(
            RegistroAluno registroAluno,
            AlunoRequestConverter requestConverter) {
        return new AlunoController(registroAluno, requestConverter);

    }

    @Bean
    public RegistroAluno registroAlunoConfigration() {
        return new RegistroAluno(new AlunoRepositoryImp());

    }

    @Bean
    public AlunoRequestConverter converterAlunoConfigration() {
        return new AlunoRequestConverter();

    }


}

